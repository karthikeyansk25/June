package org.stepdefinition;

import org.sample.BaseClass;
import org.sample.LoginPojoAdactin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinLogin extends BaseClass{
	LoginPojoAdactin a;
	@Given("To launch the adactin browser and max the window")
	public void to_launch_the_adactin_browser_and_max_the_window() {
	   launchchrome();
	   winMax();
	}

	@When("To launch the url of the adactin application")
	public void to_launch_the_url_of_the_adactin_application() {
	   Url("https://adactinhotelapp.com/");
	}

	@When("To pass the invalid emailid or phoneno in username field")
	public void to_pass_the_invalid_emailid_or_phoneno_in_username_field() {
	   a = new LoginPojoAdactin();
	   sendkeys(a.getUser(), "lakshmi4321");
	}

	@When("To pass the valid password in password field")
	public void to_pass_the_valid_password_in_password_field() {
		a = new LoginPojoAdactin();
		sendkeys(a.getPassword(), "Lakshmi@4321");
	}

	@When("To click the login btn")
	public void to_click_the_login_btn() {
		a = new LoginPojoAdactin();
		click(a.getLogin());
	}

	@Then("To close the adactin browser")
	public void to_close_the_adactin_browser() {
		close();
	}


}
