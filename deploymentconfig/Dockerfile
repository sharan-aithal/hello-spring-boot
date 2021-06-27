FROM java:8-jdk-alpine

# install

# label for the image
LABEL Description="demoapp" Version="0.0.1"

# the version of the archive
ARG VERSION=0.0.1

# mount the temp volume
VOLUME demoappvol

# Add the service as demoapp.jar
ADD ./target/hello-spring-boot-${VERSION}-SNAPSHOT.jar demoapp.jar

# touch the archive for timestamp
RUN sh -c 'touch /demoapp.jar'

# entrypoint to the image on run
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demoapp.jar"]