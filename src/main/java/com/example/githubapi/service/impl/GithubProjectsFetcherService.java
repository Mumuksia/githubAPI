package com.example.githubapi.service.impl;

import com.example.githubapi.service.ProjectsFetcherService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GithubProjectsFetcherService implements ProjectsFetcherService {

    private static final String API_GITHUB_USERS_URL = "https://api.github.com/users";
    private static final String REPOS = "repos";

    @Override
    public Optional<String> getProjectsForUser(String userName) {

        Client client = Client.create();
        WebResource webResource = client.resource(API_GITHUB_USERS_URL);
        ClientResponse response = webResource.path(userName).path(REPOS).
                get(ClientResponse.class);

        if (response.getStatus() == 200) {
            return Optional.of(response.getEntity(String.class));
        }

        return Optional.empty();
    }

    @Override
    public JSONObject getProjectInfoForUser(String userName, String projectId) {
        return null;
    }

}
