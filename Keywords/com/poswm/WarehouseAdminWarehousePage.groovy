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

public class WarehouseAdminWarehousePage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By sitedropdown = By.xpath("//a[@id='ctl00_MainContent_ddlSites_Arrow']")
	By selectbin = By.xpath("//li[contains(text(),'Bin')]")
	By warehousedropdown = By.xpath("//a[@id='ctl00_MainContent_ddlWarehouse_Arrow']")
	By selectwarehouse = By.xpath("//li[contains(text(),'Breakthru Beverage Nevada')]")
	//By selectwarehouse = By.xpath("//li[contains(text(),'POS')]")
	By addbinplus = By.xpath("//input[@id='ctl00_MainContent_rgBins_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By binname = By.xpath("//input[@id='ctl00_MainContent_rgBins_ctl00_ctl02_ctl03_TB_WarehouseBinName']")
	By insertbtn = By.xpath("//a[@id='ctl00_MainContent_rgBins_ctl00_ctl02_ctl03_PerformInsertButton']")
	By binsuccessmssg = By.xpath("//span[contains(text(),'Warehouse Bin saved successfully')]")
	//By selectitem = By.xpath("//tr[@id='ctl00_MainContent_rgItemSearch_ctl00__0']/td[11]/a")
	By selectitem = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_ctl00']/tbody/tr[1]/td[3]/a")
	By edititem = By.xpath("//input[@id='MainContent_btnEditItemWizard']")
	By itemheading = By.xpath("//span[@id = 'ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_lblItemName']")
	By transcationdropdown = By.xpath(".//*[@id = 'ctl00_MainContent_radWizardBar']/ul/li[4]/a/span/span[1]")
	By addqntytobin = By.xpath("//button[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_RadButton22']")
	By selectbinwarehouse = By.xpath("//a[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemWarehouse_Arrow']")
	By selectbindropdown = By.xpath("//a[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemBin_Arrow']")
	By binitemlist = By.xpath("//div[@id = 'ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemBin_DropDown']//ul/li")
	By selectedbinqnty = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemQuantity']")
	By savebtn = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_btnSaveItemBin_input']")
	By validatebin = By.xpath("//span[contains(text(),'000-000-001')]")
	By nextbtn1 = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_btnNext']")
	By nextbtn2 = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i1_i0_ucItemImage_btnNext']")
	By nextbtn3 = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i2_i0_ucItemBrands_btnNext']")
	By closeeditmode = By.xpath("//input[@id='MainContent_btnCloseWizard']")
	By transferradiobtn = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_rblTransfer_2']")
	By originbindropdown = By.xpath("//a[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemAdjBinFrom_Arrow']")
	By originbinlist = By.xpath("//div[@id = 'ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemAdjBinFrom_DropDown']//ul/li/div/div[1]/span")
	By destinationbindropdown = By.xpath("//a[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemAdjBinTo_Arrow']")
	By destinationbinlist = By.xpath(".//*[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemAdjBinTo_DropDown']//ul/li")
	By transdropdown = By.xpath("//a[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemAdjType_Arrow']")
	By textarea = By.xpath("//textarea[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemAdjNotes']")
	By downSavebtn = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_btnSaveAdjustment_input']")
	By transcationvalue = By.xpath("//li[contains(text(),'Return')]")
	By quantitytotransfer = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i3_i0_ucItemTransactions_radItemAdjQuantity']")
	By transfersuccess = By.xpath("//div[contains(text(),'Quantity has been updated')]")
	By bintobedeleted = By.xpath("//td[contains(text(),'000-000-001')]//preceding-sibling::td[1]")
	By deletesuccess = By.xpath("//span[contains(text(),'Warehouse bin deleted successfully')]")
	
	
	@Keyword
	public void NavigatetoBinlist() {
		try {
			action.WaitVisible(sitedropdown)
			action.Click(sitedropdown)
			action.WaitVisible(selectbin)
			action.Click(selectbin)
			action.WaitVisible(warehousedropdown)
			action.Click(warehousedropdown)
			action.WaitVisible(selectwarehouse)
			action.Click(selectwarehouse)
			action.WaitVisible(addbinplus)
		}
		catch(Exception e) {
			Assert.fail("NavigatetoBinlist Failed due to "+e)
		}
	}

	@Keyword
	public String AddBin() {
		try {
			action.Click(addbinplus)
			action.WaitVisible(binname)
			String binName = "000-000-002"
			
			action.Type(binname, binName)
			//WebUI.delay(2)
			action.Click(insertbtn)
			action.WaitVisible(binsuccessmssg)
			return binName
		}
		catch(Exception e) {
			Assert.fail("AddBin Failed due to "+e)
		}
	}
	
	@Keyword
	public void AssociateBinWithItem(String binName)
	{
		try
		{
			action.WaitVisible(selectitem)
			action.Click(selectitem)
			WebUI.delay(2)
			Set<String> set =  driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			while(it.hasNext())
			{
				String parentwidowid = it.next()
				println ("Parent Window id is"+ parentwidowid)

 

				String childwindowid = it.next()
				println ("Child Window id is"+ childwindowid)

 

				driver.switchTo().window(childwindowid)
			}
			
			action.WaitVisible(edititem)
			action.Click(edititem)
			action.WaitVisible(itemheading)
			action.WaitVisible(nextbtn1)
			action.Click(nextbtn1)
			action.WaitVisible(nextbtn2)
			action.Click(nextbtn2)
			action.WaitVisible(nextbtn3)
			action.Click(nextbtn3)
			action.WaitVisible(addqntytobin)
			action.WaitVisible(selectbinwarehouse)
			action.Click(selectbinwarehouse)
			action.WaitVisible(selectwarehouse)
			action.Click(selectwarehouse)
			WebUI.delay(8)
			action.Click(selectbindropdown)
			WebUI.delay(5)
			
		  java.util.List<WebElement> item_list = action.GetElements(binitemlist)
		 // java.util.List<String> item_name_list = new ArrayList<String>()
		  
		  for(int i=0;i<item_list.size();i++)
		  {
			  String name = item_list.get(i).getText()
			  //item_name_list.add(name)
			 // println("NAME IS -->"+name)
			  
			  if(name.equalsIgnoreCase(binName))
			  {
				  println ("----------> Bin Verified Successfully---------")
				  /*item_list[i].click()
				  WebUI.delay(2)
				  action.Type(selectedbinqnty, "10")
				  action.Click(savebtn)*/
				  break
			  }
			  
			  
		  }
		  
		  action.Click(closeeditmode)
		  action.WaitVisible(edititem)
		  action.IsElementDisplayed(validatebin)
		  action.Click(edititem)
		  action.WaitVisible(itemheading)
		  action.WaitVisible(nextbtn1)
		  action.Click(nextbtn1)
		  action.WaitVisible(nextbtn2)
		  action.Click(nextbtn2)
		  action.WaitVisible(nextbtn3)
		  action.Click(nextbtn3)
		  action.WaitVisible(addqntytobin)
		  action.WaitVisible(transferradiobtn)
		  action.Click(transferradiobtn)
		  action.Click(originbindropdown)
		  WebUI.delay(3)
		  
		  java.util.List<WebElement> origin_List = action.GetElements(originbinlist)
		  java.util.List<String>origin_name = new ArrayList<String>()
		  
		  for(int i=0;i<origin_List.size();i++)
		  {
			  String name = origin_List.get(i).getText()
			  origin_name.add(name)
		  }
		  
		  for (int j=0;j<origin_name.size();j++)
		  {
			  String checkname = origin_name[j]
			  
			  if(checkname.contains("000-000-001"))
			  {
				  origin_List[j].click()
			  }
		  }
		  WebUI.delay(8)
		  action.Click(quantitytotransfer)
		  action.Type(quantitytotransfer, "10")
		  WebUI.delay(5)
		  action.Click(destinationbindropdown)
		  WebUI.delay(3)
		  java.util.List<WebElement> destination_bin = action.GetElements(destinationbinlist)
		  
		  destination_bin[5].click()
		  action.WaitVisible(transdropdown)
		  action.Click(transdropdown)
		  action.Click(transcationvalue)
		  WebUI.delay(2)
		  action.Click(textarea)
		  action.Type(textarea, "XXXXXYYY")
		  action.Click(downSavebtn)
		  action.WaitVisible(transfersuccess)
		  action.Click(closeeditmode)
		  action.WaitVisible(edititem)
		  
		}
		catch(Exception e)
		{
			Assert.fail("AssociateBinWithItem Failed due to "+e)
		}
		
	}
	
	@Keyword
	public void deletebin()
	{
		try
		{
			action.WaitVisible(bintobedeleted)
			action.Click(bintobedeleted)
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			WebUI.delay(2)
			action.WaitVisible(deletesuccess)
		}
		catch(Exception e)
		{
			Assert.fail("deletebin Failed due to "+e)
		}
	}
	
	
}
