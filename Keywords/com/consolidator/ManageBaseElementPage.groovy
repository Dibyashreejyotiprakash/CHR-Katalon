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
	//By allelementsname = By.xpath("//*[@id='allProgramsList']//tbody//tr//td[1]/label")
	//By firstelemnetname = By.xpath("//*[@id='allProgramsList']//tbody//tr[1]//td[1]/label")
	By allelementsname = By.xpath("//*[@id='allProgramsList']//tbody//tr//td[1]/label/span[2]")
	By firstelemnetname = By.xpath("(//*[@id='allProgramsList']//tbody//tr//td[1]/label/span[2])[1]")

	@Keyword
	public void VerifyManageBaseElementPage() {
		try{
			action.VerifyCurrentPage("ConsolidatorManageBaseElement.aspx")
			boolean statusofvisibility = action.IsElementDisplayed(managebaseelementlable)
			Assert.assertTrue(statusofvisibility)
		}
		catch(Exception e) {
			Assert.fail("Verify manage base element page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAddNewElementButton() {
		try{
			boolean statusofvisibility = action.IsElementDisplayed(addnewitembtn)
			Assert.assertTrue(statusofvisibility)
		}
		catch(Exception e) {
			Assert.fail("Verify Add New Element Button failed due to "+ e)
		}
	}

	@Keyword
	public void ClickAddNewElementButton() {
		try{
			boolean statusofvisibility = action.IsElementDisplayed(addnewitembtn)
			Assert.assertTrue(statusofvisibility)

			if(statusofvisibility == true) {
				action.Click(addnewitembtn)
				action.WaitForPageToLoad()
				////WebUI.delay(10)
			}
			else{
				throw new Exception ("Add new item button not available")
			}
		}
		catch(Exception e) {
			Assert.fail("Click Add New Element Button failed due to "+ e)
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
			Assert.fail("Verify All Coulumns failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyNavigationofEditBaseElementPage() {
		try{
			boolean statusoffirsteditlink = action.IsElementDisplayed(firsteditbtn)
			if(statusoffirsteditlink == true) {
				action.Click(firsteditbtn)
				action.WaitForPageToLoad()
				//WebUI.delay(5)
			}
			else{
				throw new Exception("First edit link is not there")
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Navigation of Edit Base Element Page failed due to "+ e)
		}
	}

	@Keyword
	public void SearchElement() {
		try{
			String elementname = null
			List<WebElement> elementnamesbeforesearch = action.GetElements(allelementsname)
			if(elementnamesbeforesearch.size() != 0) {
				//for(int i=0;i< elementnamesbeforesearch.size();i++) {
				elementname = elementnamesbeforesearch.get(0).getText()
				action.Type(searchtxtbox, elementname)
				//WebUI.delay(2)
				//wait.until(ExpectedConditions.presenceOfElementLocated(firstelemnetname));
				String aftersearchelementname = action.GetText(firstelemnetname)
				if(aftersearchelementname.contentEquals(elementname)) {
					println ("Element found")
				}
				else
				{
					throw new Exception("element not found")
				}
				//}
			}
			else
			{
				throw new Exception("No Element is available in the grid")
			}
		}
		catch(Exception e) {
			Assert.fail("Search Element failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnEditLink()
	{
		try{
			List<WebElement> elementnamesbeforesearch = action.GetElements(allelementsname)
			if(elementnamesbeforesearch.size() != 0)
			{
				action.Click(firsteditbtn)
				action.WaitForPageToLoad()
			}
			else{
				throw new Exception ("No element present in the grid")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Click On Edit Link failed due to "+ e)
		}
	}
}
