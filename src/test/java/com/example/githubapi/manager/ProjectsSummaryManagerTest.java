package com.example.githubapi.manager;

import com.example.githubapi.GithubResponseUtil;
import com.example.githubapi.converter.StringToResponseModelConverter;
import com.example.githubapi.model.ProjectInformation;
import com.example.githubapi.model.ProjectSummary;
import com.example.githubapi.service.CommitCountFetcherService;
import com.example.githubapi.service.ContributorsFetcherService;
import com.example.githubapi.service.ProjectsFetcherService;
import com.example.githubapi.service.ReadmeFetcherService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProjectsSummaryManagerTest {

    static final String USERNAME = "username";
    static final String REPO_NAME = "ExcelPoiSample";
    static final long PROJECT_ID = 21045196L;

    static ProjectsSummaryManager projectsSummaryManager;

    @BeforeAll
    public static void init() {
        projectsSummaryManager = new ProjectsSummaryManager();
        ProjectsFetcherService projectsFetcherService = mock(ProjectsFetcherService.class);
        when(projectsFetcherService.getProjectsForUser(USERNAME)).
                thenReturn(GithubResponseUtil.mockProjectsSummary());
        projectsSummaryManager.setProjectsFetcherService(projectsFetcherService);

        StringToResponseModelConverter responseModelConverter = mock(StringToResponseModelConverter.class);
        when(responseModelConverter.convertResponseForProjects(GithubResponseUtil.mockProjectsSummary().orElse("")))
                .thenReturn(Arrays.asList(new ProjectSummary(239603621L, "url", "githubAPI"),
                        new ProjectSummary(PROJECT_ID, "url2", REPO_NAME)));
        projectsSummaryManager.setStringToResponseModelConverter(responseModelConverter);

        ReadmeFetcherService readmeFetcherService = mock(ReadmeFetcherService.class);
        when(readmeFetcherService.getReadme(USERNAME, REPO_NAME)).thenReturn("readme file");
        projectsSummaryManager.setReadmeFetcherService(readmeFetcherService);

        ContributorsFetcherService contributorsFetcherService = mock(ContributorsFetcherService.class);
        when(contributorsFetcherService.getContributors(USERNAME, REPO_NAME)).thenReturn(Arrays.asList("Some", "Person"));
        projectsSummaryManager.setContributorsFetcherService(contributorsFetcherService);

        CommitCountFetcherService commitCountFetcherService = mock(CommitCountFetcherService.class);
        when(commitCountFetcherService.getTotalCommitCount(USERNAME, REPO_NAME)).thenReturn(35L);
        projectsSummaryManager.setCommitCountFetcherService(commitCountFetcherService);
    }

    @Test
    void getProjectsSummaryForUser() {


        List<ProjectSummary> projectsSummaries = projectsSummaryManager.getProjectsSummaryForUser(USERNAME);

        assertEquals(2, projectsSummaries.size());
    }

    @Test
    void getProjectInformationForUser() {

        ProjectInformation projectInformation = projectsSummaryManager.getProjectInformationForUser(USERNAME, PROJECT_ID);

        assertEquals("readme file", projectInformation.getReadme());
        assertEquals(REPO_NAME, projectInformation.getRepoName());
        assertEquals(Arrays.asList("Some", "Person"), projectInformation.getContributors());
        assertEquals(35L, projectInformation.getTotalCommits());
    }
}