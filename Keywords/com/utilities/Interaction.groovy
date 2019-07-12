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
import org.openqa.selenium.Keys
import org.openqa.selenium.JavascriptExecutor
import internal.GlobalVariable
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
				else if (BuName.equalsIgnoreCase("ii3")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://ii3.uat.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://ii3.stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://rel3.instantimpact.com")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("https://ii3.dev.brandmuscle.net")
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
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@wswadmin.uat.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@wswadmin.stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@wswadmin.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@wswadmin.dev.brandmuscle.net")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("IIADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@iiadmin.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@iiadmin.stage.brandmuscle.net//")
					}
					else if (EnvironmentName.equalsIgnoreCase("PROD")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@iiadmin.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@iiadmin.dev.brandmuscle.net/")
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

				else if (BuName.equalsIgnoreCase("INSTANTIMPACTUSERSITE")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("https://ii4.uat.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://ii4.v5stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://ii4.dev.brandmuscle.net")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}

				else if (BuName.equalsIgnoreCase("POSW")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("https://csg.v5stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("https://csg.v5stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("https://csg.v5dev.brandmuscle.net")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
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
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@wswadmin.uat.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@wswadmin.stage.brandmuscle.net")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@wswadmin.dev.brandmuscle.net")
					}
					else{
						println ("Environment is not correct")
						WebUI.closeBrowser()
					}
				}
				else if (BuName.equalsIgnoreCase("IIADMIN")) {

					if (EnvironmentName.equalsIgnoreCase("UAT")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@iiadmin.uat.brandmuscle.net/")
					}
					else if (EnvironmentName.equalsIgnoreCase("STAGING")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@iiadmin.stage.brandmuscle.net//")
					}
					else if (EnvironmentName.equalsIgnoreCase("DEV")) {
						WebUI.navigateToUrl("http://dibyashree.jyoti:chr@1234@iiadmin.dev.brandmuscle.net/")
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
		return driver.getCurrentUrl();
	}


	public void  Type(By by, String value) {
		//WaitVisible(by)
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


	public void  TypeClear(By by, String value,WebDriver driver) {
		WaitVisible(by)
		WebElement element = driver.findElement(by);
		element.clear();
		element.sendKeys(value);
	}


	public void  ScrollBy(int scroll) {
		js.executeScript("window.scrollBy(0,1000)");
	}



	public void  ScrollToViewElement(By by) {
		WaitVisible(by)
		WebElement element = driver.findElement(by);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}


	//Scroll up to element to be visible
	public void  ScrollToViewElement(WebElement element)
	{
		WaitVisible(element)
		js.executeScript("arguments[0].scrolSlIntoView(true);", element);
	}


	//Scroll upto element to be visible
	public void  ScrollToViewelement(By by)
	{
		WaitVisible(by)
		js.executeScript("arguments[0].scrolSlIntoView(true);", by);
	}


	//Scroll to bottom of page
	public void  ScrollToBottomOfPage()
	{
		js.executeScript("window.scrollTo(0, document.body.clientHeight);");
	}


	//Scroll to top of page
	public void  ScrollToTopOgPage()
	{
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
			return selected;
		}
		catch(Exception e)
		{
			throw new Exception("ELEMENTNOTSELECTED");
		}
	}


	public void  WaitVisible(By by)
	{

		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}




	public void  WaitVisible(By by,int timeinsec)
	{
		WaitVisible(by)
		WebDriverWait wait = new WebDriverWait(driver, timeinsec);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}



	public void  WaitVisible(WebElement element)
	{
		WaitVisible(element)
		WebDriverWait wait = new WebDriverWait(driver,20);
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
	public  boolean AcceptAlert()
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
		WebElement elementToHover = driver.findElement(by);
		Select select = new Select(elementToHover)
		select.selectByVisibleText(text)

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
		WebElement elementToHover = driver.findElement(by);
		Select select = new Select(elementToHover)
		select.selectByIndex(index)
	}

	public void Enter(By by)
	{
		driver.findElement(by).sendKeys(Keys.ENTER);
	}

	public void GetText(By by)
	{
		driver.findElement(by).getText();
	}

	public String GenerateRandonString(String text)
	{
		LocalTime currenttime = LocalTime.now();
		String newcategoryname = text + currenttime

		return newcategoryname
	}


}
