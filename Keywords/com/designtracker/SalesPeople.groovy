package com.designtracker

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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.testng.Assert
import org.openqa.selenium.WebElement



public class SalesPeople {
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By corpName = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlCorporation']")
	By market = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlMarket']")
	By saleperson = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlSalesPerson']")
	By addnewsalepersonbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_btnInsert']")
	By firstname = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_firstnameTextBox']")
	By lastname = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_lastnameTextBox']")
	By address1 = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtAddress1']")
	By address2 = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtAddress2']")
	By city = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtCity']")
	By state = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_ddlState']")
	By zip = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtZip']")
	By country = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_ddlCountry']")
	By phone = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_phoneTextBox']")
	By emailaddress = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_emailTextBox']")
	By password = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_passwordTextBox']")
	By salespersonid = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtcB2BUserID']")
	By costcentername = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtDTCostCenterName']")
	By costcenter = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_txtDTCostCenter']")
	By dtloginchkbox = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_chkDTLoginOnly']")
	By dtemailflag = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_chkEmailNotify']")
	By realtimenotification = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_chkDTRealTimeNotifications']")
	By approvejobrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_0']")
	By brandmanagerrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_1']")
	By budgetmanagerrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_2']")
	By budgetrequestrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_1']")
	By financeialmanagerrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_4']")
	By reportuserrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_5']")
	By salesmanagerrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_6']")
	By salespersonrole = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_roleList_7']")
	By salespersondropdown = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_ddlDefaultLocations']")
	By insertbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_InsertButton']")
	By chicagobeveragegroup = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_organizations1_trvOrganizationt1']")
	By updatebtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_UpdateButton2']")
	By cancelbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvSalesPerson_UpdateCancelButton2']")
	By requiredfieldmssg = By.xpath("(//span[contains(text(),'** Required Field')])[1]")
	By progressIndicator = By.xpath("//div[@id='ctl00_ctl00_cphProgressIndicator_pnlProgressIndicator']/div[2]")
	By testemail = By.xpath("(//span[contains(text(),'test')])[1]")
	By siteadmin = By.xpath("//*[text()='SITE']")
	By salespeople = By.xpath("//*[text()='SALES PEOPLE']")
	By salepersonList = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarkets_ddlSalesPerson']/option")
	By usertoupdate = By.xpath("//option[starts-with(text(),'AUTO')]")
	By updatesuccessmssg = By.xpath("//li[contains(text(),'The Sales Person has been updated.')]")

	@Keyword
	public void ValidateSalesPeopleFields() {
		try {
			action.IsElementDisplayed(corpName)
			action.IsElementDisplayed(market)
			action.IsElementDisplayed(saleperson)
		}
		catch(Exception e) {
			Assert.fail("ValidateSalesPeopleFields Failed due to "+e)
		}
	}
	
	
	@Keyword
	public void ValidateMandatoryFieldForSalesPeople() {
		try {
			action.IsElementDisplayed(corpName)
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.WaitVisible(progressIndicator)
			WebUI.delay(2)
			action.SelectByText(market, "Chicago Beverage Systems")
			action.WaitVisible(progressIndicator)
			WebUI.delay(2)
			action.Click(addnewsalepersonbtn)
			action.IsElementDisplayed(insertbtn)
			action.Click(insertbtn)
			action.IsElementDisplayed(requiredfieldmssg)
			
		}
		catch(Exception e) {
			Assert.fail("ValidateSalesPeopleFields Failed due to "+e)
		}
	}
	
