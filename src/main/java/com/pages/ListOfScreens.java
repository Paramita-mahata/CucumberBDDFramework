package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfScreens {
	private WebDriver driver;
	
	//Constructor
		public ListOfScreens(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[1]/div[1])")
	WebElement menu;
	@FindBy (xpath = "//html/body/section/ul/li[1]")
	WebElement signin;
	@FindBy(xpath = "//html/body/section/ul/li[2]")
	WebElement register;
	@FindBy(xpath = "//html/body/section/ul/li[3]")
	WebElement team;
	@FindBy(xpath = "//html/body/section/ul/li[4]")
	WebElement Testimonials;
	@FindBy(xpath = "//html/body/section/ul/li[5]")
	WebElement Forgotpw;
	@FindBy(xpath = "//html/body/section/ul/li[6]")
	WebElement PFeature;
	@FindBy(xpath = "//html/body/section/ul/li[7]")
	WebElement Contact;
	@FindBy(xpath = "//html/body/section/ul/li[8]")
	WebElement blogs;
	@FindBy(xpath = "//html/body/section/ul/li[9]")
	WebElement Featuredcontent;
	@FindBy(xpath = "//html/body/section/ul/li[10]")
	WebElement home;
	@FindBy(xpath = "//html/body/section/ul/li[11]")
	WebElement ViewDiets;
	@FindBy(xpath = "//html/body/section/ul/li[12]")
	WebElement ViewTestReport;
	@FindBy(xpath = "//html/body/section/ul/li[13]")
	WebElement NewPatient;
	@FindBy(xpath = "//html/body/section/ul/li[14]")
	WebElement DieticianHome;
	@FindBy(xpath = "//html/body/section/ul/li[15]")
	WebElement MyPatient;
	@FindBy(xpath = "//html/body/section/ul/li[16]")
	WebElement CreatePlans;
	
	public void clickSignin() {
	 signin.click();
	}
	
	public void clickRegister() {
		register.click();
	}
	public void clickTeam() {
		team.click();
	}
	public void clickTestimonials() {
		Testimonials.click();
	}
	public void clickForgotpassword() {
		Forgotpw.click();
		}
	public void clickProductFeature() {
		PFeature.click();
		}
	public void clickContact() {
		Contact.click();
		}
	public void clickBlogs() {
		blogs.click();
		}
	public void clickFeaturedcontent() {
		Featuredcontent.click();
	}
	public void clickHome() {
		home.click();
	}
	public void clickViewDiets() {
		ViewDiets.click();}

	public void clickViewRescentTestReport() {
		ViewTestReport.click();
		}
	public void clickNewPatient() {
		NewPatient.click();
		}
	public void clickDietcianHome() {
		DieticianHome.click();
		}
	public void clickMyPatient() {
		MyPatient.click();
		}
	public void clickCreatePlans() {
		CreatePlans.click();
	}
}


