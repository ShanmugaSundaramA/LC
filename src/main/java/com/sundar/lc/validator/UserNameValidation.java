package com.sundar.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sundar.lc.api.UserRegistrationDTO;

public class UserNameValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "username.empty","User Name Cannot br Empty...");
		
	    String userName= ((UserRegistrationDTO) target).getUserName();
	
	    if(!userName.contains("_")) {
	    	errors.rejectValue("userName","username.incorrect","User Name Does not contains _ !.");
	    }
	}
	
	

}
