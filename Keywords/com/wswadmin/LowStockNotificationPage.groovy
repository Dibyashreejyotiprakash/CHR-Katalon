package com.wswadmin

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
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
import org.testng.Assert
public class LowStockNotificationPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corporationddn = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Arrow']")
	By corpddntextbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_Input']")
	By democorp = By.xpath("//*[@id='ctl00_cphMain_rcbCorp_DropDown']//li[18]")
	By lowstockcheckbox = By.xpath("//*[@id='chksetlowstocknotification']")
	By defaultemailnotificationlabel = By.xpath("//*[text()='Default e-mail Notification to']")
	By additionalemailnotificationlabel = By.xpath("//*[text()='Additional e-mail Notification to']")
	By aditilamailtextarea = By.xpath("//*[@id='txtEmailid']")
	By updatebtn = By.xpath("//*[@id='btnSave']")
	By msg = By.xpath("//*[text()='Low stock notification setting updated successfully.']")

	@Keyword
	public void VerifyLowNotificationPage() {
		try {
			String currenturl = action.GetCurrentURL()
			if(currenturl.contains("LowstockNotification.aspx")) {
				println ("Low Notification Page is veriffied")
			}
			else {
				Assert.fail()
			}
		}
		catch(Exception e) {
			println ("Verify Low Stock Notification failed due to "+ e)
		}
	}


	@Keyword
	public void AddAditionalMail() {
		try {
			action.WaitUntilElementClickable(corporationddn)
			action.Click(corporationddn)
			action.Type(corpddntextbox, "300")
			WebUI.delay(5)
			action.Click(democorp)
			WebUI.delay(5)
			boolean statusoflowstockcheckbox = action.IsElementSelected(lowstockcheckbox)
			println ("Status of check box *************"+ statusoflowstockcheckbox)

			if(statusoflowstockcheckbox == true) {
				action.Click(updatebtn)
				boolean statusofmsg = action.IsElementDisplayed(msg)
				if(statusofmsg == true) {
					println ("Successfully enabled low stock notification")
				}
			}
			else {
				action.Click(lowstockcheckbox)
				action.WaitVisible(defaultemailnotificationlabel)
				WebUI.delay(5)
				boolean statusofdefaultemail = action.IsElementDisplayed(defaultemailnotificationlabel)
				Assert.fail()
				WebUI.delay(5)
				boolean statusofadditionalemail = action.IsElementDisplayed(additionalemailnotificationlabel)
				Assert.fail()
				action.Click(aditilamailtextarea)
				action.Type(aditilamailtextarea, "dibyashree.jyoti@brandmuscle.com")
				action.WaitUntilElementClickable(updatebtn)
				action.Click(updatebtn)
			}
		}
		catch(Exception e) {
			println ("Additional Mail failed due to "+ e)
		}
	}
	
	@Keyword
	public void Verifyfields()
	{
		try{
			action.IsElementDisplayed(corporationddn)
		}
		catch(Exception e)
		{
			Assert.fail("Verify fields failed due to "+ e)
		}
	}
}
