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

public class OrderFormShiipingDetailsPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By nextbtn = By.xpath("//*[@id='ctl00_Body_btnNext']")
	By myitemsbtn = By.xpath("//*[text()='My Items']")
	By previousbtn = By.xpath("//*[text()='Previous']")
	By imagesection = By.xpath("//th[contains(text(),'Image')]")

	@Keyword
	public void ClickOnNextBtn() {
		try {
			action.Refresh()
			action.ScrollToViewElement(nextbtn)
			action.WaitUntilElementClickable(nextbtn)
			////WebUI.delay(10)
			action.Click(nextbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Next Btn failed due to "+ e)
		}
	}

	@Keyword
	public void ValidateImageSectionForNewOLOFOrder() {
		try {
			action.IsElementDisplayed(imagesection)
		}
		catch(Exception e) {
			Assert.fail("ValidateImageSectionForNewOLOFOrder Failed due to "+e)
		}
	}
}
