package com.wswadmin

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

public class TrainingResourcesPage {
	
	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();
	
	By corpoddn = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_Arrow']")
	By corpddnvalue = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_DropDown']//li[text()='300 - Instant Impact 4.0 Demo Corp (Dist.)']")
	By corptextbox = By.xpath("//*[@id='ctl00_cphMain_radCorpIDBox_Input']")
	By distddn = By.xpath("//*[@id='ctl00_cphMain_radDistributerID_Arrow']")
	By disttextbox = By.xpath("//*[@id='ctl00_cphMain_radDistributerID_Input']")
	By editlink = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00']//tr[1]//td[2]/a")
	
	By itemnametextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl05_radItemName']")
	By updatebtn = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl05_btnSave_input']")
	By updatemsg = By.xpath("//*[text()='Updated successfully']")
	
	@Keyword
	public void VerifyTrainingResourcesPage()
	{
		try{
			action.VerifyCurrentPage("TrainingResources.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Verify Training Resources page failed due to "+ e)
		}
	}
	
	@Keyword
	public void VerifyAllFields()
	{
		try{
			boolean statusofcorpddn = action.IsElementDisplayed(corpoddn)
			Assert.assertTrue(statusofcorpddn)
			
			boolean statusofdistddn = action.IsElementDisplayed(distddn)
			Assert.assertTrue(statusofdistddn)
		}
		catch(Exception e)
		{
			Assert.fail("Verify All Fields failed due to "+ e)
		}
	}
	
	@Keyword
	public void UpdateItemName()
	{
		try{
			action.Click(corpoddn)
			WebUI.delay(3)
			action.Type(corptextbox, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(corpddnvalue)
			action.Click(distddn)
			action.Type(disttextbox, "Chicago Beverage Systems")
			WebUI.delay(3)
			action.Click(editlink)
			action.TypeAndClear(itemnametextbox, "Test")
			action.Click(updatebtn)
			boolean statusofupdatemsg = action.IsElementDisplayed(updatemsg)
			Assert.assertTrue(statusofupdatemsg)
		}
		catch(Exception e)
		{
			Assert.fail("Verify Fields failed due to "+ e)
		}
	}
	
	
}
