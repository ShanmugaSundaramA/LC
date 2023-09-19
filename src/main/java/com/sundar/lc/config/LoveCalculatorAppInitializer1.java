package com.sundar.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalculatorAppInitializer1 extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?>[] configClass = {LoveCalculatorConfig.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		String[] url = {"/"};
		return url;
	}

}
