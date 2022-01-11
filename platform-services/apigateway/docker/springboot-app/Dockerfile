FROM java:8-jre-alpine

VOLUME /tmp

## LABEL ${LABEL_GROUP}="${LABEL_ID}"
## LABEL description="${LABEL_DESCRIPTION}"

COPY ../target/apigateway-0.0.1-SNAPSHOT.jar apigateway.jar

##EXPOSE ${PORT_TO_EXPOSE}

ENTRYPOINT ["java","-jar","/apigateway.jar"]