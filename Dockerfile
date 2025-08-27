FROM openjdk:21-jdk-slim
EXPOSE 8080
COPY target/k8s-project2.jar k8s-project2.jar
ENTRYPOINT ["java", "-jar", "/k8s-project2.jar"]