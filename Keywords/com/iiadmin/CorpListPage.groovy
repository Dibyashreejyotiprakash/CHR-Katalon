package com.iiadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.stringtemplate.v4.compiler.STParser.element_return
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
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
import internal.GlobalVariable

public class CorpListPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By templatesearchtextbox  = By.xpath("//*[@id='ctl00_Body_txtItemFilter']")
	By filterbtn = By.xpath("//*[@id='ctl00_Body_btnItemFilter']")
	By firsttemplateid = By.xpath("//*[@id='ctl00_Body_gvItems']/tbody//tr[2]/td[1]")
	By firsteditlink = By.xpath("//*[@id='ctl00_Body_gvItems']/tbody//tr[2]/td[7]")
	By allstatus = By.xpath("//*[@id='ctl00_Body_gvItems']/tbody//tr/td[4]")
	By statusddn = By.xpath("//*[@id='ctl00_Body_ddlActive']")
	By itemeditor = By.xpath("//*[text()='ItemEditor']")
	By logostab = By.xpath("//*[text()='Logos']")
	By shapestab = By.xpath("//*[text()='Shapes']")
	By productshotstab = By.xpath("//*[text()='Product Shots']")
	By brandstab = By.xpath("//*[text()='Brands']")
	By addnewlogos = By.xpath("//*[@id='ctl00_Body_lbNew']")


	@Keyword
	public void VerifyGraphicsMaintenancePage() {
		try{
			action.VerifyCurrentPage("GraphicMaintenance.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Graphics Maintenance Page failed due to "+ e)
		}
	}

	@Keyword
	public void NavigateToCorp300() {
		String environment = GlobalVariable.environment
		try{
			WebUI.navigateToUrl("http://iiadmin.uat.brandmuscle.net/GraphicMaintenance/EditItems.aspx?CorpID=339")
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Navigate To Corp 339 failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyTemplateSearch() {
		try{
			action.Type(templatesearchtextbox, "130722")
			WebUI.delay(3)
			action.Click(filterbtn)
			WebUI.delay(3)
			String firstrowtemplateid = action.GetText(firsttemplateid)
			Assert.assertEquals(firstrowtemplateid, "130722")
		}
		catch(Exception e) {
			Assert.fail("Verify Template Search failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyFilterByStatusOfTemplate() {
		try{
			action.SelectByIndex(statusddn, 0)
			WebUI.delay(3)
			List<WebElement> allstatus = action.GetElements(allstatus)
			for(int i=0;i< allstatus.size();i++) {
				String status = allstatus.get(i).getText()
				WebUI.delay(3)
				if(status.equalsIgnoreCase("Active")) {
					println ("Status verified")
				}else{
					throw new Exception("Staus is not correct")
				}
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Status of template failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyEditTemplate() {
		try{
			action.Type(templatesearchtextbox, "130722")
			WebUI.delay(3)
			action.Click(filterbtn)
			WebUI.delay(3)
			String firstrowtemplateid = action.GetText(firsttemplateid)
			Assert.assertEquals(firstrowtemplateid, "130722")

			action.Click(firsteditlink)
			WebUI.delay(10)
			action.WaitForPageToLoad()

			action.VerifyCurrentPage("EditItems.aspx?CorpID=339")
		}
		catch(Exception e) {
			Assert.fail("Verify Template edit failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyItemEditLink() {
		try{
			boolean statusofitemeditor = action.IsElementEnabled(itemeditor)
			Assert.assertTrue(statusofitemeditor)

			action.Click(itemeditor)
			action.VerifyCurrentPage("EditItems.aspx?CorpID=339")
		}
		catch(Exception e) {
			Assert.fail("Verify Item Editor failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyLogosLink() {
		try{
			boolean statusoflogos = action.IsElementEnabled(logostab)
			Assert.assertTrue(statusoflogos)

			action.Click(logostab)
			action.VerifyCurrentPage("Logos.aspx?CorpID=339")
		}
		catch(Exception e) {
			Assert.fail("Verify Logos link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAddNewLogoLink() {
		try {
			boolean statusofaddnewlogolink = action.IsElementEnabled(addnewlogos)
			Assert.assertTrue(statusofaddnewlogolink)

			action.Click(addnewlogos)
		}
		catch(Exception e) {
			Assert.fail("Verify Add New Logo Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyShapesLink() {
		try{
			boolean statusofshapes = action.IsElementEnabled(shapestab)
			Assert.assertTrue(statusofshapes)

			action.Click(shapestab)
			action.VerifyCurrentPage("Shapes.aspx?CorpID=339")
		}
		catch(Exception e) {
			Assert.fail("Verify Shapes link failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyProductShots() {
		try{
			boolean statusofproductshots = action.IsElementEnabled(productshotstab)
			Assert.assertTrue(statusofproductshots)

			action.Click(productshotstab)
			action.VerifyCurrentPage("ProductShots.aspx?CorpID=339")
		}
		catch(Exception e) {
			Assert.fail("Verify ProductShots link failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyBrands() {
		try{
			boolean statusofbrands = action.IsElementEnabled(brandstab)
			Assert.assertTrue(statusofbrands)

			action.Click(brandstab)
			action.VerifyCurrentPage("Brands.aspx?CorpID=339")
		}
		catch(Exception e) {
			Assert.fail("Verify Brands link failed due to "+ e)
		}
	}
}
