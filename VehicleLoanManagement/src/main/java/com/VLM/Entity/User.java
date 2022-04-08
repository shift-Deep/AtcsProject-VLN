package com.VLM.Entity;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "User")
public class User {
	
public User() {
		super();
	}
public User(Integer userId, List<LoanApplication> loanapplication, String name, String gender, Integer age,
			Integer number, String email, String password, String address, String state, String city, Integer pin,
			String emptype, Double salary, Integer aadhar, String pan, String addressProof) {
		super();
		this.userId = userId;
		this.loanapplication = loanapplication;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.number = number;
		this.email = email;
		this.password = password;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.emptype = emptype;
		this.salary = salary;
		this.aadhar = aadhar;
		this.pan = pan;
		this.addressProof = addressProof;
	}
@Id 
@GeneratedValue(strategy =GenerationType.AUTO)
private Integer userId;
	
@OneToMany
@JoinColumn(name="user_id")
private  List<LoanApplication> loanapplication;
	
	private String name;
	private String gender;
	private Integer age;
	private Integer number;
	private String email;
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
	
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<LoanApplication> getLoanapplication() {
		return loanapplication;
	}
	public void setLoanapplication(List<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public String getEmptype() {
		return emptype;
	}
	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getAadhar() {
		return aadhar;
	}
	public void setAadhar(Integer aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", loanapplication=" + loanapplication + ", name=" + name + ", gender="
				+ gender + ", age=" + age + ", number=" + number + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", state=" + state + ", city=" + city + ", pin=" + pin + ", emptype="
				+ emptype + ", salary=" + salary + ", aadhar=" + aadhar + ", pan=" + pan + ", addressProof="
				+ addressProof + ", getUserId()=" + getUserId() + ", getLoanapplication()=" + getLoanapplication()
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getAge()=" + getAge()
				+ ", getNumber()=" + getNumber() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getAddress()=" + getAddress() + ", getState()=" + getState() + ", getCity()=" + getCity()
				+ ", getPin()=" + getPin() + ", getEmptype()=" + getEmptype() + ", getSalary()=" + getSalary()
				+ ", getAadhar()=" + getAadhar() + ", getPan()=" + getPan() + ", getAddressProof()=" + getAddressProof()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
