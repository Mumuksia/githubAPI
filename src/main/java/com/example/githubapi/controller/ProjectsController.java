package com.example.githubapi.controller;

import com.example.githubapi.service.ProjectsFetcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProjectsController {

    @Autowired
    ProjectsFetcherService projectsFetcherService;

    @RequestMapping("/projects/{username}/{project_id}")
    public String getProjectInformationForUser(@PathVariable(value = "username") String username,
                                               @PathVariable(value = "project_id") String projectId) {

        return projectsFetcherService.getProjectsForUser(username).orElse("");
    }

    @RequestMapping("/projects/{username}")
    public String getProjectsSummaryForUser(@PathVariable(value = "username") String username) {

        return projectsFetcherService.getProjectsForUser(username).orElse("");
    }
}
