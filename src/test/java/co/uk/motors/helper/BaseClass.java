package co.uk.motors.helper;



import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass 
{
	private static WebDriver driver;
	private static Select select;
	private static Actions action;
	
	static
	{
		driver = null;
		select = null;
		action = null;
	}
	
	/*01 Edit by Shaikh ####################################################################
	Uses - This method launches Firefox Browser
	It is used in LaunchBrowser() method to initialise driver to Firefox.
	######################################################################*/
	//This method is deprecated nowadays
	private static WebDriver initFirefox() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
	
	/*02 ######################################################################
	Uses - This method launches Chrome Browser
	It is used in LaunchBrowser() method to initialise the driver to Chrome
	########################################################################*/
	private static WebDriver initChrome() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./lib/browser/chromedriver.exe");
		return new ChromeDriver();
	}
	
	/*03 ##################################################################
	Uses - This method launches IE Browser
	It is used in LaunchBrowser() method to initialise the driver to IE
	####################################################################*/
	private static WebDriver initInternetExplorer() throws Exception
	{
		WebDriverManager.iedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./lib/browser/IEDriverServer.exe");
		return new InternetExplorerDriver();
	}
	
	/*04 #############################################################
	Uses - This method launches any browser assigned to it
	It takes Chrome, Firefox and IE and initialises the driver
	###############################################################*/
	public static void launchBrowser(String browserName) throws Exception
	{
		switch(browserName.toLowerCase())
		{
		case "chrome" :
			driver = initChrome();
			break;
		case "firefox" :
			driver = initFirefox();
			break;
		case "ie":
		case "internetexplorer":
		case "internet explorer":
			driver = initInternetExplorer();
			break;
			
			default:
				System.out.println(browserName + " is not recognised, so Chrome browser is launched");
				driver = initChrome();
		}
		//the command below maximizes the browser when launched
		driver.manage().window().maximize();
	}
	
	
	/*05 #####################################################
	Uses - This method closes any browser open by selenium
	It is used to clean up afterwards
	#######################################################*/
	public static void closeBrowser() throws Exception
	{
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}
	
	/*06 #########################################################
	Uses - This method navigates to any url passed in. 
	Note - url must have this format -> http://www.example.com
	It is called after LaunchBrowser() method has been called.
	###########################################################*/
	public static void launchUrl(String url) throws Exception
	{
		driver.navigate().to(url);
	}
	
	/*07 #########################################################
	Uses - This method helps to hover over any element
	It takes in any WebElement of interest
	###########################################################*/
	public static void HoverOver(WebElement element) throws Exception
	{
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	/*08 #######################################################################
	Uses - This method helps to assert/validate that an element is displayed
	It takes in any WebElement of interest
	#########################################################################*/
	public static void VerifyAnElementIsDisplayed(WebElement element) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.isDisplayed());
	}
	
	
	/*09 #######################################################################
	Uses - This method helps to assert/validate that an element is selected
	It takes in any WebElement of interest
	#########################################################################*/
	public static void VerifyAnElementIsSelected(WebElement element) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.isSelected());
	}
	
	/*10 ##########################################################
	Uses - This method helps to click on an element of interest
	It takes in any WebElement of interest
	############################################################*/
	public static void clickAnElement(WebElement element) throws Exception
	{
		element.click();
	}
	
	/*11 ###############################################################
	Uses - This method helps to type given value into a field
	It takes in any WebElement of interest and the value to type in
	#################################################################*/
	public static void typeGivenValueInto(WebElement element, String text) throws Exception
	{
		element.clear();
		element.sendKeys(text);
	}
	
	/*12 #######################################################################
	Uses - This method helps to assert/validate that an element is enabled
	It takes in any WebElement of interest
	#########################################################################*/
	public static void VerifyAnElementIsEnabled(WebElement element) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.isEnabled());
	}
	
	/*13 ########################################################################################
	Uses - This method helps to assert/validate that an element contains a given text snippet
	It takes the full text and the text snippet needed to be validated 
	##########################################################################################*/
	public static void VerifyTextContainSnippet(String mainText, String snippet) throws Exception
	{
		Assert.assertTrue(snippet + " is not contained in " + mainText, 
				mainText.toLowerCase().contains(snippet.toLowerCase()));
	}
	
	/*14 ##################################################################################################
	Uses - This method helps to assert/validate that a list of element are displayed e.g. Search Result
	It takes in List of WebElement of interest
	####################################################################################################*/
	public static void VerifyListOfElementsAreDisplayed(List<WebElement> element) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.size()>0);
	}
	
	/*15 ###########################################################################
	Uses - This method helps to assert/validate the number of elements displayed
	It takes in a List of WebElement of interest
	#############################################################################*/
	public static void VerifyListOfElementsAreDisplayed(List<WebElement> element, int size) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.size()>size);
	}
	
	/*16 ###################################################################################################################
	Uses - This method helps to select element from a dropdown by specifying the index of the item needed to be selected
	It takes in the dropdown as a WebElement and the index as a number
	#####################################################################################################################*/
	public static void selectByIndex(WebElement element, int index) throws Exception
	{
		select = new Select(element);
		select.selectByIndex(index);
	}
	
	/*17 ###################################################################################################################
	Uses - This method helps to select element from a dropdown by specifying the index of the item needed to be selected
	It takes in the dropdown as a WebElement and the index as a number
	#####################################################################################################################*/
	public static void selectByValue(WebElement element, String value) throws Exception
	{
		select = new Select(element);
		select.selectByValue(value);
	}
	
	/*18 ###################################################################################################################
	Uses - This method helps to select element from a dropdown by specifying the Text of the item needed to be selected
	It takes in the dropdown as a WebElement and the Text as a String
	#####################################################################################################################*/
	public static void selectByText(WebElement element, String text) throws Exception
	{
		select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	
	public static File takeScreenShot() throws Exception
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
	
	public static void saveScreenshot() throws Exception
	{
		String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
		String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());
		
		String fileName = String.format(".\\Screenshots\\%s\\screenshot_%s", dateNow, timeNow);
		
		File screenshot = takeScreenShot();
		
		FileUtils.copyFile(screenshot, new File(fileName));
			
	}
	
	/*19 ##########################################################################
	Uses - This method helps to find element by specifying the Id of the element
	It takes in the Id as a string
	############################################################################*/
	public static WebElement getElementById(String id) throws Exception
	{
		By locator = By.id(id);
		return getElement(locator);
	}
	
	/*20 ###################################################################################
	Uses - This method helps to find List of elements by specifying the Id of the element
	It takes in the Id as a string
	#####################################################################################*/
	public static List<WebElement> getElementsById(String id) throws Exception
	{
		By locator = By.id(id);
		return getElements(locator);
	}
	
	/*21 ##################################################################################
	Uses - This method helps to find element by specifying the classname of the element
	It takes in the className as a string
	####################################################################################*/
	public static WebElement getElementByClassName(String className) throws Exception
	{
		By locator = By.className(className);
		return getElement(locator);
	}
	
	/*22 ###################################################################################
	Uses - This method helps to find elements by specifying the className of the element
	It takes in the className as a string
	#####################################################################################*/
	public static List<WebElement> getElementsByClassName(String className) throws Exception
	{
		By locator = By.className(className);
		return getElements(locator);
	}
	
	/*23 ##############################################################################################
	Uses - This method helps to find element by specifying the cssSelector identifier of the element
	It takes in the cssSelector identifier as a string
	################################################################################################*/
	public static WebElement getElementByCssSelector(String cssSelector) throws Exception
	{
		By locator = By.cssSelector(cssSelector);
		return getElement(locator);
	}
	
	/*24 ###############################################################################################
	Uses - This method helps to find elements by specifying the cssSelector identifier of the element
	It takes in the cssSelector identifier as a string
	#################################################################################################*/
	public static List<WebElement> getElementsByCssSelector(String cssSelector) throws Exception
	{
		By locator = By.cssSelector(cssSelector);
		return getElements(locator);
	}
	
	/*25 ##########################################################################################
	Uses - This method helps to find element by specifying the XPath identifier of the element
	It takes in the XPath identifier as a string
	############################################################################################*/
	public static WebElement getElementByXPath(String xpath) throws Exception
	{
		By locator = By.xpath(xpath);
		return getElement(locator);
	}
	
	/*26 ##########################################################################################
	Uses - This method helps to find elements by specifying the XPath identifier of the element
	It takes in the XPath identifier as a string
	############################################################################################*/
	public static List<WebElement> getElementsByXPath(String xpath) throws Exception
	{
		By locator = By.xpath(xpath);
		return getElements(locator);
	}
	
	/*27 #############################################################################
	Uses - This method helps to find element by specifying the name of the element
	It takes in the name as a string
	###############################################################################*/
	public static WebElement getElementByName(String name) throws Exception
	{
		By locator = By.name(name);
		return getElement(locator);
	}
	
	/*28 #############################################################################
	Uses - This method helps to find element by specifying the name of the element
	It takes in the name as a string
	###############################################################################*/
	public static List<WebElement> getElementsByName(String name) throws Exception
	{
		By locator = By.name(name);
		return getElements(locator);
	}
	
	private static WebElement getElement(By locator) throws Exception
	{
		WebElement element = null;
		int tryCount = 0;
		
		while (element == null)
		{
			try
			{
				element = driver.findElement(locator);
			} 
			catch(Exception e)
			{
				if(tryCount == 3)
				{
					saveScreenshot();
					System.out.println(element.toString() + " cannot be found");
					throw e;
				}
				
				Thread.sleep(2000);
				tryCount++;
			}
		}
		System.out.println(element.toString() + " is now retrieved");
		return element;
	}
	
	private static List<WebElement> getElements(By locator) throws Exception
	{
		List<WebElement> element = null;
		int tryCount = 0;
		
		while (element == null)
		{
			try
			{
				element = driver.findElements(locator);
			} 
			catch(Exception e)
			{
				if(tryCount == 3)
				{
					saveScreenshot();
					throw e;
				}
				
				Thread.sleep(2000);
				tryCount++;
			}
		}
		System.out.println(element.toString() + " is now retrieved");
		return element;
	}
}
