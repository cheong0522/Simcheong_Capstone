package com.simcheong.cctv.user.repository;

import com.simcheong.cctv.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long userId);

    Optional<User> findByNickname(String nickname);

    Optional<User> findByPhoneNumber(String phoneNumber);

    Optional<User> findByRefreshToken(String refreshToken);
}
