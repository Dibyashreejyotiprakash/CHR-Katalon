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
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ResourceMessage {
	
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()
	
	By resoucemessagelable = By.xpath("(//*[text()='Resource Message'])[2]")
	By corporationddn = By.xpath("//*[@id='ctl00_cphMain_rcbCorpId_Arrow']")
	By corptxtbox = By.xpath("//*[@id='ctl00_cphMain_rcbCorpId_Input']")
	By corporationddnvalue = By.xpath("//*[@id='ctl00_cphMain_rcbCorpId_DropDown']//li[280]")
	By distributorddn = By.xpath("//*[@id='ctl00_cphMain_rcbDistId_Arrow']")
	By distributortxtbox = By.xpath("//*[@id='ctl00_cphMain_rcbDistId_Input']")
	By distributorvalue = By.xpath("//*[@id='ctl00_cphMain_rcbDistId_DropDown']//li[text()='Demo Dist. Market #2 (QA)']")
	
	By resourcemessagetable = By.xpath("//*[@id='ctl00_cphMain_RadGridResource']")
	By firsteditlink = By.xpath("//*[@id='ctl00_cphMain_RadGridResource']//tr[1]/td[1]/a")
	
	By resorcespopup = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_ctl00']")
	By popupdescription = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_ctl00']//*[text()='Description:']")
	By popupdescoverride = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_ctl00']//*[text()='Description Override:']")
	By hideenlabel = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_ctl00']//*[text()='Hidden:']") 
	By trueradiobtn = By.xpath("//*[text()='True']/preceding-sibling::input")
	By falseradiobtn = By.xpath("//*[text()='False']/preceding-sibling::input")
	By updatebtn = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_btnSave_input']")
	By cancelbtn = By.xpath("//*[@id='ctl00_cphMain_RadGridResource_ctl00_ctl05_btnCancel_input']")
	
	
	@Keyword
	public void VerifyResourceMessagePage()
	{
		boolean statusofresoucelabel = action.IsElementDisplayed(resoucemessagelable)
		Assert.assertTrue(statusofresoucelabel)
	}
	
	@Keyword
	public void VerifyAllFieldsForResourceMessagePage()
	{
		boolean statusofcorpddn = action.IsElementDisplayed(corporationddn)
		Assert.assertTrue(statusofcorpddn)
		
		boolean statusofdistddn = action.IsElementDisplayed(distributorddn)
		Assert.assertTrue(statusofdistddn)
		
	}
	
	@Keyword
	public void VerifyResouceMessagePopup()
	{
		boolean statusofresourcemessagegrid = action.IsElementDisplayed(resourcemessagetable)
		if(statusofresourcemessagegrid == true)
		{
			boolean statusoffirstlink = action.IsElementEnabled(firsteditlink)
			if(statusoffirstlink == true)
			{
				action.Click(firsteditlink)
				WebUI.delay(8)
				boolean statusofresoucemsgpopup = action.IsElementDisplayed(resorcespopup)
				if(statusofresoucemsgpopup == true)
				{
					Assert.assertTrue(statusofresoucemsgpopup)
				}
			}
			else
			{
				Assert.fail()
			}
		}
		else
		{
			println ("Resource message grid is not present")
			Assert.fail()
		}
	}
	
	@Keyword
	public void VerifyAllFiledsInPopupMessage()
	{
		boolean statusofdesclbl = action.IsElementDisplayed(popupdescription)
		Assert.assertTrue(statusofdesclbl)
		
		boolean statusofdescoverridelbl = action.IsElementDisplayed(popupdescoverride)
		Assert.assertTrue(statusofdescoverridelbl)
		
		boolean statusofhidenlbl = action.IsElementDisplayed(hideenlabel)
		Assert.assertTrue(statusofhidenlbl)
		
		boolean statusoftrueradiobtnlbl = action.IsElementDisplayed(trueradiobtn)
		Assert.assertTrue(statusoftrueradiobtnlbl)
		
		boolean statusoffalseradiobtnlbl = action.IsElementDisplayed(falseradiobtn)
		Assert.assertTrue(statusoffalseradiobtnlbl)
		
		boolean statusofupdatebtn = action.IsElementDisplayed(updatebtn)
		Assert.assertTrue(statusofupdatebtn)
		
		boolean statusofcancelbtn = action.IsElementDisplayed(cancelbtn)
		Assert.assertTrue(statusofcancelbtn)
		
	}
}
