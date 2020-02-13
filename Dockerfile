FROM openjdk:8-jre
ENTRYPOINT ["java", "-jar", "/backend-0.1.0.jar"]
ADD target/backend-0.1.0.jar /backend-0.1.0.jar