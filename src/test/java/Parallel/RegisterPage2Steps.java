package Parallel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.RegisterPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPage2Steps {
	private WebDriver driver;
	private String title;
	RegisterPage  rp;
	
	@Then("User should see a form with heading {string}")
	public void user_should_see_a_form_with_heading(boolean Heading) {
		 Heading =rp.validateRegisterageHeading2();
		 Assert.assertTrue(Heading);
	}
	
	@Then("User should see a button with text {string}")
	public void user_should_see_a_button_with_text(String Heading) {
		rp= new RegisterPage(DriverFactory.getDriver());
	boolean heading =	rp.validateRegisterageHeading2();
	Assert.assertTrue(heading);
	}

	@When("User clicks on sign up button with inavalid Username")
	public void user_clicks_on_sign_up_button_with_inavalid_username() {
	    rp.signUpTest2();
	}

	@When("User clicks on sign up button with invalid Email Address")
	public void user_clicks_on_sign_up_button_with_invalid_email_address() {
	  rp.signUpTest2(); 
	}

	@When("User clicks on sign up button with invalid  Confirm Password")
	public void user_clicks_on_sign_up_button_with_invalid_confirm_password() {
	  rp.signUpTest2();  
	}

	@When("User clicks on facebook button for sign in")
	public void user_clicks_on_facebook_button() {
	   rp.facebk();
	   
	}
	
	//Data Driven approach with scenario Outline
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	  rp.txtUserName().sendKeys(username);
	  rp.txtPassword().sendKeys (password);
	}

	@Then("User successfully login with facebook account")
	public void user_successfully_login_with_facebook_account() {
	   System.out.println("Current page title is :"+"Facebook Account"); 
	}

	@When("User clicks on google button")
	public void user_clicks_on_google_button() {
	rp.google();
	}

	@Then("User successfully login with Google account")
	public void user_successfully_login_with_google_account() {
	   System.out.println("Current page title is :"+"Google Account"); 
	}

	@When("User clicks Log in here link")
	public void user_clicks_log_in_here_link() {
	    rp.loginHere();
	}

}
