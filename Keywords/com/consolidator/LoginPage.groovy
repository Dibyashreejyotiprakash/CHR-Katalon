package com.consolidator

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.utilities.Interaction


public class LoginPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By username = By.id("MainContent_LoginCentiv_UserName");
	By password = By.id("MainContent_LoginCentiv_Password");
	By loginbtn = By.xpath("//*[@id='MainContent_LoginCentiv_btnLogin']");
	By buselectionddn = By.id("MainContent_ddlBusinessUnit")
	By Logout = By.xpath("//*[text()='Logout']");







	@Keyword
	public void LoginConsolidator(String txtusername, String txtpassword) {


		action.Type(username, txtusername);
		action.Type(password, txtpassword);
		action.Click(loginbtn);
		action.WaitForPageToLoad();
		action.SelectByText(buselectionddn, "Admin Tool")
		action.WaitForPageToLoad();
	}


	@Keyword
	public void LogoutFromV5AdminTool(){
		try{
			if(action.IsElementDisplayed(Logout)){
				action.Click(Logout)
				action.WaitForPageToLoad();
				action.WaitVisible(loginbtn)
			}
		}
		catch(Exception e){
			println("LogoutFromV5AdminTool method failed due to : "+ e)
		}
	}
}
