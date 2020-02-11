package com.example.githubapi.service;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class CommitCountFetcherService {

    @Autowired
    ProjectsFetcherService projectsFetcherService;

    public Long getTotalCommitCount(String userName, String repoName) {
        Optional<String> possibleCountJSON = projectsFetcherService.getNumberOfCommits(userName, repoName);
        long total = 0;

        if (possibleCountJSON.isPresent() && StringUtils.hasText(possibleCountJSON.get())) {
            JSONArray countWeeks = new JSONArray(possibleCountJSON.get());
            for (int i = 0; i < countWeeks.length(); i++)
                total += countWeeks.getJSONObject(i).getInt("total");
            return total;
        }

        return total;
    }

    public void setProjectsFetcherService(ProjectsFetcherService projectsFetcherService) {
        this.projectsFetcherService = projectsFetcherService;
    }
}
