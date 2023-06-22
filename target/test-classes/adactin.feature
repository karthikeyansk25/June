Feature: To validate the sign in functionality

	Scenario: To validate the invalid username and valid password
	
		When To launch the url of the adactin application
		And To pass the invalid emailid or phoneno in username field
		And To pass the valid password in password field
		And To click the login btn
	