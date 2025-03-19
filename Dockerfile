From openjdk:17
COPY target/github-cicd-docker.jar github-cicd-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","github-cicd-docker.jar"]