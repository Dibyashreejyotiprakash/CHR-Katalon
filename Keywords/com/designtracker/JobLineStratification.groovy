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



public class JobLineStratification {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By corpName = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By market = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By showretiredchkbox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_ckRetired']")
	By searchbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnSearch']")
	By insertbtn = By.xpath("(//a[contains(text(),'Insert')])[2]")
	By newstratification = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvStratificationDetail_txtRegionDescr']")
	By progressIndicator = By.xpath("//div[@id='ctl00_ctl00_cphProgressIndicator_pnlProgressIndicator']/div[2]")
	By stratInsert = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_fvStratificationDetail_InsertButton']")
	By stratsuccess = By.xpath("//li[contains(text(),'New stratification added')]")
	By stratificationlist = By.xpath("//table[@id='ctl00_ctl00_cphMain_cphMain_gvMarketStratification']/tbody/tr/td[3]")
	By editStrat = By.xpath("(//a[contains(text(),'Edit')])[1]")
	By retiredcheckbox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvStratificationDetail_ckRetired']")
	By updatebtn = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_fvStratificationDetail_UpdateButton']")
	By updatestrat = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvStratificationDetail_STRATIFICATIONTextBox']")
	By updatesuccess = By.xpath("//li[contains(text(),'Update Succeeded')]")
	By strataddedmsg = By.xpath("//*[text()='New stratification added.']")

	@Keyword
	public void VerifyJobLineStratificationPage(){
		try{
			action.VerifyCurrentPage("Administration/Market/MarketJobLineStratification.aspx")
		}
		catch(Exception e){
			Assert.fail("Verify Job Line Stratification Page Failed due to "+e)
		}
	}


	@Keyword
	public void JobStratificationValidateFields() {

		try {
			boolean statusofcorpddn = action.IsElementDisplayed(corpName)
			Assert.assertTrue(statusofcorpddn)
			
			boolean statusofmarketddn = action.IsElementDisplayed(market)
			Assert.assertTrue(statusofmarketddn)
			
			boolean statusofshowretirecheckbox = action.IsElementDisplayed(showretiredchkbox)
			Assert.assertTrue(statusofshowretirecheckbox)
			
			boolean statusofsearchbtn = action.IsElementDisplayed(searchbtn)
			Assert.assertTrue(statusofsearchbtn)
		}
		catch(Exception e) {
			Assert.fail("Job Stratification Validate Fields Failed due to "+e)
		}
	}


	@Keyword
	public void AddNewStratification() {
		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(searchbtn)
			action.Click(insertbtn)
			action.Click(newstratification)

			String s = action.GenerateRandomAplphabaticString(10)

			String strat_name = "TestStrat "+s

			action.Type(newstratification, strat_name)
			action.Click(stratInsert)

			action.ScrollToTopOgPage()

			boolean statusofstartaddedmsg = action.IsElementDisplayed(strataddedmsg)
			Assert.assertTrue(statusofstartaddedmsg)
		}
		catch(Exception e) {
			Assert.fail("Add New Stratification Failed due to "+e)
		}
	}

	@Keyword
	public void ValidateNewStratificationInList(String name) {
		try {
			List<WebElement>strat_list =   action.GetElements(stratificationlist)
			List<String> strat_name_List = new ArrayList<String>()
			for (int i=0;i<strat_list.size();i++) {
				println(strat_list[i].getText())
				strat_name_List.add(strat_list[i].getText())
			}

			if(strat_name_List.contains(name)) {
				println("Strat is present")
			}
			else {
				throw new Exception("Strat not present")
			}
		}
		catch(Exception e) {
			Assert.fail("Validate New Stratification In List Failed due to "+e)
		}
	}


	@Keyword
	public void ValidateInList() {
		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(searchbtn)
			action.Click(insertbtn)
			action.Click(newstratification)
			String s = action.GenerateRandomAplphabaticString(4)
			String strat_name = "TestStrat"+s

			action.Type(newstratification, strat_name)
			action.Click(stratInsert)
			ValidateNewStratificationInList(strat_name)
		}
		catch(Exception e) {
			Assert.fail("Validate In List Failed due to "+e)
		}
	}


	@Keyword
	public void EditStratification() {
		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(searchbtn)
			action.Click(editStrat)
			action.Click(retiredcheckbox)
			action.Click(updatebtn)
			action.ScrollToTopOgPage()
			boolean statusofeditstratmsg = action.IsElementDisplayed(updatesuccess)
			Assert.assertTrue(statusofeditstratmsg)
		}
		catch(Exception e) {
			Assert.fail("Edit Stratification Failed due to "+e)
		}
	}

	@Keyword
	public void UpdateStratification() {
		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(searchbtn)
			action.Click(editStrat)
			action.Clear(updatestrat)
			action.Type(updatestrat, "TestStrat")
			action.Click(updatebtn)
		}
		catch(Exception e) {
			Assert.fail("Update Stratification Failed due to "+e)
		}
	}
}
