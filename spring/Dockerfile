FROM amazoncorretto:11-alpine-jdk as buildspring
WORKDIR /workspace/app

COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY gradle gradle
COPY gradlew .
COPY src src 

RUN ./gradlew build -x test


FROM amazoncorretto:11-alpine-jdk
WORKDIR /opt/app

COPY --from=buildspring /workspace/app/build/libs/ /opt/app/
ENTRYPOINT ["java", "-jar", "bankplusplus-0.0.1-SNAPSHOT.jar"]
