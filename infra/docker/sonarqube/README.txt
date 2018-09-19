About Docker image:
This is the official image from Sonarqube

Docker image url: 
https://hub.docker.com/_/sonarqube/

Docker volume: 
No volume created for now. It is recommended to create a separate DB (postgre) instead of the embedded (H2) that this image is using.

Sonarqube url: 
http://localhost:9000/projects
(please note that the port could be different as it is a runtime parameter. For now, the sonarqube web server uses 9000 and its embedded db uses 9092)

Sonarqube creds:
admin/admin

Command to run:
docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube


