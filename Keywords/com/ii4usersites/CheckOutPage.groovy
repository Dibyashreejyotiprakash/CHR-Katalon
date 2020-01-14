package com.ii4usersites

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory


public class CheckOutPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By dtaccountddn = By.xpath("//*[@id='ctl00_Body_desTrackAccComboBox_Arrow']")
	By dtaccountvalue = By.xpath("//*[@id='ctl00_Body_desTrackAccComboBox_DropDown']//li[2]")
	By continuetoreview = By.xpath("//*[@id='ctl00_Body_bottomContToCheckOutBtn']")
	By commentsbox = By.xpath("//*[@id='Body_tbComments']")

	@Keyword
	public String ClickOnContinueToReview() {
		String comment = "Test Comment"
		try {
			action.WaitUntilElementClickable(dtaccountddn)
			action.Click(dtaccountddn)
			action.WaitUntilElementClickable(dtaccountvalue)
			action.Click(dtaccountvalue)
			WebUI.delay(5)
			action.ScrollToBottomOfPage()
			WebUI.delay(5)
			action.Type(commentsbox, comment)
			action.Click(continuetoreview)
			//action.WaitForPageToLoad()

			return comment;
		}
		catch(Exception e) {
			println ("Click On Continue To Review failed due to "+ e)
		}
	}
}
