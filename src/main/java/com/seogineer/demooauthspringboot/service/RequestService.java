package com.seogineer.demooauthspringboot.service;

import com.seogineer.demooauthspringboot.dto.SignInResponse;
import com.seogineer.demooauthspringboot.dto.TokenRequest;
import com.seogineer.demooauthspringboot.dto.TokenResponse;

public interface RequestService<T> {
    SignInResponse redirect(TokenRequest tokenRequest);
    TokenResponse getToken(TokenRequest tokenRequest);
    T getUserInfo(String accessToken);
    TokenResponse getRefreshToken(String provider, String refreshToken);
}
