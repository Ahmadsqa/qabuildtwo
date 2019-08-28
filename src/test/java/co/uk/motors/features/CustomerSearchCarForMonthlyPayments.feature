Feature: Search

Scenario Outline: Customer can search a car based on monthly cost
	Given i navigate to Motors homepage
	And i click on Monthly Cost tab
	When i enter post code as "<PostCode>"
	And i select the car maker as "<Make>"
	And i select the car model as "<Model>"
	And i select Minimum cost as "<MinCost>"
	And i select Deposit as "<Deposit>"
#	And i sselect Maximum cost as "<MaxiCost>"
	And i select Term of loan as "<Months>"
	And i click on search button
	Then the resuls for search above are displayed
	Then i click on specific car of my choice as <CarModelLink>
	
Examples:
	|PostCode|Make|Model|MinCost|Deposit|Months|CarModelLink|
	|B93 0NA|Aston Martin|Vantage|£1000|Deposit (£9000)|Term (48 Months)|ASTON MARTIN VANTAGE 2013 (63) 4.7 V8 ROADSTER|
	