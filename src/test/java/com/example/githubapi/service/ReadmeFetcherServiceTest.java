package com.example.githubapi.service;

import com.example.githubapi.GithubResponseUtil;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReadmeFetcherServiceTest {

    private static final String SOME_TEXT_TO_TEST = "some text to test";
    ReadmeFetcherService readmeFetcherService;

    @Test
    public void getReadme() {
        readmeFetcherService = new ReadmeFetcherService();

        ProjectsFetcherService projectsFetcherService = mock(ProjectsFetcherService.class);
        when(projectsFetcherService.getProjectsForUser("userName")).
                thenReturn(GithubResponseUtil.mockProjectsSummary());
        when(projectsFetcherService.getReadmeInfo("userName", "ExcelPoiSample")).
                thenReturn(GithubResponseUtil.mockReadmeInfo());
        readmeFetcherService.setProjectsFetcherService(projectsFetcherService);

        DownloadFileService downloadFileService = mock(DownloadFileService.class);
        when(downloadFileService.getFileFromURL("https://raw.githubusercontent.com/Mumuksia/ExcelPoiSample/master/README.md")).
                thenReturn(SOME_TEXT_TO_TEST);
        readmeFetcherService.setDownloadFileService(downloadFileService);

        String result = readmeFetcherService.getReadme("userName", "ExcelPoiSample");

        assertEquals(SOME_TEXT_TO_TEST, result);
    }

    @Test
    public void getReadme_Empty() {
        readmeFetcherService = new ReadmeFetcherService();

        ProjectsFetcherService projectsFetcherService = mock(ProjectsFetcherService.class);
        when(projectsFetcherService.getProjectsForUser("userName")).
                thenReturn(GithubResponseUtil.mockProjectsSummary());
        when(projectsFetcherService.getReadmeInfo("userName", "ExcelPoiSample")).
                thenReturn(GithubResponseUtil.mockReadmeInfo());
        readmeFetcherService.setProjectsFetcherService(projectsFetcherService);

        DownloadFileService downloadFileService = mock(DownloadFileService.class);
        when(downloadFileService.getFileFromURL("https://raw.githubusercontent.com/Mumuksia/ExcelPoiSample/master/README.md")).
                thenReturn("");
        readmeFetcherService.setDownloadFileService(downloadFileService);

        String result = readmeFetcherService.getReadme("userName", "ExcelPoiSample");

        assertEquals("", result);
    }

}