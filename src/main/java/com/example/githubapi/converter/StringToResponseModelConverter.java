package com.example.githubapi.converter;

import com.example.githubapi.model.ProjectSummary;

import java.util.List;

public interface StringToResponseModelConverter {

    List<ProjectSummary> convertResponseForProjects(String projects);
}
