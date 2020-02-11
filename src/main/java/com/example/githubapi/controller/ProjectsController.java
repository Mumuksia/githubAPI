package com.example.githubapi.controller;

import com.example.githubapi.manager.ProjectsSummaryManager;
import com.example.githubapi.model.ProjectInformation;
import com.example.githubapi.model.ProjectSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProjectsController {

    @Autowired
    ProjectsSummaryManager projectsSummaryManager;

    @RequestMapping(value = "/projects/{username}/{project_id}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
    @ResponseBody
    public ProjectInformation getProjectInformationForUser(@PathVariable(value = "username") String username,
                                                           @PathVariable(value = "project_id") long projectId) {

        return projectsSummaryManager.getProjectInformationForUser(username, projectId);
    }

    @RequestMapping(value = "/projects/{username}", produces = {"application/json", "application/xml"}, method = RequestMethod.GET)
    @ResponseBody
    public List<ProjectSummary>
    getProjectsSummaryForUser(@PathVariable(value = "username") String username) {

        return projectsSummaryManager.getProjectsSummaryForUser(username);
    }
}
