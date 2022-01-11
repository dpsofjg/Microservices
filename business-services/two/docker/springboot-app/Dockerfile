FROM java:8-jre-alpine

VOLUME /tmp

## LABEL ${LABEL_GROUP}="${LABEL_ID}"
## LABEL description="${LABEL_DESCRIPTION}"

COPY ../target/two-0.0.1-SNAPSHOT.jar two.jar

##EXPOSE ${PORT_TO_EXPOSE}

ENTRYPOINT ["java","-jar","/two.jar"]