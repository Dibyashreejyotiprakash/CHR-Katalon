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

public class HomePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By posondemand = By.xpath("//*[text()='POS On Demand']")
	By postemplate = By.xpath("//*[text()='POS Templates']")
	By logoutlink = By.xpath("//*[@id='lbLogout']")
	By postemplateicon = By.xpath("//a[(@target='_self') and contains(text(),'POS Templates')]")
	By projectslink = By.xpath("//*[@id='projectsPageLink']")
	By accountslink = By.xpath("//*[@href='/Account/MyAccountPage.aspx']")
	By helplink = By.xpath("//*[@id='HelpPageLink']")


	@Keyword
	public void VerifyHomePage() {
		try{
			action.VerifyCurrentPage("Default.aspx")
		}
		catch(Exception e) {
			println ("Verify Home page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void Logout() {
		try{
			action.Click(logoutlink)
			action.WaitForPageToLoad()
			action.VerifyCurrentPage("Login.aspx")
		}
		catch(Exception e) {
			println ("Logout failed due to "+ e)
			Assert.fail()
		}
	}
	
	
	@Keyword
	public void VerifyAllAvailableLinks()
	{
		try{
			boolean statusofaccountlink = action.IsElementDisplayed(accountslink)
			Assert.assertTrue(statusofaccountlink)
			
			boolean statusofprojectslink = action.IsElementDisplayed(projectslink)
			Assert.assertTrue(statusofprojectslink)
			
			boolean statusofhelplink = action.IsElementDisplayed(helplink)
			Assert.assertTrue(statusofhelplink)
		}
		catch(Exception e) {
			println ("Verify All Available Links failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void ClickOnPosTemplate() {
		try{
			action.ScrollToBottomOfPage()
			WebUI.delay(5)
			action.Click(postemplateicon)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Pos Template failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnProjectsLink() {
		try{
			action.Click(projectslink)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On projects link failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void ClickOnCouponMakerButton() {
		try{
			action.Click(projectslink)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Coupon Maker Button failed due to "+ e)
			Assert.fail()
		}
	}
}
