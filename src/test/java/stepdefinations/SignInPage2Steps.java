package stepdefinations;

import org.openqa.selenium.WebDriver;

import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SignInPage2Steps {
	private WebDriver driver;
	private String title;
	SignInPage  sp;
	
	@Given("User is on Dietician website")
	public void user_is_on_dietician_website() {
		 DriverFactory.getDriver().get("");  
	}

	@When("User lands on Sign in page")
	public void user_lands_on_sign_in_page() {
		sp= new SignInPage (DriverFactory.getDriver());
		   title = sp.validateSignInpageTitle();
		 System.out.println( title);
	}
	
	@Then("User should see a Sign in form with heading {string}")
	public void User_lands_on_sign_in_page(boolean hed) {
	boolean	 heading = sp.validateSigninHeading2();
	System.out.println(heading );
		
	}

	@Given("User is on Sign in page")
	public void user_is_on_sign_in_page() {
		System.out.println("Current page  title is :"+"Sign in");   
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	  sp.signin();  
	}
	
	

	@When("User clicks on login button with invalid email and valid password")
	public void user_clicks_on_login_button_with_invalid_email_and_valid_password() {
		sp.signInTest2();   
	}

	@Then("User gets a message {string}")
	public void user_gets_a_message(String string) {
		String text = sp.errorText();
		 System.out.println("Error message :"+text);  
	}

	@When("User clicks on login button with valid email and invalid password")
	public void user_clicks_on_login_button_with_valid_email_and_invalid_password() {
		sp.signInTest2(); 
	}

	@When("User clicks on login button with invalid email and invalid password")
	public void user_clicks_on_login_button_with_invalid_email_and_invalid_password() {
		sp.signInTest2(); 	  
	}

	@When("User clicks on login button with valid email and valid password")
	public void user_clicks_on_login_button_with_valid_email_and_valid_password() {
		 sp.signin();   
	}


	@When("User clicks on facebook button")
	public void user_clicks_on_facebook_button () {
	  sp.google(); 
	}
	@Then("User is redirected to Facebook login page")
	public void user_is_redirected_to_facebook_login_page() {
		System.out.println("Current page title is :"+"Facebook login");  
	}

	@When("User clicks on Google  button")
	public void user_clicks_on_google_button() {
	  sp.google(); 
	}

	@Then("User is redirected to Google login page")
	public void user_is_redirected_to_google_login_page() {
		System.out.println("Current page title is :"+"Google acount"); 
	}

	@When("User clicks on Sign up link")
	public void user_clicks_on_sign_up_link() {
	 sp.loginHere();   
	}

	@Then("User is redirected to Register page")
	public void user_is_redirected_to_register_page() {
		System.out.println("Current page title is :"+"Register");
	}

}
