FROM openjdk:11-jre
# RUN apt-get update && \
# apt-get install -y openjdk-8-jdk && \
# apt-get install -y ant && \
# apt-get clean;
WORKDIR /usr/src/app
COPY ../target/* /usr/src/app
RUN echo "Start dockerfile"
ENTRYPOINT ["java","-jar","/usr/src/app/coffeeshop-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
