package com.example.githubapi.service;

import org.json.JSONObject;

import java.util.Optional;

public interface ProjectsFetcherService {

    Optional<String> getProjectsForUser(String userName);

    JSONObject getProjectInfoForUser(String userName, String projectId);

}
