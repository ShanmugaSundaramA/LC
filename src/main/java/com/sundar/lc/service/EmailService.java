package com.sundar.lc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService{

	@Autowired
	JavaMailSender sender;
	
	public void sendEmail(String username,String email,String result)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("Love Calculator Application Result");
		message.setText("Hi "+username+" The Result predicted by the LCApp is "+result);
		
		sender.send(message);
	}
}
