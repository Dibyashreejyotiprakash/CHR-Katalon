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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import internal.GlobalVariable

public class ItemSearchpage {
	
	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()
	
	
	By corporationtextbox = By.xpath("//input[@value = 'Choose a Corporation']")
	By itemtypetextbox = By.xpath("//input[@value = 'Please select an Item Type']")
	By selectcorp = By.xpath("//em[contains(text(),'300')]")
	By selectitemtemplate = By.xpath("//li[contains(text(),'Template')]")
	By statusdropdown = By.xpath("//div[@id='ctl00_ctl00_cphMain_cphMain_rcbStatus']/span/button")
	By firstselectdata = By.xpath("(//a[text() = 'Select Data'])[1]")
	
	
	@Keyword
	public void openTemplateConfigurationPage(){
		
		action.Click(corporationtextbox)
		action.Type(corporationtextbox, "300")
		action.Click(selectcorp)
		action.Click(itemtypetextbox)
		action.Click(selectitemtemplate)
	}
		
}
	
	
	
	
}
