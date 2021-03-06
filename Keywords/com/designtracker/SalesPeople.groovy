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
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



public class SalesPeople {
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By corpName = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By market = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By saleperson = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlSalesPerson']")
	By addnewsalepersonbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_btnInsert']")
	By firstname = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_firstnameTextBox']")
	By lastname = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_lastnameTextBox']")
	By address1 = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtAddress1']")
	By address2 = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtAddress2']")
	By city = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtCity']")
	By state = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_ddlState']")
	By zip = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtZip']")
	By country = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_ddlCountry']")
	By phone = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_phoneTextBox']")
	By emailaddress = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_emailTextBox']")
	By password = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_passwordTextBox']")
	By salespersonid = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtcB2BUserID']")
	By costcentername = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtDTCostCenterName']")
	By costcenter = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtDTCostCenter']")
	By dtloginchkbox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_chkDTLoginOnly']")
	By dtemailflag = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_chkEmailNotify']")
	By realtimenotification = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_chkDTRealTimeNotifications']")
	By approvejobrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_0']")
	By brandmanagerrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_1']")
	By budgetmanagerrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_2']")
	By budgetrequestrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_1']")
	By financeialmanagerrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_4']")
	By reportuserrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_5']")
	By salesmanagerrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_6']")
	By salespersonrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_7']")
	By salespersondropdown = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_ddlDefaultLocations']")
	By insertbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_InsertButton']")
	By chicagobeveragegroup = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_organizations1_trvOrganizationt1']")
	By updatebtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_UpdateButton2']")
	By cancelbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_UpdateCancelButton2']")
	By requiredfieldmssg = By.xpath("(//span[contains(text(),'** Required Field')])[1]")
	By progressIndicator = By.xpath("//div[@id='ctl00_ctl00_cphProgressIndicator_pnlProgressIndicator']/div[2]")
	By testemail = By.xpath("(//span[contains(text(),'test')])[1]")
	By siteadmin = By.xpath("//*[text()='SITE']")
	By salespeople = By.xpath("//*[text()='SALES PEOPLE']")
	By salepersonList = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlSalesPerson']/option")
	By usertoupdate = By.xpath("//option[starts-with(text(),'AUTO')]")
	By updatesuccessmssg = By.xpath("//li[contains(text(),'The Sales Person has been updated.')]")
	By insertnewaddresslistlink = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_btnALInsert']")
	By listname = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_txtAddressListName']")
	By selectfilebtn = By.xpath("(//input[@class = 'ruButton ruBrowse'])[1]")
	By uploadaddresslistbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnSaveAddressList']")



	@Keyword
	public void VerifySalesPeoplePage() {
		try {
			action.VerifyCurrentPage("Administration/Market/SalesPeople.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Sales People Page Failed due to "+e)
		}
	}

	@Keyword
	public void ValidateSalesPeopleFields() {
		try {
			action.IsElementDisplayed(corpName)
			action.IsElementDisplayed(market)
			action.IsElementDisplayed(saleperson)
		}
		catch(Exception e) {
			Assert.fail("ValidateSalesPeopleFields Failed due to "+e)
		}
	}


	@Keyword
	public void ValidateMandatoryFieldForSalesPeople() {
		try {
			//action.IsElementDisplayed(corpName)
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			//action.WaitVisible(progressIndicator)
			action.SelectByText(market, "Chicago Beverage Systems")
			//action.WaitVisible(progressIndicator)
			action.Click(addnewsalepersonbtn)
			//action.IsElementDisplayed(insertbtn)
			action.Click(insertbtn)
			//action.IsElementDisplayed(requiredfieldmssg)
		}
		catch(Exception e) {
			Assert.fail("ValidateSalesPeopleFields Failed due to "+e)
		}
	}

	@Keyword
	public void AddNewSalesPeople() {
		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")

			action.Click(addnewsalepersonbtn)

			String s = action.GenerateRandomAplphabaNeumericString(10)
			String id = action.GenerateRandomNumericString(10)

			String name1 = "Test" + s
			String name2 = "Auto" + s
			String email = "test"+s+"@brandmuscle.com"
			String add1 = "4th Avenue"

			println("EMAIL IS "+email)

			action.Type(firstname, name1)
			action.Type(lastname, name2)
			action.Type(address1, add1)
			action.Type(city, "Cleveland")
			action.SelectByText(state, "OH")
			action.Type(zip, "44114")
			action.Type(phone, "976-976-7676")
			action.Type(emailaddress, email)
			action.Type(password, "go2web")
			action.Type(salespersonid,id)
			action.Click(brandmanagerrole)
			action.Click(chicagobeveragegroup)
			action.ScrollToBottomOfPage()
			action.SelectByText(salespersondropdown,"Default - 6250 N. River Rd Suite 9000, Rosemont, IL 60018")
			action.Click(insertbtn)
		}
		catch(Exception e) {
			Assert.fail("Add New Sales People Failed due to "+e)
		}
	}


	@Keyword
	public void ValidateNewSalePersonInSalePersonDD() {

		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(addnewsalepersonbtn)

			String s = action.GenerateRandomAplphabaNeumericString(4)
			String id = action.GenerateRandomNumericString(6)
			String name1 = "Test" + s
			String name2 = "Auto" + s
			String email = "test"+s+"@brandmuscle.com"
			String add1 = "4th Avenue"

			println("EMAIL IS "+email)

			action.Type(firstname, name1)
			action.Type(lastname, name2)
			action.Type(address1, add1)
			action.Type(city, "Cleveland")
			action.SelectByText(state, "OH")
			action.Type(zip, "44114")
			action.Type(emailaddress, email)
			action.Type(password, "go2web")
			action.Type(salespersonid,id)
			action.Click(brandmanagerrole)
			action.Click(chicagobeveragegroup)

			action.SelectByText(salespersondropdown,"Default - 6250 N. River Rd Suite 9000, Rosemont, IL 60018")
			action.Click(insertbtn)
			action.MouseHoverOnElement(siteadmin)
			action.Click(salespeople)
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.Click(saleperson)
		}
		catch(Exception e) {
			Assert.fail("Validate New Sale Person In Sale Person DD Failed due to "+e)
		}
	}


	@Keyword
	public void updateUser() {
		try {
			action.Click(budgetmanagerrole)
			action.ScrollToBottomOfPage()
			action.Click(updatebtn)
			boolean statuofupdatemsg = action.IsElementDisplayed(updatesuccessmssg)
			Assert.assertTrue(statuofupdatemsg)
		}
		catch(Exception e) {
			Assert.fail("updateUser Failed due to "+e)
		}
	}

	@Keyword
	public void InsertAddressList() {
		try {
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(market, "Chicago Beverage Systems")
			action.SelectByText(saleperson, "ADMIN2, TEST (testadmin2@brandmuscle.com)")
			action.ScrollToViewElement(insertnewaddresslistlink)
			action.Click(insertnewaddresslistlink)
			action.Type(listname, "TestFile")
			action.Click(selectfilebtn)
			uploadFile("D:\\Jeremy_Address_List.xls")
		}
		catch(Exception e) {
			Assert.fail("InsertAddressList Failed due to "+e)
		}
	}

	@Keyword
	public void uploadFile(String imagePath) {
		StringSelection stringSelection = new StringSelection(imagePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Robot robot = null;

		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		robot.delay(250);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
