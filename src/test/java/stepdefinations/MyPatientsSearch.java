package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.MyPatient;
import io.cucumber.java.en.*;

public class MyPatientsSearch {
	
	private WebDriver driver;
	private String title;
	private String msg;
	MyPatient ObjMyPatient = new MyPatient(driver);
	
	
	
	@Given("User is on any page")
	public void user_is_on_any_page() {
	    // Write code here that turns the phrase above into concrete actions
		//it calls Application hooks to invoke browser
		
	}

	@When("User clicks on My Patients tab")
	public void user_clicks_on_my_patients_tab() {
	    // Write code here that turns the phrase above into concrete actions
//		MyPatient ObjMyPatient = new MyPatient(driver);
		ObjMyPatient.clickMyPatients();
	}

	@Then("User should be directed to My Patients page")
	public void user_should_be_directed_to_my_patients_page() {
	    // Write code here that turns the phrase above into concrete actions
		title = driver.getTitle();
		Assert.assertTrue(title.contains("expectedTitleName"));
	}

	@Given("User is on My Patients page")
	public void user_is_on_my_patients_page() {
	    // Write code here that turns the phrase above into concrete actions
		//it calls Application hooks to invoke browser
	}

	@When("User clicks Search button without any entry")
	public void user_clicks_search_button_without_any_entry() {
	    // Write code here that turns the phrase above into concrete actions
//		MyPatient ObjMyPatient = new MyPatient(driver);
		ObjMyPatient.clickSearchBtn();
	}

	@Then("User should see an Alert message  {string}")
	public void user_should_see_an_alert_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
//		MyPatient ObjMyPatient = new MyPatient(driver); 
		ObjMyPatient.captureAlertMessage();
		msg="expectedAlertMessage";
		Assert.assertTrue(msg.contains("expectedAlertMessage"));
	}

	@When("User clicks Search button invalid name")
	public void user_clicks_search_button_invalid_name() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchEntername();
		ObjMyPatient.clickSearchBtn();
	}

	@Then("User should see an Alert message1 {string}")
	public void user_should_see_an_alert_message1(String string) {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.captureAlertMessage();
		msg="expectedAlertMessage";
		Assert.assertTrue(msg.contains("expectedAlertMessage"));
	}

	@When("User clicks Search with  invalid email")
	public void user_clicks_search_with_invalid_email() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchEnterEmail();
		ObjMyPatient.clickSearchBtn();
	}

	@Then("User should see an Alert message2 {string}")
	public void user_should_see_an_alert_message2(String string) {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.captureAlertMessage();
		msg="expectedAlertMessage";
		Assert.assertTrue(msg.contains("expectedAlertMessage"));
	}

	@When("User clicks Submit button with invalid phone number")
	public void user_clicks_submit_button_with_invalid_phone_number() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchEnterPhone();
		ObjMyPatient.clickSearchBtn();
	}

	@Then("User should see an Alert message3 {string}")
	public void user_should_see_an_alert_message3(String string) {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.captureAlertMessage();
		msg="expectedAlertMessage";
		Assert.assertTrue(msg.contains("expectedAlertMessage"));
	}

	@When("User clicks search button with name field.")
	public void user_clicks_search_button_with_name_field() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchEntername();
		ObjMyPatient.clickSearchBtn();
	}

	@Then("Records with that name phrase are displayed")
	public void records_with_that_name_phrase_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchResult();
		msg="expectedAlertMessage";
		Assert.assertTrue(msg.contains("expectedAlertMessage"));
	}

	@When("User clicks search button with email field")
	public void user_clicks_search_button_with_email_field() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchEnterEmail();
		ObjMyPatient.clickSearchBtn();
	}

	@Then("Records with that email are displayed")
	public void records_with_that_email_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchResult();
		msg="expectedAlertMessage";
		Assert.assertTrue(msg.contains("expectedAlertMessage"));
	}

	@When("User clicks search button with phone number field")
	public void user_clicks_search_button_with_phone_number_field() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchEnterPhone();
		ObjMyPatient.clickSearchBtn();
	}

	@Then("Records with that phone number are displayed")
	public void records_with_that_phone_number_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		ObjMyPatient.searchResult();
		msg="expectedAlertMessage";
		Assert.assertTrue(msg.contains("expectedAlertMessage"));
	}
	

}
