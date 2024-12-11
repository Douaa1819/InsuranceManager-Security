FROM tomcat:10.1.13-jdk17-temurin
COPY target/Assure-Manager-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/Assure-Manager.war
EXPOSE 8082
CMD ["catalina.sh", "run"]
