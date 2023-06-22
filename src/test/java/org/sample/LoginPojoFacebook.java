package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoFacebook extends BaseClass {
	
	//WebDriver driver;
	public LoginPojoFacebook() {
		PageFactory.initElements(driver, this);
		} 
	@FindBy (id="email")
	private WebElement user;
	@FindBy(id="pass")
	private WebElement pass;
	@FindAll({
		@FindBy (name="login"),
		@FindBy(id="u_0_5_7j")
	})
		private WebElement btnLogin;
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}

}
