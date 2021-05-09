package com.manhtai.shopmanhtai.fragment_notification.child_model;

public class Notification1 {
    private int image;
    private String title;
    private String contentShort;

    public Notification1(int image, String title, String contentShort) {
        this.image = image;
        this.title = title;
        this.contentShort = contentShort;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentShort() {
        return contentShort;
    }

    public void setContentShort(String contentShort) {
        this.contentShort = contentShort;
    }
}
