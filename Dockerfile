FROM openjdk:21-jdk-slim
EXPOSE 8080
COPY target/k8s-project.jar k8s-project.jar
ENTRYPOINT ["java", "-jar", "/k8s-project.jar"]