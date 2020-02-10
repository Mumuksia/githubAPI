package com.example.githubapi.converter.impl;

import com.example.githubapi.converter.StringToResponseModelConverter;
import com.example.githubapi.model.Project;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

@Service
public class JSONToResponseModelConverter implements StringToResponseModelConverter {

    @Override
    public Set<Project> convertResponseForProjects(String projects) {
        Set<Project> responseProjects = new HashSet<>();
        if (StringUtils.isEmpty(projects))
            return responseProjects;

        JSONArray jsonProjects = new JSONArray(projects);

        for (int i = 0; i < jsonProjects.length(); i++) {
            JSONObject project = jsonProjects.getJSONObject(i);

            responseProjects.add(new Project(project.getLong("id"), project.getString("html_url"),
                    project.getString("name")));
        }

        return responseProjects;
    }
}
