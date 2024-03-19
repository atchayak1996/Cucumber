package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	 LoginPojo l;
	@Given("user have to launch facebook url through chromebrowser")
	public void user_have_to_launch_facebook_url_through_chromebrowser() {
	  browserLaunch();
	  launchUrl("https://www.facebook.com/");
	}
	@When("user have to click valid username and invalid password")
	public void user_have_to_click_valid_username_and_invalid_password() {
	  l=new LoginPojo();
	  l.getEmail().sendKeys("sst");
	  l.getPassword().sendKeys("3534");
	}
	@When("user have to click login button")
	public void user_have_to_click_login_button() {
	  l=new LoginPojo();
	  l.getLogin().click();
	}
	@When("user have to click invalid username and invalid password")
	public void user_have_to_click_invalid_username_and_invalid_password() {
		 l=new LoginPojo();
		  l.getEmail().sendKeys("atchaya");
		  l.getPassword().sendKeys("3534");
	}

	@Then("user have to go for invalid credential page")
	public void user_have_to_go_for_invalid_credential_page() {
	 System.out.println("hai");
	}

}
