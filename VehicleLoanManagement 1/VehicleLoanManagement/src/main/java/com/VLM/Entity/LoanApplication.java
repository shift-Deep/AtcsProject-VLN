package com.VLM.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoanApplication {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Integer applicationId;
	
	@Column(name="user_id")
	private Integer userId;
	
	private String chassisNo; 
	
	@NotNull(message="This field is mandatory")
	private Double existingEMI;
	
	private Integer tenure;
	private Double interest;
	private Double amount;
	private LocalDate appdate;
	private String status="PENDING";
	private String brand;
	private String colour;
	private String model;
	private Integer type;
	private Double exShowPrice;
	
}

