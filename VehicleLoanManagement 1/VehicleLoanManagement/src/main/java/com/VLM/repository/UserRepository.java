package com.VLM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.VLM.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
//	@Query("select u from User u WHERE u.email=:email and u.password=:password")
//	User authentication(@Param("email") String email, @Param("password") String password);
	
	public User findByEmailAndPassword(String email,String password);
}
