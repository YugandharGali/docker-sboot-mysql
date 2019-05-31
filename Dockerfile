FROM openjdk:8
ADD target/docker-sboot-user-app.jar docker-sboot-user-app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","docker-sboot-user-app.jar"]