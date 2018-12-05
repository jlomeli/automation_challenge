package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.pages.ChosenItemPage;
import com.selenium.pages.HomePage;
import com.selenium.pages.SearchResultsPage;

public class AddToCartTest {
	
	public WebDriver driver;
	public HomePage homePage;
	public SearchResultsPage searchResultsPage;
	public ChosenItemPage chosenItemPage;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.drive", "~//usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		
		 homePage = new HomePage(driver);
		 searchResultsPage = new SearchResultsPage(driver);
		 chosenItemPage = new ChosenItemPage(driver);
		
		driver.get("https://teechip.com");
	}
	
	@Test
	public void addToCart() {
		
		homePage.enterSearchTerm("cats");
		homePage.clickSearchButton();
		
		WebDriverWait waitForSearchResults = new WebDriverWait(driver, 10);
		waitForSearchResults.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://dbcpu9gznkryx.cloudfront.net/public/sl-prod-od-0/images/retail-products/A85AFE77D7B5E2/A85AFE77D7B5E2-A927272C9FA7-GS1-TC12-RED/front/medium.jpg']")));
		
		searchResultsPage.selectAvailableItem();
		
		WebDriverWait waitForItemPage = new WebDriverWait(driver, 10);
		waitForItemPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='CampaignProductThumbnail selected clipped ui card']//img")));
		
		
		chosenItemPage.selectItem();
		chosenItemPage.selectColorOfItem();
		chosenItemPage.selectsizeOfItem();
		chosenItemPage.selectNumberOfItems();
		
		
		chosenItemPage.addToCart();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
