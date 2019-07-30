package com.wswadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

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

//import internal.GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

public class CategoryMaintenancePage {

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()

	By corporationtextbox = By.xpath("//input[@value = 'Choose a Corporation']")
	By externalitemcorpsettingtab = By.xpath("//span[contains(text(),'Create External Item Corp Settings')]")
	By selectcorp = By.xpath("//em[contains(text(),'300')]")
	By addnewCorpsettingtab = By.xpath("//a[contains(text(),'Add New Corporate Setting')]")
	By descoverridetextbox = By.xpath("//input[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radDescription']")
	By externalitemdropdown = By.xpath("//a[@id='ctl00_cphMain_RadCategorySetting_ctl00_ctl02_ctl04_radExternalItemID_Arrow']")
	By categoryList = By.xpath("//ul[@class = 'rcbList']/li")


	@Keyword
	public void validateSupplierForNonMigrated(){


		action.Click(externalitemcorpsettingtab)
		action.WaitVisible(corporationtextbox,10)
		action.Click(corporationtextbox)
		action.Type(corporationtextbox, "300")
		action.Click(selectcorp)
		action.WaitVisible(addnewCorpsettingtab)
		action.Click(addnewCorpsettingtab)
		action.WaitVisible(externalitemdropdown)
		action.WaitVisible(descoverridetextbox)
		action.Click(externalitemdropdown)
		action.WaitVisible(categoryList)
		WebUI.delay(3)

		WebElement category_List = driver.findElement(By.xpath("//ul[@class = 'rcbList']"))
		List<WebElement> listElement = category_List.findElements(By.tagName('li'))

		println('No. of Elements' + listElement.size())

		for(int i=0;i<listElement.size();i++) {
			println(listElement.get(i).getText())

			if (!(listElement.get(i).getText().equalsIgnoreCase("Supplier"))) {

				println('Supplier is not present')
			}
			else {
				Assert.fail("Error:-Supplie is present");
			}
		}
	}
}
