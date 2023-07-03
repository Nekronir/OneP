package com.example.onep.model;

public class Course {

    private int id;
    private String title;

    private String text;

    private String level;

    private String color;
    private String date;
    private String image;


    public Course(int id, String img, String title, String date, String level, String color,String text) {
        this.id = id;
        this.image = img;
        this.title = title;
        this.date = date;
        this.level = level;
        this.color = color;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return image;
    }

    public void setImg(String img) {
        this.image = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
