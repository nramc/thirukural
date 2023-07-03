FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
COPY target/*.jar thirukural.jar
ENV SPRING_PROFILES_ACTIVE=production
ENTRYPOINT ["java","-jar","/thirukural.jar"]
