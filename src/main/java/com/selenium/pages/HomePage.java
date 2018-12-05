package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(xpath="//div[@class='item computer-only tablet-only input-box']//input[@placeholder='Find what you love']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class='item computer-only tablet-only input-box']//i[@class='search icon']")
	WebElement searchButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchTerm(String search) {
		searchBox.sendKeys(search);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
}
