package com.pages;

public class CreatePlanone {
   
	
static WebDriver driver; 
	
	//public By clickBrowse = By.xpath("") ;
	//public By browseTag = By.xpath("") ;
	//public By clickUpload = By.xpath("") ;
	//public By uploadTag = By.xpath("") ;
	//public By toggleBtn = By.xpath("") ;
	//public By confirmBtn = By.xpath("") ;
	//public By confirmTag = By.xpath("") ;


	public CreatePlanone(WebDriver driver) {
		// TODO Auto-generated constructor stub
		searchResults.driver=driver; 
	}
	
	public void clickBrowseOption() {
		//driver.findElement(clickBrowse).click();
		System.out.println("clickBrowseOption is successful");
	}

	public void browseTag() {
		//browseTag.gettext();
		System.out.println("Browse is successful");
	}
	
	public void clickUploadOption() {
		//driver.findElement(clickBrowse).click();
		System.out.println("clickUploadOption is successful");
	}
	
	public void UploadTag() {
		//uploadTag.gettext();
		System.out.println("UploadTag is successful");
	}
	
	public void select() {
		//toggleBtn.click();

		System.out.println("select is successful");
	}
	
	public void clickConfirm() {
		//driver.findElement(confirmBtn).click();
		System.out.println("confirmBtn is successful");
	}
	
	public void confirmTag() {
		//confirmTag.gettext();
		System.out.println("confirmTag is successful");
	}
	
	
	

}
