package com.seogineer.demooauthspringboot.service;

import com.seogineer.demooauthspringboot.common.exception.BadRequestException;
import com.seogineer.demooauthspringboot.dto.SignUpRequest;
import com.seogineer.demooauthspringboot.entity.User;
import com.seogineer.demooauthspringboot.entity.UserRepository;
import com.seogineer.demooauthspringboot.enumType.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public String createUser(SignUpRequest signUpRequest){
        if(userRepository.existsByIdAndAuthProvider(signUpRequest.getClientId(), signUpRequest.getAuthProvider())){
            throw new BadRequestException("aleady exist user");
        }

        return userRepository.save(
                User.builder()
                        .clientId(signUpRequest.getClientId())
                        .userId(signUpRequest.getUserId())
                        .userName(signUpRequest.getUserName())
                        .nickname(signUpRequest.getNickname())
                        .email(signUpRequest.getEmail())
                        .profileImageUrl(signUpRequest.getProfileImageUrl())
                        .role(Role.USER)
                        .authProvider(signUpRequest.getAuthProvider())
                        .build()).getClientId();
    }
}
