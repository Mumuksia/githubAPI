package com.example.githubapi.service;

import com.example.githubapi.GithubResponseUtil;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ContributorsFetcherServiceTest {

    ContributorsFetcherService contributorsFetcherService;

    @Test
    public void getContributors() {

        contributorsFetcherService = new ContributorsFetcherService();
        ProjectsFetcherService projectsFetcherService = mock(ProjectsFetcherService.class);
        when(projectsFetcherService.getProjectsForUser("userName")).
                thenReturn(GithubResponseUtil.mockProjectsSummary());
        when(projectsFetcherService.getContributors("userName", "ExcelPoiSample")).
                thenReturn(GithubResponseUtil.mockContributors());
        contributorsFetcherService.setProjectsFetcherService(projectsFetcherService);

        assertEquals(Collections.singletonList("Mumuksia"), contributorsFetcherService.getContributors("userName", "ExcelPoiSample"));


    }

}