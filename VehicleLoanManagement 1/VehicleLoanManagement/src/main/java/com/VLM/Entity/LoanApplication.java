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
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer applicationId;
	
	@Column(name="user_id")
	private Integer userId;
	
	@NotNull(message="This field is mandatory")
	private String chassisNo; 
	
	@NotNull(message="This field is mandatory")
	private Double existingEMI;
	
	@NotNull(message="This field is mandatory")
	private Integer tenure;
	@NotNull(message="This field is mandatory")
	private Double interest;
	@NotNull(message="This field is mandatory")
	private Double amount;
	//@NotNull(message="This field is mandatory")
	private LocalDate appdate;
	
	private String status="PENDING";
	@NotNull(message="This field is mandatory")
	private String brand;
	@NotNull(message="This field is mandatory")
	private String colour;
	@NotNull(message="This field is mandatory")
	private String model;
	@NotNull(message="This field is mandatory")
	private String type;
	@NotNull(message="This field is mandatory")
	private Double exShowPrice;
	
}

