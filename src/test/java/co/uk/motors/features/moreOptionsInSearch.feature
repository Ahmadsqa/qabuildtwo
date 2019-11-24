Feature: More options for Search

As a customer
i want the ability to search
for a car 
and use more options 
so that i can review the  car to buy

Scenario Outline: Customer can add more search filters while searching a car based on monthly cost option
	Given i navigate to Motors homepage
	And i click on Monthly Cost tab
	When i enter post code as "<PostCode>"
	And i select the car maker as "<Make>"
	And i select the car model as "<Model>"
	And i select my Minimum Cost as "<MiniCost>"
	And i select Deposit as "<Deposit>"
	And i select my Maximum Cost as "<MaximumCost>"
	And i select Term of loan as "<Months>"
	And i click on 	MOREOPTIONS button
	And i select distance as "<Distance>"
	And i click convertible bodystyle 
	And i click on coupe bodystle 
	And i click on search button
	Then the results for search above are displayed
	Then i click on specific car of my choice as <CarModelLink>

Examples:
	|PostCode|Make        |Model  |MiniCost|Deposit              |MaximumCost|Months      	|Distance |CarModelLink										|
	|B93 0NA |Aston Martin|Vantage|£900   |Deposit (£10000)		|£1000		|Term (48 Months)|National|ASTON MARTIN, VANTAG 2010 (10) V8 Roadster 2-door|
