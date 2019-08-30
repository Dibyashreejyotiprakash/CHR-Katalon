package com.designtracker

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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.testng.Assert
import org.openqa.selenium.WebElement



public class JobLineStratification 
{
	
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()
	
	By corpName = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By market = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By showretiredchkbox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_ckRetired']")
	By searchbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_ckRetired']")
	By insertbtn = By.xpath("(//a[contains(text(),'Insert')])[2]")
	By newstratification = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvStratificationDetail_txtRegionDescr']")
	By progressIndicator = By.xpath("//div[@id='ctl00_ctl00_cphProgressIndicator_pnlProgressIndicator']/div[2]")
	By stratInsert = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_fvStratificationDetail_InsertButton']")
	By stratsuccess = By.xpath("//li[contains(text(),'New stratification added')]")
	By stratificationlist = By.xpath("//table[@id='ctl00_ctl00_cphMain_cphMain_gvMarketStratification']/tbody/tr/td[3]")
	
	@Keyword
	public void JobStratificationValidateFields()
	{
		
		try
		{
			action.IsElementDisplayed(corpName)
			action.IsElementDisplayed(market)
			action.IsElementDisplayed(showretiredchkbox)
			action.IsElementDisplayed(searchbtn)
		}
		catch(Exception e)
		{
			Assert.fail("JobStratificationValidateFields Failed due to "+e)
		}
	}
	
	
	@Keyword
	public void AddNewStratification()
	{
		try
		{
			action.IsElementDisplayed(corpName)
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.IsElementDisplayed(progressIndicator)
			WebUI.delay(2)
			action.SelectByText(market, "Chicago Beverage Systems")
			action.IsElementDisplayed(progressIndicator)
			WebUI.delay(2)
			action.Click(searchbtn)
			action.WaitVisible(insertbtn)
			action.Click(insertbtn)
			action.WaitVisible(newstratification)
			action.Click(newstratification)
			
			String s = action.GenerateRandomAplphabaticString(4)
			
			String strat_name = "TestStrat"+s
			
			action.Type(newstratification, strat_name)
			action.Click(stratInsert)
			action.WaitVisible(progressIndicator)
			action.WaitVisible(searchbtn)
			WebUI.delay(2)
			
			
			
			
		}
		catch(Exception e)
		{
			Assert.fail("AddNewStratification Failed due to "+e)
		}
	}
	
	@Keyword
	public void ValidateNewStratificationInList()
	{
		try
		{
			List<WebElement>strat_list =   action.GetElements(stratificationlist)
			
			List<String> strat_name_List = new ArrayList<String>()
			
			for (int i=0;i<strat_list.size();i++)
			{
				println(strat_list[i].getText())
				strat_name_List.add(strat_list[i].getText())
			}
			
			
		}
		catch(Exception e)
		{
			Assert.fail("ValidateNewStratificationInList Failed due to "+e)
		}
		
	}
	
}
