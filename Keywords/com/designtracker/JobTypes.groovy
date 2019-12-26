package com.designtracker

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

import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.By
import org.testng.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class JobTypes {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By jobtypemarketheadre = By.xpath("//*[text()='Job Type Market']")
	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By jobtypename = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvMarketJobType_txtJobTypeName']")
	By createbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_fvMarketJobType_btnNewJobType']")
	By startnewjoblink = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_lbNewMarketJobType']")
	By jobtypenames = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_gvjobTypes']/tbody//td[3]")

	@Keyword
	public void VerifyJobTypePage() {
		try {
			String actualurl = action.GetCurrentURL();
			if(actualurl.contains("MarketJobType.aspx")) {
				println ("Page Verified")
				boolean statufofheader = action.IsElementDisplayed(jobtypemarketheadre)
				Assert.assertTrue(statufofheader)

				boolean statusofcorp = action.IsElementDisplayed(corpddn)
				Assert.assertTrue(statusofcorp)

				boolean statusofmarketddn = action.IsElementDisplayed(marketddn)
				Assert.assertTrue(statusofmarketddn)
			}
			else {
				Assert.fail();
			}
		}
		catch(Exception e) {
			println ("Verify Job Types Page failed due to "+ e)
			Assert.fail();
		}
	}

	@Keyword
	public void VerifyStartNewJobTypeLink() {
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			boolean statusofvisibiltyoflink = action.IsElementDisplayed(startnewjoblink)
			Assert.assertTrue(statusofvisibiltyoflink)

			boolean statusofenabilityoflink = action.IsElementDisplayed(startnewjoblink)
			Assert.assertTrue(statusofenabilityoflink)

			boolean
		}
		catch(Exception e) {
			println ("Verify Start New Job Type Link failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public String CreateNewJobType() {
		String newjobtypename = null;
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			newjobtypename = action.GenerateRandomAplphabaticString(5)
			action.Type(jobtypename, newjobtypename)
			action.Click(createbtn)
			return newjobtypename;
		}
		catch(Exception e) {
			println ("Create New Job Type failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyNewlyCreatedJobTypeInJobTypesgrid() {
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			List<WebElement> alljobtype = action.GetElements(jobtypenames)
			for(int i=0;i< alljobtype.size();i++) {
				String expectedjobtype = CreateNewJobType()
				println ("Newly created job "+ expectedjobtype)
				String actualjobtype = alljobtype.get(i).getText()
				println ("Actual Job Type is "+ actualjobtype)
				//WebUI.delay(5)
				if(actualjobtype.contains(expectedjobtype)) {
					println ("Newly Created Job Type is found "+ expectedjobtype)
					break
				}
				else {
					Assert.fail()
				}
			}
		}
		catch(Exception e) {
			println ("Failed due to "+ e)
			Assert.fail()
		}
	}
}



