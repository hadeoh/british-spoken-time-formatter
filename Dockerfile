FROM eclipse-temurin:17-jre
COPY target/british-spoken-time-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
