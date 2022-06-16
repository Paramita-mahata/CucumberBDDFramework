package Parallel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.DieticianHomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class DieticianHomePageSteps {
	private WebDriver driver;
	private String title;

	private DieticianHomePage dhp = new DieticianHomePage(DriverFactory.getDriver());

	@Given("dietician is on dietician website")
	public void dietician_is_on_dietician_website() {
		DriverFactory.getDriver().get("");
	}

	@When("Dietician clicks on dietician signin button")
	public void dietician_clicks_on_dietician_signin_button() {
		dhp.ClickSigninbtn();
	}

	
	@Then("dietician navigated to dietician sign in page")
	public void dietician_navigated_to_dietician_sign_in_page() {
		System.out.println("Current page title is :" + "Dietician signin Page");
		Assert.assertEquals(title, "Dietician signin Page");

	}

	@Given("Dietician on dietician signin page")
	public void dietician_on_dietician_signin_page() {
		System.out.println("Current page title is :" + "Dietician signin Page");
	}

	@When("Dietician clicks on sign in button with valid {string} and {string}")
	public void dietician_clicks_on_sign_in_button_with_valid_and(String string, String string2) {
		dhp.signin();

	}

	@Then("Dietician should navigated to Dietician Homepage")
	public void dietician_should_navigated_to_dietician_homepage() {
		System.out.println("Current page title is :" + "Dietician HomePage");
		Assert.assertEquals(title, "Dietician Home Page");
	}

	@Then("verify message {string} is displayed")
	public void verify_message_is_displayed(String string) {
		String txt = dhp.Message();
		Assert.assertTrue(txt.contains(string));

	}

	@Given("Dietician is on dietician Home page")
	public void dietician_is_on_dietician_home_page() {
		dhp = new DieticianHomePage(DriverFactory.getDriver());
		title = dhp.validateDieticianHomepageTitle();
		Assert.assertEquals(title, "DieticianHomePage");
		

	}

	@When("Dietician clicks on new patient tab")
	public void dietician_clicks_on_new_patient_tab() {
		dhp.ClickAddnewPatient();
	}

	@Then("User should be navigated to new patient form page")
	public void user_should_be_navigated_to_new_patient_form_page() {
		System.out.println("Current page title is :" + "Add NewPatient Page");
	}

	@When("Dietician clicks on My Patients tab")
	public void dietician_clicks_on_my_patients_tab() {
		dhp.clickMyPatients();
	}

	@Then("User should be navigated to My Patients page")
	public void user_should_be_navigated_to_my_patients_page() {
		System.out.println("Current page title is :" + "Dietician MyPatient Page");
	}

	@When("Dietician clicks on Diet Plans tab")
	public void dietician_clicks_on_diet_plans_tab() {
		dhp.clickDietPlans();
	}

	@Then("User should be navigated to Diet Plans page")
	public void user_should_be_navigated_to_diet_plans_page() {
		System.out.println("Current page title is :" + "Dietician HomePage");
	}

	@When("Dietician clicks on Sign Out button")
	public void dietician_clicks_on_sign_out_button() {
		dhp.clickSignOut();
	}

}


