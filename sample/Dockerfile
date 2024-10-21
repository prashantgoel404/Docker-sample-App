# Start with a base image containing Java runtime environment
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/sample-0.0.1-SNAPSHOT.jar /app/sample-0.0.1-SNAPSHOT.jar

# Expose the port the app runs on
EXPOSE 8083

# Run the JAR file
ENTRYPOINT ["java", "-jar", "sample-0.0.1-SNAPSHOT.jar"]
