FROM openjdk:8-jre-alpine

COPY ./build/libs/nexoretail.jar /root/nexoretail.jar

WORKDIR /root

CMD ["java", "-server", "-Xms4g", "-Xmx4g", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "nexoretail.jar"]