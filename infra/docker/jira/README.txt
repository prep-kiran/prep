About Docker image:
There is no official image from Atlassian. This is from one of their dev's private account

Docker image url: 
https://hub.docker.com/r/dchevell/jira-software/

Docker volume: 
jiraVolume

Jira url: 
http://localhost:8080
(please note that the port could be different as it is a runtime parameter)

Jira creds:
learnbay-kiran/password

Command to run:
docker run -v jiraVolume:/var/atlassian/application-data/jira --name="jira" -d -p 8080:8080 dchevell/jira-software


