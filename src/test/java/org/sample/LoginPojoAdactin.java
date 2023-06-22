package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoAdactin extends BaseClass{
	 public LoginPojoAdactin(){
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="username")
		WebElement User;
	@FindBy (id="password")
		WebElement password;
	@FindBy (id="login")
		WebElement login;
	@FindBy (id="location")
		WebElement location;
	@FindBy (id="hotels")
		WebElement hotels;
	@FindBy (id="room_type")
		WebElement roomtype;
	@FindBy (id="room_nos")
		WebElement roomNo;
	@FindBy (id="datepick_in")
		WebElement datepickIn;
	@FindBy (id="datepick_out")
		WebElement datepickOut;
	@FindBy (id="adult_room")
		WebElement adultroom;
	@FindBy (id="child_room")
		WebElement childroom;
	@FindBy (id="Submit")
		WebElement search;
	@FindBy (id="radiobutton_0")
		WebElement radiobutton;
	@FindBy (id="continue")
		WebElement conti;
	@FindBy (id="first_name")
		WebElement firstName;
	@FindBy (id="last_name")
		WebElement lastName;
	@FindBy (id="address")
		WebElement address;
	@FindBy (id="cc_num")
		WebElement creditCardNUmber;
	@FindBy (id="cc_type")
		WebElement creditCardType;
	@FindBy (id="cc_exp_month")
		WebElement expMonth;
	@FindBy (id="cc_exp_year")
		WebElement expYear;
	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy (id="cc_cvv")
		WebElement cvvNUmber;
	@FindBy (id="book_now")
		WebElement booknow;

	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNUmber() {
		return creditCardNUmber;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvvNUmber() {
		return cvvNUmber;
	}
	
	public WebElement getConti() {
		return conti;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getDatepickIn() {
		return datepickIn;
	}
	public WebElement getDatepickOut() {
		return datepickOut;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getUser() {
		return User;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

}
