package com.VLM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VLM.Entity.LoanApplication;

@Repository
public interface LoanRepository extends JpaRepository<LoanApplication, Integer>{

	Object findByUserId(Integer userId);

	
	
}