package com.wswadmin

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
import org.testng.AssertJUnit

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class CategoryItemEditAndDeletePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By firstdeletelink = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00__0']//td[2]/a")
	By firsteditlink = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00__0']//td[1]/a")
	By deletesuccessfullmsg = By.xpath("//*[text()='You have successfully deleted the meta tag!']")
	By editpopup = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00_ctl05_ctl00']")
	By metatagtextbox = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00_ctl05_radExternalItem']")
	By metattagupdatebtn = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00_ctl05_btnSave_input']")
	By editsuccessfullmsg = By.xpath("//*[text()='You have successfully updated the meta tag description!']")
	By corpsearchtextbox = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00_ctl02_ctl03_FilterTextBox_corporationname']")
	By allcorporation = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00']/tbody/tr/td[3]")


	@Keyword
	public void VerifyCategoryItemEditDeletePage() {
		try{
			action.VerifyCurrentPage("CategoryItemEditDelete.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Category Item edit delete page failed due "+ e)
		}
	}

	@Keyword
	public void DeleteMetatag() {
		try{
			action.Click(firsteditlink)
			action.AcceptAlert()
			boolean statusofdeletedmsg = action.IsElementDisplayed(deletesuccessfullmsg)
			Assert.assertTrue(statusofdeletedmsg)
		}
		catch(Exception e) {
			Assert.fail("Delete Meta tag failed due "+ e)
		}
	}

	@Keyword
	public void EditMetatag() {
		try{
			action.Click(firsteditlink)
			boolean statusofeditpop = action.IsElementDisplayed(editpopup)
			Assert.assertTrue(statusofeditpop)

			if(statusofeditpop == true) {
				action.TypeAndClear(metatagtextbox, "Test Meta Tag")
				WebUI.delay(4)
				action.Click(metattagupdatebtn)
				WebUI.delay(4)

				boolean statusofedietdmsg = action.IsElementDisplayed(editsuccessfullmsg)
				Assert.assertTrue(statusofedietdmsg)
			}
			else{
				throw new Exception ("Edit pop up is not present")
			}
		}
		catch(Exception e) {
			Assert.fail("Delete Meta tag failed due "+ e)
		}
	}

	@Keyword
	public void VerifyCorporationSearch() {
		try{
			action.Type(corpsearchtextbox, "Instant Impact")
			action.Enter(corpsearchtextbox)
			List<WebElement> allcorporationnameingrid = action.GetElements(allcorporation)
			for(int i=0;i<allcorporationnameingrid.size();i++ ) {
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Corporation Search failed due "+ e)
		}
	}
}




