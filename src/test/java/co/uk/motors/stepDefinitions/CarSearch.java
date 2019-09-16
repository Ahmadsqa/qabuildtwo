package co.uk.motors.stepDefinitions;

import co.uk.motors.helper.BaseClass;
import co.uk.motors.pages.CarSearchResultsPage;
import co.uk.motors.pages.MotorsHomePage;
import co.uk.motors.pages.VehicleDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarSearch extends BaseClass {
	MotorsHomePage homepage = new MotorsHomePage();
	CarSearchResultsPage carsearchresults = new CarSearchResultsPage();
	VehicleDetailsPage vehicledetails = new VehicleDetailsPage();
	
	//Scenario no. 3 line 28 i navigate to Motors homepage
	@Given("i navigate to Motors homepage")
	public void i_navigate_to_Motors_homepage() throws Exception {
	 homepage.navigateToHomePage();
	    
	}
	//Scenario no. 3 line 29 i enter post code as
	@When("i enter post code as {string}")
	public void i_enter_post_code_as(String pCode) throws Exception{
	    homepage.postCode(pCode);
	   
	}
	//Scenario no. 3 line 30 i select my MinPrice as 
	@When("i select my MinPrice as {string}")
	public void i_select_my_MinPrice_as(String mnPrice) throws Exception {
	    homepage.selectMinPrice(mnPrice);
	   
	}
	//Scenario no. 3 line 31 i select my MaxiPrice
	@When("i select my MaxiPrice as {string}")
	public void i_select_my_MaxiPrice_as(String mxPrice) throws Exception {
	    homepage.selectMaxiPrice(mxPrice);
	    
	}
	//Scenario no. 3 line 32 i click on search button
		
	@When("i click on search button")
	public void i_click_on_search_button() throws Exception {
		carsearchresults = homepage.clickOnSearchButton();
	}

	//Scenario no. 3 line 33 the search results for all the cars within that "<Region>"  in the area  is displayed
	@Then("the search results for all the cars within that {string}  in the area  is displayed")
	public void the_search_results_for_all_the_cars_within_that_in_the_area_is_displayed(String string) {
	    
	}
//Scenario no. 3 line 36 i click on FullDetails button of a car of my choice
	@Then("i click on FullDetails button of a car of my choice")
	public void i_click_on_FullDetails_button_of_a_car_of_my_choice() throws Exception {
		vehicledetails = carsearchresults.clickonfullDetailsButton();
	}
	
////////Scenario no. 4 Steps started from here//////
	
	//Scenario no. 4 line 48 i click on Monthly Cost tab
	@Given("i click on Monthly Cost tab")
	public void i_click_on_Monthly_Cost_tab() throws Exception {
	  
		homepage.clickOnMonthlyTab();
	}
	//Scenario no. 4 line 50 i select the car maker as
	@When("i select the car maker as {string}")
	public void i_select_the_car_maker_as(String CarMker) throws Exception {
	  
		homepage.seletCarMaker(CarMker);
	}
		
	//Scenario no. 4 line 51 i select the car model as
	@When("i select the car model as {string}")
	public void i_select_the_car_model_as(String CarModel) throws Exception {
	   
		homepage.selectCarModel(CarModel);
	}
	
	//Scenario no. 4 line 52 i select my Minimum Cost
	@When("i select my Minimum Cost as {string}")
	public void i_select_my_Minimum_Cost_as(String MinCost) throws Exception {
	    homepage.selectMinimumCost(MinCost);
	}
	
		//Scenario no. 4 line 53 i select Deposit as
	@When("i select Deposit as {string}")
	public void i_select_Deposit_as(String Deposit) throws Exception{
	    homepage.selectDeposit(Deposit);
	}
	
	//Scenario no. 4 line 54 i select my Maximum Cost as
	@When("i select my Maximum Cost as {string}")
	public void i_select_my_Maximum_Cost_as(String MaxCost) throws Exception {
	    homepage.selectMaxiCost(MaxCost);
	}
	//Scenario no. 4 line 55 i select Term of loan as
	@When("i select Term of loan as {string}")
	public void i_select_Term_of_loan_as(String LonTerm) throws Exception {
	   homepage.selectLoanTearm(LonTerm);
	}
	//Scenario no. 4 line 57 the results for search above are displaye
	@Then("the results for search above are displayed")
	public void the_results_for_search_above_are_displayed() {
	   
	}
		
/////==========================
	//Scenario no. 4 line 58 i click on specific car of my choice
	@Then("i click on specific car of my choice as ASTON MARTIN, VANTAG {int} \\({int}) V{int} Roadster {int}-door")
	public void i_click_on_specific_car_of_my_choice_as_ASTON_MARTIN_VANTAG_V_Roadster_door(Integer int1, Integer int2, Integer int3, Integer int4) throws Exception {
	    
		 vehicledetails = carsearchresults.clickOnCarOfMYChoice();
	}

}
