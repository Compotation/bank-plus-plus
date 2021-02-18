FROM adoptopenjdk:11 as buildspring
WORKDIR /workspace/app

COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY gradle gradle
COPY gradlew .
COPY src src 

RUN ./gradlew build -x test


FROM adoptopenjdk:11
WORKDIR /opt/app

COPY --from=buildspring /workspace/app/build/libs/ /opt/app/
ENTRYPOINT ["java", "-jar", "bankplusplus-0.0.1-SNAPSHOT.jar"]
