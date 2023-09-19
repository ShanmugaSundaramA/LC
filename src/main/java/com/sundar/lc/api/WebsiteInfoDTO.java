package com.sundar.lc.api;

import javax.validation.constraints.NotEmpty;

public class WebsiteInfoDTO {

	@NotEmpty(message = "Not Empty")
	private String websiteName;
	@NotEmpty(message = "Not Empty")
	private String websiteCompany;

	public String getWebsiteName() {
		return websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	public String getWebsiteCompany() {
		return websiteCompany;
	}

	public void setWebsiteCompany(String websiteCompany) {
		this.websiteCompany = websiteCompany;
	}

}
