package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
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

public class ItemListOptionPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By bindingsbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_BindingButton_input']")
	By colorbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ColorButton_input']")
	By coloraddnewbtn = By.xpath("//*[@id='ctl00_cphMain_ColorGrid_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By cuttypesbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_CutTypeButton_input']")
	By formatmaterialbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_FormatMaterialButton_input']")
	By formatmaterialtype = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_FormatMaterialTypeButton_input']")
	By formatmaterialtypeaddnewbtn = By.xpath("//*[@id='ctl00_cphMain_MaterialTypeGrid_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By gluebtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_GlueButton_input']")
	By laminationsbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_LaminationButton_input']")
	By shipswithbaneersbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ShipsWithBannerButton_input']")
	By shipwithmarketskitsbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ShipsWithMarkerKitButton_input']")
	By shipswithshelfclipsbtn = By.xpath("//*[@id='ctl00_ctl00_cphMain_cphMain_ShipsWithShelfClipButton_input']")
	By addnewrecordbtn = By.xpath("//*[@id='BindingGrid_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By nametextbox = By.xpath("//*[@id='BindingGrid_ctl00_ctl02_ctl02_NameEditor']")
	By insertbtn = By.xpath("//*[@id='BindingGrid_ctl00_ctl02_ctl02_btnUpdate']")


	@Keyword
	public void VerifyItemListOptionsPage() {
		try{
			action.VerifyCurrentPage("Default.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Item List Options failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyBindingsBtnAndAddNewRecord() {
		try{
			boolean statusofbindingbtn = action.IsElementEnabled(bindingsbtn)
			Assert.assertTrue(statusofbindingbtn)
			
			println ("Status of bindings button ----"+ statusofbindingbtn)

			if(statusofbindingbtn == true) {
				action.Click(bindingsbtn)
				WebUI.delay(3)
				action.Click(addnewrecordbtn)
				WebUI.delay(3)
				action.Type(nametextbox,"Test")
				WebUI.delay(3)
				action.Click(insertbtn)
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Bindings Btn failed due to "+ e)
		}
	}
	
	
	@Keyword
	public void VerifyColoresbtn() {
		try{
			boolean statusofcolorbtn = action.IsElementEnabled(colorbtn)
			Assert.assertTrue(statusofcolorbtn)
			
			println ("Status of bindings button ----"+ statusofcolorbtn)

			if(statusofcolorbtn == true) {
				action.Click(colorbtn)
				WebUI.delay(3)
				
				driver.switchTo().frame("ItemColorGrid.aspx")
			}
			else{
				throw new Exception("Verify Colors btn failed")
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Colors Btn failed due to "+ e)
		}
	}
	
	@Keyword
	public void VerifyFormatMaterialTypebtnAndDeleteMatrailType() {
		try{
			boolean statusofmaterialsbtn = action.IsElementEnabled(formatmaterialbtn)
			Assert.assertTrue(statusofmaterialsbtn)
			
			println ("Status of bindings button ----"+ statusofmaterialsbtn)

			if(statusofmaterialsbtn == true) {
				action.Click(formatmaterialbtn)
				WebUI.delay(3)
				driver.switchTo().frame(0)
				action.Click(formatmaterialtypeaddnewbtn)
				WebUI.delay(3)
			}
			else{
				throw new Exception("Verify Format Material Type btn failed")
			}
		}
		catch(Exception e) {
			Assert.fail("Verify Format Material Type button and Delete failed due to "+ e)
		}
	}
	
}
