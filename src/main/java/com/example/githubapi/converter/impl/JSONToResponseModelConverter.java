package com.example.githubapi.converter.impl;

import com.example.githubapi.converter.StringToResponseModelConverter;
import com.example.githubapi.model.ProjectSummary;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class JSONToResponseModelConverter implements StringToResponseModelConverter {

    @Override
    public List<ProjectSummary> convertResponseForProjects(String projects) {
        List<ProjectSummary> responseProjectSummaries = new ArrayList<>();
        if (!StringUtils.hasText(projects))
            return responseProjectSummaries;

        JSONArray jsonProjects = new JSONArray(projects);

        for (int i = 0; i < jsonProjects.length(); i++) {
            JSONObject project = jsonProjects.getJSONObject(i);

            responseProjectSummaries.add(new ProjectSummary(project.getLong("id"), project.getString("html_url"),
                    project.getString("name")));
        }

        return responseProjectSummaries;
    }
}
