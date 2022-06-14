package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinksOfHomePageSteps {
	private WebDriver driver;
	private String title;
	private HomePage hp = new HomePage (DriverFactory.getDriver());
	
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
	 title =  hp.validateHomePageTitle(); 
	 Assert.assertEquals(title,"Home");
	}

	@When("User clicks on product  link")
	public void user_clicks_on_product_link() {
	    hp.clickproduct();
	}

	@Then("User is re-directed to Product page")
	public void user_is_re_directed_to_product_page() {
		System.out.println("Current Page title is :"+"Product");	
	    
	}

	@When("User clicks on client link")
	public void user_clicks_on_client_link() {
	   hp.clickClient();
	}

	@Then("User is re-directed to client testimonial page")
	public void user_is_re_directed_to_client_testimonial_page() {
		System.out.println("Current Page title is :"+"Client Testimonial");   
	}

	@When("User clicks on Team link")
	public void user_clicks_on_team_link() {
	   hp.clickTeam();
	}

	@Then("User is directed  to Doctor team page")
	public void user_is_directed_to_doctor_team_page() {
		System.out.println("Current Page title is :"+"Team");   
	}

	@When("User clicks on Register link")
	public void user_clicks_on_register_link() {
	  hp.clickRegister();  
	}

	@Then("User is directed  to Register page")
	public void user_is_directed_to_register_page() {
		System.out.println("Current Page title is :"+"Register");
	    
	}

	@Then("User is directed  to About page")
	public void user_is_directed_to_about_page() {
		System.out.println("Current Page title is :"+"About");
	}

	@When("User clicks on Feature  link")
	public void user_clicks_on_feature_link() {
	    hp.clickFeatured();
	}

	@Then("User is directed  to Featured content page")
	public void user_is_directed_to_featured_content_page() {
		System.out.println("Current Page title is :"+"Featured Content");  
	}

	@When("User clicks on Blogs link")
	public void user_clicks_on_blogs_link() {
	    hp.clickBlog();
	}

	@Then("User is directed  to Blogs page")
	public void user_is_directed_to_blogs_page() {
		System.out.println("Current Page title is :"+"Blogs");  
	}

	@When("User clicks on Contact us link")
	public void user_clicks_on_contact_us_link() {
	    hp.clickContactUs();
	}

	@Then("User is directed  to Contact us page")
	public void user_is_directed_to_contact_us_page() {
	  System.out.println("Current Page title is :"+"Contact Us");
	}

}
