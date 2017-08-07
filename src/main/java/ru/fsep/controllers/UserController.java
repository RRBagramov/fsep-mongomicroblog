package ru.fsep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.fsep.models.Post;
import ru.fsep.models.User;
import ru.fsep.models.UserInfo;
import ru.fsep.services.UserService;

import java.util.List;

/**
 * 09.07.2017
 *
 * @author Robert Bagramov.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String user(@ModelAttribute("model") ModelMap model, @RequestParam(value = "id") Long id) {

        User user = userService.getUserById(id);
        List<Post> posts = user.getPosts();
        UserInfo userInfo = user.getUserInfo();

        model.addAttribute("user", user);
        model.addAttribute("posts", posts);
        model.addAttribute("userInfo", userInfo);

        return "userPage";
    }
}