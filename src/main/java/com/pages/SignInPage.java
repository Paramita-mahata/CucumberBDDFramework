package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
private WebDriver driver;
	
	//Constructor
		public SignInPage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		//page objects
		@FindBy(name = "FirstName") WebElement firstName;
		@FindBy(linkText = "login") WebElement loginHere;
		@FindBy(id = "Last Name") WebElement lastName;
		@FindBy(id = "email") WebElement txtEmail;
		@FindBy(id = "password") WebElement txtPassword;
		@FindBy(xpath = "//div[contains(@class,img-responsive')]") WebElement  fields;
		@FindBy(css = "button[type ='Signup']") WebElement loginBtn;
		@FindBy(className= "Name") WebElement txtName;
		@FindBy(id= "username") WebElement txtUserName;
		@FindBy(xpath = "//img[contains(@class,img-responsive')]") WebElement logo;
		@FindBy(css = "button[type ='Signup']") WebElement signUpBtn;
		@FindBy(css = "button[type ='Sign-in']") WebElement confirmBtn;
		@FindBy(xpath = "//div[contains(@class,heading-responsive')]") WebElement Heading1;
		@FindBy(xpath = "//div[contains(@class,heading2-responsive')]") WebElement Heading2;
		@FindBy(css = "button[value='facebook']") WebElement facebookBtn;
		@FindBy(css= "button[value='google']") WebElement googleBtn;
		@FindBy(xpath = "//div[@text()=error msg']") WebElement errorMsg;
		@FindBy(id = "forgot pwd") WebElement forgotpwd;
		@FindBy(css= "button[type='not member']") WebElement notmember;
		@FindBy(xpath = "//div[@text()=success msg']") WebElement successMsg;
		//Actions 
		public String validateSignInpageTitle() {
			return	driver.getTitle();
				
			}
		
		public boolean validateSigninHeading1() {
			return Heading1.isDisplayed();
				
			}
		public boolean validateSigninHeading2() {
			return Heading2.isDisplayed();
				
			}
		public boolean validatefields() {
			return fields.isDisplayed();
				
			}
		public void signInTest() {
			txtUserName.sendKeys("dfghbjh");
			 txtPassword.sendKeys("cnwdjgekdjed");
			 signUpBtn.click();
			}
		public void signInTest2() {

			 txtEmail.sendKeys("xfgdghb@gnail.com");
			 txtPassword.sendKeys("cnwdjgekdjed");
			 loginBtn.click();
			}
		
		public void emptyFields() {
			firstName.sendKeys("");
			 lastName.sendKeys("");
			 txtEmail.sendKeys("");
			 txtPassword.sendKeys("");
		}
		
		public String errorText() {
		return	errorMsg.getText();
		}
		public void facebk() {
			facebookBtn.click();
			}
		public void google() {
			googleBtn.click();
			}
		public void loginHere() {
			loginHere.click();
			}
		
		public void signin() {
			signUpBtn.click();
		}

		public void forgotpwd() {
			forgotpwd.click();
		}
		public void notmember () {
			notmember.click();
		}
		public String successMsg () {
			return successMsg.getText();
		}
}
