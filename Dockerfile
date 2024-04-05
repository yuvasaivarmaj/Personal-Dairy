# Use a base image with OpenJDK 11
FROM openjdk:23-ea-slim-bookworm

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY build/libs/Mydairy-0.0.1-SNAPSHOT.jar /app/Mydairy-0.0.1-SNAPSHOT.jar

# Expose the port your application runs on (default is 8080)
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "Mydairy-0.0.1-SNAPSHOT.jar"]
