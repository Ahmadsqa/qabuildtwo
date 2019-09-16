Feature: Search
As a customer
i want the ability to search
for a car
so that i can review the  car to buy
#  Scenario 01: None-parameterize scenario
#Scenario: Customer can search car giving minimum and maximum price
#	Given i navigate to Motors homepage
#	When i enter valid post code
#	And i select MinPrice
#	And i select MaxiPrice	
#	And i Click Search button
#	Then the results of the above search is displayed
#	And click pluse sign link infront of SMART PICKS FOR YOU heading

#  Scenario 02: Direct injunction data base scenario
#Scenario: Customer can search car giving minimum and maximum price
#	Given i navigate to Motors homepage
#	When i enter post code as "B8 1LP"
#	And i select my MinPrice as "£500" 
#	And i select my MaxiPrice as "£15,000"	
#	And i Click Search button
#	Then the search results for all the cars with that range in the area  is displayed
#	And click pluse sign link infront of SMART PICKS FOR YOU heading	
	
#  Scenario 03:	
Scenario Outline: Customer can search car giving minimum and maximum price and review fulldetails of specific car
	Given i navigate to Motors homepage
	When i enter post code as "<PostCode>"
	And i select my MinPrice as "<MiniPrice>"
	And i select my MaxiPrice as "<MaximumPrice>"	
	And i click on search button
	Then the search results for all the cars within that "<Region>"  in the area  is displayed
#	And click pluse sign link infront of SMART PICKS FOR YOU heading
#	And i click on car name link 
	And i click on FullDetails button of a car of my choice

Examples:
	|PostCode|MiniPrice|MaximumPrice|Region|
	|L35 9JG|£1,000|£6,000|Rainhill, Prescot|
#	|B7 5RL|£2,000|£20,000|Nechells|
#	|B35 7LP|£3,000|£17,500|Castle Vale|
#	|B90 1BP|£5,000|£1,000,000|Solihull|
	
#	Scenario 04:
Scenario Outline: Customer can search a car based on monthly cost
	Given i navigate to Motors homepage
	And i click on Monthly Cost tab
	When i enter post code as "<PostCode>"
	And i select the car maker as "<Make>"
	And i select the car model as "<Model>"
	And i select my Minimum Cost as "<MiniCost>"
	And i select Deposit as "<Deposit>"
	And i select my Maximum Cost as "<MaximumCost>"
	And i select Term of loan as "<Months>"
	And i click on search button
	Then the results for search above are displayed
	Then i click on specific car of my choice as <CarModelLink>

Examples:
	|PostCode|Make        |Model  |MiniCost|Deposit              |MaximumCost|Months      	|CarModelLink|
	|B93 0NA |Aston Martin|Vantage|£900   |Deposit (£10000)		|£1000		|Term (48 Months)|ASTON MARTIN, VANTAG 2010 (10) V8 Roadster 2-door|
		
	
#  Scenario 05:
#Scenario: Customer can search specific make and model of a car
#	Given i navigate to Motors homepage
#	When i enter valid post code
#	And i select a car maker
#	And i select a car modle
#	And i click Search button
#	Then the result of the search above is displayed

#  Scenario 06:
#Scenario: Customer can search specific make and model with minmum price
#	Given i navigate to Motors homepage
#	When i enter valid post code
#	And i select MinPrice
#	And i select a car maker
#	And i select a car modle
#	And i click Search button
#	Then the result of the search above is displayed

#  Scenario 07:
#Scenario: Random max price selection cstomer can search significant make and model of car
#	Given i navigate to Motors homepage
#	When i enter valid post code
#	And random max price selection 
#	And i select a car maker
#	And i click Search button
#	Then the result of the search above is displayed

 #Scenario 08:
Scenario Outline: Customer can add more search options while search a car based on monthly cost
	Given i navigate to Motors homepage
	And i click on Monthly Cost tab
	When i enter post code as "<PostCode>"
	And i select the car maker as "<Make>"
	And i select the car model as "<Model>"
	And i select my Minimum Cost as "<MiniCost>"
	And i select Deposit as "<Deposit>"
	And i select my Maximum Cost as "<MaximumCost>"
	And i select Term of loan as "<Months>"
	And i click on 	HIDEMOREOPTIONS button
	And i select distance as "<Distance>"
	And i click convertible bodystyle 
	And i click on coupe bodystle 
	And i click on search button
	
	Then the results for search above are displayed
	Then i click on specific car of my choice as <CarModelLink>

Examples:
	|PostCode|Make        |Model  |MiniCost|Deposit              |MaximumCost|Months      	|CarModelLink|
	|B93 0NA |Aston Martin|Vantage|£900   |Deposit (£10000)		|£1000		|Term (48 Months)|ASTON MARTIN, VANTAG 2010 (10) V8 Roadster 2-door|
		
	
