# hello-spring-boot-app
Spring boot 3.3 + Java 21 + Kotlin 2.0


## build docker image using jib
https://cloud.google.com/java/getting-started/jib
Jib is a java tool chain for building Docker images for Java applications. It is integrated with Maven and Gradle and uses a distroless base image to produce small images.
Jib does not require the docker command or the Docker daemon, there is no need to solve the Docker-in-Docker problem in order to build Docker images as part of your continuous integration.

### docker base image
[eclipse-temurin:21-alpine](https://hub.docker.com/_/eclipse-temurin)

###
Build and push image to remote docker registry
`mvn compile jib:build`
Build and push image to local docker registry
`mvn compile jib:dockerBuild`

###
Run docker image in local
`$docker run -d --name spring-app -p 8080:8080  hello-spring-boot-app:latest`

## how to mysql in local

###
`$docker pull mysql:latest`
`$docker run -d --name test-mysql -e MYSQL_ROOT_PASSWORD=strong_password -p 3306:3306 mysql:latest`
`$docker exec -it test-mysql bash`

## how to run Spring Boot and MySQL together using docket compose
`$docker compose up -d`
`$docker compose down`