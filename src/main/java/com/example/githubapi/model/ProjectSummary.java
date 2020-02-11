package com.example.githubapi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "projectSummary")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectSummary {

    private Long id;

    private String url;

    private String title;

    public ProjectSummary() {
    }

    public ProjectSummary(Long id, String url, String title) {
        this.id = id;
        this.url = url;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
