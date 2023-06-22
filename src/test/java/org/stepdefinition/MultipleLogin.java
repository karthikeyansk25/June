package org.stepdefinition;

import org.sample.BaseClass;
import org.sample.LoginPojoFacebook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleLogin extends BaseClass {
	LoginPojoFacebook l;
	@Given("Launch the browser and max window")
	public void launch_the_browser_and_max_window() {
	 launchchrome();
	 winMax();
	}

	@When("Launch the url of the given application")
	public void launch_the_url_of_the_given_application() {
	 Url("https://www.facebook.com/");
	}
	@When("Pass the positive and negative {string} from email field")
	public void pass_the_positive_and_negative_from_email_field(String username) {
		l = new LoginPojoFacebook();
		sendkeys(l.getUser(), username);
	}

	@When("Pass the positive and negative {string} from password field")
	public void pass_the_positive_and_negative_from_password_field(String password) {
		l = new LoginPojoFacebook();
		sendkeys(l.getPass(), password);
	}

	@When("Click the login button")
	public void click_the_login_button() {
		 l = new LoginPojoFacebook();
			click(l.getBtnLogin());
	}

	@Then("Close the browser")
	public void close_the_browser() {
		close();
	}

}
