# Spring boot + Webpack + Vue.js
빌드된 웹앱을 static 파일로 Serve 하는 Spring boot 어플리케이션.

Spring Boot 2.0.1.RELEASE 버전이며, 
WebApp 은 webpack v3.6.0, vuejs v2.5.11 을 사용.

## Run 

``` bash
# Run Spring boot
$ ./gradlew bootRun

# Another terminal
$ cd public-app

# install dependencies at first
$ npm install

# serve with hot reload at localhost:8081
$ npm run dev
```
