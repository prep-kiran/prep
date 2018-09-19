About Docker image:
This is the official image from Sonatype

Docker image url: 
https://hub.docker.com/r/sonatype/nexus3/

Docker volume: 
nexusVolume

Nexus url: 
http://localhost:8081
(please note that the port could be different as it is a runtime parameter)

Nexus creds:
admin/admin123

Command to run:
docker run -d -p 8081:8081 --name nexus -v nexusVolume:/nexus-data sonatype/nexus3


