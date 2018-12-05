package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChosenItemPage {
	WebDriver driver;
	
	@FindBy (xpath="//div[@class='CampaignProductThumbnail selected clipped ui card']//img")
	WebElement typeOfItemElement;
	
	@FindBy(xpath="//div[@class='ColorPicker interactive bordered']//div[@class='picked color']//div[@class='ui big circular label']")
	WebElement pinkColorSelectorElement;
	
	@FindBy(xpath="//div[@class='CampaignProductSizeSelector']//div[3]//div[1]//div[1]")
	WebElement sizeSelectorElement;
	
	@FindBy(xpath = "//div[@class='ui column three wide column min-width-80px']//select[@class='ui selection dropdown fluid']")
	WebElement numberOfItemsDropdown;
	
	@FindBy (xpath= "//option[@value='2']")
	WebElement numberOfItemsSelection;
	
	@FindBy (xpath="//div[@id='buy-it-now']")
	WebElement buyNowButton;
	
	public ChosenItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectItem() {
		typeOfItemElement.click();
		System.out.println("Type pf Item selected");
	}
	
	public void selectColorOfItem() {
		pinkColorSelectorElement.click();
		System.out.println("Color selected");
	}
	
	public void selectsizeOfItem() {
		sizeSelectorElement.click();
		System.out.println("Size selected");
	}
	
	public void selectNumberOfItems() {
		numberOfItemsDropdown.click();
		numberOfItemsSelection.click();
		System.out.println("Number of items selected");
	}
	
	public void addToCart() {
		buyNowButton.click();
	}
}
