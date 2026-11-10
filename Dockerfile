# Using light JDK 21 version of Amazon
FROM amazoncorretto:21-alpine
# Creating working folder in container
WORKDIR /app
# Copy file JAR from 'out' folder of IntelliJ into container
# Changed name: Named "moto_racing_jar" and "moto_racing.jar" ny your real name
COPY out/artifacts/moto_racing_jar/moto_racing.jar /app/moto_racing.jar
# The commend to run app when container start up
ENTRYPOINT ["java", "-jar", "/app/moto_racing.jar"]
