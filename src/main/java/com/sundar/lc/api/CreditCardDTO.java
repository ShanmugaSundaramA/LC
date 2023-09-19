package com.sundar.lc.api;

public class CreditCardDTO {

	public Integer firstInteger;
	public Integer secondnteger;
	public Integer thirdInteger;
	public Integer fourthInteger;

	public Integer getFirstInteger() {
		return firstInteger;
	}

	public void setFirstInteger(Integer firstInteger) {
		this.firstInteger = firstInteger;
	}

	public Integer getSecondnteger() {
		return secondnteger;
	}

	public void setSecondnteger(Integer secondnteger) {
		this.secondnteger = secondnteger;
	}

	public Integer getThirdInteger() {
		return thirdInteger;
	}

	public void setThirdInteger(Integer thirdInteger) {
		this.thirdInteger = thirdInteger;
	}

	public Integer getFourthInteger() {
		return fourthInteger;
	}

	public void setFourthInteger(Integer fourthInteger) {
		this.fourthInteger = fourthInteger;
	}

	@Override
	public String toString() {
		return  firstInteger + "-" + secondnteger + "-"+ thirdInteger + "-" + fourthInteger;
	}
	
	

}
