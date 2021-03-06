package com.ii3usersite

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
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
import org.openqa.selenium.WebElement
public class ii3OrderFormorderHeaderPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By newaccountname = By.xpath("//*[@id='ctl00_ctl00_ContentMain_MainPlaceHolder_rtbNewAccountName']")
	By jobnotetxtbox = By.xpath("//*[@id='ctl00_ctl00_ContentMain_MainPlaceHolder_rtbBillingNotes']")
	By continuetoitemsbtn = By.xpath("//*[@id='ctl00_ctl00_ContentMain_MainPlaceHolder_btnContinue']")
	By jobdetailslable = By.xpath("//*[text()='Job Details']")
    By allvaliddates = By.xpath("//*[@id='ctl00_ctl00_ContentMain_MainPlaceHolder_rdcJobCalendar']//tr/td/a/span[1]")

	@Keyword
	public void VerifyOrderHeaderPage() {
		try {
			boolean statusofjobdetailslabale = action.IsElementDisplayed(jobdetailslable)
			Assert.assertTrue(statusofjobdetailslabale)
		}
		catch(Exception e) {
			println ("Click On Order Now failed due to "+ e)
		}
	}

	@Keyword
	public void EnterValuesToFiledsInOrderPage() {
		try {
			action.Type(newaccountname, "Test")
			action.ScrollToBottomOfPage()
			
			List<WebElement> alldates = action.GetElements(allvaliddates)
			for(int i=0;i<= alldates.size();i++)
			{
				alldates.get(i).click()
				break
			}
			
			action.Click(continuetoitemsbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Enter Values To Fileds In Order Page failed due to "+ e)
		}
	}
}
