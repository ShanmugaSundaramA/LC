package com.sundar.lc.api;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;

import com.sundar.lc.validator.Age;

public class UserRegistrationDTO {

	@NotEmpty(message = "Not Empty")
	private String user;
	private String userName;
	private String Password;
	@Age(lower = 20,upper = 75)
	private Integer age;
	private String country;
	private String hobbies[];
	private String gender;
	private CommunicationDTO communicationDTO;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

	@Override
	public String toString() {
		return "UserRegistrationDTO [user=" + user + ", userName=" + userName + ", Password=" + Password + ", age="
				+ age + ", country=" + country + ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender
				+ ", communicationDTO=" + communicationDTO + "]";
	}

}
