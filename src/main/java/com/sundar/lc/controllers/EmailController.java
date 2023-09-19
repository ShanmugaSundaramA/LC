package com.sundar.lc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundar.lc.api.EmailDTO;
import com.sundar.lc.service.EmailService;

@Controller
public class EmailController {

	@Autowired
	EmailService service;
	
	@RequestMapping("/email")
	public String emailpage(@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		return "EmailPage";
	}
	
	@RequestMapping("Process-EmailPage")
	public String processEmailpage(@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		service.sendEmail("Sundar", emailDTO.getEmail(), "Love");
		
		return "EmailResultPage";
	}
}
