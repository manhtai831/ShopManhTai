package com.manhtai.shopmanhtai.fragment_me.child_model;

public class ItemChild {
    int image_title,image_next;
    String title;


    public ItemChild(int image_title, int image_next, String title) {
        this.image_title = image_title;
        this.image_next = image_next;
        this.title = title;
    }

    public int getImage_title() {
        return image_title;
    }

    public void setImage_title(int image_title) {
        this.image_title = image_title;
    }

    public int getImage_next() {
        return image_next;
    }

    public void setImage_next(int image_next) {
        this.image_next = image_next;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
