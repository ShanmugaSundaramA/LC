package com.sundar.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sundar.lc.api.UserRegistrationDTO;

public class EmailValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");

		String email = ((UserRegistrationDTO) target).getCommunicationDTO().getEmail();

		if (!email.contains("@gmail.com")) {
			
			errors.rejectValue("communicationDTO.email", "email.incorrect");
			
		}
	}

}
