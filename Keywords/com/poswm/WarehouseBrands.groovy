package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class WarehouseBrands {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()




	@Keyword
	public void VerifyMenuLinkBrandPage() {

		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/Admin/WarehouseBrands.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/Admin/WarehouseBrands.aspx"
		String expectedPRODUrl = "https://csg.brandmuscle.net/Warehouse/Admin/WarehouseBrands.aspx";


		try{
			action.VerifyCurrentPage("WarehouseBrands.aspx")
		}
		catch(Exception e)
		{
			println ("Verify Menu Link Brand Page failed due to "+ e)
			Assert.fail()
		}
	}
}
