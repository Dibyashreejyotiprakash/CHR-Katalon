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
import org.openqa.selenium.WebElement
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ManageProgramElementPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By manageprogramelementsheader = By.xpath("//*[text()='Manage Program Elements']")
	By searchtxtbox = By.xpath("//*[@id='searchAddressforCompany']")
	By statusddn = By.xpath("//*[@class='btn btn-default full-width dropdown-toggle myStatusDropdown']")
	By programcoloumn = By.xpath("//*[@id='allProgramsList_wrapper']//thead/tr/th[2]")
	By startdatecolumn = By.xpath("//*[@id='allProgramsList_wrapper']//thead/tr/th[3]")
	By enddatecolumn = By.xpath("//*[@id='allProgramsList_wrapper']//thead/tr/th[4]")
	By statuscolumn = By.xpath("//*[@id='allProgramsList_wrapper']//thead/tr/th[5]")
	By firsteditlink = By.xpath("//*[@id='allProgramsList_wrapper']//tr[1]/td[6]/a")
	By allprogramelement = By.xpath("//*[@id='allProgramsList']//tr//td[2]//span[1]")
	By firstcheckbox = By.cssSelector("tbody > tr:nth-of-type(1) .check")
	By downloadlink = By.cssSelector("th#headerDownload > .btn-download")
	By yesbtn = By.xpath("//*[@id='ctl00_ctl00_MainContent_MainContent_rwSelectAlternate_C_btnAccept']")
	By nobtn = By.xpath("//*[@id='ctl00_ctl00_MainContent_MainContent_rwSelectAlternate_C_btnDeny']")
	By downloadprogramslabel = By.xpath("//*[text()='Download Programs']")



	@Keyword
	public void VerifyManageProgramElements() {
		try {
			action.VerifyCurrentPage("ConsolidatorManageProgramItem.aspx")
			boolean statusofheaderbar = action.IsElementDisplayed(manageprogramelementsheader)
			Assert.assertTrue(statusofheaderbar)
		}
		catch(Exception e) {
			println ("Verify Manage Program Elements failed due to "+ e)
			throw e;
		}
	}

	@Keyword
	public void VerifyAllCoulumns() {
		try {
			boolean statusofprogramcolumn = action.IsElementDisplayed(programcoloumn)
			Assert.assertTrue(statusofprogramcolumn)

			boolean statusofstartdatecolumn = action.IsElementDisplayed(startdatecolumn)
			Assert.assertTrue(statusofstartdatecolumn)

			boolean statusofenddatecolumn = action.IsElementDisplayed(enddatecolumn)
			Assert.assertTrue(statusofenddatecolumn)

			boolean statuscolumn = action.IsElementDisplayed(statuscolumn)
			Assert.assertTrue(statuscolumn)
		}
		catch(Exception e) {
			println ("Verify All Coulumns failed due to "+ e)
			throw e;
		}
	}


	@Keyword
	public void NavigateToConsolidatorEditProgramItemPage() {
		try {
			boolean statusoffirsteditlink = action.IsElementDisplayed(firsteditlink)
			if(statusoffirsteditlink == true) {
				boolean statusofenablefirsteditlink = action.IsElementEnabled(firsteditlink)
				if(statusofenablefirsteditlink == true) {
					action.Click(firsteditlink)
					action.WaitForPageToLoad()
					WebUI.delay(5)
				}
			}else{
				throw new Exception("First edit link disabled")
			}
		}
		catch(Exception e) {
			println ("Verify Manage Program Elements failed due to "+ e)
			throw e;
		}
	}

	@Keyword
	public void SearchPragramElement() {
		try{
			List<WebElement> allprogramelementsnames = action.GetElements(allprogramelement)
			int totalprogramelement = allprogramelementsnames.size()
			println ("Total Program element Name is ----"+ totalprogramelement)
			if(totalprogramelement >0) {
				for(int i=0;i< allprogramelementsnames.size();i++) {
					String firstprogramelementname =allprogramelementsnames.get(i).getText()
					println ("Program Element Name is ------"+ firstprogramelementname)
					action.Type(searchtxtbox, firstprogramelementname)
				}
			}
			else{
				throw new Exception("Program element is not present")
			}
		}
		catch(Exception e) {
			Assert.fail("Search program element failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnEdit() {
		try{
			List<WebElement> allprogramelements = action.GetElements(allprogramelement)
			int totalprogramelement = allprogramelements.size()
			if(totalprogramelement >0) {
				for(int i=0;i< allprogramelements.size();i++) {
					boolean statusoffirsteditlink = action.IsElementDisplayed(firsteditlink)
					if(statusoffirsteditlink == true) {
						boolean statusofenablefirsteditlink = action.IsElementEnabled(firsteditlink)
						if(statusofenablefirsteditlink == true) {
							action.Click(firsteditlink)
							action.WaitForPageToLoad()
							WebUI.delay(5)
						}
					}else{
						throw new Exception("First edit link disabled")
					}
				}
			}
			else{
				throw new Exception("Program element is not present")
			}
		}
		catch(Exception e) {
			Assert.fail("Click On Edit failed due to "+ e)
		}
	}
	
	@Keyword
	public void VerifyDownloadPopUp()
	{
		try{
			action.Click(firstcheckbox)
			action.Click(downloadlink)
			action.WaitVisible(downloadprogramslabel)
			boolean statusofdownloadprogramslabel = action.IsElementDisplayed(downloadprogramslabel)
			Assert.assertTrue(statusofdownloadprogramslabel)
			if(statusofdownloadprogramslabel == true)
			{
				boolean statusofyesbtn = action.IsElementEnabled(yesbtn)
				println ("Status of Yes Button ---"+ statusofyesbtn)
				Assert.assertTrue(statusofyesbtn)
				action.Click(yesbtn)
				
				boolean statusofnobtn = action.IsElementEnabled(nobtn)
				println ("Status of No Button ---"+ statusofnobtn)
				Assert.assertTrue(statusofyesbtn)
			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Download PopUp failed due to "+ e)
		}
	}
}
