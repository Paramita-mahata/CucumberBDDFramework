package stepdefinations;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.AddNewPatientPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class AddNewPatientSteps {
	private WebDriver driver;
	private String title;
	
	private AddNewPatientPage anp = new AddNewPatientPage(DriverFactory.getDriver());
	@Given("User is on add new patient page")
	public void user_is_on_add_new_patient_page() {
		title=anp.Validateaddnewpatienttitle();
		Assert.assertEquals(title, "Addnewpatient");
		}

	@When("User attempts to submit button without entering {string}")
	public void user_attempts_to_submit_button_without_entering(String string) {
	anp.emptyfields();
	}

	@Then("Verify message {string} should display")
	public void verify_message_should_display(String string) {
		String text = anp.errormessage();
		Assert.assertTrue(text.contains(string));
	}

	@When("User attemtps to put numeric value in {string} field")
	public void user_attemtps_to_put_numeric_value_in_field(String string) {
		anp.numfullname();
	}

	@When("user enters {string} and {string} without space")
	public void user_enters_and_without_space(String string, String string2){
		anp.nospacename();
	}

	@When("User attempts to submit form without entering {string} field")
	public void user_attempts_to_submit_form_without_entering_field(String string) {
anp.addressEmpty();	}

	@Then("Unable to submit {string} message should display")
	public void unable_to_submit_message_should_display(String string) {
		String text1 = anp.message();
		Assert.assertTrue(text1.contains(string));
		
	}

	@When("User Attempts to submit form without selecting {string}")
	public void user_attempts_to_submit_form_without_selecting(String string) {
	anp.emptyCountry();
	}

	@When("user attempts to put numeric value in {string} field")
	public void user_attempts_to_put_numeric_value_in_field(String string) {
anp.numericcity();
	}

	@When("User trying to enter wrong data format in {string} field")
	public void user_trying_to_enter_wrong_data_format_in_field(String string) {
		anp.wrongemail();
	}

	@When("User attempts to put characters in {string} field")
	public void user_attempts_to_put_characters_in_field(String string) {
		anp.charPnumber();
	}

	@When("User fills the New Patient form with valid inputs")
	public void user_fills_the_new_patient_form_with_valid_inputs() {
		anp.AddnewPatient();
	}

	@Then("Verify {string} button should appear")
	public void verify_button_should_appear(String string) {
		
		
	}

	@When("User clicks on {string} button after entering valid patient data")
	public void user_clicks_on_button_after_entering_valid_patient_data(String string) {
		anp.AddnewPatient();
	}

	@Then("User should land on {string} page with the new {string} details dispalyed")
	public void user_should_land_on_page_with_the_new_details_dispalyed(String string, String string2) {
		System.out.println("Current page title is :" + "MyPatients Page");
		Assert.assertEquals(title, "MyPatientsPage");
	}

}


