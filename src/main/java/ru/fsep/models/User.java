package ru.fsep.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * 24.07.2017
 *
 * @author Robert Bagramov.
 */

@Document(collection = "users")
public class User {

    @Id
    private Long id;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    private String nickname;

    private String password;

    @Field("photo_link")
    private String photoLink;

    private List<Post> posts;

    private List<Long> followers;

    private List<Long> following;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String nickname, String password, String photoLink, List<Post> posts, List<Long> followers, List<Long> following) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.password = password;
        this.photoLink = photoLink;
        this.posts = posts;
        this.followers = followers;
        this.following = following;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Long> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Long> followers) {
        this.followers = followers;
    }

    public List<Long> getFollowing() {
        return following;
    }

    public void setFollowing(List<Long> following) {
        this.following = following;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", photoLink='" + photoLink + '\'' +
                ", posts=" + posts +
                ", followers=" + followers +
                ", following=" + following +
                '}';
    }

    public UserInfo getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setFollowersCount(followers.size());
        userInfo.setFollowingCount(following.size());
        userInfo.setPostsCount(posts.size());

        return userInfo;
    }
}
