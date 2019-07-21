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
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class FinishInCompleteOrderHistoryPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By headerlabel = By.xpath("//*[text()='Select Job you would like to Complete']")
	By filteroptionsaccordion = By.xpath("//*[@class='accordion-toggle collapsed']")
	By firsteditbtn = By.xpath("//*[@id='ctl00_Body_grdJobs_ctl00_ctl04_lbtnSelect']")
	By deletebtn = By.xpath("//*[@id='ctl00_Body_grdJobs_ctl00_ctl04_lbtnDelete']")


	@Keyword
	public void VerifyFinishInComplete() {
		try {
			boolean statusofheaderlabel = action.IsElementDisplayed(headerlabel)
			Assert.assertTrue(statusofheaderlabel)
		}
		catch(Exception e) {
			println ("Verify Finish InComplete failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyDeleteLink() {
		try {
			boolean statusofdeletelink = action.IsElementEnabled(deletebtn)
			Assert.assertTrue(statusofdeletelink)
		}
		catch(Exception e) {
			println ("Verify Delete Link failed due to "+ e)
		}
	}

	@Keyword
	public void DeleteLink() {
		try {
			action.Click(deletebtn)
			action.AcceptAlert()
		}
		catch(Exception e) {
			println ("Verify Delete Link failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyEditLink() {
		try {
			boolean statusoffirsteditlink = action.IsElementEnabled(firsteditbtn)
			Assert.assertTrue(statusoffirsteditlink)
		}
		catch(Exception e) {
			println ("Verify Edit Link failed due to "+ e)
		}
	}

	@Keyword
	public void Edit() {
		try {
			boolean statusoffirsteditlink = action.IsElementEnabled(firsteditbtn)
			Assert.assertTrue(statusoffirsteditlink)
			action.Click(firsteditbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Verify Edit Link failed due to "+ e)
		}
	}
}
