package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPage1Steps {
	private WebDriver driver;
	private String title;
	SignInPage  sp;
	
	
	
	
	@Given("User has alreday sign up")
	public void user_has_alreday_sign_up() {
	 System.out.println("Current page title is :"+"Sign In");  
	}


	

//	@Given("User is on Sign in  page")
//	public void user_is_on_sign_in_page() {
//		sp= new SignInPage (DriverFactory.getDriver());
//		   title = sp.validateSignInpageTitle();
//		   Assert.assertEquals(title ,"Sign in");
	//}
	@When("user is on sign in page")
	public void user_is_on_sign_in_page() {
		sp= new SignInPage (DriverFactory.getDriver());
		   title = sp.validateSignInpageTitle();
		   Assert.assertEquals(title ,"Sign in");  
	}
	
	@When("user clicks on sign in")
	public void user_clicks_on_sign_in() {
	 sp.signin();   
	}

	

	@Then("User should see all mandatory fields")
	public void user_should_see_all_mandatory_fields() {
	boolean fd =	sp.validatefields();
	Assert.assertTrue(fd);
	   
	}


	@When("User clicks on sign in button with all fields empty")
	public void user_clicks_on_sign_in_button_with_all_fields_empty() {
	 sp.emptyFields();
	}

	@Then("User should get message {string}")
	public void user_should_get_message(String errortext) {
	    String text = sp.errorText();
	   Assert.assertTrue(text.contains(errortext));
	}

	

	@When("User clicks on sign in button with inavalid first name")
	public void user_clicks_on_sign_in_button_with_inavalid_first_name() {
	  sp.signInTest();  
	}

	

	@When("User clicks on sign in button with invalid Password")
	public void user_clicks_on_sign_in_button_with_invalid_password() {
	  sp.signin();  
	}

	@When("User clicks on sign in button with invalid  username and password")
	public void user_clicks_on_sign_in_button_with_invalid_username_and_password() {
	   sp.signInTest();
	}

	

	@When("User clicks on forgot password button")
	public void user_clicks_on_forgot_password_button() {
	   sp.forgotpwd();
	}

	@Then("User should be directed to reset password link")
	public void user_should_be_directed_to_reset_password_link() {
	  System.out.println("Current page title is :"+"reset password"); 
	}

	@When("User clicks on not member yet button")
	public void user_clicks_on_not_member_yet_button() {
	    sp.notmember();
	}

	@Then("User will land on Register page")
	public void user_will_land_on_register_page() {
	  System.out.println("Current page title is :"+"register");  
	}

	@When("User clicks sign in with all fields entered")
	public void user_clicks_sign_in_with_all_fields_entered() {
sp.signin();
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	String msg = sp.successMsg();
	System.out.println(msg );
	}

}
