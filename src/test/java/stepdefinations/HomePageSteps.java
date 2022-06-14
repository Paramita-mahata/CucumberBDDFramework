package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	private WebDriver driver;
	private String title;
	private HomePage hp = new HomePage (DriverFactory.getDriver());
	
	
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		//it calls Application hooks to invoke browser

	}

	@When("User open the Dietician Website")
	public void user_open_the_dietician_website() {
	    DriverFactory.getDriver().get("");
	}

	@Then("User should see the title of the home page as {string}")
	public void user_should_see_the_title_of_the_home_page_as(String expectedTitleName) {
	title =  hp.validateHomePageTitle(); 
	Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("User should see the Logo image with Company Name")
	public void user_should_see_the_logo_image_with_company_name() {
	boolean flag = hp.validateLogo();
	Assert.assertTrue(flag);
	   
	}

	@Then("User should see a tab with text {string}")
	public void user_should_see_a_tab_with_text(String expectedText) {
		Assert.assertTrue(title.contains(expectedText));  
	}

	@Then("User should see a search option symbol on the bottom menu bar")
	public void user_should_see_a_search_option_symbol_on_the_bottom_menu_bar() {
	 boolean flag =   hp.searchOptionTest();
	 Assert.assertTrue(flag);
	}

	@Then("User should see a Signin option next to the search button")
	public void user_should_see_a_signin_option_next_to_the_search_button() {
		boolean flag =   hp.signinOptionTest();
		 Assert.assertTrue(flag); 
	}

}
