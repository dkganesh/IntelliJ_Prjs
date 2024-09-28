package com.dkpractice_security_telusko.securitypractice.repository;

import com.dkpractice_security_telusko.securitypractice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findByEmail(String email);
}
