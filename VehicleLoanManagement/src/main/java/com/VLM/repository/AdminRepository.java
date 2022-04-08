package com.VLM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.VLM.Entity.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	@Query("select a from Admin a WHERE a.username=:username and a.password=:password")
	Admin authentication(@Param("username") String username, @Param("password") String password);

}
