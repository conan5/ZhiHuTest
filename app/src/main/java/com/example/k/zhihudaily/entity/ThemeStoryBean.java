package com.example.k.zhihudaily.entity;

import java.util.List;

/**
 * Created by K on 2016/11/8.
 */

public class ThemeStoryBean {

    private List<String> images;
    private int type;
    private long id;
    private String title;

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
