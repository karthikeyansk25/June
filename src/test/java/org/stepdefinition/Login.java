package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.devtools.v111.database.Database;
import org.sample.BaseClass;
import org.sample.LoginPojoFacebook;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	LoginPojoFacebook l;
	@Given("To launch the browser and max window")
	public void to_launch_the_browser_and_max_window(){
		launchchrome();
		winMax();
	}

	@When("To launch the url of the application")
	public void to_launch_the_url_of_the_application() {
		Url("https://www.facebook.com/");
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field(DataTable d) {
		l = new LoginPojoFacebook();
		List<String> x = d.asList();
		sendkeys(l.getUser(), x.get(1));
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field(DataTable e) {
		l = new LoginPojoFacebook();
		List<List<String>> y = e.asLists();
		sendkeys(l.getPass(), y.get(1).get(0));
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		 l = new LoginPojoFacebook();
		click(l.getBtnLogin());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		close();
		
	}


}
