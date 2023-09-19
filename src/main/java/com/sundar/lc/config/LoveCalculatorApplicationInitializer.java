package com.sundar.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class LoveCalculatorApplicationInitializer {// implements WebApplicationInitializer {

	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		 System.out.println("<<< This method is automatically call by server. >>>");
		 
		 //Create DispatcherServlet.
		 
		 /*
		  * for xml
		  * 
		  * XmlWebApplicationContext context= new XmlWebApplicationContext();
		  * context.setConfigLocation("classpath:DispatcherServlet-servlet.xml");
		  *
		  */
		 
		 AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		 context.register(LoveCalculatorConfig.class);
		 
		 DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		 
		 //Register DispatcherServelt
		 
		 Dynamic myDispatcherServlet = servletContext.addServlet("MyDispatcherServlet", dispatcherServlet);

		 myDispatcherServlet.setLoadOnStartup(1);

		 myDispatcherServlet.addMapping("/");
	}

}
