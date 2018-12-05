package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCartSimplified {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.drive", "~//usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://teechip.com");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void addToCart() {
		WebElement searchBox = driver.findElement(By.xpath("//div[@class='item computer-only tablet-only input-box']//input[@placeholder='Find what you love']"));
		WebElement searchButton = driver.findElement(By.xpath("//div[@class='item computer-only tablet-only input-box']//i[@class='search icon']"));
		
		searchBox.sendKeys("cats");
		searchButton.click();
		
		//WebElement firstItem = driver.findElement(By.xpath("//img[@src='https://dbcpu9gznkryx.cloudfront.net/public/sl-prod-od-0/images/retail-products/A85AFE77D7B5E2/A85AFE77D7B5E2-A927272C9FA7-GS1-TC12-RED/front/medium.jpg']"));
		
		WebDriverWait waitForSearchResults = new WebDriverWait(driver, 10);
		waitForSearchResults.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://dbcpu9gznkryx.cloudfront.net/public/sl-prod-od-0/images/retail-products/A85AFE77D7B5E2/A85AFE77D7B5E2-A927272C9FA7-GS1-TC12-RED/front/medium.jpg']")));
		
		WebElement firstItem = driver.findElement(By.xpath("//img[@src='https://dbcpu9gznkryx.cloudfront.net/public/sl-prod-od-0/images/retail-products/A85AFE77D7B5E2/A85AFE77D7B5E2-A927272C9FA7-GS1-TC12-RED/front/medium.jpg']"));
		
		firstItem.click();
		
		WebDriverWait waitForItemPage = new WebDriverWait(driver, 10);
		waitForItemPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui full-width input']//select[@class='ui selection dropdown fluid']")));
		
		WebElement availableProductDropdown = driver.findElement(By.xpath("//div[@class='ui full-width input']//select[@class='ui selection dropdown fluid']"));
		WebElement availableProductOption = driver.findElement(By.xpath("//option[@value='A85AFE77D7B5E2-A927272C9FA7-GS1-TC4-BLK']"));
		
		WebElement colorSelectorElement = driver.findElement(By.xpath("//div[@class='ColorPicker interactive bordered']//div[@class='picked color']//div[@class='ui big circular label']"));
		WebElement sizeSelectorElement = driver.findElement(By.xpath("//div[@class='CampaignProductSizeSelector']//div[3]//div[1]//div[1]"));
		WebElement numberOfItemsDropdownn = driver.findElement(By.xpath("//div[@class='ui column three wide column min-width-80px']//select[@class='ui selection dropdown fluid']"));
		WebElement numberOfItemsOption = driver.findElement(By.xpath("//option[@value='2']"));
		
		
		availableProductDropdown.click();
		availableProductOption.click();
		
		colorSelectorElement.click();
		sizeSelectorElement.click();
		numberOfItemsDropdownn.click();
		numberOfItemsOption.click();
		
		
		WebElement buyNowButton = driver.findElement(By.xpath("//div[@id='buy-it-now']"));
		
		buyNowButton.click();
		
		
	}
}
