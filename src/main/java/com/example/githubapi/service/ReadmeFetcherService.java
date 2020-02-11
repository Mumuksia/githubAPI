package com.example.githubapi.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class ReadmeFetcherService {

    @Autowired
    ProjectsFetcherService projectsFetcherService;
    @Autowired
    DownloadFileService downloadFileService;

    public String getReadme(String userName, String repoName) {
        Optional<String> potentialReadmeInfo = projectsFetcherService.getReadmeInfo(userName, repoName);

        if (potentialReadmeInfo.isPresent()) {
            JSONObject readmeInfo = new JSONObject(potentialReadmeInfo.get());

            String readmeTxt = downloadFileService.getFileFromURL(readmeInfo.getString("download_url"));

            return extractWords(readmeTxt);
        }

        return "";
    }

    private String extractWords(String text) {
        if (!StringUtils.hasText(text))
            return "";
        String[] words = text.split(" ");
        int length = Math.min(words.length, 50);
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]);
        for (int i = 1; i < length; i++)
            sb.append(" ").append(words[i]);
        return sb.toString();
    }

    public void setProjectsFetcherService(ProjectsFetcherService projectsFetcherService) {
        this.projectsFetcherService = projectsFetcherService;
    }

    public void setDownloadFileService(DownloadFileService downloadFileService) {
        this.downloadFileService = downloadFileService;
    }
}
