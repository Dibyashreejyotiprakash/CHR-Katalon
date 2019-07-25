package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
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
import org.testng.Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import internal.GlobalVariable
import java.time.LocalTime
import java.security.Timestamp


public class GlobalMetataggingMaintenancePage {


	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()


	By addnewmetatagbtn = By.xpath("//button[contains(text(),'Add New Meta Tag')]")
	By addmetatagbtn = By.xpath("//input[@id='btnaddnew']")
	By newmetatagnamefield = By.xpath("//input[@id='txtaddmetatag']")
	By canceladdmetatagbtn = By.xpath("(//input[@class = 'btn-primary cancel-btn'])[2]")
	By deleteoption = By.xpath("//div[@id='divMenu']/div[contains(text(),'Delete')]")
	By confirmdeletecheckbox = By.xpath("//input[@id = 'deleteconfirm']//following-sibling::span[1]")
	By confirmdeletebtn = By.xpath("(//input[@value = 'Delete'])[2]")
	By deletesuccessmssg = By.xpath("//div[contains(text(),'deleted successfully')]")
	By elipssys = By.xpath("//span[@id='spnMenuIcon_506']")
	By globalsearchbox = By.xpath("//input[@id='txtSearch']")
	By renameoption = By.xpath("//div[@id='divMenu']/div[contains(text(),'Rename')]")
	By searchcategoryfield = By.xpath("//input[@placeholder = 'Search or Select Category']")
	By selectbrandcategory = By.xpath("//li[contains(text(),'Brand Name')]")
	By categorydropdown = By.xpath("//span[@id='select2-cphMain_ddlCategories-container']")
	By metatagcount = By.xpath("//label[@id='lblMetatagCount']")
	By sortoption = By.xpath("//label[contains(text(),'Sort by')]")
	By addmetatagsuccessmssg = By.xpath("//div[contains(text(),'has been added successfully')]")
	By specialcharactermetatag = By.xpath("//label[contains(text(),'Te@t')]")
	By specialmetatagelipssys = By.xpath("//span[@name = 'Te@t']")

	LocalTime currenttime = LocalTime.now()
	String newmetatagname = "Test"+ currenttime


	@Keyword
	public void selectCategory(){

		try {
			action.Click(categorydropdown)
			action.Click(searchcategoryfield)
			action.Type(searchcategoryfield, "Brand Name")
			WebUI.delay(3)
			action.Click(selectbrandcategory)
		}
		catch(Exception e) {
			Assert.fail("Not able to select category "+e)
		}
	}

	@Keyword
	public void globalMetataggingFieldValidation(){

		try {

			action.WaitVisible(addnewmetatagbtn)
			action.IsElementDisplayed(deleteoption)
			action.IsElementDisplayed(globalsearchbox)
			action.IsElementDisplayed(metatagcount)
			action.IsElementDisplayed(elipssys)
		}
		catch(Exception e) {
			Assert.fail("Field is missing"+e)
			throw e
		}
	}

	@Keyword
	public void addNewMetatag(){

		try {

			action.WaitVisible(metatagcount)
			action.WaitVisible(addnewmetatagbtn)
			action.Click(addnewmetatagbtn)
			println("New metatag name is "+newmetatagname)

			action.IsElementDisplayed(addmetatagbtn)
			action.IsElementDisplayed(canceladdmetatagbtn)
			action.IsElementDisplayed(newmetatagnamefield)
			/*LocalTime currenttime = LocalTime.now()
			 String newmetatagname = "Test"+ currenttime*/
			action.Type(newmetatagnamefield,newmetatagname)
			action.Click(addmetatagbtn)
			action.WaitVisible(addmetatagsuccessmssg)
		}
		catch(Exception e) {
			Assert.fail("Add New metatag failed "+e)
		}
	}


	@Keyword
	public void addSpecialCharacterGlobalMetatag(){

		try {

			action.WaitVisible(metatagcount)
			action.WaitVisible(addnewmetatagbtn)
			action.Click(addnewmetatagbtn)
			println("New metatag name is "+newmetatagname)

			action.IsElementDisplayed(addmetatagbtn)
			action.IsElementDisplayed(canceladdmetatagbtn)
			action.IsElementDisplayed(newmetatagnamefield)
			/*LocalTime currenttime = LocalTime.now()*/
			String newmetatagname = "Te@t"
			action.Type(newmetatagnamefield,newmetatagname)
			action.Click(addmetatagbtn)
			action.WaitVisible(addmetatagsuccessmssg)
		}
		catch(Exception e) {
			Assert.fail("addSpecialCharacterGlobalMetatag "+e)
		}
	}

	@Keyword
	public void ValidateDeleteSpecialCharacterGlobalMetatag(){

		try {
			WebUI.delay(8)
			action.Click(globalsearchbox)
			action.Type(globalsearchbox,"Te@t")
			WebUI.delay(5)
			action.WaitVisible(specialcharactermetatag)
			action.Click(specialmetatagelipssys)
			action.Click(deleteoption)
			action.Click(confirmdeletecheckbox)
			action.Click(confirmdeletebtn)
			action.WaitVisible(deletesuccessmssg)
		}
		catch(Exception e) {
			Assert.fail("ValidateDeleteSpecialCharacterGlobalMetatag "+e)
		}
	}
}