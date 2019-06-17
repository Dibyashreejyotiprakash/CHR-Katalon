package com.iiusersites

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
import com.utilities.Interactions
import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

class LoginPage {
	Interactions action = new Interactions()
	WebDriver driver = DriverFactory.WebDriver


	By InstantImpactLogo  = By.xpath("//*[containstext,'Instant Impact Login']")
	By loginUserName   =  By.xpath("//input[@id='UserName']" )
	By loginPassword  =   By.id("Password" )
	By loginButton   =  By.id("btnLogin")
	By lnkLougout   =  By.id("lbLogout")
	By ddlCorporation = By.xpath("//select[@id='ddlCorporation']")
	By ddlDistributor = By.xpath("//select[@id='ddlDistributer']")
	By btnAccept =  By.xpath("//input[@id='Body_btnAccept']")
	By imgDiageo =  By.xpath("//img[@id='imgCorporationLogo']")
	By PrivacyPolicy = By.xpath("(.//a[@class='GenericLink'])[2]")
	By LicenceAgreement = By.xpath("(.//a[@class='GenericLink'])[3]")
	By lnkForgotPassword = By.id("lbForgotPassword")
	By chkbxRememberme = By.xpath(".//*[@class='checkbox_text']")
	By txtSuccessMsgForgotPassword = By.xpath(".//*[@id='MainContent_lblErrorMessage']/span")
	By lnkHelp = By.linkText("HELP")
	By txbPasswordRecovery = By.id("PasswordRecoveryEmail")
	By btnSubmit = By.id("btnPasswordRecovery")
	By ValRememberMe = By.xpath(".//*[@class='form_value']")






	//Login
	def Login(String email, String password)
	{
		try
		{
			action.Type(loginUserName, email);
			action.Type(loginPassword, password);
			action.Click(loginButton);
			action.WaitForPageToLoad();

		}
		catch (Exception e)
		{
			println ("LoginToApplication failed due to: " + e);
			throw e;
		}
	}

	//Logout from application
	def Logout()
	{
		try
		{
			try
			{
				//obj_InstantImpact.lnkLougout.ScrollToViewElement();
				action.WaitTime(2);
				action.Click(lnkLougout);
				action.WaitTime(2);
				println ("Logout method executed");
			}
			catch(Exception e)
			{
				println ("Validation failed due to " + e);
				throw e;
			}
		}
		catch (Exception e)
		{
			println("Logout failed due to " + e);
			throw e;
		}
	}


}


