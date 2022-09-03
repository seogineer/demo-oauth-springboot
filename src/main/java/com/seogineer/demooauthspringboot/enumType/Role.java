package com.seogineer.demooauthspringboot.enumType;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("GUEST", "손님"),
    USER("USER", "일반 사용자");

    private final String key;
    private final String title;
}