package com.iiadmin

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

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class UserSetUpEditPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By usermailtextbox = By.xpath("//*[@id='ctl00_Body_txtUserName']")
	By selectlinkfordemodist = By.xpath("//*[@id='ctl00_Body_gvCustomers']//tr[3]//td[1]/a[text()='Select']")
	By forcecccheckbox = By.xpath("//*[@id='ctl00_Body_fvCustomer_forceccCheckBox']")
	By updatebtn = By.xpath("//*[@id='ctl00_Body_fvCustomer_UpdateButton']")


	@Keyword
	public void SearchForDemoUserAndUpdateWithForceCC() {
		try{
			action.Type(usermailtextbox, GlobalVariable.iiusersiteusername)
			WebUI.delay(5)
			action.Enter(usermailtextbox)
			action.Click(selectlinkfordemodist)
			WebUI.delay(5)
			boolean statusofforcecccheckbox = action.IsElementSelected(forcecccheckbox)
			if(statusofforcecccheckbox == true) {
				action.ScrollToBottomOfPage()
				action.Click(updatebtn)
			}
			else{
				action.Click(forcecccheckbox)
				action.ScrollToBottomOfPage()
				action.Click(updatebtn)
			}
		}
		catch(Exception e) {
			Assert.fail("Search For Demo User And Update With Force CC")
		}
	}
}
