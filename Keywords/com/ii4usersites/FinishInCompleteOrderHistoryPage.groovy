package com.ii4usersites

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
import org.openqa.selenium.WebElement
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class FinishInCompleteOrderHistoryPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()
	OrderFormDefaultPage ofdp = new OrderFormDefaultPage();


	By headerlabel = By.xpath("//*[text()='Select Job you would like to Complete']")
	By filteroptionsaccordion = By.xpath("//*[@class='accordion-toggle collapsed']")
	By firsteditbtn = By.xpath("//*[@id='ctl00_Body_grdJobs_ctl00_ctl04_lbtnSelect']")
	By deletebtn = By.xpath("//*[@id='ctl00_Body_grdJobs_ctl00_ctl04_lbtnDelete']")
	By backToOOFHomeBtn = By.xpath("//*[text()='Back to Online Order Form Home']")
	By numberOfIncompleteItems  = By.xpath("//strong[1]")
	By filterOptionsLink = By.xpath("//a[@href='#FilterPanel']")
	By orderTypeLabel = By.xpath("//label[text()='Order Type']")
	By clearBtn = By.xpath("//input[@value = 'Clear']")
	By filterBtn = By.xpath("//input[@value = 'Filter']")
	By accountfiterddnbtn = By.xpath("//*[@id='ctl00_Body_ddlAccount_Arrow']")
	By accountddnvalue = By.xpath("//*[@id='ctl00_Body_ddlAccount_DropDown']//li[text()='Test']")
	By accountype = By.xpath("//*[@id='ctl00_Body_grdJobs']//tr/td[4]")
	By ordertypeddn = By.xpath("//*[@id='ctl00_Body_ddlOrderType_Arrow']")
	By odrertypeddnvalue = By.xpath("//*[@id='ctl00_Body_ddlOrderType_DropDown']//li[text()='Accessories Only']")
	By ordertype = By.xpath("//*[@id='ctl00_Body_grdJobs']//tr/td[3]")

	@Keyword
	public void VerifyFinishInComplete() {
		try {
			boolean statusofheaderlabel = action.IsElementDisplayed(headerlabel)
			Assert.assertTrue(statusofheaderlabel)
		}
		catch(Exception e) {
			println ("Verify Finish InComplete failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyDeleteLink() {
		try {
			boolean statusofdeletelink = action.IsElementEnabled(deletebtn)
			Assert.assertTrue(statusofdeletelink)
		}
		catch(Exception e) {
			println ("Verify Delete Link failed due to "+ e)
		}
	}

	@Keyword
	public void DeleteLink() {
		try {
			action.Click(deletebtn)
			action.AcceptAlert()
		}
		catch(Exception e) {
			println ("Verify Delete Link failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyEditLink() {
		try {
			boolean statusoffirsteditlink = action.IsElementEnabled(firsteditbtn)
			Assert.assertTrue(statusoffirsteditlink)
		}
		catch(Exception e) {
			println ("Verify Edit Link failed due to "+ e)
		}
	}

	@Keyword
	public void Edit() {
		try {
			boolean statusoffirsteditlink = action.IsElementEnabled(firsteditbtn)
			Assert.assertTrue(statusoffirsteditlink)
			action.Click(firsteditbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Verify Edit Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyBackToOOFHome() {
		try {

			//boolean statusoffinishanIncompletedOrder = action.IsElementDisplayed(ofdp.finishincompletebtn)
			action.Click(backToOOFHomeBtn)
			action.WaitForPageToLoad()
			//Assert.assertTrue(statusoffinishanIncompletedOrder)
			Assert.assertTrue(action.IsElementDisplayed(ofdp.finishincompletebtn))
			println(ofdp.finishincompletebtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Verify Edit Link failed due to "+ e)
		}
	}

	@Keyword
	public int GetNumberOfItemsBeforeDelete() {
		try {
			action.WaitVisible(numberOfIncompleteItems)
			println(action.GetText(numberOfIncompleteItems))
			return Integer.parseInt(action.GetText(numberOfIncompleteItems))
		}
		catch(Exception e) {
			println ("Verify Edit Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyNumberOfItemsAfterDelete(int i) {
		try {
			//WebUI.delay(5)
			action.WaitVisible(numberOfIncompleteItems)
			println(action.GetText(numberOfIncompleteItems))
			Assert.assertEquals(i-1, Integer.parseInt(action.GetText(numberOfIncompleteItems)))
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Verify Edit Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyFilterOptions() {
		try {
			action.WaitForPageToLoad()
			action.Click(filterOptionsLink)
			action.WaitVisible(orderTypeLabel)
			Assert.assertEquals(true, action.IsElementDisplayed(filterBtn))
			Assert.assertEquals(true, action.IsElementDisplayed(clearBtn))
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Verify Edit Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAccountFiletr() {
		try {
			action.WaitUntilElementClickable(filterOptionsLink)
			action.Click(filterOptionsLink)
			action.WaitUntilElementClickable(accountfiterddnbtn)
			action.Click(accountfiterddnbtn)
			action.Click(accountddnvalue)
			action.Click(filterBtn)
			//WebUI.delay(5)
			List<WebElement> allaccountname = action.GetElements(accountype)
			for(int i=0;i< allaccountname;i++) {
				if((allaccountname.get(i).getText()).equalsIgnoreCase("test")) {
					println ("Account type filter verified")
				}
				else {
					Assert.fail()
				}
			}
		}
		catch(Exception e) {
			println ("Verify Account Filter failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyOrderTypeFiletr() {
		try {
			action.WaitUntilElementClickable(filterOptionsLink)
			action.Click(filterOptionsLink)
			action.WaitUntilElementClickable(ordertypeddn)
			action.Click(ordertypeddn)
			action.Click(odrertypeddnvalue)
			action.Click(filterBtn)
			//WebUI.delay(5)
			List<WebElement> allordertype = action.GetElements(ordertype)
			for(int i=0;i< allordertype;i++) {
				if((allordertype.get(i).getText()).equalsIgnoreCase("Accessories Only")) {
					println ("Order Type filter verified")
				}
				else {
					Assert.fail()
				}
			}
		}
		catch(Exception e) {
			println ("Verify Account Filter failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyClearButton() {
		try {
			action.WaitUntilElementClickable(filterOptionsLink)
			action.Click(filterOptionsLink)
			action.WaitUntilElementClickable(ordertypeddn)
			action.Click(ordertypeddn)
			action.Click(odrertypeddnvalue)
			action.Click(filterBtn)
			//WebUI.delay(5)
			action.Click(clearBtn)
		}
		catch(Exception e) {
			println ("Verify Account Filter failed due to "+ e)
		}
	}
}
