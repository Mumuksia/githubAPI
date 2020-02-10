package com.example.githubapi.converter;

import com.example.githubapi.model.Project;

import java.util.Set;

public interface StringToResponseModelConverter {

    Set<Project> convertResponseForProjects(String projects);
}
