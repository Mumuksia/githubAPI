package com.example.githubapi.service.impl;

import com.example.githubapi.service.ProjectsFetcherService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GithubProjectsFetcherService implements ProjectsFetcherService {

    private static final String API_GITHUB_USERS_URL = "https://api.github.com/users";
    private static final String API_GITHUB_REPOS_URL = "https://api.github.com/repos";
    private static final String REPOS = "repos";

    @Override
    public Optional<String> getProjectsForUser(String userName) {

        WebResource webResource = getUsersWebResource();
        ClientResponse response = webResource.path(userName).path(REPOS).
                get(ClientResponse.class);

        if (response.getStatus() == 200) {
            return Optional.of(response.getEntity(String.class));
        }

        return Optional.empty();
    }

    @Override
    public Optional<String> getReadmeInfo(String userName, String repoName) {
        WebResource webResource = getReposWebResource();
        ClientResponse response = webResource.path(userName).path(repoName).path("readme").
                get(ClientResponse.class);

        if (response.getStatus() == 200) {
            return Optional.of(response.getEntity(String.class));
        }

        return Optional.empty();
    }

    @Override
    public Optional<String> getContributors(String userName, String repoName) {
        WebResource webResource = getReposWebResource();
        ClientResponse response = webResource.path(userName).path(repoName).path("contributors").
                get(ClientResponse.class);

        if (response.getStatus() == 200) {
            return Optional.of(response.getEntity(String.class));
        }

        return Optional.empty();
    }

    @Override
    public Optional<String> getNumberOfCommits(String userName, String repoName) {
        WebResource webResource = getReposWebResource();
        ClientResponse response = webResource.path(userName).path(repoName).path("stats").path("commit_activity").
                get(ClientResponse.class);

        if (response.getStatus() == 200) {
            return Optional.of(response.getEntity(String.class));
        }

        return Optional.empty();
    }

    private WebResource getUsersWebResource() {
        Client client = Client.create();
        return client.resource(API_GITHUB_USERS_URL);
    }

    private WebResource getReposWebResource() {
        Client client = Client.create();
        return client.resource(API_GITHUB_REPOS_URL);
    }

}
