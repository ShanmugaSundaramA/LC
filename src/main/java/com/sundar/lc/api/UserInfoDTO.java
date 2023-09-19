package com.sundar.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

    @NotBlank(message = "* Please fill UserName cannot be Empty.")
    @Size(min = 3 , max = 15 , message = "* Min 3 Max 15 Letters")
	private String userName;
    
    @NotBlank(message = "* Please fill UserName cannot be Empty.")
    @Size(min = 3 , max = 15 , message = "* Min 3 Max 15 Letters")
	private String crushName;
    
    @AssertTrue(message = " you must agree Terms and Condition.")
    private boolean termsAndCondition;

	public boolean isTermsAndCondition() {
		return termsAndCondition;
	}

	public void setTermsAndCondition(boolean termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}