	@Keyword
	public void AddNewSalesPeople()
	{
		try
		{
			action.IsElementDisplayed(corpName)
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.WaitVisible(progressIndicator)
			WebUI.delay(5)
			action.SelectByText(market, "Chicago Beverage Systems")
			action.WaitVisible(progressIndicator)
			WebUI.delay(2)
			
			action.Click(addnewsalepersonbtn)
			action.WaitVisible(firstname)
			
			String s = action.GenerateRandomAplphabaNeumericString(4) 
			String id = action.GenerateRandomNumericString(6)
			String name1 = "Test" + s
			String name2 = "Auto" + s
			String email = "test"+s+"@brandmuscle.com"
			String add1 = "4th Avenue"
			
			println("EMAIL IS "+email)
			
			action.Type(firstname, name1)
			action.Type(lastname, name2)
			action.Type(address1, add1)
			action.Type(city, "Cleveland")
			action.SelectByText(state, "OH")
			action.Type(zip, "44114")
			action.Type(phone, "976-976-7676")
			action.Type(emailaddress, email)
			WebUI.delay(2)
			action.Type(password, "go2web")
			action.Type(salespersonid,id)
			action.Click(brandmanagerrole)
			action.Click(chicagobeveragegroup)
			action.IsElementDisplayed(progressIndicator)
			action.IsElementDisplayed(testemail)
			action.SelectByText(salespersondropdown,"Default - 6250 N. River Rd Suite 9000, Rosemont, IL 60018")
			action.Click(insertbtn)
			action.IsElementDisplayed(updatebtn)
			
			
		}
		catch(Exception e)
		{
			Assert.fail("AddNewSalesPeople Failed due to "+e)
		}
		
		
	}
	
	
	@Keyword
	public void ValidateNewSalePersonInSalePersonDD()
	{
		
		try
		{
		    action.IsElementDisplayed(corpName)
			action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.WaitVisible(progressIndicator)
			WebUI.delay(5)
			action.SelectByText(market, "Chicago Beverage Systems")
			action.WaitVisible(progressIndicator)
			WebUI.delay(2)
			
			action.Click(addnewsalepersonbtn)
			action.WaitVisible(firstname)
			
			String s = action.GenerateRandomAplphabaNeumericString(4) 
			String id = action.GenerateRandomNumericString(6)
			String name1 = "Test" + s
			String name2 = "Auto" + s
			String email = "test"+s+"@brandmuscle.com"
			String add1 = "4th Avenue"
			
			println("EMAIL IS "+email)
			
			action.Type(firstname, name1)
			action.Type(lastname, name2)
			action.Type(address1, add1)
			action.Type(city, "Cleveland")
			action.SelectByText(state, "OH")
			action.Type(zip, "44114")
			action.Type(emailaddress, email)
			WebUI.delay(2)
			action.Type(password, "go2web")
			action.Type(salespersonid,id)
			action.Click(brandmanagerrole)
			action.Click(chicagobeveragegroup)
			action.IsElementDisplayed(progressIndicator)
			action.IsElementDisplayed(testemail)
			action.SelectByText(salespersondropdown,"Default - 6250 N. River Rd Suite 9000, Rosemont, IL 60018")
			action.Click(insertbtn)
			action.IsElementDisplayed(updatebtn)
		
		
		
		action.MouseHoverOnElement(siteadmin)
		WebUI.delay(3)
		action.Click(salespeople)
		action.WaitForPageToLoad()
		action.IsDisplayed(salespeople)
		action.IsElementDisplayed(corpName)
		action.SelectByText(corpName, "Instant Impact 4.0 Demo Corp (Dist.)")
		action.WaitVisible(progressIndicator)
		WebUI.delay(5)
		action.SelectByText(market, "Chicago Beverage Systems")
		action.WaitVisible(progressIndicator)
		WebUI.delay(2)
		action.Click(saleperson)
		WebUI.delay(2)
		/*List<WebElement>person_list =   action.GetElements(salepersonList)
		List<String> person_name_List = new ArrayList<String>()
		
		for (int i=0;i<person_list.size();i++)
		{
			println(person_list[i].getText())
			person_name_List.add(person_list[i].getText())
		}
		
		for(int j=0;j<person_name_List.size();j++)
		{
		  if(person_name_List)
		  {
			println("User is present")
		 	
		  }
		  else
		  {
			throw new Exception("User Not Present")
		  }
	  }*/
	}
	catch(Exception e)
	{
		Assert.fail("ValidateNewSalePersonInSalePersonDD Failed due to "+e)
	}	
		
  }
	
	
	@Keyword
	public void updateUser()
	{
		try
		{
			action.Click(budgetmanagerrole)
			action.Click(updatebtn)
			action.IsElementDisplayed(updatesuccessmssg)
		}
		catch(Exception e)
		{
			Assert.fail("updateUser Failed due to "+e)
		}
		
	}
	
	
}
