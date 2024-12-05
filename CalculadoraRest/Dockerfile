#FROM openjdk:23
#VOLUME /tmp
#ENV IMG_PATH=/img
#EXPOSE 8080
#RUN mkdir -p /img
#ADD ./target/s
#ENTRYPOINT ["java", "-jar", "/app.jar"]

FROM openjdk:23
ARG JAR_FILE=target/CalculadoraRest-0.0.1.jar
COPY ${JAR_FILE} app_calculadora.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app_calculadora.jar"]