package com.iiadmin

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

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable



public class NewAccountSetupPage {
	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By corpdropdown = By.xpath("//select[@id='ctl00_Body_ddlCorps']")
	By distributorsetup = By.xpath("//a[contains(text(),'Distributor Setup')]")
	By editdistributor = By.xpath("//a[contains(text(),'Edit Distributor')]")
	By distributordropdown = By.xpath("//select[@id='ctl00_Body_ddlDistributor']")
	By payperdownload = By.xpath("//label[contains(text(),'Pay per Download')]")
	By monthlysubscription = By.xpath("//label[contains(text(),'Monthly Subscription')]")
	By payfordownloads = By.xpath("//td[contains(text(),'Pay for Downloads')]")
	By payperdownloadradiobtn = By.xpath("//input[@id = 'ctl00_Body_fvAccounts_DigitalDownloadPaymentType_0']")
	By monthlysubscriptionradiobtn = By.xpath("//input[@id='ctl00_Body_fvAccounts_DigitalDownloadPaymentType_1']")
	By payperdownloadradiobtndist = By.xpath("//input[@id='ctl00_Body_fvDistributors_DigitalDownloadPaymentType_0']")
	By monthlysubscriptionradiobtndist = By.xpath("//input[@id='ctl00_Body_fvDistributors_DigitalDownloadPaymentType_1']")

	@Keyword
	public void ValidateDDPaymentOptionsForCorp() {
		try {
			action.WaitVisible(corpdropdown)
			action.SelectByText(corpdropdown, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			//action.SelectByValue(corpdropdown, "300")
			action.WaitVisible(payfordownloads)
			action.ScrollToViewElement(payfordownloads)
			action.IsElementDisplayed(payfordownloads)
			action.IsElementDisplayed(payperdownloadradiobtn)
			action.IsElementDisplayed(monthlysubscriptionradiobtn)
			String attribute_val = action.Attribute(payperdownloadradiobtn, "checked")
			Assert.assertEquals(attribute_val, "true")
		}
		catch(Exception e) {
			Assert.fail("ValidateDDPaymentOptions User failed due to "+ e)
		}
	}


	@Keyword
	public void ValidateDDPaymentOptionsForDist() {
		try {
			action.WaitVisible(corpdropdown)
			
			action.SelectByText(corpdropdown, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.WaitVisible(distributordropdown)
			action.SelectByText(distributordropdown, "Chicago Beverage Systems")
			action.IsElementDisplayed(payfordownloads)
			action.IsElementDisplayed(payperdownloadradiobtndist)
			action.IsElementDisplayed(monthlysubscriptionradiobtndist)
			String attribute_val = action.Attribute(payperdownloadradiobtndist, "checked")
			Assert.assertEquals(attribute_val, "true")
		}
		catch(Exception e) {
			Assert.fail("ValidateDDPaymentOptions User failed due to "+ e)
		}
	}
}
