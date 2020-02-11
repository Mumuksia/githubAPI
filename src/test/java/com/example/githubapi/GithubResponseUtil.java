package com.example.githubapi;

import java.util.Optional;

/**
 * Util class for storing dummy responses. Other option is to have separate resource file for every response
 * but it would slow down unit tests a bit
 */
public class GithubResponseUtil {

    private static String projectInfo = "[\n" +
            "  {\n" +
            "    \"id\": 21045196,\n" +
            "    \"node_id\": \"MDEwOlJlcG9zaXRvcnkyMTA0NTE5Ng==\",\n" +
            "    \"name\": \"ExcelPoiSample\",\n" +
            "    \"full_name\": \"Mumuksia/ExcelPoiSample\",\n" +
            "    \"private\": false,\n" +
            "    \"owner\": {\n" +
            "      \"login\": \"Mumuksia\",\n" +
            "      \"id\": 1185817,\n" +
            "      \"node_id\": \"MDQ6VXNlcjExODU4MTc=\",\n" +
            "      \"avatar_url\": \"https://avatars3.githubusercontent.com/u/1185817?v=4\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/Mumuksia\",\n" +
            "      \"html_url\": \"https://github.com/Mumuksia\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/Mumuksia/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/Mumuksia/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/Mumuksia/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/Mumuksia/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/Mumuksia/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/Mumuksia/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/Mumuksia/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/Mumuksia/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/Mumuksia/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false\n" +
            "    },\n" +
            "    \"html_url\": \"https://github.com/Mumuksia/ExcelPoiSample\",\n" +
            "    \"description\": \"Application to play around with excel file using apache poi\",\n" +
            "    \"fork\": false,\n" +
            "    \"url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample\",\n" +
            "    \"forks_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/forks\",\n" +
            "    \"keys_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/keys{/key_id}\",\n" +
            "    \"collaborators_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/collaborators{/collaborator}\",\n" +
            "    \"teams_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/teams\",\n" +
            "    \"hooks_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/hooks\",\n" +
            "    \"issue_events_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/issues/events{/number}\",\n" +
            "    \"events_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/events\",\n" +
            "    \"assignees_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/assignees{/user}\",\n" +
            "    \"branches_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/branches{/branch}\",\n" +
            "    \"tags_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/tags\",\n" +
            "    \"blobs_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/git/blobs{/sha}\",\n" +
            "    \"git_tags_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/git/tags{/sha}\",\n" +
            "    \"git_refs_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/git/refs{/sha}\",\n" +
            "    \"trees_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/git/trees{/sha}\",\n" +
            "    \"statuses_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/statuses/{sha}\",\n" +
            "    \"languages_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/languages\",\n" +
            "    \"stargazers_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/stargazers\",\n" +
            "    \"contributors_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/contributors\",\n" +
            "    \"subscribers_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/subscribers\",\n" +
            "    \"subscription_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/subscription\",\n" +
            "    \"commits_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/commits{/sha}\",\n" +
            "    \"git_commits_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/git/commits{/sha}\",\n" +
            "    \"comments_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/comments{/number}\",\n" +
            "    \"issue_comment_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/issues/comments{/number}\",\n" +
            "    \"contents_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/contents/{+path}\",\n" +
            "    \"compare_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/compare/{base}...{head}\",\n" +
            "    \"merges_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/merges\",\n" +
            "    \"archive_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/{archive_format}{/ref}\",\n" +
            "    \"downloads_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/downloads\",\n" +
            "    \"issues_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/issues{/number}\",\n" +
            "    \"pulls_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/pulls{/number}\",\n" +
            "    \"milestones_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/milestones{/number}\",\n" +
            "    \"notifications_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/notifications{?since,all,participating}\",\n" +
            "    \"labels_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/labels{/name}\",\n" +
            "    \"releases_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/releases{/id}\",\n" +
            "    \"deployments_url\": \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/deployments\",\n" +
            "    \"created_at\": \"2014-06-20T16:49:42Z\",\n" +
            "    \"updated_at\": \"2014-06-26T08:23:44Z\",\n" +
            "    \"pushed_at\": \"2014-06-26T10:21:55Z\",\n" +
            "    \"git_url\": \"git://github.com/Mumuksia/ExcelPoiSample.git\",\n" +
            "    \"ssh_url\": \"git@github.com:Mumuksia/ExcelPoiSample.git\",\n" +
            "    \"clone_url\": \"https://github.com/Mumuksia/ExcelPoiSample.git\",\n" +
            "    \"svn_url\": \"https://github.com/Mumuksia/ExcelPoiSample\",\n" +
            "    \"homepage\": null,\n" +
            "    \"size\": 188,\n" +
            "    \"stargazers_count\": 0,\n" +
            "    \"watchers_count\": 0,\n" +
            "    \"language\": \"JavaScript\",\n" +
            "    \"has_issues\": true,\n" +
            "    \"has_projects\": true,\n" +
            "    \"has_downloads\": true,\n" +
            "    \"has_wiki\": true,\n" +
            "    \"has_pages\": false,\n" +
            "    \"forks_count\": 0,\n" +
            "    \"mirror_url\": null,\n" +
            "    \"archived\": false,\n" +
            "    \"disabled\": false,\n" +
            "    \"open_issues_count\": 0,\n" +
            "    \"license\": null,\n" +
            "    \"forks\": 0,\n" +
            "    \"open_issues\": 0,\n" +
            "    \"watchers\": 0,\n" +
            "    \"default_branch\": \"master\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 239603621,\n" +
            "    \"node_id\": \"MDEwOlJlcG9zaXRvcnkyMzk2MDM2MjE=\",\n" +
            "    \"name\": \"githubAPI\",\n" +
            "    \"full_name\": \"Mumuksia/githubAPI\",\n" +
            "    \"private\": false,\n" +
            "    \"owner\": {\n" +
            "      \"login\": \"Mumuksia\",\n" +
            "      \"id\": 1185817,\n" +
            "      \"node_id\": \"MDQ6VXNlcjExODU4MTc=\",\n" +
            "      \"avatar_url\": \"https://avatars3.githubusercontent.com/u/1185817?v=4\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/Mumuksia\",\n" +
            "      \"html_url\": \"https://github.com/Mumuksia\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/Mumuksia/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/Mumuksia/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/Mumuksia/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/Mumuksia/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/Mumuksia/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/Mumuksia/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/Mumuksia/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/Mumuksia/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/Mumuksia/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false\n" +
            "    },\n" +
            "    \"html_url\": \"https://github.com/Mumuksia/githubAPI\",\n" +
            "    \"description\": \"service to get familiar with basic github api functionality\",\n" +
            "    \"fork\": false,\n" +
            "    \"url\": \"https://api.github.com/repos/Mumuksia/githubAPI\",\n" +
            "    \"forks_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/forks\",\n" +
            "    \"keys_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/keys{/key_id}\",\n" +
            "    \"collaborators_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/collaborators{/collaborator}\",\n" +
            "    \"teams_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/teams\",\n" +
            "    \"hooks_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/hooks\",\n" +
            "    \"issue_events_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/issues/events{/number}\",\n" +
            "    \"events_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/events\",\n" +
            "    \"assignees_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/assignees{/user}\",\n" +
            "    \"branches_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/branches{/branch}\",\n" +
            "    \"tags_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/tags\",\n" +
            "    \"blobs_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/git/blobs{/sha}\",\n" +
            "    \"git_tags_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/git/tags{/sha}\",\n" +
            "    \"git_refs_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/git/refs{/sha}\",\n" +
            "    \"trees_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/git/trees{/sha}\",\n" +
            "    \"statuses_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/statuses/{sha}\",\n" +
            "    \"languages_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/languages\",\n" +
            "    \"stargazers_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/stargazers\",\n" +
            "    \"contributors_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/contributors\",\n" +
            "    \"subscribers_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/subscribers\",\n" +
            "    \"subscription_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/subscription\",\n" +
            "    \"commits_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/commits{/sha}\",\n" +
            "    \"git_commits_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/git/commits{/sha}\",\n" +
            "    \"comments_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/comments{/number}\",\n" +
            "    \"issue_comment_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/issues/comments{/number}\",\n" +
            "    \"contents_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/contents/{+path}\",\n" +
            "    \"compare_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/compare/{base}...{head}\",\n" +
            "    \"merges_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/merges\",\n" +
            "    \"archive_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/{archive_format}{/ref}\",\n" +
            "    \"downloads_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/downloads\",\n" +
            "    \"issues_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/issues{/number}\",\n" +
            "    \"pulls_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/pulls{/number}\",\n" +
            "    \"milestones_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/milestones{/number}\",\n" +
            "    \"notifications_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/notifications{?since,all,participating}\",\n" +
            "    \"labels_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/labels{/name}\",\n" +
            "    \"releases_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/releases{/id}\",\n" +
            "    \"deployments_url\": \"https://api.github.com/repos/Mumuksia/githubAPI/deployments\",\n" +
            "    \"created_at\": \"2020-02-10T20:12:55Z\",\n" +
            "    \"updated_at\": \"2020-02-11T12:59:21Z\",\n" +
            "    \"pushed_at\": \"2020-02-11T12:59:17Z\",\n" +
            "    \"git_url\": \"git://github.com/Mumuksia/githubAPI.git\",\n" +
            "    \"ssh_url\": \"git@github.com:Mumuksia/githubAPI.git\",\n" +
            "    \"clone_url\": \"https://github.com/Mumuksia/githubAPI.git\",\n" +
            "    \"svn_url\": \"https://github.com/Mumuksia/githubAPI\",\n" +
            "    \"homepage\": null,\n" +
            "    \"size\": 31,\n" +
            "    \"stargazers_count\": 0,\n" +
            "    \"watchers_count\": 0,\n" +
            "    \"language\": \"Java\",\n" +
            "    \"has_issues\": true,\n" +
            "    \"has_projects\": true,\n" +
            "    \"has_downloads\": true,\n" +
            "    \"has_wiki\": true,\n" +
            "    \"has_pages\": false,\n" +
            "    \"forks_count\": 0,\n" +
            "    \"mirror_url\": null,\n" +
            "    \"archived\": false,\n" +
            "    \"disabled\": false,\n" +
            "    \"open_issues_count\": 0,\n" +
            "    \"license\": null,\n" +
            "    \"forks\": 0,\n" +
            "    \"open_issues\": 0,\n" +
            "    \"watchers\": 0,\n" +
            "    \"default_branch\": \"master\"\n" +
            "  }\n" +
            "  ]";

