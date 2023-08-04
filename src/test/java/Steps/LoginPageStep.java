package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {
	 
	LoginPage loginPage;
	
	@Given("User is on Guru99 Application")
	public void user_is_on_guru99_application() {
		  initialization();
	}

	@When("user enter firstname, lastname, phone and email")
	public void user_enter_firstname_lastname_phone_and_email() {
		loginPage = new LoginPage();
		loginPage.contactPageFunctionality("Gauri", "Pawar", "90909090", "gauri@gmail.com");
	}

	@Then("user enter address, city, state, postalcode and country")
	public void user_enter_address_city_state_postalcode_and_country() {
		loginPage = new LoginPage();
	    loginPage.mailingInfo("Karad", "Pune", "MH", "455544", "INDIA");
	}

	@When("user enter username, password and cofirm password")
	public void user_enter_username_password_and_cofirm_password() {
		loginPage = new LoginPage();
	    loginPage.userInfo("GaUri", "Gauri123", "Gauri123");
	}

	@Then("click on submit btn")
	public void click_on_submit_btn() {
	    loginPage.clickonSubmit();
	}
	
	@AfterStep
	public static void tearDowm(Scenario scenario) {
		if (scenario.isFailed()) {

			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
		}
		else {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
		}
	}

}
