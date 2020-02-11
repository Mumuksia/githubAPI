# githubAPI
service to get familiar with basic github api functionality

# description
The service contains two endpoints:

get project summary - /projects/{username} which will return summary of projects for the user. The summary consists of URL, Title and project id.

detailed project information - /projects/{username}/{project_id} which returns gathered information about different aspects of the project. 
Like: list of contributors, number of commits and extract of readme for the project. 

Each endpoint has two produced media types: JSON and XML. In order to switch between those the mediatype parameter should be added at the end of request like:
url?mediaType=xml. the default mediaType is JSON.

Project has also circleCI integration which runs the tasks to build and test the project.
Also it creates docker image and pushes it to docker hub.

# running application
There are different ways to run application, the most simple are:

- getting project from repository and run main springBooApplication class. It will start spring boot application and rest endpoints wil be available on 80 port.

- similar the project can be started with running gradle bootRun from terminal (gradle should be preinstalled for that).

The default port for this application is 80 but it can easily be changed in application.properties file.

# todo

- Add proper logging
- Add integration tests
- Introduce caching for projectsSummary call as it is called also to get repoName from project_id
- Add better exception handling and provide better output in case of error
 
   
