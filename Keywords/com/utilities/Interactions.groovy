package com.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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


import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.WebDriver
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import internal.GlobalVariable

def class Interactions {

	WebDriver driver = DriverFactory.getWebDriver()
	String pageLoadStatus = null;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Keyword
	def GetUrl(String BuName,String TestType, String EnvironmentName) {
		try {

			if(TestType.equalsIgnoreCase("SMOKE")) {
				if (BuName.equalsIgnoreCase("CONSOLIDATOR")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("https://admintool.v5qa.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://admintool.v5stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("https://admintool.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("https://admintool.v5dev.brandmuscle.net")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("DESIGNTRACKER")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://designtracker.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://designtracker.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://designtracker.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://designtracker.dev.brandmuscle.net/")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("DESIGNTRACKERAPPROVALPORTAL")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if(BuName.equalsIgnoreCase("POSW")){
					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://csg.v5qa.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://csg.v5stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://csg.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("https://csg.v5dev.brandmuscle.net")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}

				else if (BuName.equalsIgnoreCase("INSTANTIMPACTUSERSITE")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://ii4.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://ii4.v5stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://rel4.instantimpact.com")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://ii4.dev.brandmuscle.net/")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("WSWADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://wswadmin.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://wswadmin.stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://wswadmin.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://wswadmin.dev.brandmuscle.net/")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("IIADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://iiadmin.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://iiadmin.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://iiadmin.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://iiadmin.dev.brandmuscle.net/")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}


				else if (BuName.equalsIgnoreCase("PROOFGALLERY")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else{

					WebUI.closeBrowser()
					println ("Bu is not correct")
				}
			}

			else if(TestType.equalsIgnoreCase("REGRESSION")) {
				if (BuName.equalsIgnoreCase("CONSOLIDATOR")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}

				else if (BuName.equalsIgnoreCase("INSTANTIMPACTUSERSITE")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
					}
				}

				else if (BuName.equalsIgnoreCase("PROOFGALLERY")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://proofs.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://proofs.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://proofs.dev.brandmuscle.net/")
					}
				}
				else if (BuName.equalsIgnoreCase("WSWADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://wswadmin.uat.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://wswadmin.stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://wswadmin.dev.brandmuscle.net")
					}
				}
				else if (BuName.equalsIgnoreCase("IIADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://iiadmin.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://iiadmin.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://iiadmin.dev.brandmuscle.net/")
					}
				}
				else if (BuName.equalsIgnoreCase("DESIGNTRACKER")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://designtracker.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://designtracker.stage.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://designtracker.dev.brandmuscle.net/")
					}
				}
			}
			else{
				println ("Test type is not correct")
				WebUI.closeBrowser()
			}
		}

		catch (Exception e) {
			println ("GetUrl failed due to " + e);
		}
	}


	@Keyword
	def  WaitTime(int seconds) throws InterruptedException {
		try {
			seconds = seconds * 1000;
		}
		catch (Exception e) {
			seconds = 1000;
		}
		Thread.sleep(seconds);
	}

	@Keyword
	def  WaitForPageToLoad() {

		WebDriverWait wait = new WebDriverWait(driver, 300);
		pageLoadStatus = (String)js.executeScript("return document.readyState");
	}


	@Keyword
	def  GoToURL(String url) {
		driver.navigate().to(url);
	}

	@Keyword
	def  Back() {
		driver.navigate().back();
	}

	@Keyword
	def  Refresh() {
		driver.navigate().refresh();
	}


	@Keyword
	def  GetCurrentURL() {
		return driver.getCurrentUrl();
	}

	@Keyword
	public void  Type(By by, String value) {
		WaitVisible(by)
		driver.findElement(by).sendKeys(value);
	}

	@Keyword
	def  Type(By by, String value, int waittimeinsecs) throws InterruptedException {
		WaitVisible(by)
		driver.findElement(by).sendKeys(value);
	}

	@Keyword
	def  Clear(By by) {
		WaitVisible(by)
		driver.findElement(by).clear();
	}


	@Keyword
	def  Clear(By by, int waittimeinsecs) {
		WaitVisible(by)
		driver.findElement(by).clear();
	}

	@Keyword
	def  TypeClear(By by, String value,WebDriver driver) {
		WaitVisible(by)
		WebElement element = driver.findElement(by);
		element.clear();
		element.sendKeys(value);
	}

	@Keyword
	def  ScrollBy(int scroll) {
		js.executeScript("window.scrollBy(0,1000)");
	}


	@Keyword
	def  ScrollToViewElement(By by) {
		WaitVisible(by)
		WebElement element = driver.findElement(by);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	@Keyword
	//Scroll up to element to be visible
	def  ScrollToViewElement(WebElement element)
	{
		WaitVisible(element)
		js.executeScript("arguments[0].scrolSlIntoView(true);", element);
	}

	@Keyword
	//Scroll upto element to be visible
	def  ScrollToViewelement(By by)
	{
		WaitVisible(by)
		js.executeScript("arguments[0].scrolSlIntoView(true);", by);
	}

	@Keyword
	//Scroll to bottom of page
	def  ScrollToBottomOfPage()
	{
		js.executeScript("window.scrollTo(0, document.body.clientHeight);");
	}

	@Keyword
	//Scroll to top of page
	def  ScrollToTopOgPage()
	{
		js.executeScript("window.scrollTo(0, 0)");
	}


	@Keyword
	//Get single element
	def WebElement GetElement(By by)
	{
		WaitVisible(by)
		return driver.findElement(by);
	}

	@Keyword
	//Get single element
	def WebElement GetElement(By by, int waittimeinsecs)
	{
		WaitVisible(by)
		return driver.findElement(by);
	}

	@Keyword
	//Get Multiple elements
	def List<WebElement> GetElements(By by)
	{
		WaitVisible(by)
		return  driver.findElements(by);
	}

	@Keyword
	//Check element is displayed or not
	def boolean IsElementDisplayed(By by) throws Exception
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

	@Keyword
	// Element is enabled or not
	def boolean IsElementEnabled(By by) throws Exception
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

	@Keyword
	//Element is selected or not
	def boolean IsElementSelected(By by) throws Exception
	{
		try
		{
			WaitVisible(by)
			boolean selected = driver.findElement(by).isSelected();
			return selected;
		}
		catch(Exception e)
		{
			throw new Exception("ELEMENTNOTSELECTED");
		}
	}

	@Keyword
	def  WaitVisible(By by)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}



	@Keyword
	def  WaitVisible(By by,int timeinsec)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}


	@Keyword
	def  WaitVisible(WebElement element)
	{
		WaitVisible(element)
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(element));
	}


	@Keyword
	def  WaitVisible(WebElement element,int timeinsec)
	{
		WaitVisible(element)
		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}


	@Keyword
	def  WaitExist(By by)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}


	@Keyword
	def  WaitExistsForMultipleElements(By by)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}

	@Keyword
	def  WaitExistsForNestedElements(By by,By nestedlocator)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(by, nestedlocator));
	}


	@Keyword
	def  WaitExistsForNestedElements(WebElement element,By subelement)
	{
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(subelement, subelement));
	}


	@Keyword
	def  WaitTillNotVisible(By by,int timeinsec)
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


	@Keyword
	def WebElement WaitUntilElementClickable(WebElement element)
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


	@Keyword
	def  WaitUntilElementClickable(By by)
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


	@Keyword
	def boolean WaitUntilStalenessOfElement(WebElement element, int timeinsec)
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

	@Keyword
	/*Click*/
	def  Click(By by)
	{
		WaitVisible(by)
		driver.findElement(by).click();
	}

	@Keyword
	def  ClickAndWait(By by,int timeinsec) throws InterruptedException
	{
		WaitTime(timeinsec);
		driver.findElement(by).click();
	}

	@Keyword
	def  DoubleClick(By by) throws InterruptedException
	{
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.doubleClick();
		action.build().perform();
		WaitTime(4);
	}

	@Keyword
	def  JsClick(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,300);
		js.executeScript( "arguments[0].click();", element );
	}


	@Keyword
	/*Alert Handler*/
	def boolean AcceptAlert()
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
			System.out.println("Alert Was Present");
			return true;
		}
		catch(Exception e)
		{
			System.out.println("No Alert Found");
			return false;
		}
	}

	@Keyword
	def boolean DismissAlert()
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

	@Keyword
	def String GetAlertText()
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

	@Keyword
	def MouseHoverOnElement(By by)
	{
		WebElement elementToHover = driver.findElement(by);
		Actions hover = new Actions(driver);
		hover.moveToElement(by)
		hover.perform();
	}


	@Keyword
	def MouseHoverAndClick(By by)
	{
		WaitVisible(by);
		WebElement elementToHover = driver.findElement(by);
		Actions hover = new Actions(driver);
		hover.moveToElement(by).perform();
		hover.click();
	}


	@Keyword
	def MouserHoverAndClick(By hoverby, By clickby)
	{
		WaitVisible(hoverby);
		WebElement elementToHover = driver.findElement(hoverby);
		Actions hover = new Actions(driver);
		hover.moveToElement(elementToHover).perform();
		WebElement elementToClick = driver.findElement(clickby);
		hover.moveToElement(elementToClick).perform();
		hover.click();
	}




	@Keyword
	def SelectByText(By by, String text)
	{
		WaitVisible(by);
		WebElement elementToHover = driver.findElement(by);
		Select select = new Select(elementToHover)
		select.selectByVisibleText(text)

	}


	@Keyword
	//Select By Value from Drop down
	def SelectByValue(By by, String value)
	{
		WaitVisible(by);
		WebElement elementToHover = driver.findElement(by);
		Select select = new Select(elementToHover)
		select.selectByVisibleText(value)
	}


	@Keyword
	//Select by Index from drop down
	def SelectByIndex(By by, int index)
	{
		WaitVisible(by);
		WebElement elementToHover = driver.findElement(by);
		Select select = new Select(elementToHover)
		select.selectByIndex(index)
	}


}
