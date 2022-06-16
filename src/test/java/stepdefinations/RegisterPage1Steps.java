package stepdefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.RegisterPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPage1Steps {
	private WebDriver driver;
	private String title;
	RegisterPage  rp;

@Given("User is on Dietician  website")
public void user_is_on_dietician_website() {
	 DriverFactory.getDriver().get(""); 
}

@When("User lands on Register page")
public void user_lands_on_register_page() {
    rp= new RegisterPage(DriverFactory.getDriver());
}

@Then("User should see the title of the page as {string}")
public void user_should_see_the_title_of_the_page_as(String expectedTitleName ) {
     title = rp.validateRegisterageTitle();
  Assert.assertTrue(title.contains(expectedTitleName));
}

@Then("User should see all the mandatory fields with star symbol")
public void user_should_see_all_the_mandatory_fields_with_star_symbol() {
boolean verify =   rp.allFields();
Assert.assertTrue(verify);
}
	

@Then("User should see a  Register form with heading {string}")
public void user_should_see_a_form_with_heading(boolean Heading) {
	 Heading =rp.validateRegisterageHeading1();
	 Assert.assertTrue(Heading);
}

@Given("User is on Register page")
public void user_is_on_register_page() {
   rp.validateRegisterageTitle();
   System.out.println("Current page title is :"+"Register");
}



@When("User clicks on sign up button with all fields empty")
public void user_clicks_on_sign_up_button_with_all_fields_empty() {
  rp.emptyFields();
}

@Then("User should see a message {string}")
public void user_should_see_a_message(String errorMsg) {
 String msg =  rp.errorText(); 
 Assert.assertTrue(msg.contains(errorMsg));
}

//data table approach
@When("User enters inavalid first name")
public void user_enters_inavalid_first_name(io.cucumber.datatable.DataTable dataTable) {
List<String> data =	dataTable.asList();
System.out.println(data.get(0));

}
@Then("User clicks on sign up button")
public void user_clicks_on_sign_up_button() {
   rp.signupbtn();
}
@When("User clicks on sign up button with invalid any other field")
public void user_clicks_on_sign_up_button_with_invalid_any_other_field() {
   rp.signupbtn();
}

@When("User clicks on sign up button with inavalid first name")
public void user_clicks_on_sign_up_button_with_inavalid_first_name() {
  rp.signUpTest(); 
 
}

@When("User clicks on sign up button with inavalid last name")
public void user_clicks_on_sign_up_button_with_inavalid_last_name() {
  rp.signUpTest(); 
}
@When("User clicks on sign up button with incorrect moblie number")
public void user_clicks_on_sign_up_button_with_incorrect_moblie_number() {
	rp.signUpTest();  
}

@When("User clicks on sign up button with invalid Email")
public void user_clicks_on_sign_up_button_with_invalid_email() {
  rp.signUpTest();
}

@When("User clicks on sign up button with invalid Password")
public void user_clicks_on_sign_up_button_with_invalid_password() {
  rp.signUpTest();  
}

@When("User clicks on sign up button with valid credentials")
public void user_clicks_on_sign_up_button_with_valid_credentials() {
  rp.signUpTest();
}

@Then("User is re-directed to sign in page")
public void user_is_re_directed_to_sign_in_page() {
  System.err.println("Current page title is :"+"Sign In");  
}

}
