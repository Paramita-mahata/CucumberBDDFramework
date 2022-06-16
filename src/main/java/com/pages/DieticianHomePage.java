package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DieticianHomePage {
	private WebDriver driver;

	public DieticianHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// page objects
	@FindBy(name = "button")
	WebElement singninbtn;
	@FindBy(id = "name")
	WebElement txtusername;
	@FindBy(id = "password")
	WebElement txtpassword;
	@FindBy(xpath = "//input[@type='button']")
	WebElement sgnbtn;

	@FindBy(xpath = "//ul/li[2]/a/spam")
	WebElement newpatient;
	@FindBy(css = "div[class*='patient']")
	WebElement mypatients;
	@FindBy(xpath = "//ul/li[4]/a/spam")
	WebElement dietplans;
	@FindBy(xpath = "//button[@type=sign out]")
	WebElement lgtbtn;
	@FindBy(xpath = "//div[@text()='msg']")
	WebElement message;

	// Actions
	public String validateDieticianHomepageTitle() {
		return driver.getTitle();

	}

	public void ClickSigninbtn() {
		singninbtn.click();
	}

	public void signin() {
		txtusername.sendKeys("username");
		txtpassword.sendKeys("password");
		sgnbtn.click();

	}

	public String Message() {
		return message.getText();
	}

	public void ClickAddnewPatient() {
		newpatient.click();
	}

	public void clickMyPatients() {
		mypatients.click();
	}

	public void clickDietPlans() {
		dietplans.click();
	}

	public void clickSignOut() {
		lgtbtn.click();
	}

}
