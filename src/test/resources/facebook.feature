Feature: To validate the login functionality
	
	Scenario: To validate the valid username and invalid password
	
		When To launch the url of the application
		And To pass the valid username in email field
		
		|chowdry|teja|vamsi|
		
		And To pass the invalid password in password field
		
		|java|selenium|23456|
		|oracle|reactjs|76566|
		|testing|automation|manual|
		
		And To click the login button
		
	
	Scenario Outline: To validate the positive and negative test cases in login functionality
		
		When Launch the url of the given application
		And Pass the positive and negative "<username>" from email field
		And Pass the positive and negative "<password>" from password field
		And Click the login button
	
		
		Examples: 
			|username|password|
			|karthi|karthi@123|
			|sathish|sathish@123|
			|babu|babu@123|
			|ajay|ajay@123|
			|dhinesh|dhinesh@123|