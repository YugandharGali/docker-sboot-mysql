# docker-sboot-user-app
Create Docker Image for Spring Boot App With MySQL

# Useful Docker commands
.docker pull mysql:5.6

.docker run --name user-standalone-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=userdb -e MYSQL_USER=root -e 

MYSQL_PASSWORD=password -d mysql:latest

.docker run -p 9090:9090 --name docker-sboot-user-app --link standalone-mysql:mysql -d docker-sboot-user-app

.docker container ls

.docker images

.docker logs <container_name>

.docker container rm <container_name> -f

.docker image rm <image_name>


# OR
# Use docker-compose file.
# command -> docker-compose up
