package com.example.githubapi.converter.impl;

import com.example.githubapi.GithubProjectsUtil;
import com.example.githubapi.model.ProjectSummary;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JSONToResponseModelConverterTest {

    JSONToResponseModelConverter converter;

    @Test
    void convertResponseForProjects() {

        converter = new JSONToResponseModelConverter();
        List<ProjectSummary> projectSummaries = converter.convertResponseForProjects(GithubProjectsUtil.getProjects());

        assertEquals(2, projectSummaries.size());

        assertEquals(239603621, projectSummaries.get(1).getId());
        assertEquals("githubAPI", projectSummaries.get(1).getTitle());
        assertEquals("https://github.com/Mumuksia/githubAPI", projectSummaries.get(1).getUrl());
    }

    @Test
    void convertResponseForProjects_empty() {

        converter = new JSONToResponseModelConverter();
        List<ProjectSummary> projectSummaries = converter.convertResponseForProjects("");

        assertEquals(0, projectSummaries.size());

    }

    @Test
    void convertResponseForProjects_emptyArray() {

        converter = new JSONToResponseModelConverter();
        List<ProjectSummary> projectSummaries = converter.convertResponseForProjects("[]");

        assertEquals(0, projectSummaries.size());

    }
}