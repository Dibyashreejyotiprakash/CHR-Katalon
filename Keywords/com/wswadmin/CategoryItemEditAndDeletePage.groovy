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
	By metatagdescriptionsearchbox = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00_ctl02_ctl03_FilterTextBox_Description']")
	By norecordsmesg = By.xpath("//*[text()='No records to display.']")
	By overridepopup = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00_ctl05_radExternalItem']")
	By firstmetatagdescription = By.xpath("//*[@id='ctl00_cphMain_RadCategoryMaintenance_ctl00__0']//td[5]")


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
	public void EditMetatag(String newlycreatedmetatag) {
		try{
			action.Type(metatagdescriptionsearchbox, newlycreatedmetatag)
			action.Enter(metatagdescriptionsearchbox)
			action.Click(firsteditlink)
			boolean statusofeditpop = action.IsElementDisplayed(editpopup)
			Assert.assertTrue(statusofeditpop)

			if(statusofeditpop == true) {
				action.TypeAndClear(metatagtextbox, "Test Meta Tag")
				//WebUI.delay(4)
				action.Click(metattagupdatebtn)
				//WebUI.delay(4)

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
	public void VerifyMetatagDescriptionSearch(String newlycreatedmetatag) {
		try{
			action.Type(metatagdescriptionsearchbox, newlycreatedmetatag)
			action.Enter(metatagdescriptionsearchbox)
			boolean statusoffirstmetatagdescription = action.IsElementDisplayed(firstmetatagdescription)
			Assert.assertTrue(statusoffirstmetatagdescription)
			String descriptionapperingaftersearch = action.GetText(firstmetatagdescription)
			if(descriptionapperingaftersearch.equals(newlycreatedmetatag)){
				println ("Newly created metatag searching verified")
			}else{
				Assert.fail("Newly created metatag not found "+ e1)
			}
		}
		catch(Exception e){
			Assert.fail("Verify Metatag Description Search failed due "+ e)
		}
	}

	@Keyword
	public void DeleteNewlyCreatedMetatag(String newlycreatedmetatag) {
		try{
			action.Type(metatagdescriptionsearchbox, newlycreatedmetatag)
			action.Enter(metatagdescriptionsearchbox)
			action.Click(firstdeletelink)
			action.AcceptAlert()
		}
		catch(Exception e) {
			Assert.fail("Delete Newly Created Metatag failed due "+ e)
		}
	}

	@Keyword
	public void VerifyDeletedNewlyCreatedMetatag(String newlycreatedmetatag) {
		try{
			action.TypeClear(metatagdescriptionsearchbox, newlycreatedmetatag)
			action.Enter(metatagdescriptionsearchbox)
			boolean statusofnorecordmsg = action.IsElementDisplayed(norecordsmesg)
			Assert.assertTrue(statusofnorecordmsg)
			if(statusofnorecordmsg == true){
				println ("Newly created metatag is deleted successfully")
			}else{
				throw new Exception("Not Deleted")
			}
		}
		catch(Exception e) {
			Assert.fail("Delete Newly Created Metatag failed due "+ e)
		}
	}
}




