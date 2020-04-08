FROM java:8
EXPOSE 8080
ADD htmlParser-1.0-SNAPSHOT.war htmlparser.war
ENTRYPOINT ["java", "-jar", "htmlparser.war"]