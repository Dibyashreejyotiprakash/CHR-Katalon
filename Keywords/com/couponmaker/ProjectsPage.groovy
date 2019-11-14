package com.couponmaker

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

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ProjectsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By templatesearchbox = By.xpath("//*[@id='Body_TxtSearch']")
	By searchbtn = By.xpath("//*[@id='ctl00_Body_btnSearch']")
	By allsavedtemplatename = By.xpath("//*[@id='ctl00_Body_RadGridTemplate']//tr/td[5]")

	@Keyword
	public void VerifyProjectsPage() {
		try{
			action.VerifyCurrentPage("MyProjectsPage.aspx")
		}
		catch(Exception e) {
			println ("Verify Projects page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyFieldsInProjectsPage(String couponname) {
		try{
			boolean statusofsearchtextfield = action.IsElementDisplayed(templatesearchbox)
			Assert.assertTrue(statusofsearchtextfield)

			if(statusofsearchtextfield == true) {
				action.Type(templatesearchbox, couponname)
				WebUI.delay(5)
				boolean statusofsearchbtn = action.IsElementDisplayed(searchbtn)
				Assert.assertTrue(statusofsearchbtn)

				if(statusofsearchbtn == true) {
					action.Click(searchbtn)
					WebUI.delay(10)

					List<WebElement> alltemplatenames = action.GetElements(allsavedtemplatename)
					for(int i=0;i< alltemplatenames.size();i++) {
						if(alltemplatenames.get(i).getText().equals(couponname)) {
							println ("Coupon name found")
						}
						else{
							throw new Exception("Coupon templatenot found")
						}
					}
				}
				else{
					throw new Exception("Saerch button is not enabled")
				}
			}
			else{
				throw new Exception("Saerch text box is not enabled")
			}
		}
		catch(Exception e) {
			println ("Verify Fields In Projects Page failed due to "+ e)
			Assert.fail()
		}
	}
}
