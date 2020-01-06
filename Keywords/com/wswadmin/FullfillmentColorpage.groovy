package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
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

public class FullfillmentColorpage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By addnewbtn = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By colornametextbox = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00_ctl02_ctl03_TB_ColorName']")
	By insertbtn = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00_ctl02_ctl03_PerformInsertButton']")

	By firstcolor = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00__0']/td[3]")
	By allcolornames = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00']/tbody/tr/td[3]")
	By colornamesearchtextfield = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00_ctl02_ctl02_FilterTextBox_ColorName']")
	By searchbtn = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00_ctl02_ctl02_Filter_ColorName']")

	By removebtn = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00_ctl04_gbcDeleteColumn']")
	By firsteditbtn = By.xpath("//*[@id='ctl00_cphMain_rgColor_ctl00_ctl04_EditButton']")
	By norecodrsfoundmsg = By.xpath("//*[text()='No records to display.']")



	@Keyword
	public void VerifyFullfillmentColorPage() {
		try{
			action.VerifyCurrentPage("FulfillmentColor.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Fullfillment Color Page failed due to "+ e)
		}
	}

	@Keyword
	public String AddNewColor() {

		String colorname = action.GenerateRandonString("7")
		try{
			action.Click(addnewbtn)
			//WebUI.delay(3)
			action.Type(colornametextbox,colorname)
			//WebUI.delay(3)
			action.Click(insertbtn)
			//WebUI.delay(3)

			return colorname
		}
		catch(Exception e) {
			Assert.fail("Create New Color failed due to "+ e)
		}
	}

	@Keyword
	public String DeleteColor() {

		String colorname = action.GenerateRandomAplphabaticString(7)
		try{
			action.Click(addnewbtn)
			//WebUI.delay(3)
			action.Type(colornametextbox,colorname)
			//WebUI.delay(3)
			action.Click(insertbtn)
			//WebUI.delay(3)
			action.Type(colornamesearchtextfield, colorname)
			//WebUI.delay(3)
			action.Click(searchbtn)
			//WebUI.delay(3)
			String firstcolorname = action.GetText(firstcolor)
			action.Click(removebtn)
			//WebUI.delay(3)
			action.AcceptAlert()
			//WebUI.delay(3)
			String msg = action.GetText(norecodrsfoundmsg)
			Assert.assertEquals(msg, "No records to display.")
			return colorname
		}
		catch(Exception e) {
			Assert.fail("Create New Color failed due to "+ e)
		}
	}


	@Keyword
	public void SearhColor() {
		try{
			String firstcolorname = action.GetText(firstcolor)
			//WebUI.delay(3)
			action.Type(colornamesearchtextfield, firstcolorname)
			//WebUI.delay(3)
			action.Click(searchbtn)

			List<WebElement> allcolornames = action.GetElements(allcolornames)
			for(int i=0;i< allcolornames.size();i++) {
				String appearedcolorname = allcolornames.get(i).getText()
				if(firstcolorname.equalsIgnoreCase(appearedcolorname)) {
					println ("Expected color name appeared")
				}
				else{
					throw new Exception ("Search failed")
				}
			}
		}
		catch(Exception e) {
			Assert.fail("Searh Color failed due to "+ e)
		}
	}
}
