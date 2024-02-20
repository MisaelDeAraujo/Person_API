package git.misaeldearaujo.api.person.entity;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "person_tb")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false,length = 50)
	private String completeName;
	@Email
	@Column(nullable = false, length = 50, unique = true)
	private String email;
	@CPF
	@Column(nullable = false, length = 11, unique = true)
	private String cpf;
	@Column(nullable = false, length = 10, unique = true)
	private String rg;
	@Column(nullable = false, length = 6, unique = false)
	private String gender;
	@Column(nullable = false, length = 11, unique = true)
	private String cellphone;
	@Column(nullable = false, length = 8, unique = false)
	private String cep;
	@Column(nullable = false, length = 60, unique = false)
	private String address;
	@Column(nullable = false, unique = false)
	private String number;
	@Column(nullable = false, length = 30, unique = false)
	private String complement;
	@Column(nullable = false, length = 30, unique = false)
	private String city;
	@Column(nullable = false, length = 30, unique = false)
	private String district;
	@Column(nullable = false, length = 30, unique = false)
	private String state;
	@Column(nullable = false, length = 30, unique = false)
	private String country;
	@Column(nullable = false, unique = false)
	private LocalDateTime registrationDate;
	
	public Person() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompleteName() {
		return completeName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

}
