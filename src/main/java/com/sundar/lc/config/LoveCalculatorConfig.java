package com.sundar.lc.config;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sundar.lc.converter.CreditCardConverter;
import com.sundar.lc.converter.CreditCardConverterObjectToString;
import com.sundar.lc.formatters.PhoneFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.sundar.lc")
@PropertySources({@PropertySource("classpath:Email.properties")})
public class LoveCalculatorConfig implements WebMvcConfigurer {
	
	@Autowired
	Environment env;
	
	Logger logger = Logger.getLogger(LoveCalculatorConfig.class.getName());
	
	@Bean("viewResolver")
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
    @Override
    public void addFormatters(FormatterRegistry registry) {
    	
    	System.out.println(" 1) Inside Formatter addFormatter(). ");
    	
    	registry.addFormatter(new PhoneFormatter());
    	
    	registry.addConverter(new CreditCardConverterObjectToString());
    	registry.addConverter(new CreditCardConverter());
    	
    	//registry.addFormatter(new CreditCardFormatter());
    }
    
    @Bean
    public MessageSource messageSource() {
    	
    	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    	messageSource.setBasename("ErrorMessages");
    
      return messageSource;	
    }
    
    @Bean
    public LocalValidatorFactoryBean factoryBean() {
    	
    	LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
    	factoryBean.setValidationMessageSource(messageSource());
    	
    	return factoryBean;
    }

    @Override
    public Validator getValidator() {
    	return factoryBean();
    }
    
    @Bean
    public JavaMailSender javaMailSender() {
    	
    	logger.info(env.getProperty("mail.host"));
    	
    	JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    	mailSender.setHost(env.getProperty("mail.host"));
    	mailSender.setUsername(env.getProperty("mail.username"));
    	mailSender.setPassword(env.getProperty("mail.password"));
    	mailSender.setPort(Integer.parseInt(env.getProperty("mail.port")));
    	
    	Properties props = properties();
		
		mailSender.setJavaMailProperties(props);
		
    	return mailSender;
    }
    
    public Properties properties() {
    	
    	Properties props = new Properties();
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.starttls.enable", "true");
    	
		return props;
    }

}
