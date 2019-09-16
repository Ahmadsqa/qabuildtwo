package co.uk.motors.pages;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import co.uk.motors.helper.BaseClass;

public class MotorsHomePage extends BaseClass {
	WebElement postCode;
	WebElement minPrice;
	WebElement maxPrice;
	WebElement searchButton;
	WebElement monthlyTab;
	WebElement maker;	
	WebElement carModel;
	WebElement minimumCost;
	WebElement minDeposit;
	WebElement maximumCost;
	WebElement loanTerm;
	
	//To launch the Motors homepage
	public void navigateToHomePage() throws Exception {
		launchUrl("https://www.motors.co.uk/");} 
	
	//Now implementing Scenario no. 3
	//Here implementing postcode field
	public void postCode (String pCode) throws Exception {
		postCode = getElementByCssSelector("#searchPanel > section > div > section > div.sp__bar > div > div.postcode > input[type=text]");
		postCode.sendKeys(pCode);}
	
	//Now implementing Scenario no. 3
	//Here implementing Minimum price field
	public void selectMinPrice (String miniPrice) throws Exception {
	WebElement searchCountActualTitle = getElementByCssSelector("#searchPanel > section > div > section > div.sp__bar > button > span.sp__btn-count");
	String searchCountTitle = searchCountActualTitle.getText();
	System.out.println("here is the total car count"+searchCountTitle);
		minPrice = getElementByCssSelector("#MinPrice");
		selectByText (minPrice, miniPrice);
		
	}
	
	// Now Implementing Scenario no. 3
	// Here implment maximum price field
	public void selectMaxiPrice (String mxiPrice) throws Exception {
		maxPrice = getElementByCssSelector("#MaxPrice");
		
		selectByText (maxPrice, mxiPrice);
		//maxPrice.sendKeys(Keys.TAB);
	}
	
					// Now Implementing Scenario no. 3
	// Here implement Search Button
	public CarSearchResultsPage clickOnSearchButton() throws Exception {
		//Thread.sleep(5000);
		searchButton = getElementByCssSelector("#searchPanel > section > div > section > div.sp__bar > button");
		searchButton.click();
		return new CarSearchResultsPage();
		}
//====================================================================//
					//Implementation of Scenario no. 4//
	// Here implementing Monthlytab
	public void clickOnMonthlyTab () throws Exception {
		monthlyTab = getElementByCssSelector("#searchPanel > section > div > section > div.sp__mode > div > label:nth-child(2) > span");
		monthlyTab.click();
	}
	//Implementation of Scenario no. 4//
// Here implementing selection of car maker
	
	public void seletCarMaker(String CarMaker) throws Exception {
		maker = getElementByCssSelector("#Make");
		selectByText (maker, CarMaker);
		maker.sendKeys(CarMaker);
	}
	//Implementation of Scenario no. 4//
	// Here implementing selection of car model 
	public void selectCarModel (String carMdel) throws Exception {
		carModel = getElementByCssSelector("#Model");
		selectByText(carModel,carMdel);
	}
	//Implementation of Scenario no. 4//
		// Here implementing selection of Minimum Cost 
	public void selectMinimumCost(String minCost)throws Exception {
		minimumCost = getElementByCssSelector("#MinCost");
		selectByText(minimumCost, minCost);
	}
	//Implementation of Scenario no. 4//
			// Here implementing minimum Deposit 
	public void selectDeposit(String deposit) throws Exception {
		minDeposit = getElementByCssSelector("#Deposit");
		selectByText(minDeposit, deposit);
	}
	//Implementation of Scenario no. 4//
			// Here implementing selection of Maximum Cost 
		public void selectMaxiCost(String maxCost)throws Exception {
			maximumCost = getElementByCssSelector("#MaxCost");
			selectByText(maximumCost, maxCost);
		}
		//Implementation of Scenario no. 4//
		// Here implementing selection of lenght of loan Tearm 
	public void selectLoanTearm(String Term)throws Exception {
		loanTerm = getElementByCssSelector("#Term");
		selectByText(loanTerm, Term);
	}
}