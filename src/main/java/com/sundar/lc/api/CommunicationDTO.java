package com.sundar.lc.api;

public class CommunicationDTO {
	
	private String email = "xxx@gmail.com";
	private PhoneDTO phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PhoneDTO getPhone() {
		return phone;
	}

	public void setPhone(PhoneDTO phone) {
		this.phone = phone;
	}

}
