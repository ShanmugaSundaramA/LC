package com.sundar.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sundar.lc.api.UserInfoDTO;

@Controller
@SessionAttributes("userInfoDTO")
public class HomePageController {

	@RequestMapping("/home")
	public String homePage(Model model, UserInfoDTO userInfoDTO) {

		model.addAttribute("userInfoDTO", userInfoDTO);

		return "HomePage";
	}

	@RequestMapping("/Process-HomePage")
	public String homePageProcess(@Valid @ModelAttribute("userInfoDTO") UserInfoDTO userInfoDTO, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {

			List<ObjectError> errors = bindingResult.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println(error);
			}

			System.out.println(" My Form has Error. ");

			return "HomePage";
		}

		return "ResultPage";
	}
	
	/*
	 * eg 3 for Two way Data binding
	 * 
	@RequestMapping("/home")
	public String homePage(Model model) {
		
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		
		model.addAttribute("userInfoDTO",userInfoDTO);
		
		return "HomePage";
	}
	
	@RequestMapping("/Process-HomePage")
	public String homePageProcess(UserInfoDTO userInfoDTO,Model model) {
		
		model.addAttribute("userInfoDTO",userInfoDTO);
		
		return "ResultPage";
	}
	*/
	
	/*
	 * eg 2 for DataBing
	 * 
	@RequestMapping("/Process-HomePage")
	public String homePageProcess(UserInfoDTO userInfoDTO,Model model) {
		
		System.out.println(userInfoDTO.getUserName()+" "+userInfoDTO.getCrushName());
		
		model.addAttribute("userName",userInfoDTO.getUserName());
		model.addAttribute("crushName",userInfoDTO.getCrushName());
		
		return "ResultPage";
	}
	*/
	
	/*
	 * eg 1 for @RequestParam
	 * 
	@RequestMapping("/Process-HomePage")
	public String homePageProcess(@RequestParam String userName,@RequestParam String crushName,Model model) {
		
		System.out.println(userName+" "+crushName);
		
		model.addAttribute("userName",userName);
		model.addAttribute("crushName",crushName);
		
		return "ResultPage";
	}
	*/
	
}
