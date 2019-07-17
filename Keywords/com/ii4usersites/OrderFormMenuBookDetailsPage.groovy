package com.ii4usersites

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

import com.utilities.Interaction
import org.openqa.selenium.By
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class OrderFormMenuBookDetailsPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By joblinename = By.xpath("//*[@id='ctl00_Body_JobLineNameEditor']")
	By productgroupddn = By.xpath("//*[@id='ctl00_Body_ProductGroupEditor_Arrow']")
	By productgroupddnvalue = By.xpath("//*[@id='ctl00_Body_ProductGroupEditor_DropDown']//li[2]")
	By nextbtn = By.xpath("//*[@id='ctl00_Body_NextButton']")
	By menusizeddn = By.xpath("//*[@id='ctl00_Body_GexDropDown01_ItemEditor_Arrow']")
	By menusizeddnvalue = By.xpath("//*[text()='8.5 x 14']")


	@Keyword
	public void EnterValuesToJobDetailspage() {
		try {
			action.Type(joblinename, "test")
			action.Click(productgroupddn)
			action.Click(productgroupddnvalue)
			boolean statusofnextbtn = action.IsElementDisplayed(nextbtn)
		    WebUI.delay(10)
			if(statusofnextbtn == true)
			{
				action.WaitUntilElementClickable(nextbtn)
				println ("***********************DEMOOOOO*********************")
				action.Click(nextbtn)
				println ("***********************DEMOOOOO*********************")
			}
			
			/*String currentenvironment = GlobalVariable.environment

			if(currentenvironment.equalsIgnoreCase("uat")) {
				WebUI.navigateToUrl("http://ii4.uat.brandmuscle.net/OnlineOrderForm/BooksAccessories/FinishingDetails.aspx?id=68353&type=3")
				action.WaitForPageToLoad()
			}
			else if(currentenvironment.equalsIgnoreCase("stage")) {
				WebUI.navigateToUrl("https://ii4.v5stage.brandmuscle.net/OnlineOrderForm/BooksAccessories/FinishingDetails.aspx?id=64687&type=3")
				action.WaitForPageToLoad()
			}*/
		}
		catch(Exception e) {
			println ("Enter Values To Job Details page failed due to "+ e)
		}
	}
}
