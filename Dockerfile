FROM adoptopenjdk:12.0.2_10-jdk-hotspot-bionic
COPY target/senolibrary-0.0.1-SNAPSHOT.jar senolibrary-0.0.1-SNAPSHOT.jar
CMD java -jar senolibrary-0.0.1-SNAPSHOT.jar
EXPOSE 8080
