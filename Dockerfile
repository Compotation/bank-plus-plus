FROM node:lts-alpine as buildvue
WORKDIR /workspace/app

COPY vue/babel.config.js .
COPY vue/package.json .
COPY vue/package-lock.json .
COPY vue/public public
COPY vue/src src

RUN npm install ci
RUN npm run build

FROM adoptopenjdk:11 as buildspring
WORKDIR /workspace/app

COPY spring/build.gradle.kts .
COPY spring/settings.gradle.kts .
COPY spring/gradle gradle
COPY spring/gradlew .
COPY spring/src src 

COPY --from=buildvue /workspace/app/dist/ /workspace/app/src/main/resources/static/

RUN ./gradlew build -x test


FROM adoptopenjdk:11
WORKDIR /opt/app

COPY --from=buildspring /workspace/app/build/libs/ /opt/app/
ENTRYPOINT ["java", "-jar", "bankplusplus-0.0.1-SNAPSHOT.jar"]
