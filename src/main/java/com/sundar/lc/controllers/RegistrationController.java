package com.sundar.lc.controllers;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sundar.lc.api.CommunicationDTO;
import com.sundar.lc.api.PhoneDTO;
import com.sundar.lc.api.UserRegistrationDTO;
import com.sundar.lc.validator.EmailValidation;
import com.sundar.lc.validator.UserNameValidation;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String registerPage(@ModelAttribute("registrationDTO") UserRegistrationDTO registrationDTO) {

		PhoneDTO phone = new PhoneDTO();
		phone.setCountryCode("91");
		phone.setUserNumber("8939678600");

		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);

		registrationDTO.setUser("Mr.");
		registrationDTO.setUserName("Alpha");
		registrationDTO.setCommunicationDTO(communicationDTO);

		return "RegisterPage";
	}

	@RequestMapping("/Process-RegisterPage")
	public String registerPageProcess(@Valid @ModelAttribute("registrationDTO") UserRegistrationDTO registrationDTO,BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
			return "RegisterPage";
		}
		
		return "index";
	}
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		System.out.println("<<< Inside InitBinder. >>>");
		
		//dataBinder.setDisallowedFields("user"); it is used to avoid particular field to bind.
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, "user", editor);
		
		dataBinder.addValidators(new UserNameValidation());
		dataBinder.addValidators(new EmailValidation());
	    
	}

}
