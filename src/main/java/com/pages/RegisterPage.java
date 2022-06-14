package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	private WebDriver driver;
	
	//Constructor
		public RegisterPage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		//page objects
		@FindBy(name = "FirstName") WebElement firstName;
		@FindBy(linkText = "login") WebElement loginHere;
		@FindBy(id = "Last Name") WebElement lastName;
		@FindBy(id = "email") WebElement txtEmail;
		@FindBy(id = "password") WebElement txtPassword;
		@FindBy(name= "Mobile number") WebElement typeNumber;
		@FindBy(css= "#anyotherfield") WebElement txtField;
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
		//Actions 
		public String validateRegisterageTitle() {
			return	driver.getTitle();
				
			}
		
		public boolean validateRegisterageHeading1() {
			return Heading1.isDisplayed();
				
			}
		public boolean validateRegisterageHeading2() {
			return Heading2.isDisplayed();
				
			}
		
		public void signUpTest() {
			firstName.sendKeys("sfdgfhjn");
			 lastName.sendKeys("xfdtkuhj");
			 typeNumber.sendKeys("13434455766");
			 txtField.sendKeys("DTFYJGJHJK");
			 txtEmail.sendKeys("xfgdghb@gnail.com");
			 txtPassword.sendKeys("cnwdjgekdjed");
			}
		public void signUpTest2() {
			txtName.sendKeys("sfdgfhjn");
			 lastName.sendKeys("xfdtkuhj");
			 txtUserName.sendKeys("sfdgfhjn");
			 txtEmail.sendKeys("xfgdghb@gnail.com");
			 txtPassword.sendKeys("cnwdjgekdjed");
			 confirmBtn.sendKeys("cnwdjgekdjed");
			}
		
		public void emptyFields() {
			firstName.sendKeys("");
			 lastName.sendKeys("");
			 typeNumber.sendKeys("");
			 txtField.sendKeys("");
			 txtEmail.sendKeys("");
			 txtPassword.sendKeys("");
		}
		
		public boolean allFields() {
			firstName.isDisplayed();
			 lastName.isDisplayed();
			return txtPassword.isDisplayed();
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
		
}
		
