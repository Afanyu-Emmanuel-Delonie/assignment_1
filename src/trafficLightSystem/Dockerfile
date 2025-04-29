FROM openjdk:17-jdk-slim

ENV PROJECT_ID=26841

WORKDIR /app

COPY trafficLight.jar app.jar

CMD ["sh", "-c", "echo Project ID is $PROJECT_ID && java -jar app.jar"]
