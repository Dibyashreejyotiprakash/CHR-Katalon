package com.utilities

import org.testng.Assert
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.Wait
import org.openqa.selenium.support.ui.FluentWait
import org.openqa.selenium.WebDriver
import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver.Timeouts;
import java.util.concurrent.TimeUnit;
import java.text.DateFormat
import java.text.SimpleDateFormat
//import internal.GlobalVariable
import java.time.LocalTime

public  class Interaction {

	WebDriver driver = DriverFactory.getWebDriver()
	String pageLoadStatus = null;
	JavascriptExecutor js = (JavascriptExecutor) driver;


	@Keyword
	public void GetUrl(String BuName,String TestType, String EnvironmentName) {
		try {
			if(TestType.equalsIgnoreCase("SMOKE")) {
				if (BuName.equalsIgnoreCase("CONSOLIDATOR")) {
					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.consolidatorurlUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.consolidatorurlSTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl(GlobalVariable.consolidatorurlPROD)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("ii3")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.ii3UAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.ii3STAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl(GlobalVariable.ii3PROD)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.ii3DEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("DESIGNTRACKER")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.dtUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.dtSTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl(GlobalVariable.dtPROD)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.dtDEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}

				else if(BuName.equalsIgnoreCase("POSW")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.poswUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.poswSTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl(GlobalVariable.poswPROD)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("INSTANTIMPACTUSERSITE")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.ii4UAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.ii4STAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl(GlobalVariable.ii4PROD)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.ii4DEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("WSWADMIN")) {
					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.wswadminUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.wswadminSATGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl(GlobalVariable.wswadminPROD)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.wswadminDEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("IIADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.iiadminUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.iiadminSTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl(GlobalVariable.iiadminPROD)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.iiadminDEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("APPROVALS")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.dtapprovalUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.dtapprovalSTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl(GlobalVariable.dtapprovalsPROD)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.dtapprovalsDEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("PROOFGALLERY"))
				{

					if (EnvironmentName.equalsIgnoreCase("UAT"))
					{
						WebUI.navigateToUrl(GlobalVariable.proofgalleryUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING"))
					{
						WebUI.navigateToUrl(GlobalVariable.proofgallerySTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD"))
					{
						WebUI.navigateToUrl(GlobalVariable.proofgalleryPROD)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV"))
					{
						WebUI.navigateToUrl(GlobalVariable.proofgalleryDEV)
					}
					else
					{
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else
				{
					throw new Exception("BU is not correct")
					WebUI.closeBrowser()
				}
			}

			else if(TestType.equalsIgnoreCase("REGRESSION"))
			{
				if (BuName.equalsIgnoreCase("CONSOLIDATOR"))
				{

					if (EnvironmentName.equalsIgnoreCase("UAT"))
					{
						WebUI.navigateToUrl(GlobalVariable.consolidatorurlUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.consolidatorurlSTAGE)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("INSTANTIMPACTUSERSITE")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.ii4UAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.ii4STAGE)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("POSW")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.poswUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.poswSTAGE)
					}
					else {
						println ("Environment is not correct")
						WebUI.closeBrowser()
						throw new Exception("Environment is not correct")
					}
				}

				else if (BuName.equalsIgnoreCase("APPROVALS")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.dtapprovalUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.dtapprovalSTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.dtapprovalsDEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("WSWADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.wswadminUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.wswadminSATGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.wswadminDEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("IIADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.iiadminUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.iiadminSTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.iiadminDEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("DESIGNTRACKER")) {
					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl(GlobalVariable.dtUAT)
						//WebUI.delay(3)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl(GlobalVariable.dtSTAGE)
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl(GlobalVariable.dtDEV)
					}
					else {
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("PROOFGALLERY"))
				{
					if (EnvironmentName.equalsIgnoreCase("DEV"))
					{
						WebUI.navigateToUrl(GlobalVariable.proofgalleryDEV)
					}
					else if (EnvironmentName.equalsIgnoreCase("UAT"))
					{
						WebUI.navigateToUrl(GlobalVariable.proofgalleryUAT)
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING"))
					{
						WebUI.navigateToUrl(GlobalVariable.proofgallerySTAGE)
					}
					else
					{
						throw new Exception("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else
				{
					throw new Exception("BU is not correct")
					WebUI.closeBrowser()
				}
			}
			else {
				throw new Exception("Test type is not correct")
				WebUI.closeBrowser()
			}
			println ("TestType---BU---Env are : "+TestType+"---"+BuName+"---"+EnvironmentName)
		}
		catch (Exception e) {
			Assert.fail("Ge tUrl failed due to"+e)
			println ("Failed due to "+ e)
		}
	}



	public void  WaitTime(int seconds) throws InterruptedException {
		try {
			seconds = seconds * 1000;
		}
		catch (Exception e) {
			seconds = 1000;
		}
		Thread.sleep(seconds);
	}


	public void  WaitForPageToLoad() {

		WebDriverWait wait = new WebDriverWait(driver, 300);
		pageLoadStatus = (String)js.executeScript("return document.readyState");

		//WebUI.delay(10)
	}


	public void CloseAllBrowser() {
		driver.quit()
	}

	public void  GoToURL(String url) {
		driver.navigate().to(url);
	}


	public void  Back() {
		driver.navigate().back();
	}


	public void  Refresh() {
		driver.navigate().refresh();
	}



	public String  GetCurrentURL() {

		//WaitVisible(by)
		WebUI.delay(2)
		return driver.getCurrentUrl();
	}

	public void  Type(By by, String value) {
		WaitVisible(by)
		driver.findElement(by).sendKeys(value);
	}


	public void  Type(By by, String value, int waittimeinsecs) throws InterruptedException {
		WaitVisible(by)
		driver.findElement(by).sendKeys(value);
	}


	public void  Clear(By by) {
		WaitVisible(by)
		driver.findElement(by).clear();
	}



	public void  Clear(By by, int waittimeinsecs) {
		WaitVisible(by)
		driver.findElement(by).clear();
	}


	public void  TypeClear(By by, String value) {
		WaitVisible(by)
		driver.findElement(by).clear()
		driver.findElement(by).sendKeys(value)
	}


	//clear text field and type value
	public void TypeAndClear(By by, String value){
		WaitVisible(by)
		WebElement element = driver.findElement(by);
		element.clear();
		element.sendKeys(value);

	}




	public void  ScrollBy(int scroll) {
		js.executeScript("window.scrollBy(0,1000)");
	}


	//Scroll upto element to be visible
	public void  ScrollToViewElement(By by) {

		WebUI.delay(1)
		WebElement element = driver.findElement(by);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		//WaitVisible(by)
	}


	//Scroll up to element to be visible
	public void  ScrollToViewElement(WebElement element)
	{
		WaitVisible(element)
		//WebUI.delay(1)
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}


	//Scroll upto element to be visible
	/*public void  ScrollToViewelement(By by)
	 {
	 WebUI.delay(1)
	 js.executeScript("arguments[0].scrollIntoView(true);", by);
	 WaitVisible(by)
	 }*/


	//Scroll to bottom of page
	public void  ScrollToBottomOfPage()
	{
		WebUI.delay(1)
		js.executeScript("window.scrollTo(0, document.body.clientHeight);");
	}


	//Scroll to top of page
	public void  ScrollToTopOgPage()
	{
		WebUI.delay(1)
		js.executeScript("window.scrollTo(0, 0)");
	}



	//Get single element
	public  WebElement GetElement(By by)
	{
		WaitVisible(by)
		return driver.findElement(by);
	}


	//Get single element
	public  WebElement GetElement(By by, int waittimeinsecs)
	{
		WaitVisible(by)
		return driver.findElement(by);
	}


	//Get Multiple elements
	public  List<WebElement> GetElements(By by)
	{
		WaitVisible(by)
		return  driver.findElements(by);
	}


	//Check element is displayed or not
	public  boolean IsElementDisplayed(By by) throws Exception
	{
		try
		{
			WaitVisible(by)
			boolean displayed = driver.findElement(by).isDisplayed();
			return displayed;
		}
		catch(Exception e)
		{
			throw new Exception("ELEMENTNOTDISPLAYED");
		}
	}

	public  boolean IsDisplayed(By by)
	{
		try
		{
			//WebUI.delay(10)
			WaitVisible(by)
			boolean displayed = driver.findElement(by).isDisplayed();
			return displayed;
		}
		catch(Exception e)
		{
			//throw new Exception("ELEMENTNOTDISPLAYED");
			println("Not Displayed")
		}
	}

	// Element is enabled or not
	public  boolean IsElementEnabled(By by) throws Exception
	{
		try
		{
			WaitVisible(by)
			boolean enabled = driver.findElement(by).isEnabled();
			return enabled;
		}
		catch(Exception e)
		{
			throw new Exception("ELEMENTNOTENABLED");
		}
	}

	//Element is selected or not
	public  boolean IsElementSelected(By by) throws Exception
	{
		try
		{
			WaitVisible(by)
			boolean selected = driver.findElement(by).isSelected();

			println ("****************"+selected + "*************")
			return selected;
		}
		catch(Exception e)
		{
			throw new Exception("ELEMENTNOTSELECTED");
		}
	}


	public void WaitVisible(By by)
	{
		WebUI.delay(1)
		WebDriverWait wait = new WebDriverWait(driver, 60)
		wait.until(ExpectedConditions.visibilityOfElementLocated(by))

		/*println('Entering into Explicit wait statements')
		 Boolean prsentstatus=wait.until(ExpectedConditions.presenceOfElementLocated(by))
		 println(prsentstatus)
		 Boolean prsentstatus1 = wait.until(ExpectedConditions.visibilityOfElementLocated(by))
		 println(prsentstatus1)*/
	}

	public void  WaitVisibleDup(By by)
	{
		WebDriverWait wait = new WebDriverWait(driver, 300)

		println('Entering into Explicit wait statements')

		Boolean prsentstatus=wait.until(ExpectedConditions.presenceOfElementLocated(by))
		println(prsentstatus)

		Boolean clickstatus=wait.until(ExpectedConditions.elementToBeClickable(by))
		println(clickstatus)

	}

	public void  WaitVisible(By by,int timeinsec)
	{
		WebUI.delay(1)
		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void  WaitVisible(WebElement element)
	{
		WebUI.delay(1)
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOf(element));
	}


	public void  WaitVisible(WebElement element,int timeinsec)
	{
		WaitVisible(element)
		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}



	public void  WaitExist(By by)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}



	public void  WaitExistsForMultipleElements(By by)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}


	public void  WaitExistsForNestedElements(By by,By nestedlocator)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(by, nestedlocator));
	}

	public void  WaitExistsForNestedElements(WebElement element,By subelement)
	{
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(subelement, subelement));
	}

	public void  WaitTillNotVisible(By by,int timeinsec)
	{
		boolean stillExists = true;
		while (stillExists)
		{
			try
			{
				WaitVisible(by,timeinsec);
			}
			catch(Exception e)
			{
				stillExists = false;
			}
		}
	}

	public  WebElement WaitUntilElementClickable(WebElement element)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,300);
			return wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Element : '" + element + "' was not found in current context page.");
			throw e;
		}
	}

	public void  WaitUntilElementClickable(By by)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,300);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Element : '" + by + "' was not found in current context page.");
			throw e;
		}
	}

	public  boolean WaitUntilStalenessOfElement(WebElement element, int timeinsec)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,300);
			return wait.until(ExpectedConditions.stalenessOf(element));
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is still not attached to current DOM");
			return false;
		}
	}

	/*Click*/
	public void  Click(By by)
	{
		WaitVisible(by)
		driver.findElement(by).click();
	}

	public void  ClickAndWait(By by,int timeinsec) throws InterruptedException
	{
		WaitTime(timeinsec);
		driver.findElement(by).click();
	}

	public void  DoubleClick(By by) throws InterruptedException
	{
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.doubleClick();
		action.build().perform();
		WaitTime(4);
	}

	public void  JsClick(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,300);
		js.executeScript( "arguments[0].click();", element );
	}

	/*Alert Handler*/
	public  void AcceptAlert()
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e)
		{
			println (e)
		}
	}

	public  boolean DismissAlert()
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			System.out.println("Alert Was Present");
			return true;
		}
		catch(Exception e)
		{
			System.out.println("No Alert Found");
			return false;
		}
	}

	public  String GetAlertText()
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Was Present");
			return text;
		}
		catch(Exception e)
		{
			System.out.println("No Alert Found");
			return null;
		}
	}

	public void MouseHoverOnElement(By by)
	{
		WaitVisible(by);
		WebElement elementToHover = driver.findElement(by);
		Actions hover = new Actions(driver);
		hover.moveToElement(elementToHover)
		hover.perform();
	}

	public void MouseHoverAndClick(By by)
	{
		WaitVisible(by);
		WebElement elementToHover = driver.findElement(by);
		Actions hover = new Actions(driver);
		hover.moveToElement(elementToHover).click().perform();

	}

	public void MouserHoverAndClick(By hoverby, By clickby)
	{
		WaitVisible(hoverby);
		WebElement elementToHover = driver.findElement(hoverby);
		Actions hover = new Actions(driver);
		hover.moveToElement(elementToHover).perform();
		WebElement elementToClick = driver.findElement(clickby);
		hover.moveToElement(elementToClick).click().perform();

	}

	public void SelectByText(By by, String text)
	{
		WaitVisible(by);
		WaitVisibleDup(by);
		WebElement elementToHover = driver.findElement(by);
		Select select = new Select(elementToHover)
		select.selectByVisibleText(text)

	}

	public List<WebElement> GetAllOptions(By by)
	{
		WaitVisible(by)
		WebElement elementToHover = driver.findElement(by)
		Select select = new Select(elementToHover)
		return select.getAllSelectedOptions()
	}

	public String GetselectedText(By by)
	{
		Select select = new Select(driver.findElement(by))
		WebElement option = select.getFirstSelectedOption()
		return  option.getText()
	}



	//Select By Value from Drop down
	public void SelectByValue(By by, String value)
	{
		WaitVisible(by);
		WebElement elementToHover = driver.findElement(by);
		Select select = new Select(elementToHover)
		select.selectByVisibleText(value)
	}



	//Select by Index from drop down
	public void SelectByIndex(By by, int index)
	{
		WaitVisible(by);
		WaitVisibleDup(by);
		WebElement elementToHover = driver.findElement(by);
		Select select = new Select(elementToHover)
		select.selectByIndex(index)
	}

	//Get all options
	public List<WebElement> GetAllOption(By by)
	{
		WaitVisible(by);
		WebElement elementToHover = driver.findElement(by)
		Select select = new Select(elementToHover)
		List <WebElement> options = select.getOptions()

		return options
	}

	//window handling
	@Keyword
	public void WindowHandle(){
		try{
			Set<String> set =  driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			while(it.hasNext())
			{
				String parentwidowid = it.next()
				println ("Parent Window id is"+ parentwidowid)

				String childwindowid = it.next()
				println ("Child Window id is"+ childwindowid)

				driver.switchTo().window(childwindowid)
			}


		}
		catch(Exception e){
			println ("WindowHandle method failed due to :"+ e)

		}
	}

	//Get attribute of webelement

	public String Attribute(By by, String attri)
	{
		WaitVisible(by);
		WebElement element = driver.findElement(by);
		String value = element.getAttribute(attri)

		return value

	}

	public boolean isAttribtuePresent(By by, String attribute)
	{
		WebElement element = driver.findElement(by);
		boolean result = false;
		String value = element.getAttribute(attribute)

		if(value != null)
		{
			result = true
		}

		return result

	}


	public void Enter(By by)
	{
		driver.findElement(by).sendKeys(Keys.ENTER);
	}
	public void PreseBackSpace(By by)
	{
		driver.findElement(by).sendKeys(Keys.BACK_SPACE)
	}

	public void PreseLeftArrow(By by)
	{
		driver.findElement(by).sendKeys(Keys.ARROW_LEFT)
	}

	public void PreseRightArrow(By by)
	{
		driver.findElement(by).sendKeys(Keys.ARROW_RIGHT)
	}

	public String GetText(By by)
	{
		WaitVisible(by)
		return driver.findElement(by).getText();
	}

	public String GenerateRandonString(String text)
	{
		LocalTime currenttime = LocalTime.now();
		String newcategoryname = text + currenttime

		return newcategoryname
	}

	public String GenerateRandomAplphabaticString(int stringlength)
	{
		return RandomStringUtils.randomAlphabetic(stringlength)
	}

	public String GenerateRandomAplphabaNeumericString(int stringlength)
	{
		return RandomStringUtils.randomAlphanumeric(stringlength)
	}

	public String GenerateRandomNumericString(int stringlength)
	{
		return RandomStringUtils.randomNumeric(stringlength)
	}

	public void VerifyCurrentPage(String expectedurl)
	{
		WebUI.delay(3)
		String actualurl = driver.getCurrentUrl()
		//boolean b = actualurl.contains(expectedurl)
		if(actualurl.contains(expectedurl))
		{
			println ("Page verified")
		}
		else
		{
			throw new Exception("Page is not verified")
		}
	}


	@Keyword
	public String CheckEnvironmentAndQuit(){
		String currentenvironment = GlobalVariable.environment
		try{
			if(currentenvironment.equals("UAT")){
				driver.quit()
			}
			else if(currentenvironment.equals("STAGE"))
			{
				driver.quit()
			}
			else{
				println ("Executing For Production")
			}
			return currentenvironment
		}
		catch(Exception e){
			println ("Check Environment And Quit failed due to "+ e)
		}
	}


	public boolean isElementPresent(By by){
		try{
			driver.findElement(by);
			return true;
		}
		catch(NoSuchElementException e){
			throw new Exception ("Element is not present "+ by)
		}
	}


	//get current local date
	@Keyword
	public String GetCurrentDate(String Format)
	{
		try
		{
			if(Format.equalsIgnoreCase("month"))
			{
				GetCurrentDateWithMonthFirst()
			}
			else
			{
				GetCurrentDateWithDateFirst()
			}
		}
		catch(Exception e)
		{
			Assert.fail("GetCurrentDate failed due to : " + e)
		}
	}

	//get current date time with Date()
	@Keyword
	public void GetCurrentDateWithMonthFirst()
	{
		try
		{
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

			//get current date time with Date()
			Date date = new Date();

			// Now format the date
			String dateFormatted= dateFormat.format(date);

		}
		catch(Exception e)
		{
			Assert.fail("GetCurrentDate failed due to : " + e)
		}
	}

	@Keyword
	public void GetCurrentDateWithDateFirst()
	{
		try
		{
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			//get current date time with Date()
			Date date = new Date();

			// Now format the date
			String dateFormatted= dateFormat.format(date);

		}
		catch(Exception e)
		{
			Assert.fail("GetCurrentDate failed due to : " + e)
		}
	}

}