    private static final String readmeInfo = "{\n" +
            "    name: \"README.md\",\n" +
            "    path: \"README.md\",\n" +
            "    sha: \"0262e85564a4c5449de820f5bd34a59abaf6b32a\",\n" +
            "    size: 91,\n" +
            "    url: \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/contents/README.md?ref=master\",\n" +
            "    html_url: \"https://github.com/Mumuksia/ExcelPoiSample/blob/master/README.md\",\n" +
            "    git_url: \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/git/blobs/0262e85564a4c5449de820f5bd34a59abaf6b32a\",\n" +
            "    download_url: \"https://raw.githubusercontent.com/Mumuksia/ExcelPoiSample/master/README.md\",\n" +
            "    type: \"file\",\n" +
            "    content: \"RXhjZWxQb2lTYW1wbGUKPT09PT09PT09PT09PT0KCkFwcGxpY2F0aW9uIHRv\\nIHBsYXkgYXJvdW5kIHdpdGggZXhjZWwgZmlsZSB1c2luZyBhcGFjaGUgcG9p\\nCg==\\n\",\n" +
            "    encoding: \"base64\",\n" +
            "    _links: {\n" +
            "    self: \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/contents/README.md?ref=master\",\n" +
            "    git: \"https://api.github.com/repos/Mumuksia/ExcelPoiSample/git/blobs/0262e85564a4c5449de820f5bd34a59abaf6b32a\",\n" +
            "    html: \"https://github.com/Mumuksia/ExcelPoiSample/blob/master/README.md\"\n" +
            "}\n" +
            "}";

