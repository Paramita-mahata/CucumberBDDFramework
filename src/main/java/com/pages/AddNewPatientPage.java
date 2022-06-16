package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewPatientPage {
	private WebDriver driver;

	// constructor
	public AddNewPatientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[type ='Submit'")
	WebElement submit;

	@FindBy(id = "fullname")
	WebElement txtname;

	@FindBy(name = "address1")
	WebElement txtadd1;
	@FindBy(id = "address2")
	WebElement txtadd2;
	@FindBy(xpath = "//div/a[3]")
	WebElement selectcountry;
	@FindBy(className = "city")
	WebElement txtcity;
	@FindBy(id = "state")
	WebElement state;
	@FindBy(id = "postalcode")
	WebElement code;
	@FindBy(name = "email")
	WebElement txtemail;
	@FindBy(id = "phonenumber")
	WebElement number;
	@FindBy(xpath = "//div/div[@text='text']")
	WebElement msg;
	@FindBy(xpath = "//div[@text()=success msg']")
	WebElement msg1;
	@FindBy(xpath = "input[@type='addbutton']")
	WebElement addnewpatient;

	public String Validateaddnewpatienttitle() {
		return driver.getTitle();
	}

	public void emptyfields() {
		txtname.sendKeys("");
		txtadd1.sendKeys("");
		txtadd2.sendKeys("");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(0);
		txtcity.sendKeys("");
		state.sendKeys("");
		code.sendKeys("");
		txtemail.sendKeys("");
		number.sendKeys("");

	}

	public void numfullname() {
		txtname.sendKeys("12344");
	}

	public void nospacename() {
		txtname.sendKeys("nandankishore");

	}

	public void addressEmpty() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("");
		txtadd2.sendKeys("");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		txtcity.sendKeys("New York");
		state.sendKeys("NY");
		code.sendKeys("12345");
		txtemail.sendKeys("anita@gmail.com");
		number.sendKeys("2435622727");
	}

	public void emptyCountry() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(0);
		txtcity.sendKeys("New York");
		state.sendKeys("NY");
		code.sendKeys("12345");
		txtemail.sendKeys("anita@gmail.com");
		number.sendKeys("2435622727");

	}

	public void numericcity() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		txtcity.sendKeys("1234");
		state.sendKeys("NY");
		txtemail.sendKeys("anita@gmail.com");
		number.sendKeys("2435622727");

	}

	public void emptycity() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("");
		state.sendKeys("NY");
		code.sendKeys("12345");
		txtemail.sendKeys("anita@gmail.com");
		number.sendKeys("2435622727");
	}

	public void EmptyState() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("Erie");
		state.sendKeys("");
		code.sendKeys("12345");
		txtemail.sendKeys("anita@gmail.com");
		number.sendKeys("2435622727");
	}

	public void numState() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("Erie");
		state.sendKeys("1234");
		
	}

	public void charPcode() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("Erie");
		state.sendKeys("NY");
		code.sendKeys("wertf");
		
	}

	public void emptyPcode() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("Erie");
		state.sendKeys("NY");
		code.sendKeys("");
		txtemail.sendKeys("anita@gmail.com");
		number.sendKeys("2435622727");
	}

	public void EmptyEmail() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("Erie");
		state.sendKeys("NY");
		code.sendKeys("12345");
		txtemail.sendKeys("");
		number.sendKeys("2435622727");
	}

	public void wrongemail() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("Erie");
		state.sendKeys("NY");
		code.sendKeys("12345");
		txtemail.sendKeys("sfrs@#$@gmail.com");
		
	}

	public void EmptyPnumber() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("Erie");
		state.sendKeys("NY");
		code.sendKeys("12345");
		txtemail.sendKeys("anita@gmail.com");
		number.sendKeys("");
	}

	public void charPnumber() {
		txtname.sendKeys("lucky pari");
		txtadd1.sendKeys("123 main street");
		txtadd2.sendKeys("apt 22");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("Erie");
		state.sendKeys("NY");
		code.sendKeys("12345");
		txtemail.sendKeys("anita@gmail.com");
		number.sendKeys("hnjbgvfcdx");

	}

	public void AddnewPatient() {
		txtname.sendKeys("Full Name");
		txtadd1.sendKeys("Address line 1");
		txtadd2.sendKeys("Country");
		WebElement staticdropdown = selectcountry;
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		txtcity.sendKeys("City");
		state.sendKeys("State,province or region");
		code.sendKeys("Postal code");
		txtemail.sendKeys("Email");
		number.sendKeys("Phone Number");
	}

	public void AddNewpatient() {
		addnewpatient.click();
	}
public String errormessage() {
	return msg.getText();
}
public String message() {
	return msg1.getTagName();
	
}
}



