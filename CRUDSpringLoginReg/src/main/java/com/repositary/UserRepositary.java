package com.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserLogin.model.UserModel;

public interface UserRepositary extends JpaRepository<UserModel, Integer>{

	Optional<UserModel> findByLoginAndPasswordOptional(String login, String password);
}
