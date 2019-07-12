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

public class ii3OrderFormDefaultPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By createnewbtn = By.xpath("//*[@id='ContentMain_MainPlaceHolder_NewOrderButton']")
	By clonebtn = By.xpath("//*[@id='ContentMain_MainPlaceHolder_JobSearchButton']")
	By customodrerformlabel = By.xpath("//*[text()='Custom Order Form']")

	@Keyword
	public void VerifyOLOFPage() {
		try {
			boolean statusofcustomodrerlabel = action.IsElementDisplayed(customodrerformlabel)
			Assert.assertTrue(statusofcustomodrerlabel)
		}
		catch(Exception e) {
			println ("Verify OLOF Home Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyCreateCloneFinsihIncompleteButton() {
		try {
			boolean statusofcreatebutton = action.IsElementDisplayed(createnewbtn)
			Assert.assertTrue(statusofcreatebutton)

			boolean statusofclonebutton = action.IsElementDisplayed(clone)
			Assert.assertTrue(statusofclonebutton)
		}
		catch(Exception e) {
			println ("Verify Create Clone Finsih Incomplete Button failed due to "+ e)
		}
	}

	@Keyword
	public void ClickonCreateNewCustomOrder() {
		try {
			action.Click(createnewbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click on Create New CustomOrder failed due to "+ e)
		}
	}

	@Keyword
	public void ClickonCloneOrder() {
		try {
			action.Click(clone)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click on  Clone Order failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyCreateNewOrderButton() {
		try {

			boolean statusofcreatenewdesignbtn = action.IsElementDisplayed(createnewbtn)
			Assert.assertTrue(statusofcreatenewdesignbtn)
		}
		catch(Exception e) {
			println ("Click on Create New CustomOrder failed due to "+ e)
		}
	}
}
