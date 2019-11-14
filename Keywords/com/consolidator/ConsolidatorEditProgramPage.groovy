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
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory


public class ConsolidatorEditProgramPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By addnewelementbtn = By.xpath("//*[@class='btn btn-default primary-blue btn-label']")
	By backbtn = By.xpath("//*[@href='ConsolidatorManageProgramItem.aspx']")
	By firsteditlink = By.xpath("//*[@id='allProgramElements']//tr[1]/td[6]/a")
	By dleeteelementlink = By.xpath("//*[@class='remove full-width']")
	By viewdetailslink = By.xpath("//*[text()='View Details']")
	By pricetextbox = By.xpath("//*[@id='price']")
	By savechangesbtn = By.xpath("//*[@id='saveButton']")
	By confirmchangesbtn = By.xpath("//*[@id='updateButton']")
	By okbtn = By.xpath("//*[@id='btnCfmOk']")
	By deletelink = By.xpath("//*[@class='remove full-width']")
	By deletecheckbox = By.cssSelector(".check")
	By deletebtn = By.xpath("//*[@id='btnDeleteElement']")

	@Keyword
	public void VerifyEditProgramItemPage() {
		try{
			action.VerifyCurrentPage("ConsolidatorEditProgramItem.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Edit Program Item Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAddNewElementBtn() {
		try{
			boolean statusofaddnewelement = action.IsElementDisplayed(addnewelementbtn)
			if(statusofaddnewelement == true) {
				boolean isenabale = action.IsElementEnabled(addnewelementbtn)
				if(isenabale == true) {
					action.Click(addnewelementbtn)
					action.WaitForPageToLoad()
					WebUI.delay(10)
				}
			}
			else{
				throw new Exception("Add New Element is not enabled")
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Add New Element Btn failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyBackBtn() {
		try {
			boolean statusofbacklink = action.IsElementDisplayed(backbtn)
			if(statusofbacklink == true) {
				boolean statusofenablebacklink = action.IsElementEnabled(backbtn)
				Assert.assertTrue(statusofenablebacklink)
				action.Click(backbtn)
				action.WaitForPageToLoad()
				WebUI.delay(5)
			}
		}
		catch(Exception e) {
			println ( "Verify Back Btn failed due to "+ e)
			throw e
		}
	}

	@Keyword
	public void VerifyEditLink() {
		try {
			boolean statusoflink = action.IsElementDisplayed(firsteditlink)
			Assert.assertTrue(statusoflink)

			boolean statusenablelink = action.IsElementEnabled(firsteditlink)
			Assert.assertTrue(statusenablelink)

			if(statusenablelink == true) {
				action.Click(firsteditlink)
				action.WaitForPageToLoad()
				WebUI.delay(5)
			}
		}
		catch(Exception e) {
			println ( "Verify Edit Link failed due to "+ e)
			throw e
		}
	}

	@Keyword
	public void VerifyDeleteLink() {
		boolean statusofdeletelink = action.IsElementDisplayed(dleeteelementlink)
		Assert.assertTrue(statusofdeletelink)

		boolean statusofenabledeletelink = action.IsElementEnabled(dleeteelementlink)
		Assert.assertTrue(statusofenabledeletelink)

		if(statusofenabledeletelink == true) {
			action.Click(dleeteelementlink)
		}
	}

	@Keyword
	public void VerifyViewDetailsLink() {
		boolean statusofviewlink = action.IsElementDisplayed(viewdetailslink)
		Assert.assertTrue(statusofviewlink)

		boolean statusofenableviewlink = action.IsElementEnabled(viewdetailslink)
		Assert.assertTrue(statusofenableviewlink)
	}

	@Keyword
	public void EditFirstElement() {
		try{
			action.Click(firsteditlink)
			action.WaitForPageToLoad()
			action.TypeClear(pricetextbox, "10001")
			WebUI.delay(5)
			action.ScrollToBottomOfPage()
			boolean statusofsavechangesbtn = action.IsElementEnabled(savechangesbtn)
			Assert.assertTrue(statusofsavechangesbtn)
			if(statusofsavechangesbtn == true) {
				action.Click(savechangesbtn)
				action.Click(confirmchangesbtn)
				action.Click(okbtn)
			}
			else{
				throw new Exception ("Save Changes button is not enabled")
			}
		}
		catch(Exception e) {
			Assert.fail("Edit First Element failed due to "+ e)
		}
	}

	@Keyword
	public void DeleteElement() {
		try{
			action.Click(firsteditlink)
			action.WaitForPageToLoad()
			boolean statusofdeletelink = action.IsElementEnabled(deletelink)
			Assert.assertTrue(statusofdeletelink)
			if(statusofdeletelink == true) {
				action.Click(deletelink)
				WebUI.delay(5)
				action.Click(deletecheckbox)
				WebUI.delay(5)
				action.Click(deletebtn)
			}
		}
		catch(Exception e) {
			Assert.fail("Delete Element failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyDetailsLink() {
		try{
			action.Click(firsteditlink)
			action.WaitForPageToLoad()
			boolean statusofdetialslink = action.IsElementEnabled(viewdetailslink)
			Assert.assertTrue(statusofdetialslink)
			if(statusofdetialslink == true) {
				action.Click(viewdetailslink)
			}
		}
		catch(Exception e){
			Assert.fail("Verify Details Link failed due to "+ e)
		}
	}
}
