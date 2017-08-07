package ru.fsep.models;


import java.util.Date;

/**
 * 24.07.2017
 *
 * @author Robert Bagramov.
 */

public class Post {

    private String text;

    private Date date;

    public Post() {
    }

    public Post(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
