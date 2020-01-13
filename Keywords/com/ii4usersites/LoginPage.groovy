package com.ii4usersites

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.utilities.Interaction
import com.kms.katalon.core.webui.driver.DriverFactory
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

import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By


class LoginPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By InstantImpactLogo =By.xpath("//*[contains(text(),'Instant Impact Login')]")
	By loginUserName = By.xpath("//input[@id='UserName']")
	By loginPassword = By.id("Password")
	By loginButton = By.id("btnLogin")
	By lnkLougout = By.id("lbLogout")
	By ddlCorporation = By.xpath("//select[@id='ddlCorporation']")
	By ddlDistributor = By.xpath("//select[@id='ddlDistributer']")
	By btnAccept = By.xpath("//input[@id='Body_btnAccept']")
	By imgDiageo = By.xpath("//img[@id='imgCorporationLogo']")
	By PrivacyPolicy = By.xpath("(.//a[@class='GenericLink'])[2]")
	By LicenceAgreement = By.xpath("(.//a[@class='GenericLink'])[3]")
	By lnkForgotPassword = By.id("lbForgotPassword")
	By chkbxRememberme = By.xpath(".//*[@class='checkbox_text']")
	By txtSuccessMsgForgotPassword = By.xpath(".//*[@id='MainContent_lblErrorMessage']/span")
	By lnkHelp = By.linkText("HELP")
	By txbPasswordRecovery = By.id("PasswordRecoveryEmail")
	By btnSubmit = By.id("btnPasswordRecovery")
	By ValRememberMe = By.xpath(".//*[@class='form_value']")



	//Login with Demo Corp-339
	@Keyword
	public void LoginToDemoCorp(String demoemail, String demopassword)
	{
		try
		{
			action.Type(loginUserName, demoemail);
			action.Type(loginPassword, demopassword);
			action.Click(loginButton);
			action.WaitForPageToLoad();
			action.SelectByText(ddlCorporation, "Demo Distributor (QA)");
			action.SelectByText(ddlDistributor, "Demo Dist. Market #1 (QA)");
			action.Click(loginButton);

		}
		catch (Exception e)
		{
			println("Login To DemoCorp failed due to: " + e);
			throw e;
		}
	}


	@Keyword
	public void LoginToDiageo(String username,String password)
	{
		try
		{
			action.Type(loginUserName, username);
			action.Type(loginPassword, password);
			action.Click(loginButton);
			action.WaitForPageToLoad();
		}
		catch (Exception e)
		{
			println("Login To Diageo failed due to: " + e);
			throw e;
		}
	}


	@Keyword
	public void LoginToInstantImpactDist(String demoemail, String demopassword)
	{
		try
		{
			action.Type(loginUserName, demoemail);
			action.Type(loginPassword, demopassword);
			action.Click(loginButton);
			action.WaitForPageToLoad();
			action.SelectByText(ddlCorporation, "Instant Impact 4.0 Demo Corp (Dist.)");
			//WebUI.delay(3)
			action.SelectByText(ddlDistributor, "Chicago Beverage Systems");
			action.Click(loginButton);

		}
		catch (Exception e)
		{
			println("Login To DemoCorp failed due to: " + e);
			throw e;
		}
	}
	
	@Keyword
	public void LoginToInstantImpactSupp(String demoemail, String demopassword)
	{
		try
		{
			action.Type(loginUserName, demoemail);
			action.Type(loginPassword, demopassword);
			action.Click(loginButton);
			action.WaitForPageToLoad();
			action.SelectByText(ddlCorporation, "Instant Impact 4.0 Demo Corp (Supp.)");
			WebUI.delay(3)
			action.Click(loginButton);

		}
		catch (Exception e)
		{
			println("Login To DemoCorp failed due to: " + e);
			throw e;
		}
	}

}
