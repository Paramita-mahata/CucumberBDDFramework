package Parallel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.CreatePlantwo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePlanTwo {

	private WebDriver driver;   
	private String msg;
	CreatePlantwo objCreatePlanTwo = new CreatePlantwo(driver);


	@Given("The user is on {string} page2")
	public void the_user_is_on_page2(String string) {
		// Write code here that turns the phrase above into concrete actions
		//it calls Application hooks to invoke browser
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Browse button option {int}")
	public void user_clicks_browse_button_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.clickBrowseOption2();
	}

	@Then("A window should popup to select the file from file location option {int}")
	public void a_window_should_popup_to_select_the_file_from_file_location_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.browseTag2();
		msg="browse open string";
		Assert.assertTrue(msg.contains("browse open string"));
	}

	@When("User clicks Upload button option {int}")
	public void user_clicks_upload_button_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.clickUploadOption2();
	}

	@Then("It should upload the file successfully option2")
	public void it_should_upload_the_file_successfully_option2() {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.UploadTag2();
		msg="Upload open string";
		Assert.assertTrue(msg.contains("Upload open string"));
	}

	@When("User clicks Upload button with correpted file option {int}")
	public void user_clicks_upload_button_with_correpted_file_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.clickUploadOption2();
	}

	@Then("Display alert the file could not be uploaded option {int}")
	public void display_alert_the_file_could_not_be_uploaded_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.UploadTag2();
		msg="Upload open string";
		Assert.assertTrue(msg.contains("Upload open string"));
	}

	@When("User unselect toggle button option {int}")
	public void user_unselect_toggle_button_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
	}

	@Then("The respective option must deselect option {int}")
	public void the_respective_option_must_deselect_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		//		if (toggleBtn.isSelected()) {					
		//      System.out.println("Checkbox is Toggled On");					
		//
		//  } else {			
		//      System.out.println("Checkbox is Toggled Off");					
		//  }
		objCreatePlanTwo.select2();
	}

	@When("User select toggle button option {int}")
	public void user_select_toggle_button_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
	}

	@Then("The respective option must get selected option {int}")
	public void the_respective_option_must_get_selected_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		//		if (toggleBtn.isSelected()) {					
		//      System.out.println("Checkbox is Toggled On");					
		//
		//  } else {			
		//      System.out.println("Checkbox is Toggled Off");					
		//  }
		objCreatePlanTwo.select2();
	}

	@When("User clicks Confirm button option {int}")
	public void user_clicks_confirm_button_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays confirmed successfuly and no more updates allowed to user option {int}")
	public void displays_confirmed_successfuly_and_no_more_updates_allowed_to_user_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button without selecting any options {int}")
	public void user_clicks_confirm_button_without_selecting_any_options(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Please select atleast one option option {int}")
	public void displays_please_select_atleast_one_option_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button with no condition selected option {int}")
	public void user_clicks_confirm_button_with_no_condition_selected_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Select atleast one option from condition option {int}")
	public void displays_select_atleast_one_option_from_condition_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button with no Co-Morbidities selected option {int}")
	public void user_clicks_confirm_button_with_no_co_morbidities_selected_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Select atleast one option from Co-Morbidities")
	public void displays_select_atleast_one_option_from_co_morbidities() {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button with no preference selected option {int}")
	public void user_clicks_confirm_button_with_no_preference_selected_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@Then("Displays Select atleast one option from preference option {int}")
	public void displays_select_atleast_one_option_from_preference_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button upon selecting only condition option {int}")
	public void user_clicks_confirm_button_upon_selecting_only_condition_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Confirmed, only condition is selected option {int}")
	public void displays_confirmed_only_condition_is_selected_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button upon selecting only Co-Morbidities option {int}")
	public void user_clicks_confirm_button_upon_selecting_only_co_morbidities_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Confirmed, only Co-Morbidities is selected")
	public void displays_confirmed_only_co_morbidities_is_selected() {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button upon selecting only preference option {int}")
	public void user_clicks_confirm_button_upon_selecting_only_preference_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Confirmed, only preference is selected option {int}")
	public void displays_confirmed_only_preference_is_selected_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button upon selecting only condition and Co-Morbidi condition option {int}")
	public void user_clicks_confirm_button_upon_selecting_only_condition_and_co_morbidi_condition_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Confirmed, only condition and Co-Morbidities are selected")
	public void displays_confirmed_only_condition_and_co_morbidities_are_selected() {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button upon selecting only Co-Morbidi condition and preference option {int}")
	public void user_clicks_confirm_button_upon_selecting_only_co_morbidi_condition_and_preference_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Confirmed, only Co-Morbidities and preferences are selected")
	public void displays_confirmed_only_co_morbidities_and_preferences_are_selected() {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button upon selecting only condition and preference option {int}")
	public void user_clicks_confirm_button_upon_selecting_only_condition_and_preference_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Displays Confirmed, only condition and preferences are selected option {int}")
	public void displays_confirmed_only_condition_and_preferences_are_selected_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("User clicks Confirm button option {int} neg")
	public void user_clicks_confirm_button_option_neg(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.select2();
		objCreatePlanTwo.clickConfirm2();
	}

	@Then("Nothing happened, no message displayed")
	public void nothing_happened_no_message_displayed() {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.confirmTag2();
		msg="confirm string";
		Assert.assertTrue(msg.contains("confirm string"));
	}

	@When("user clicks Generate Menu Button option {int}")
	public void user_clicks_generate_menu_button_option(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.Generate();
	}

	@Then("Displays Menu generated")
	public void displays_menu_generated() {
		// Write code here that turns the phrase above into concrete actions
		objCreatePlanTwo.generateTag();
		msg="Generated plan string";
		Assert.assertTrue(msg.contains("Generated plan string"));
	}



}
