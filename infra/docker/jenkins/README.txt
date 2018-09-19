About Docker image:
This is the official image from Jenkins. This is the LTS version.

Docker image url: 
https://hub.docker.com/r/jenkins/jenkins/

Docker volume: 
jenkinsVolume

Jenkins url: 
http://localhost:8080
(please note that the port could be different as it is a runtime parameter. If Jenkins server has to connect to slaves using JNLP, port 50000 is used)

Jenkins creds:
jenkins/jenkins

Command to run:
docker run -d --name jenkins -v jenkinsVolume:/var/jenkins_home -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts


