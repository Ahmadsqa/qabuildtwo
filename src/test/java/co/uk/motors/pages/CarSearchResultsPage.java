package co.uk.motors.pages;

import org.openqa.selenium.WebElement;

import co.uk.motors.helper.BaseClass;

	public class CarSearchResultsPage extends BaseClass {
		WebElement fullDetailsButton;
		WebElement choosenCarLink;
		
				///////////////Scenario no. 3////////// 
		//line no. 36 i click on FullDetails button of a car of my choice
		public VehicleDetailsPage clickonfullDetailsButton () throws Exception {
			fullDetailsButton = getElementByCssSelector("#_53342058_33620 > footer > div.r__cta > a");
			fullDetailsButton.click();
			return new VehicleDetailsPage();
			
		}
		///////////////Scenario no. 4 ////////// 
//line no. 58 i click on specific car of my choice as
		
		public VehicleDetailsPage clickOnCarOfMYChoice() throws Exception {
			
			choosenCarLink = getElementByCssSelector("#_54319903_51232 > a.r__head > h3");
			choosenCarLink.click();
			return new VehicleDetailsPage();
		}

		
		
		
	}
