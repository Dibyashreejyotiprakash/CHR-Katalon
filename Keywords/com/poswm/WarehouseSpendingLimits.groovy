package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

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
import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class WarehouseSpendingLimits {


	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()
	
	
	
	
	
	By StateComplianceLebel2019 = By.xpath("//*[text()='2019 State Compliance']")
	By complianceLevelEditBtn = By.xpath("(//*[text()='Edit'])[2]")
	By ITEMStextBox = By.xpath("//*[@id='ctl00_MainContent_rgBudgetLevel_ctl00_ctl05_rcbWarehouseItems']/div/input")
	By UPDATEbtn = By.xpath("//*[@id='ctl00_MainContent_rgBudgetLevel_ctl00_ctl05_btnUpdateBL']")
	By FirstItemName = By.xpath("//*[@class='racSlide']/div/ul/li[1]")
	
	By ItemNameList = By.xpath("//*[@id='ctl00_MainContent_rgBudgetLevel_ctl00_ctl05_rcbWarehouseItems']//span")
	By Itenamremovelink = By.xpath("//*[@id='ctl00_MainContent_rgBudgetLevel_ctl00_ctl05_rcbWarehouseItems']//span/a")
	By warningMsg = By.xpath("//*[@id='ctl00_MainContent_radNotification_simpleContentDiv']/big")
	By warningMsgDiv = By.xpath("//*[@id='ctl00_MainContent_radNotification_popup']")
	
	
	
	
	
	
	@Keyword
	public void ClickOn2019Compliance()
	{
		try
		{
			action.Click(StateComplianceLebel2019)
			WebUI.delay(5)
		}
		catch(Exception e)
		{
			Assert.fail("ClickOn2019Compliance method failed due to : "+ e)
		}
	}
	
	@Keyword
	public void AddItemTotheComplianceLevel(String ItemName)
	{
		try
		{
			action.Click(complianceLevelEditBtn)
			WebUI.delay(5)
			action.Click(ITEMStextBox)
			action.Type(ITEMStextBox, ItemName)
			WebUI.delay(5)
			action.Click(FirstItemName)
			WebUI.delay(5)
			action.Click(UPDATEbtn)
			WebUI.delay(5)
			
		}
		catch(Exception e)
		{
			Assert.fail("AddItemTotheComplianceLevel method failed due to : "+ e)
		}
	}
	
	
	
	
	
	/*@Keyword
	public void RemoveItemTotheComplianceLevel(String GivenItemName)
	{
		try
		{
			action.Click(complianceLevelEditBtn)
			WebUI.delay(5)
			action.Click(ITEMStextBox)
			
			List<WebElement> itemnames = action.GetElement(ItemNameList)
			WebUI.delay(5)
			for(int i=0;i<= itemnames.size();i++ )
			{
				String displayeditemname = itemnames.get(i).getText()
				WebUI.delay(5)
				if(displayeditemname.equals(GivenItemName))
				{
					println "both are same " + displayeditemname
					List<WebElement> removebuttons = action.GetElement(Itenamremovelink)
					WebUI.delay(5)
					for(int j=0;j<= removebuttons.size();j++)
					{
						WebUI.delay(5)
						removebuttons.get(i).click()
						WebUI.delay(5)
					}
				}
			}
			
			action.Type(ITEMStextBox, GivenItemName)
			WebUI.delay(5)
			action.Click(FirstItemName)
			WebUI.delay(5)
			action.Click(UPDATEbtn)
			WebUI.delay(5)
			
		}
		catch(Exception e)
		{
			Assert.fail("AddItemTotheComplianceLevel method failed due to : "+ e)
		}
	}*/
	
	
	
	
	
	
	@Keyword
	public void RemoveItemTotheComplianceLevel()
	{
		try
		{
			action.Click(complianceLevelEditBtn)
			WebUI.delay(5)
			action.Click(ITEMStextBox)
			action.PreseLeftArrow(ITEMStextBox)
			action.PreseLeftArrow(ITEMStextBox)
			action.PreseBackSpace(ITEMStextBox)
			
			WebUI.delay(5)
			action.Click(UPDATEbtn)
			WebUI.delay(5)
		}
		catch(Exception e)
		{
			Assert.fail("RemoveItemTotheComplianceLevel method failed due to : "+ e)
		}
	}
	
	@Keyword
	public String  VerifySpendLimitWarningMsg()
	{
		try
		{
			boolean statusWarningMsg = action.IsElementDisplayed(warningMsgDiv)
			Assert.assertTrue(statusWarningMsg)
			String warningMsg = action.GetText(warningMsg)
			WebUI.delay(3)
			//println ("**************" + warningMsg + "****************")
			
			return warningMsg
			
		}
		catch(Exception e)
		{
			Assert.fail("VerifySpendLimitWarningMsg method failed due to : "+ e)
		}
	}
	
	
	
	

	@Keyword
	public void VerifyWarehouseSpendLimitPage() {
		try{
			action.VerifyCurrentPage("WarehouseSpendingLimits.aspx")
		}
		catch(Exception e) {
			println ("Verify Ware house Spend Limit Page failed due to "+ e)
			Assert.fail()
		}
	}
}
