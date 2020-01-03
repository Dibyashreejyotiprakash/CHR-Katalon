package com.poswm

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

import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.*;
import org.openqa.selenium.WebElement
import java.util.*


public class WarehouseAdminItemProperty {
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By itempropertydropdown = By.xpath("//a[@id='ctl00_MainContent_ddlTypes_Arrow']")
	By seasonaltype = By.xpath("//li[contains(text(),'SeasonalType')]")
	By addnewpropertyplus = By.xpath("//input[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By newpropertyname = By.xpath("//input[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl02_ctl03_TB_SearchPropertyOptionValue']")
	By insertbtn = By.xpath("//a[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl02_ctl03_PerformInsertButton']")
	By insertsuccessmssg = By.xpath("//span[@id='MainContent_msgPanel_lblSummary']")
	By itempropertysearch = By.xpath("//input[@id='ctl00_MainContent_txtSearch']")
	By searchbtn = By.xpath("//input[@id='ctl00_MainContent_btnSearch_input']")
	By clearbtn = By.xpath("//input[@id='ctl00_MainContent_btnClear_input']")
	By addedpropertyname = By.xpath("//tr[@id='ctl00_MainContent_rgAdminTypes_ctl00__0']/td[3]")
	By editbtn = By.xpath("//a[contains(text(),'Edit')]")
	By updatebtn = By.xpath("//a[contains(text(),'Update')]")
	By updatesuccessmssg = By.xpath("//span[contains(text(),'Item Property saved successfully')]")
	By deletebtn = By.xpath("//a[contains(text(),'Delete')]")
	By newitem = By.xpath("//span[contains(text(),'New Item')]")
	By seasonaltypedropdown = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSeasonalType_Input']")
	By seasonaltypelist = By.xpath("//div[@id = 'ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSeasonalType_DropDown']//ul/li")
	By deletesuccess = By.xpath("//span[contains(text(),'Item Property has successfully been deleted')]")
	By editpropertyname = By.xpath("//input[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl05_TB_SearchPropertyOptionValue']")
	By itemPropertySearchField = By.xpath("//*[@id='ctl00_MainContent_ddlTypes_Input']")
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	@Keyword
	public String CreateItemProperty() {
		try {
			//WebUI.delay(2)
			action.Click(itemPropertySearchField)   
			action.WaitVisible(itempropertydropdown)
			action.Click(itempropertydropdown)
			action.WaitVisible(seasonaltype)
			action.Click(seasonaltype)
			action.WaitVisible(itempropertysearch)
			action.Click(addnewpropertyplus)
			action.WaitVisible(newpropertyname)
			String name = action.GenerateRandomAplphabaticString(5)
			//String name = "TestProperty"
			action.Type(newpropertyname,name)
			action.Click(insertbtn)
			action.WaitVisible(insertsuccessmssg)
			return name
		}
		catch(Exception e) {
			Assert.fail("CreateItemProperty Failed due to "+e)
		}
	}

	@Keyword
	public void DeleteItemProperty(String propNme) {
		try {
			action.WaitVisible(itempropertydropdown)
			action.Click(itempropertydropdown)
			action.WaitVisible(seasonaltype)
			action.Click(seasonaltype)
			action.WaitVisible(itempropertysearch)
			action.Click(addnewpropertyplus)

			action.Type(itempropertysearch,propNme)
			action.Click(searchbtn)
			action.WaitVisible(deletebtn)
			action.Click(deletebtn)
			WebUI.delay(2)

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			WebUI.delay(2)
			action.WaitVisible(deletesuccess)
			action.IsElementDisplayed(deletesuccess)
		}
		catch(Exception e) {
			Assert.fail("DeleteItemProperty Failed due to "+e)
		}
	}

	@Keyword
	public void updateitemproperty() {
		try {
			//CreateItemProperty()
			//action.Type(itempropertysearch,"TestProperty")
			action.WaitVisible(itempropertydropdown)
			action.Click(itempropertydropdown)
			action.WaitVisible(seasonaltype)
			action.Click(seasonaltype)
			action.WaitVisible(itempropertysearch)
			action.Click(editbtn)
			action.WaitVisible(editpropertyname)
			action.Type(editpropertyname,"123")
			action.Click(updatebtn)
			action.WaitVisible(updatesuccessmssg)
			/*action.Type(itempropertysearch,"TestProperty123")
			 action.Click(deletebtn)
			 Robot robot = new Robot();
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 action.WaitVisible(deletesuccess)*/
		}
		catch(Exception e) {
			Assert.fail("updateitemproperty Failed due to "+e)
		}
	}


	@Keyword
	public void ValidateItemPropertyOnNewItem() {

		try {
			action.WaitVisible(seasonaltypedropdown)
			action.Click(seasonaltypedropdown)
			WebUI.delay(3)


			java.util.List<WebElement>item_name  = action.GetElements(seasonaltypelist)
			java.util.List<String> name_list = new ArrayList<String>()

			for(int i=0;i<item_name.size();i++) {
				String name = item_name.get(i).getText()
				name_list.add(name)
			}

			if(name_list.contains("TestProperty")) {
				println("Property present")
			}
			else {
				println("Property Not present")
			}
		}
		catch(Exception e) {
			Assert.fail("ValidateItemPropertyOnNewItem Failed due to "+e)
		}
	}
}
