FROM java:8-jre-alpine

VOLUME /tmp

## LABEL ${LABEL_GROUP}="${LABEL_ID}"
## LABEL description="${LABEL_DESCRIPTION}"

COPY ${project.build.finalName}.${packaging} app.jar

##EXPOSE ${PORT_TO_EXPOSE}

ENTRYPOINT ["java","-jar","/app.jar"]