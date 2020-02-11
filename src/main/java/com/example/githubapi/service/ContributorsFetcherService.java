package com.example.githubapi.service;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContributorsFetcherService {

    @Autowired
    ProjectsFetcherService projectsFetcherService;

    public List<String> getContributors(String userName, String repoName) {
        List<String> contributorsName = new ArrayList<>();
        Optional<String> contributors = projectsFetcherService.getContributors(userName, repoName);

        if (contributors.isPresent()) {
            JSONArray contributorsArr = new JSONArray(contributors.get());

            for (int i = 0; i < contributorsArr.length(); i++) {
                contributorsName.add(contributorsArr.getJSONObject(i).getString("login"));
            }
        }

        return contributorsName;
    }

    public void setProjectsFetcherService(ProjectsFetcherService projectsFetcherService) {
        this.projectsFetcherService = projectsFetcherService;
    }
}
