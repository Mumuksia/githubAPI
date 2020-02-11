package com.example.githubapi.service;

import com.example.githubapi.GithubResponseUtil;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CommitCountFetcherServiceTest {

    CommitCountFetcherService commitCountFetcherService;

    @Test
    public void getTotalCommitCount() {

        commitCountFetcherService = new CommitCountFetcherService();

        ProjectsFetcherService projectsFetcherService = mock(ProjectsFetcherService.class);
        when(projectsFetcherService.getProjectsForUser("userName")).
                thenReturn(GithubResponseUtil.mockProjectsSummary());
        when(projectsFetcherService.getNumberOfCommits("userName", "ExcelPoiSample")).
                thenReturn(GithubResponseUtil.mockCommitActivity());
        commitCountFetcherService.setProjectsFetcherService(projectsFetcherService);

        long result = commitCountFetcherService.getTotalCommitCount("userName", "ExcelPoiSample");

        assertEquals(89, result);
    }

    @Test
    public void getTotalCommitCount_Empty() {

        commitCountFetcherService = new CommitCountFetcherService();

        ProjectsFetcherService projectsFetcherService = mock(ProjectsFetcherService.class);
        when(projectsFetcherService.getProjectsForUser("userName")).
                thenReturn(GithubResponseUtil.mockProjectsSummary());
        when(projectsFetcherService.getNumberOfCommits("userName", "ExcelPoiSample")).
                thenReturn(Optional.of(""));
        commitCountFetcherService.setProjectsFetcherService(projectsFetcherService);

        long result = commitCountFetcherService.getTotalCommitCount("userName", "ExcelPoiSample");

        assertEquals(0, result);
    }
}