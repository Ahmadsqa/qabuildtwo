Feature: Sign up 
Customer can register 

Scenario: Customer can sign-up using email
	Given i navigate to motors homepage
  	And i click on Sign-in link
  	And i click on New User Sign-up today tab
  	When i enter email as "chazkalil@gmail.com"
  	And click Sign-up button
  	And i enter first name as "chaz"
  	And i enter last name as "kalil"
  	And click Next button
  	And i click MotorsCoUK updates checkbox
  	And i click on Latest motoring news checkbox
  	And i click on Exclusive offers and competitions checkbox
  	And i enter password as "2019MotorscoukPass"
  	And i enter my post coe as "B8 1LP"
	And i click on CREATE MY ACCOUNT button 	 