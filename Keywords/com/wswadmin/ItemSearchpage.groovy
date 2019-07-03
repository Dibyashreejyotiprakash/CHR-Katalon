package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

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
	By corporationname = By.xpath("//span[@id='cphMain_cphMain_lblCorporateInfo']")
	By brandnamecategory = By.xpath("//span[contains(text(),'Brand Name')]")
	By brandnamemetatagcount = By.xpath("//div[@id='10']")
	By selectcorp1 = By.xpath("//em[contains(text(),'276')]")
	By suppliercategory = By.xpath("(//span[contains(text(),'Supplier')])[3]")
	By suppliermetatagcount = By.xpath("//input[@id='65']")



	@Keyword
	public void openTemplateConfigurationPage(){

		action.Click(corporationtextbox)
		action.Type(corporationtextbox, "300")
		action.Click(selectcorp1)
		WebUI.delay(10)
		action.Click(itemtypetextbox)
		action.Click(selectitemtemplate)
		action.Click(firstselectdata)
		action.WaitVisible(corporationname)
	}

	@Keyword
	public void validateBrandnameCategory(){
		action.WaitVisible(brandnamecategory)
		WebUI.delay(5)
		action.ScrollToViewElement(brandnamemetatagcount)
		action.WaitVisible(brandnamemetatagcount)
		boolean status=action.IsElementDisplayed(brandnamemetatagcount)
		Assert.assertTrue(status, "true")
	}


	@Keyword
	public void openTemplateConfigurationPage1(){

		action.Click(corporationtextbox)
		action.Type(corporationtextbox, "276")
		action.Click(selectcorp1)
		WebUI.delay(10)
		action.Click(itemtypetextbox)
		action.Click(selectitemtemplate)
		action.Click(firstselectdata)
		action.WaitVisible(corporationname)
	}
	
	@Keyword
	public void validateSupplierCategory(){
		action.WaitVisible(suppliercategory)
		action.IsElementDisplayed(suppliercategory)		
	}
	
	
}




