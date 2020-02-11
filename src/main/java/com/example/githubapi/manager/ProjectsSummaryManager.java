package com.example.githubapi.manager;

import com.example.githubapi.converter.StringToResponseModelConverter;
import com.example.githubapi.model.ProjectInformation;
import com.example.githubapi.model.ProjectSummary;
import com.example.githubapi.service.CommitCountFetcherService;
import com.example.githubapi.service.ContributorsFetcherService;
import com.example.githubapi.service.ProjectsFetcherService;
import com.example.githubapi.service.ReadmeFetcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectsSummaryManager {

    @Autowired
    ProjectsFetcherService projectsFetcherService;
    @Autowired
    StringToResponseModelConverter stringToResponseModelConverter;
    @Autowired
    ReadmeFetcherService readmeFetcherService;
    @Autowired
    ContributorsFetcherService contributorsFetcherService;
    @Autowired
    CommitCountFetcherService commitCountFetcherService;

    public List<ProjectSummary> getProjectsSummaryForUser(String userName) {
        Optional<String> possibleProjects = projectsFetcherService.getProjectsForUser(userName);

        if (possibleProjects.isPresent()) {
            return stringToResponseModelConverter.convertResponseForProjects(possibleProjects.get());
        }
        return new ArrayList<>();
    }

    public ProjectInformation getProjectInformationForUser(String userName, long projectId) {
        Optional<String> potentialRepoName = getRepoName(userName, projectId);

        ProjectInformation projectInformation = new ProjectInformation();

        if (potentialRepoName.isPresent()) {
            String repoName = potentialRepoName.get();

            projectInformation.setRepoName(repoName);
            projectInformation.setReadme(readmeFetcherService.getReadme(userName, repoName));
            projectInformation.setContributors(contributorsFetcherService.getContributors(userName, repoName));
            projectInformation.setTotalCommits(commitCountFetcherService.getTotalCommitCount(userName, repoName));
        }
        return projectInformation;
    }

    private Optional<String> getRepoName(String userName, long projectId) {
        if (!StringUtils.hasText(userName))
            return Optional.empty();

        Optional<String> possibleProjects = projectsFetcherService.getProjectsForUser(userName);

        if (possibleProjects.isPresent()) {
            List<ProjectSummary> projectsSummaries = stringToResponseModelConverter.convertResponseForProjects(possibleProjects.get());

            return projectsSummaries.stream().filter(ps -> Long.valueOf(projectId).equals(ps.getId())).
                    map(ProjectSummary::getTitle).findAny();
        }
        return Optional.empty();
    }

    public void setProjectsFetcherService(ProjectsFetcherService projectsFetcherService) {
        this.projectsFetcherService = projectsFetcherService;
    }

    public void setStringToResponseModelConverter(StringToResponseModelConverter stringToResponseModelConverter) {
        this.stringToResponseModelConverter = stringToResponseModelConverter;
    }

    public void setReadmeFetcherService(ReadmeFetcherService readmeFetcherService) {
        this.readmeFetcherService = readmeFetcherService;
    }

    public void setContributorsFetcherService(ContributorsFetcherService contributorsFetcherService) {
        this.contributorsFetcherService = contributorsFetcherService;
    }

    public void setCommitCountFetcherService(CommitCountFetcherService commitCountFetcherService) {
        this.commitCountFetcherService = commitCountFetcherService;
    }
}
