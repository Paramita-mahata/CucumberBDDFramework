package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GenerateDietPlans {
	private WebDriver driver;
	
	//Constructor
		public GenerateDietPlans(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(linkText = "ViewPDF")
	WebElement viewPDF;
	
	public void viewPDF() {
		 viewPDF.click();
		}
		
}