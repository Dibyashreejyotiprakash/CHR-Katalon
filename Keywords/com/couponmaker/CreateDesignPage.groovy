package com.couponmaker

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
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

public class CreateDesignPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By itemtyperadiobtn = By.xpath("//*[@id='Body_coupons_CouponType_userControl_rblCouponTypes_1']")
	By offerbtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='Offer']")
	By crossmerchandisebtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='Cross Merchandise']")
	By datesbtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='Dates']")
	By statesbtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='States']")
	By selectallcheckbox = By.xpath("//*[@id='cblSelectAll']")
	By reviewandorderbtn = By.xpath("//*[@id='ctl00_Body_coupons_RadTabStripCustomize']/div/ul/li[text()='Review and Order']")
	By startdatebtn = By.xpath("//*[@id='ctl00_Body_coupons_Dates_userControl_txtStartDate_popupButton']")
	By startdatevalue = By.xpath("//*[@id='ctl00_Body_coupons_Dates_userControl_txtStartDate_calendar_Top']//tr//td[text()='18']")
	By enddatebtn = By.xpath("//*[@id='ctl00_Body_coupons_Dates_userControl_txtExpirationDate_popupButton']")
	By enddatevalue = By.xpath("//*[@id='ctl00_Body_coupons_Dates_userControl_txtExpirationDate_calendar_Top']//tr//td[text()='18']")


	@Keyword
	public void VerifyCreateDesignPage() {
		try{
			action.VerifyCurrentPage("Coupons.aspx")
		}
		catch(Exception e) {
			println ("Verify Create Design page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void Enterallvaliddata() {
		try {
			action.Click(offerbtn)
			action.Click(crossmerchandisebtn)
			action.Click(datesbtn)
			WebUI.delay(5)
			action.Click(startdatebtn)
			action.Click(startdatevalue)
			WebUI.click(20)
			action.Click(enddatebtn)
			action.Click(enddatevalue)
			action.Click(statesbtn)
		}
		catch(Exception e) {
			println ("Verify Create Design page failed due to "+ e)
			Assert.fail()
		}
	}
}
