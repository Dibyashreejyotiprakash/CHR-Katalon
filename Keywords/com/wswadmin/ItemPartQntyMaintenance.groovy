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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.testng.Assert

public class ItemPartQntyMaintenance {

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()


	By norecords = By.xpath("//div[contains(text(),'No records to display')]")
	By additempart = By.xpath("//input[@id='ctl00_cphMain_RadGridResource_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By itempartdropdown = By.xpath("//input[@id='ctl00_cphMain_RadGridResource_ctl00_ctl02_ctl03_radPartNumber_Input']")
	By itemList = By.xpath("//table[@id = 'ctl00_cphMain_RadGridResource_ctl00']//tbody/tr/td[5]")
	By product1 = By.xpath("//li[text()='CLV04']")
	By minqnty = By.xpath("//input[@id='ctl00_cphMain_RadGridResource_ctl00_ctl02_ctl03_txtMinQty']")
	By addbtn = By.xpath("//input[@id='ctl00_cphMain_RadGridResource_ctl00_ctl02_ctl03_btnSave_input']")

	@Keyword
	public void ValidatePart(){

		try {
			WebUI.delay(10)
			boolean grid_status = action.IsDisplayed(norecords)
			println("Grid Status "+grid_status)

			if(!grid_status) 
			{
				List<WebElement> part_List = action.GetElements(itemList)

				println("No. of Elements "+part_List.size())
				
				List<String> part_name = new ArrayList<String>()

				for (int i=0;i<part_List.size();i++)
				 {
					part_name.add(part_List[i].getText())
					println(part_name[i])
				}



				if(part_name.contains("CLV04")) 
				{
					
				}
				else
				{
					
					println("Inner else")
					action.Click(additempart)
					action.Click(itempartdropdown)
					action.Type(itempartdropdown, "CLV04")
					action.WaitVisible(product1)
					action.Click(product1)
					action.Click(minqnty)
					action.Type(minqnty, "10")
					WebUI.delay(2)
					action.Click(addbtn)
				}
			}
			else 
			{
				println("Outer else")
				action.Click(additempart)
				action.Click(itempartdropdown)
				action.Type(itempartdropdown, "CLV04")
				action.WaitVisible(product1)
				action.Click(product1)
				action.Click(minqnty)
				action.Type(minqnty, "10")
				WebUI.delay(2)
				action.Click(addbtn)
			}
		}
		catch(Exception e) {
			println("ValidatePart failed due to "+e)
			Assert.fail("ValidatePart failed due to")
		}
	}
}
