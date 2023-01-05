package com.twinkles.talkamout.repository;

import com.twinkles.talkamout.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
    Optional<User> findTherapistByAddress_State(String address_state);
}