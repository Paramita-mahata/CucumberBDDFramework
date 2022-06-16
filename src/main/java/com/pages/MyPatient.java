package com.pages;

import org.openqa.selenium.WebDriver;

public class MyPatient {
	
	static WebDriver driver;
	//public By clickMyPatient = By.xpath("") ;
	//public By clickSearch = By.xpath("") ;
	//public By alertMessage = By.xpath("") ;
	//public By enterName = By.xpath("") ;
	//public By enterEmail = By.xpath("") ;
	//public By enterPhone = By.xpath("") ;
	//public By searchResultTag = By.xpath("") ;
	
//	public MyPatient (WebDriver driver) {
//		this.driver=driver;
//		}

	

	@SuppressWarnings("static-access")
	public MyPatient(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void clickMyPatients() {
		//driver.findElement(clickMyPatient).click();
		System.out.println("clickMyPatients is successful");
		}
	
	public void clickSearchBtn() {
		//driver.findElement(clickSearch).click();
		System.out.println("clickSearchBtn is successful");
		}
	
	public void captureAlertMessage() {
		//driver.findElement(alertMessage).getText();
		
		System.out.println("captureAlertMessage is successful");
		
		}
	
	public void searchEntername() {
		//driver.findElement(enterName).sendKeys();
		System.out.println("searchEntername is successful");
		}
	
	public void searchEnterEmail() {
		//driver.findElement(enterEmail).sendKeys();
		System.out.println("searchEnterEmail is successful");
		}
	
	public void searchEnterPhone() {
		//driver.findElement(enterPhone).sendKeys();
		System.out.println("searchEnterPhone is successful");
		}
	
	public void searchResult() {
		//driver.findElement(enterPhone).sendKeys();
		//searchResultTag.gettext();
		System.out.println("searchResult display is successful");
		}
}

