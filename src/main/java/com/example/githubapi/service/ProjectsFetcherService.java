package com.example.githubapi.service;

import org.json.JSONObject;

import java.util.Optional;

public interface ProjectsFetcherService {

    Optional<String> getProjectsForUser(String userName);

    JSONObject getProjectInfoForUser(String userName, String projectId);

    Optional<String> getReadmeInfo(String userName, String repoName);

    Optional<String> getContributors(String userName, String repoName);

    Optional<String> getNumberOfCommits(String userName, String repoName);

}