    private static final String commit_activity = "[\n" +
            "  {\n" +
            "    \"days\": [\n" +
            "      0,\n" +
            "      3,\n" +
            "      26,\n" +
            "      20,\n" +
            "      39,\n" +
            "      1,\n" +
            "      0\n" +
            "    ],\n" +
            "    \"total\": 89,\n" +
            "    \"week\": 1336280400\n" +
            "  }\n" +
            "]";

    private static final String contributors = "[\n" +
            "{\n" +
            "    login: \"Mumuksia\",\n" +
            "    id: 1185817,\n" +
            "    node_id: \"MDQ6VXNlcjExODU4MTc=\",\n" +
            "    avatar_url: \"https://avatars3.githubusercontent.com/u/1185817?v=4\",\n" +
            "    gravatar_id: \"\",\n" +
            "    url: \"https://api.github.com/users/Mumuksia\",\n" +
            "    html_url: \"https://github.com/Mumuksia\",\n" +
            "    followers_url: \"https://api.github.com/users/Mumuksia/followers\",\n" +
            "    following_url: \"https://api.github.com/users/Mumuksia/following{/other_user}\",\n" +
            "    gists_url: \"https://api.github.com/users/Mumuksia/gists{/gist_id}\",\n" +
            "    starred_url: \"https://api.github.com/users/Mumuksia/starred{/owner}{/repo}\",\n" +
            "    subscriptions_url: \"https://api.github.com/users/Mumuksia/subscriptions\",\n" +
            "    organizations_url: \"https://api.github.com/users/Mumuksia/orgs\",\n" +
            "    repos_url: \"https://api.github.com/users/Mumuksia/repos\",\n" +
            "    events_url: \"https://api.github.com/users/Mumuksia/events{/privacy}\",\n" +
            "    received_events_url: \"https://api.github.com/users/Mumuksia/received_events\",\n" +
            "    type: \"User\",\n" +
            "    site_admin: false,\n" +
            "    contributions: 1\n" +
            "}\n" +
            "]";

    public static Optional<String> mockProjectsSummary() {
        return Optional.of(projectInfo);
    }

    public static Optional<String> mockReadmeInfo() {
        return Optional.of(readmeInfo);
    }

    public static Optional<String> mockCommitActivity() {
        return Optional.of(commit_activity);
    }

    public static Optional<String> mockContributors() {
        return Optional.of(contributors);
    }
}
