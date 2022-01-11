FROM java:8-jre-alpine

VOLUME /tmp

## LABEL ${LABEL_GROUP}="${LABEL_ID}"
## LABEL description="${LABEL_DESCRIPTION}"

COPY ../target/one-0.0.1-SNAPSHOT.jar one.jar

##EXPOSE ${PORT_TO_EXPOSE}

ENTRYPOINT ["java","-jar","/one.jar"]