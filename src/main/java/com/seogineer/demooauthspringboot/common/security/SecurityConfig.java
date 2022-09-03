package com.seogineer.demooauthspringboot.common.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig {
    private final SecurityFilter securityFilter;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .headers().frameOptions().disable()
            .and()
            .cors()
            .and()
            .sessionManagement()//세션 정책 설정
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests()
            .antMatchers("/login/**", "/user", "/oauth2/**", "/auth/**", "/h2-console/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .oauth2Login()
            .redirectionEndpoint()
            .baseUri("/oauth2/code/*")
//                    .and()
//                .userInfoEndpoint()
//                    .userService(customOAuth2UserService)
            ;

        return http.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class).build();
    }
}