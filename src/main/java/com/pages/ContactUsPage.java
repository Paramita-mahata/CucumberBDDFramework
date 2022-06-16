package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	private WebDriver driver;

	// constructor
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
}
	@FindBy(xpath="//ul/li[3]/a/span")
	WebElement contactus;
	@FindBy(xpath="//input[@type='button']")
	WrapsElement submitbtn;
	@FindBy(id="firstname")
	WebElement fname;
	@FindBy(id="lastname")
	WebElement lname;
	@FindBy(name="email")
	WebElement Email;
	@FindBy(xpath="//div[@class='subject']")
	WebElement subject;
	@FindBy(linkText="message")
	WebElement mssg;
	@FindBy(xpath = "//div[@text()=success msg']")
	WebElement message;
	@FindBy(xpath = "//div[@text()=error msg']")
	WebElement message1;
	@FindBy(xpath = "//div[@text()=error msg']")
	WebElement message2;
	@FindBy(xpath = "//div[@text()=error msg']")
	WebElement message3;
	@FindBy(xpath = "//div[@text()=error msg']")
	WebElement message4;
	@FindBy(xpath = "//div[@text()=error msg']")
	WebElement message5;
	@FindBy(xpath = "//div[@text()=error msg']")
	WebElement message6;
	@FindBy(xpath = "//div[@text()=error msg']")
	WebElement message7;
	
	public String ValidateHomePagetitle() {
		return driver.getTitle();
	}
	public void Contactus() {
		contactus.click();
	}
	
	public String Validatecontactustitle() {
		return driver.getTitle();
	}
		public void emptyfields() {
			fname.sendKeys("");
			lname.sendKeys("");
			Email.sendKeys("");
			subject.sendKeys("");
			mssg.sendKeys("");
		}
		public void numfirstname() {
			fname.sendKeys("12345");
			
		}
		public void numlastname() {
			fname.sendKeys("anita");
			lname.sendKeys("1234");
			
		}
		public void invademail() {
			fname.sendKeys("anita");
			lname.sendKeys("nitturi");
			Email.sendKeys("sw2314s@1234.com");
		}
		public void numsubject() {
			fname.sendKeys("anita");
			lname.sendKeys("nitturi");
			Email.sendKeys("anita@gmail.com");
			subject.sendKeys("735627");
			
		}
		public void nummessage() {
			fname.sendKeys("anita");
			lname.sendKeys("nitturi");
			Email.sendKeys("anita@gmail.com");
			subject.sendKeys("dietician");
			mssg.sendKeys("7434824723948");
			
		}
		public void validinformation() {
			fname.sendKeys("anita");
			lname.sendKeys("nitturi");
			Email.sendKeys("anita@gmail.com");
			subject.sendKeys("dietician");
			mssg.sendKeys("appointment");
			
		}
		public String message() {
			 return message.getText();
		}
		public String msg() {
			return message1.getText();
		}
		public String msg1() {
			return message1.getText();
		}
		public String msg2() {
			return message2.getText();
		}
		public String msg3() {
			return message3.getText();
		}
		public String msg4() {
			return message4.getText();
		}
		public String msg5() {
			return message5.getText();
		}
		public String msg6() {
			return message6.getText();
		}
		public String msg7() {
			return message7.getText();
		}
	
	
	
}


