package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

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

//import internal.GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert




public class StandardItemGating
{
	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()

	By corpddn = By.xpath(".//*[@id='ctl00_cphMain_rcbCorporation']/span/button")
	By distributorddn = By.xpath(".//*[@id='ctl00_cphMain_rcbDistributor']/span/button")
	By groupddn = By.xpath(".//*[@id='ctl00_cphMain_rcbUserGroups']/span/button")
	By chicagobeverage = By.xpath("//span[contains(text(),'Chicago Beverage Systems')]")
	By email = By.xpath("//label[contains(text(),'(test123@brandmuscle.com)')]")
	By distributorcorpval = By.xpath("//li[contains(text(),'300 - Instant Impact')]")
	By distributorval = By.xpath("//li[contains(text(),'Chicago Beverage Systems')]")
	By distributorgroupval = By.xpath("//li[contains(text(),'Jeremy')]")
	By suppliercorpval = By.xpath("//li[contains(text(),'Demo Supplier')]")
	By suppliergroupval = By.xpath("//li[contains(text(),'Test')]")
	By demoSuppQA = By.xpath("//span[contains(text(),'Demo Supplier QA')]")
	By supp_email = By.xpath("//label[contains(text(),'(test321@brandmuscle.com)')]")

	@Keyword
	public void ValidateUserOnWswAdminForDistributor()
	{
		try
		{
			action.WaitVisible(corpddn)
			action.WaitVisible(distributorddn)
			WebUI.delay(2)
			action.Click(corpddn)
			WebUI.delay(2)
			action.Click(distributorcorpval)
			WebUI.delay(4)
			action.Click(distributorddn)
			WebUI.delay(2)
			action.Click(distributorval)
			WebUI.delay(4)
			action.Click(groupddn)
			WebUI.delay(2)
			action.Click(distributorgroupval)
			action.WaitVisible(chicagobeverage)
			action.Click(chicagobeverage)
			action.IsElementDisplayed(email)

		}
		catch(Exception e)
		{
			Assert.fail("ValidateUserOnWswAdminForDistributor Failed due to "+e)
		}

	}

	@Keyword
	public void ValidateUserOnWswAdminForSupplier()
	{
		try
		{
			action.WaitVisible(corpddn)
			action.WaitVisible(distributorddn)
			WebUI.delay(2)
			action.Click(corpddn)
			WebUI.delay(2)
			action.Click(suppliercorpval)
			WebUI.delay(4)
			action.Click(groupddn)
			WebUI.delay(2)
			action.Click(suppliergroupval)
			action.WaitVisible(demoSuppQA)
			action.Click(demoSuppQA)
			action.IsElementDisplayed(supp_email)

		}
		catch(Exception e)
		{
			Assert.fail("ValidateUserOnWswAdminForSupplier Failed due to "+e)
		}

	}



}
