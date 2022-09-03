package com.seogineer.demooauthspringboot.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class TokenRequest {
    private String registrationId;
    private String code;
    private String state;
    private String refreshToken;

    @Builder
    public TokenRequest(String registrationId, String code, String state){
        this.registrationId = registrationId;
        this.code = code;
        this.state = state;
    }
}
