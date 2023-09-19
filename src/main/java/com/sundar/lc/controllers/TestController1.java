package com.sundar.lc.controllers;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sundar.lc.api.WebsiteInfoDTO;

@Controller
@SessionAttributes("websiteInfoDTO")
public class TestController1 {

	@RequestMapping("/test3")
	@ResponseBody
	public String test3(Model model) {

		System.out.println("Inside the test3()");

		WebsiteInfoDTO websiteInfoDTO = new WebsiteInfoDTO();
		websiteInfoDTO.setWebsiteName("asd");
		websiteInfoDTO.setWebsiteCompany("asdds");

		model.addAttribute("websiteInfoDTO",websiteInfoDTO);
		return "Test2";
	}

	@RequestMapping("/test2")
	@ResponseBody
	public String test2(@SessionAttribute("websiteInfoDTO") WebsiteInfoDTO websiteInfoDTO) {

		System.out.println("Inside the test2()");
		System.out.println(websiteInfoDTO.getWebsiteName());
		System.out.println(websiteInfoDTO.getWebsiteCompany());

		return "Test2";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		System.out.println("initBinder from Test2Controller.");

		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);

	}

	//@ExceptionHandler(Exception.class)
	@ResponseBody
	public String handleAnyException() {

		System.out.println("Exception Handler");

		return "Error";
	}
}
