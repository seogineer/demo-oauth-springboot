package com.seogineer.demooauthspringboot.entity;

import com.seogineer.demooauthspringboot.enumType.AuthProvider;
import com.seogineer.demooauthspringboot.enumType.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "user_tbl")
public class User extends BaseTimeEntity {
    @Id
    private String clientId;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String email;

    @Column
    private String profileImageUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AuthProvider authProvider;

    @Builder
    public User(
            String clientId
            , String userId
            , String userName
            , String nickname
            , String email
            , String profileImageUrl
            , Role role
            , AuthProvider authProvider
    ){
        this.clientId = clientId;
        this.userId = userId;
        this.userName = userName;
        this.nickname = nickname;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
        this.role = role;
        this.authProvider = authProvider;
    }

    public User update(String name, String picture){
        this.nickname = name;
        this.profileImageUrl = picture;

        return this;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }
}
