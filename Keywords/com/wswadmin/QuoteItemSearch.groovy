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
import org.testng.Assert

//import internal.GlobalVariable

public class QuoteItemSearch
{

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()


	By mypendingitem = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_MyPendingButton_input']")
	By allitemIcreated = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_MySubmittedButton_input']")
	By mypendingestimationitem = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_MyEstimatorButton_input']")
	By allpendingitem = By.xpath("//input[@id = 'ctl00_ctl00_cphMain_cphMain_OpenEstimates_input']")
	By allitems = By.xpath("//input[@id = 'ctl00_ctl00_cphMain_cphMain_AllItemsButton_input']")
	By quoteid = By.xpath("//input[@id = 'ctl00_ctl00_cphMain_cphMain_QuoteIDSearchBox']")
	By dtjobid = By.xpath("//input[@id = 'ctl00_ctl00_cphMain_cphMain_DTJobIDSearchBox']")
	By checkallchkbox = By.xpath("//input[@id = '//input[@class = 'rlbCheckAllItemsCheckBox']")
	By performsearch = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_SearchButton_input']")
	By clearbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_ClearSearchButton_input']")
	By quoterecord = By.xpath("//a[contains(text(),'230397')]")
	By dtrecord = By.xpath("(//td[contains(text(),'2402881')])[1]")


	By quoteidtextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CloneQuoteIDEditor']")
	By clonequotebtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CloneQuoteButton_input']")
	By dtjobidtextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_DTNumberEditor']")
	By fillindtinfobtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_DTFillButton_input']")
	By cleardtbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_ClearDTButton_input']")
	By rpojectnametextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_ProjectNameEditor']")

	By lockcorpmarketbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_LockCorpMarketButton_input']")

	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_CorporationEditor_Arrow']")
	By corpddntextbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GeneralInfoControl_CorporationEditor_Input']")

	By firstquotelink = By.xpath("(//*[contains(@href,'QuoteDetails.aspx?quoteid=')])[1]")

	//By quoteeditlink = By.


	@Keyword
	public void VerifyRequestNewQuotePage()
	{
		try{
			action.VerifyCurrentPage("Default.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Verify Request New QuotePage")
		}
	}


	@Keyword
	public void ValidateTimeout()
	{

		try
		{
			action.Click(mypendingitem)
			action.Click(mypendingestimationitem)
			action.Click(allpendingitem)
			action.Click(clearbtn)
			action.Click(quoteid)
			action.Type(quoteid, "230397")
			action.Click(performsearch)
			action.IsElementDisplayed(quoterecord)
			action.Click(clearbtn)
			action.Click(dtjobid)
			action.Type(dtjobid, "2402881")
			action.Click(performsearch)
			action.IsElementDisplayed(dtrecord)
			action.Clear(clearbtn)

			action.Click(checkallchkbox)
			action.Click(performsearch)
		}
		catch(Exception e)
		{
			Assert.fail("ValidateTimeout Failed Due to "+e)
		}
	}

	@Keyword
	public void SearchQuote()
	{
		try{
			action.Click(firstquotelink)
			//WebUI.delay(10)
			Set<String> windowids = driver.getWindowHandles()
			Iterator<String> it = windowids.iterator()
			while (it.hasNext()) {
				String parentwindowid = it.next()
				println ("Parent Window id is "+ parentwindowid)

				String childwidowid = it.next()
				println ("Child Window id is "+ childwidowid)

				driver.switchTo().window(childwidowid)

				println ("Child window url ------"+ action.GetCurrentURL())
			}
		}
		catch(Exception e)
		{
			Assert.fail("Search Quote Failed Due to "+e)
		}
	}

}
