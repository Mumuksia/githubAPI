package com.example.githubapi.service;

import java.util.Optional;

public interface ProjectsFetcherService {

    Optional<String> getProjectsForUser(String userName);

    Optional<String> getReadmeInfo(String userName, String repoName);

    Optional<String> getContributors(String userName, String repoName);

    Optional<String> getNumberOfCommits(String userName, String repoName);

}
