package com.VLM.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "LoanApplication")
public class LoanApplication {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Integer applicationId;
	
//	@ManyToOne
//	@JoinColumn(name = "UId",referencedColumnName="userId")
//	private User user;
	
	@Column(name="user_id")
	private Integer userId;
	
	private String chassisNo; 
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
	
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanApplication(Integer applicationId, Integer userId, String chassisNo, Double existingEMI, Integer tenure,
			Double interest, Double amount, LocalDate appdate, String status, String brand, String colour, String model,
			Integer type, Double exShowPrice) {
		super();
		this.applicationId = applicationId;
		this.userId = userId;
		this.chassisNo = chassisNo;
		this.existingEMI = existingEMI;
		this.tenure = tenure;
		this.interest = interest;
		this.amount = amount;
		this.appdate = appdate;
		this.status = status;
		this.brand = brand;
		this.colour = colour;
		this.model = model;
		this.type = type;
		this.exShowPrice = exShowPrice;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public Double getExistingEMI() {
		return existingEMI;
	}

	public void setExistingEMI(Double existingEMI) {
		this.existingEMI = existingEMI;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getAppdate() {
		return appdate;
	}

	public void setAppdate(LocalDate appdate) {
		this.appdate = appdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Double getExShowPrice() {
		return exShowPrice;
	}

	public void setExShowPrice(Double exShowPrice) {
		this.exShowPrice = exShowPrice;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationId=" + applicationId + ", userId=" + userId + ", chassisNo=" + chassisNo
				+ ", existingEMI=" + existingEMI + ", tenure=" + tenure + ", interest=" + interest + ", amount="
				+ amount + ", appdate=" + appdate + ", status=" + status + ", brand=" + brand + ", colour=" + colour
				+ ", model=" + model + ", type=" + type + ", exShowPrice=" + exShowPrice + "]";
	}	
}

