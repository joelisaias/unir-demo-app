FROM amazoncorretto:17.0.10
COPY target/*.jar app.jar
EXPOSE 7000
ENTRYPOINT ["java","-jar","app.jar"]