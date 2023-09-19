package com.sundar.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sundar.lc.api.WebsiteInfoDTO;

@Controller
@ControllerAdvice
@SessionAttributes("websiteInfoDTO")
public class TestController {

	@ModelAttribute("websiteInfoDTO")
	public WebsiteInfoDTO getwebsiteInfoDTO() {

		System.out.println("Inside the getwebsiteInfoDTO()");

		WebsiteInfoDTO websiteInfoDTO = new WebsiteInfoDTO();
		websiteInfoDTO.setWebsiteName("sundar.com");
		websiteInfoDTO.setWebsiteCompany("AlphaCoop");

		return websiteInfoDTO;
	}

	@RequestMapping("/test")
	public String test(@ModelAttribute("websiteInfoDTO") WebsiteInfoDTO websiteInfoDTO) {

		System.out.println("Inside the test()");
		System.out.println(websiteInfoDTO.getWebsiteName());
		System.out.println(websiteInfoDTO.getWebsiteCompany());

		return "Test";
	}

	@RequestMapping("/test1")
	public String test1(@Valid @ModelAttribute("websiteInfoDTO") WebsiteInfoDTO websiteInfoDTO, BindingResult result)
			throws Exception {

		System.out.println("Inside the test1()");
		System.out.println(websiteInfoDTO.getWebsiteName());
		System.out.println(websiteInfoDTO.getWebsiteCompany());

		return "Login";

	}
}
