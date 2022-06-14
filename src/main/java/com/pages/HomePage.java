package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
//Constructor
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//page objects
	@FindBy(linkText = "Register") WebElement registerLink;
	@FindBy(id = "prpduct") WebElement productLink;
	@FindBy(css = "a[class ='client']") WebElement clientLink;
	@FindBy(id = "TEAM") WebElement teamLink;
	@FindBy(id= "About") WebElement aboutaLink;
	@FindBy(id= "Blog") WebElement blogLink;
	@FindBy(className= "Featured") WebElement featuredLink;
	@FindBy(className= "Contact us") WebElement contactUsLink;
	@FindBy(xpath = "//img[contains(@class,img-responsive')]") WebElement logo;
	@FindBy(css = "button[type ='Search']") WebElement searchOption;
	@FindBy(css = "button[type ='Sign-in']") WebElement signInOption;
//Actions
public String validateHomePageTitle() {
return	driver.getTitle();
	
}

public boolean validateLogo() {
	return logo.isDisplayed();
}

public void clickRegister() {
	registerLink.click();
}

public void clickproduct() {
	productLink.click();
}
public void clickTeam() {
	teamLink.click();
}
public void clickClient() {
	clientLink.click();
}
public void clickAbout() {
	aboutaLink.click();
}
public void clickBlog() {
	blogLink.click();
}
public void clickFeatured() {
	featuredLink.click();
}
public void clickContactUs() {
	contactUsLink.click();
}
public boolean searchOptionTest() {
return	searchOption.isDisplayed();
}

public boolean signinOptionTest() {
return	signInOption.isDisplayed();
}

	
}

