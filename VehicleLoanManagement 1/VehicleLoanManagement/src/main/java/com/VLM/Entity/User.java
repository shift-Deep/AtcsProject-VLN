package com.VLM.Entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_VLM")
public class User {
	

@Id 
@GeneratedValue(strategy =GenerationType.AUTO)
private Integer userId;
	
@OneToMany
@JoinColumn(name="user_id")
private  List<LoanApplication> loanapplication;
	
    @NotBlank(message=" username is mandatory")
	private String name;

	@NotBlank(message=" gender is mandatory")
	private String gender;
	
	@NotNull(message= "age is mandatory")
	@Positive
	private Integer age;
	
	@NotNull(message= "Phone number is mandatory")
	private Long number;
	
	@NotBlank(message= "Email is mandatory")
	@Email
	private String email;
	
	@NotBlank(message= "password is mandatory")
	private String password;
	
	private String address;
	private String state;
	private String city;
	private Integer pin;
	private String emptype;
	private Double salary;
	private Integer aadhar;
	private String pan;
	private String addressProof;
		
}
