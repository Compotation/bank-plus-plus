FROM node:stretch-slim as buildvue
WORKDIR /workspace/app

COPY babel.config.js .
COPY package.json .
COPY package-lock.json .
COPY public public
COPY src src

RUN npm install ci
RUN npm run build

FROM nginx:alpine
COPY --from=buildvue /workspace/app/dist /usr/share/nginx/html
COPY nginx-proxy.conf /etc/nginx/nginx.conf

EXPOSE 80
ENTRYPOINT ["nginx", "-g", "daemon off;"]
