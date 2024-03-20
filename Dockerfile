FROM openjdk:17-oracle
WORKDIR /app
COPY target/tutorial7-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]