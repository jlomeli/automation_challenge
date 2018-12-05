package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
	public WebDriver driver;
	
	
	@FindBy(xpath = "//img[@src='https://dbcpu9gznkryx.cloudfront.net/public/sl-prod-od-0/images/retail-products/A85AFE77D7B5E2/A85AFE77D7B5E2-A927272C9FA7-GS1-TC12-RED/front/medium.jpg']")
	WebElement firstItem;
	
	public SearchResultsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectAvailableItem() {
		firstItem.click();
	}
	
	
}
