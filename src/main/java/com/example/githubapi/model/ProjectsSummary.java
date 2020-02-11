package com.example.githubapi.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectsSummary {

    @XmlElementWrapper(name = "projectSummaries")
    @XmlElement(name = "projectSummary")
    private List<ProjectSummary> projectSummaries;

    public ProjectsSummary() {
        this.projectSummaries = new ArrayList<>();
    }

    public List<ProjectSummary> getProjectSummaries() {
        return projectSummaries;
    }

    public void setProjectSummaries(List<ProjectSummary> projectSummaries) {
        this.projectSummaries = projectSummaries;
    }
}
