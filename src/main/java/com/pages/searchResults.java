package com.pages;

import org.openqa.selenium.WebDriver;

public class searchResults {
	
	static WebDriver driver;
	
	//public By clickNewPlan = By.xpath("") ;
	//public By clickPreviousTestReports = By.xpath("") ;
	//public By clickPreviousDiet = By.xpath("") ;
	//public By clickPageNumber = By.xpath("") ;
	//public By clickFrontArrow = By.xpath("") ;
	//public By clickBackArrow = By.xpath("") ;
	//public By pageNumberTag = By.xpath("") ;
	//public By clickPDF = By.xpath("") ;
	
	
	public searchResults(WebDriver driver) {
		// TODO Auto-generated constructor stub
		searchResults.driver=driver;
	}

	public void clickCreateNewPlan() {
		//driver.findElement(clickNewPlan).click();
		System.out.println("clickCreateNewPlan navigation is successful");
		}

	public void clickTestReports() {
		//driver.findElement(clickPreviousTestReports).click();
		System.out.println("clickTestReports navigation is successful");
		}
	
	public void clickPreviousDietPlan() {
		//driver.findElement(clickNewPlan).click();
		System.out.println("clickPreviousDietPlan navigation is successful");
		}
	
	public void clickPageNumber() {
		//driver.findElement(clickPageNumber).click();
		System.out.println("clickPageNumber navigation is successful");
		}
	
	public void clickFrontArrow() {
		//driver.findElement(clickFrontArrow).click();
		System.out.println("clickFrontArrow navigation is successful");
		}
	
	public void clickBackArrow() {
		//driver.findElement(clickBackArrow).click();
		System.out.println("clickBackArrow navigation is successful");
		}
	
	public void pageNumber() {
		//driver.findElement(enterPhone).sendKeys();
		//pageNumberTag.gettext();
		System.out.println("pageNumber is successful");
		}
	
	public void clickPDF() {
		//driver.findElement(clickPDF).click();
		System.out.println("clickPDF button is successful");
		}
	
	public void capturePDFinfo() {
		//driver.findElement(clickPDF).click();
		System.out.println("clickPDF button is successful");
		}
	
	
}
