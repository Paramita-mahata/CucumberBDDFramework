package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.ContactUsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class ContactUsPageSteps {
	private WebDriver driver;
	private String title1;

	private ContactUsPage cp = new ContactUsPage(DriverFactory.getDriver());

	@Given("User is on HomePage")
	public void user_is_on_home_page() {
		title1 = cp.ValidateHomePagetitle();
		Assert.assertEquals(title1, "Home");
	}

	@When("User clicks on contact us page")
	public void user_clicks_on_contact_us_page() {
		cp.Contactus();
	}

	@Then("User should navigated to contact us page")
	public void user_should_navigated_to_contact_us_page() {
		System.out.println("Current Page title is :" + "Contactus");
	}

	@Given("User is on Contact Us page")
	public void user_is_on_contact_us_page() {
		title1 = cp.Validatecontactustitle();
		driver.getTitle();
	}

	@When("User clicks submit button with all fields empty on contact us page")
	public void user_clicks_submit_button_with_all_fields_empty_on_contact_us_page() {
		cp.emptyfields();
	}

	@Then("Verify {string} message should display")
	public void verify_message_should_display1(String string) {
		String text = cp.msg1();
		Assert.assertTrue(text.contains(text));

	}

	@When("User try to enter numeric values in firstname field")
	public void user_try_to_enter_numeric_values_in_firstname_field() {
		cp.numfirstname();
	}

	@Then("Verify {string} message display")
	public void verify_message_display(String string) {
		String text = cp.msg2();
		Assert.assertTrue(text.contains(text));
	}

	@When("User try to enter numeric values in lastname field")
	public void user_try_to_enter_numeric_values_in_lastname_field() {
		cp.numlastname();
	}

	@Then("Verify {string} msg should display")
	public void verify_msg_should_display(String string) {
		String text = cp.msg3();
		Assert.assertTrue(text.contains(text));
	}

	@When("User enters invalid email and other fields with valid information and clicks submit")
	public void user_enters_invalid_email_and_other_fields_with_valid_information_and_clicks_submit() {
		cp.invademail();
	}

	@Then("Verify {string} message should displayed")
	public void verify_message_should_displayed1(String string) {
		String text = cp.msg4();
		Assert.assertTrue(text.contains(text));
	}

	@When("User enters Subject field with numeric values and other field valid values and click")
	public void user_enters_subject_field_with_numeric_values_and_other_field_valid_values_and_click() {
		cp.numsubject();
	}

	@Then("Verify {string} should displayed")
	public void verify_should_displayed(String string) {
		String text = cp.msg5();
		Assert.assertTrue(text.contains(text));
	}

	@When("User enters message with numeric values and other field valid values and click")
	public void user_enters_message_with_numeric_values_and_other_field_valid_values_and_click() {
		cp.nummessage();
	}

	@Then("Verify Message {string} should display")
	public void verify_message_should_display(String string) {
		String text = cp.msg6();
		Assert.assertTrue(text.contains(string));
	}

	@When("User enters all valid values in all fields and click submit button")
	public void user_enters_all_valid_values_in_all_fields_and_click_submit_button() {
		cp.Validatecontactustitle();
	}

	@Then("Verify {string} Message should displayed")
	public void verify_message_should_displayed(String string) {
		String text = cp.msg7();
		Assert.assertTrue(text.contains(text));
	}

}
