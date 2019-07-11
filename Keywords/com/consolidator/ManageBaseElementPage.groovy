package com.consolidator

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

public class ManageBaseElementPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By managebaseelementlable = By.xpath("//*[text()='Manage Elements']")
	By searchtxtbox = By.xpath("//*[@id='searchAddressforCompany']")
	By addnewitembtn = By.xpath("//*[@href='ConsolidatorAddBaseElement.aspx']")
	By elementcolumn = By.xpath("//*[@id='allProgramsList']//tr[1]/th[1]")
	By pricecolumn = By.xpath("//*[@id='allProgramsList']//tr[1]/th[2]")
	By qtyperpackcolumn = By.xpath("//*[@id='allProgramsList']//tr[1]/th[3]")
	By estqtycolumn = By.xpath("//*[@id='allProgramsList']//tr[1]/th[4]")
	By estvrcoulmn = By.xpath("//*[@id='allProgramsList']//tr[1]/th[5]")
	By firsteditbtn = By.xpath("//*[@id='allProgramsList_wrapper']//tr[1]/td[6]/a")

	@Keyword
	public void VerifyManageBaseElementPage() {
		boolean statusofvisibility = action.IsElementDisplayed(managebaseelementlable)
		Assert.assertTrue(statusofvisibility)
	}

	@Keyword
	public void VerifyAddNewElementButton() {
		boolean statusofvisibility = action.IsElementDisplayed(addnewitembtn)
		Assert.assertTrue(statusofvisibility)
	}
	
	@Keyword
	public void ClickAddNewElementButton() {
		boolean statusofvisibility = action.IsElementDisplayed(addnewitembtn)
		Assert.assertTrue(statusofvisibility)
		
		if(statusofvisibility == true)
		{
			action.Click(addnewitembtn)
			action.WaitForPageToLoad()
		}
	}

	@Keyword
	public void VerifyAllCoulumns() {
		try {
			boolean statusofelementcolumn = action.IsElementDisplayed(elementcolumn)
			Assert.assertTrue(statusofelementcolumn)

			boolean statusofpricecolumn = action.IsElementDisplayed(pricecolumn)
			Assert.assertTrue(statusofpricecolumn)

			boolean statusofqtyperpackcolumn = action.IsElementDisplayed(qtyperpackcolumn)
			Assert.assertTrue(statusofqtyperpackcolumn)

			boolean estqtyperpackcolmn = action.IsElementDisplayed(estqtycolumn)
			Assert.assertTrue(estqtyperpackcolmn)
		}
		catch(Exception e) {
			println ("Verify All Coulumns failed due to "+ e)
			throw e;
		}
	}

	@Keyword
	public void VerifyNavigationofEditBaseElementPage() {
		boolean statusoffirsteditlink = action.IsElementDisplayed(firsteditbtn)
		if(statusoffirsteditlink == true) {
			action.Click(firsteditbtn)
			action.WaitForPageToLoad()
		}
	}
}
