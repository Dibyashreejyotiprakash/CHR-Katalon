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



public class HierarchyPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By corpName = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By market = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By chicago_market_hierarchy = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_trvOrganizations_trvOrganizationt1']")
	By associateuserbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnAssociateUsers1']")
	By testusercheckbox = By.xpath("//label[contains(text(),'test123@brandmuscle.com')]//preceding-sibling::input")
	By progressIndicator = By.xpath("//div[@id='ctl00_ctl00_cphProgressIndicator_pnlProgressIndicator']/div[2]")
	By testusersuppcheckbox = By.xpath("//label[contains(text(),'test321@brandmuscle.com')]//preceding-sibling::input")
	By testemail = By.xpath("(//span[contains(text(),'test')])[1]")
	By mobiletesthierarchy = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_trvOrganizations_trvOrganizationt2']")
	By assigneduserssection = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_dlSelectedUsers']")

	@Keyword
	public void VerifyHierarchyPage() {
		try{
			action.VerifyCurrentPage("Administration/Market/OrganizationStructure.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Hierarchy Page Failed Due to "+e)
		}
	}

	@Keyword
	public void ValidateHierarchyPageFields() {
		try {
			action.IsElementDisplayed(corpName)
			action.IsElementDisplayed(market)
		}
		catch(Exception e) {
			Assert.fail("ValidateHierarchyPageFields Failed Due to "+e)
		}
	}

	@Keyword
	public void AssociateUser() {

		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(chicago_market_hierarchy)
			String val = action.Attribute(testusercheckbox, "checked")
			println("Checkbox value is "+val)

			if (val == "true") {
				println("inside if")
			}
			else {
				action.Click(testusercheckbox)
				action.Click(associateuserbtn)
			}
		}
		catch(Exception e) {
			Assert.fail("AssociateUser Failed Due to "+e)
		}
	}


	@Keyword
	public void AssociateUserForSupplier() {

		try {
			action.SelectByText(corpName, "Demo Supplier (QA)")
			action.SelectByText(market, "Demo Supplier (QA)")
			action.Click(chicago_market_hierarchy)
			String val = action.Attribute(testusersuppcheckbox, "checked")
			println("Checkbox value is "+val)

			if (val == "true") {
				println("inside if")
			}
			else {
				action.Click(testusercheckbox)
				action.Click(associateuserbtn)
			}
		}
		catch(Exception e) {
			Assert.fail("AssociateUser Failed Due to "+e)
		}
	}


	@Keyword
	public void ValidateNewAddedSalesPersonInHierarchyPage() {
		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(chicago_market_hierarchy)
			boolean statusoftestemial = action.IsElementDisplayed(testemail)
			Assert.assertTrue(statusoftestemial)
		}
		catch(Exception e) {
			Assert.fail("ValidateNewAddedSalesPersonInHierarchyPage Failed Due to "+e)
		}
	}

	@Keyword
	public void VerifyVisibiltyOfAssignedUsersToHierarchy() {
		try{
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(mobiletesthierarchy)
			boolean statusofassigneduserssection = action.IsElementDisplayed(assigneduserssection)
			Assert.assertTrue(statusofassigneduserssection)
			action.Click(mobiletesthierarchy)
			boolean statusofassigneduserssectionafterclickingonmobiletesthierarchy = action.IsElementDisplayed(assigneduserssection)
			Assert.assertTrue(statusofassigneduserssection)
		}
		catch(Exception e) {
			Assert.fail("Verify Visibilty Of Assigned Users To Hierarchy failed due to "+ e)
		}
	}
}


