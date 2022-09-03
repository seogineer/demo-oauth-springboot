package com.seogineer.demooauthspringboot.controller;

import com.seogineer.demooauthspringboot.common.security.SecurityUtil;
import com.seogineer.demooauthspringboot.enumType.AuthProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthControllerTests {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private SecurityUtil securityUtil;
//
//    @Test
//    public void refreshToken() throws Exception {
//        String refreshToken = securityUtil.createRefreshToken(1L, AuthProvider.KAKAO);
//        String json = "{\"refreshToken\": " + refreshToken + "}";
//
//        mockMvc.perform(
//            post("/auth/token")
//            .contentType(MediaType.APPLICATION_JSON) // Json 타입으로 지정
//            .content(json)
//        ).andExpect(status().isOk());
//    }
}
