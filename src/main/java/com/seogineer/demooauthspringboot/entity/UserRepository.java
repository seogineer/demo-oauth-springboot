package com.seogineer.demooauthspringboot.entity;

import com.seogineer.demooauthspringboot.enumType.AuthProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);

    boolean existsByIdAndAuthProvider(String id, AuthProvider authProvider);
}
