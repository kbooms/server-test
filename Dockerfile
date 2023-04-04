# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app/

# Make port 8080 available to the world outside the container
EXPOSE 8080

# Run the pplication when the container starts
CMD ["mvn", "spring-boot:run"]