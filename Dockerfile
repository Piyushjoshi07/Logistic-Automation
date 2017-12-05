FROM java:8
EXPOSE 8085
ADD /target/logisticautomation.jar logisticautomation.jar
ENV MONGODB_DB_NAME logisticAutomation
ENV MONGODB_DB_HOST mongo
ENV MONGODB_DB_PORT 27017
ENTRYPOINT ["java","-jar","logisticautomation.jar"]