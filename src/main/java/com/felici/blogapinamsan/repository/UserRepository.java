package com.felici.blogapinamsan.repository;

import com.felici.blogapinamsan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * author: felici
 */

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
