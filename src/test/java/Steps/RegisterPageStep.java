package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStep extends BaseClass{
	   
	  RegisterPage regPage;
	
	@Then("user click on sign in link")
	public void user_click_on_sign_in_link() {
		regPage = new RegisterPage();
		regPage.clickonlick();
	}

	@When("user enter username, password and click on sublit button")
	public void user_enter_username_password_and_click_on_sublit_button() {
		regPage = new RegisterPage();
	   regPage.userinfo("GaUri", "Gauri123");
	}

	@Then("user capture the pagetitle")
	public void user_capture_the_pagetitle() {
		regPage = new RegisterPage();
	    String actTitle = regPage.CurrentTitle();
	    Assert.assertEquals(actTitle.contains("Tours"),true);
	}

}
