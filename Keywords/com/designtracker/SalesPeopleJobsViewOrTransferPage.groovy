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
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
import org.testng.Assert

public class SalesPeopleJobsViewOrTransferPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By viewtransferheader = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_SectionHeader1_lblSectionHeader']")
	By corpddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By marketddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By actionddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlAction']")
	By grantforddn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlFromSalesPerson']")
	By toviewjobfor = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlToSalesPerson']")
	By includeinactiveusercheckbox = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_chkInactive']")
	By addnewbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_btnTransfer']")
	By addedrecord = By.xpath("//tr[@class = 'GridViewRow']//td[contains(text(),'ADMIN2, TEST')]")
	By deletebtn = By.xpath("(//a[contains(text(),'Delete')])[1]")
	


	@Keyword
	public void VerifyViewTransferPage() {
		try {
			String actualurl = action.GetCurrentURL()
			if(actualurl.contains("SalesPeopleJobsViewOrTransfer.aspx")) {
				boolean statusofheader = action.IsElementDisplayed(viewtransferheader)

				println ("Page is verified")
			}
			else {
				Assert.fail()
			}
		}
		catch(Exception e) {
			println ("Verify View Transfer Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAllFiledsInViewTransferPage() {
		try {
			boolean statusofcorpddn = action.IsElementDisplayed(corpddn)
			Assert.assertTrue(statusofcorpddn)

			boolean statusofmarketddn = action.IsElementDisplayed(marketddn)
			Assert.assertTrue(statusofmarketddn)

			boolean statusofactionddn = action.IsElementDisplayed(actionddn)
			Assert.assertTrue(statusofactionddn)

			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(5)

			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(5)

			action.SelectByText(marketddn, "View Jobs")
			WebUI.delay(5)
		}
		catch(Exception e) {
			println ("Verify All Fileds In View Transfer Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAddNewBtnWithoutSelectingUser() {
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(5)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(5)
			action.SelectByText(actionddn, "View Jobs")
			boolean statusofaddnewjob = action.IsElementEnabled(addnewbtn)
			Assert.assertFalse(statusofaddnewjob)
		}
		catch(Exception e) {
			println ("Verify Add New Button Without Selecting User failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAddNewBtnAfterSelectingUser() {
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(5)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(5)
			action.SelectByText(actionddn, "View Jobs")
			WebUI.delay(5)
			action.SelectByText(grantforddn, "ADMIN1, QA (qaadmin1@brandmuscle.com)")
			WebUI.delay(5)
			action.SelectByText(toviewjobfor, "ADMIN1, TEST (testadmin1@brandmuscle.com)")
			WebUI.delay(5)
			boolean statusofaddnewjob = action.IsElementEnabled(addnewbtn)
			Assert.assertTrue(statusofaddnewjob)
		}
		catch(Exception e) {
			println ("Verify Add New Button Without Selecting User failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void TransferJob() {
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(5)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(5)
			action.SelectByText(actionddn, "View Jobs")
			WebUI.delay(5)
			action.SelectByText(grantforddn, "ADMIN1, QA (qaadmin1@brandmuscle.com)")
			WebUI.delay(5)
			action.SelectByText(toviewjobfor, "ADMIN1, TEST (testadmin1@brandmuscle.com)")
			WebUI.delay(5)
			boolean statusofaddnewjob = action.IsElementEnabled(addnewbtn)
			Assert.assertTrue(statusofaddnewjob)
			action.Click(addnewbtn)
		}
		catch(Exception e) {
			println ("Transfer Job failed due to "+ e)
			Assert.fail()
		}
	}
	
	
	@Keyword
	public void VerifyUserDisplayOnceAdded() {
		try {
			action.SelectByText(corpddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			WebUI.delay(5)
			action.SelectByText(marketddn, "Chicago Beverage Systems")
			WebUI.delay(5)
			action.SelectByText(actionddn, "View Jobs")
			WebUI.delay(5)
			action.SelectByText(grantforddn, "ADMIN2, TEST (testadmin2@brandmuscle.com)")
			WebUI.delay(5)
			action.SelectByText(toviewjobfor, "ADMIN1, TEST (testadmin1@brandmuscle.com)")
			WebUI.delay(5)
			boolean statusofaddnewjob = action.IsElementEnabled(addnewbtn)
			Assert.assertTrue(statusofaddnewjob)
			action.Click(addnewbtn)
			action.WaitVisible(deletebtn)
			action.Click(deletebtn)
			
			
		}
		catch(Exception e) {
			println ("VerifyUserDisplayOnceAdded failed due to "+ e)
			Assert.fail()
		}
	}
	
}
