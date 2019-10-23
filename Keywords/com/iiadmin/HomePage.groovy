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

public class HomePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By systemsetupandmaintenance = By.xpath("//*[text()='System Setup and Maintenance']")
	By operations = By.xpath("//*[text()='Operations']")
	By shippingagents = By.xpath("//*[text()='Shipping Agents']")
	By useraccessandcontrol = By.xpath("//*[text()='User Access and Control']")
	By users = By.xpath("//*[text()='Users']")
	By editusers = By.xpath("//*[text()='Edit User']")
	By systemsetup = By.xpath("//a[contains(text(),'System Setup and Maintenance')]")
	By corpsetup = By.xpath("//a[contains(text(),'Corporation Setup')]")
	By editcorp = By.xpath("//a[contains(text(),'Edit Corporation')]")
	By corpdropdown = By.xpath("//select[@id='ctl00_Body_ddlCorps']")
	By distsetup = By.xpath("//a[contains(text(),'Distributor Setup')]")
	By editdist = By.xpath("//a[contains(text(),'Edit Distributor')]")



	@Keyword
	public void VerifyHomePage() {
		try{
			action.VerifyCurrentPage("GraphicMaintenance.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Home Page failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnShippinAgents() {
		try{
			action.MouseHoverOnElement(systemsetupandmaintenance)
			WebUI.delay(10)
			action.MouseHoverOnElement(operations)
			WebUI.delay(10)
			action.Click(shippingagents)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Click on Shipping agents failed due to "+ e)
		}
	}

	@Keyword
	public void CLickOnEditUser() {
		try{
			action.MouseHoverOnElement(useraccessandcontrol)
			action.MouseHoverOnElement(users)
			action.Click(editusers)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("CLick On Edit User failed due to "+ e)
		}
	}

	@Keyword
	public void EditCorporation() {
		try {
			action.WaitVisible(systemsetup)
			action.Click(systemsetup)
			action.WaitVisible(corpsetup)
			action.Click(corpsetup)
			action.WaitVisible(editcorp)
			action.Click(editcorp)
		}
		catch(Exception e) {
			Assert.fail("EditCorporation failed due to "+ e)
		}
	}


	@Keyword
	public void EditDistributor() {
		try {
			action.WaitVisible(systemsetup)
			action.Click(systemsetup)
			action.WaitVisible(distsetup)
			action.Click(distsetup)
			action.WaitVisible(editdist)
			action.Click(editdist)
		}
		catch(Exception e) {
			Assert.fail("EditCorporation failed due to "+ e)
		}
	}
}
