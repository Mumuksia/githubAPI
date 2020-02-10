package com.example.githubapi.model;

public class Project {

    private long id;

    private String url;

    private String title;

    public Project(long id, String url, String title) {
        this.id = id;
        this.url = url;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
