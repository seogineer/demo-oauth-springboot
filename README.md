# Spring Security 이용한 OAuth + JWT 로그인 구현

로그인 API를 만들면 제공되는 정보들은 공유하면 안되기 때문에 src/main/resources 하위 경로에 application-oauth2.yml 작성해서 각자 client-id와 client-secret 정보를 입력한다.

```yml
spring:
  config:
    activate:
      on-profile: local
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: {google 로그인 api를 만들때 발급 받은 client-id}
            client-secret: {google 로그인 api를 만들때 발급 받은 client-secret}
            redirect-uri: "http://localhost:8081/login/oauth2/code/google"
            authorization-grant-type: authorization_code
            scope: profile, email
          kakao:
            client-id: {kakao 로그인 api를 만들때 발급 받은 client-id}
            redirect-uri: "http://localhost:8081/login/oauth2/code/kakao"
            client-authentication-method: POST
            authorization-grant-type: authorization_code
            scope: profile_nickname, profile_image, account_email
            client-name: Kakao
          naver:
            client-id: {naver 로그인 api를 만들때 발급 받은 client-id}
            client-secret: {naver 로그인 api를 만들때 발급 받은 client-id}
            redirect-uri: "http://localhost:8081/login/oauth2/code/naver"
            authorization-grant-type: authorization_code
            scope: name, email, profile_image
            client-name: Naver
        provider:
          google:
            authorization-uri: https://accounts.google.com/o/oauth2/v2/auth?prompt=consent&access_type=offline
            token_uri: https://oauth2.googleapis.com/token
            user-info-uri: https://www.googleapis.com/oauth2/v2/userinfo
          kakao:
            authorization_uri: https://kauth.kakao.com/oauth/authorize
            token_uri: https://kauth.kakao.com/oauth/token
            user-info-uri: https://kapi.kakao.com/v2/user/me
            user_name_attribute: id
          naver:
            authorization_uri: https://nid.naver.com/oauth2.0/authorize
            token_uri: https://nid.naver.com/oauth2.0/token
            user-info-uri: https://openapi.naver.com/v1/nid/me
            user_name_attribute: response
```
