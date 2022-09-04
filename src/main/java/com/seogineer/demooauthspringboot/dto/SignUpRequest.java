package com.seogineer.demooauthspringboot.dto;

import com.seogineer.demooauthspringboot.enumType.AuthProvider;
import lombok.Getter;

@Getter
public class SignUpRequest {
    private String id;
    private String email;
    private String nickname;
    private String profileImageUrl;
    private AuthProvider authProvider;
}
