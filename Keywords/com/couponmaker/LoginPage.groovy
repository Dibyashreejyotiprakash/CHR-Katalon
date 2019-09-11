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
import com.sun.xml.internal.ws.policy.spi.AssertionCreationException

import internal.GlobalVariable

public class LoginPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


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

	@Keyword
	public void VerifyLoginPage() {
		try{
			action.VerifyCurrentPage("Login.aspx")
		}
		catch(Exception e) {
			println ("Verify Login page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void LoginToDemoCorp(String demoemail, String demopassword) {
		try {
			action.Type(loginUserName, demoemail);
			action.Type(loginPassword, demopassword);
			action.Click(loginButton);
			action.WaitForPageToLoad();
			action.SelectByText(ddlCorporation, "Demo Supplier (QA)");
			action.Click(loginButton);
			WebUI.delay(15)
		}
		catch (Exception e) {
			println("Login To DemoCorp failed due to: " + e);
			throw e;
		}
	}
}
