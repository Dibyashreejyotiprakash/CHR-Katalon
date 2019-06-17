package com.designtracker

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.FindBy

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectXpath
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.utilities.DemoInteractions
import com.utilities.Interactions
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

import org.openqa.selenium.By





public class LoginPage extends Interactions {

	DemoInteractions actions = new DemoInteractions()

	WebDriver driver = DriverFactory.getWebDriver()



	//def username = WS.sendRequest(findTestObject('Object Repository/DESIGNTRACKER/LoginPage/UserName'))

	//def username = WS.sendRequest(findTestObject('Object Repository/DESIGNTRACKER/LoginPage/UserName'))

	//TestObject username1= WebUI.findTestObject("Object Repository/DESIGNTRACKER/LoginPage/UserName")

	//By username = By.xpath("//*[@id='ctl00_cphMain_LoginCentiv_UserName']")

	//@FindBy(xpath="//*[@id='ctl00_cphMain_LoginCentiv_UserName']")



	@Keyword
	def LoginDesignTracker() {

		//actions.Type(username, "dibyashree.jyoti@brandmuscle.com")
		driver.findElement(By.xpath("//*[@id='ctl00_cphMain_LoginCentiv_UserName']")).sendKeys("dibyashree.jyoti@brandmuscle.com")
		driver.findElement(By.xpath("//*[@id='ctl00_cphMain_LoginCentiv_Password']")).sendKeys("dibya@1234")
		driver.findElement(By.xpath("//*[@id='ctl00_cphMain_LoginCentiv_LoginButton']")).click()

	}
}
