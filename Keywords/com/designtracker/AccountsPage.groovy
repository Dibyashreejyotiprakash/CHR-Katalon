package com.designtracker

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
//import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert
import java.util.Date
import java.time.LocalDateTime
import java.util.Calendar
import org.openqa.selenium.WebElement
import java.awt.Robot
import java.awt.event.KeyEvent;

public class AccountsPage
{

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()

	By corpDropDown = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarketsInsert_ddlCorporation']")
	By marketDropDown = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarketsInsert_ddlMarket']")
	By description = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_txtDescription']")
	By city = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_txtCity']")
	By state = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_txtState']")
	By zip = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_txtZip']")
	By phonenumber = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_txtPhoneInsert']")
	By clientaccountid = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_txtClientAccountID']")
	By accounttype = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_ddlAccountTypeID']")
	By region = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_ddlRegionForInsert']")
	By insertbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_InsertButton']")
	By cancelbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_InsertCancelButton']")
	By corprequiredmssg = By.xpath("//span[contains(text(),'Corporation Required')]")
	By marketrequiredmssg = By.xpath("//span[contains(text(),'Market Required')]")
	By descrequiredmssg = By.xpath("//span[contains(text(),'Description Required')]")
	By clientidrequiredmssg = By.xpath("//span[contains(text(),'Client Account ID Required')]")
	By siteadmintab = By.xpath("(//a[@title = 'Site Administration']/span)[1]")
	By accounts = By.xpath("//a[@class = 'rmLink']/span[contains(text(),'ACCOUNTS')]")
	By lookupaccount = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_lbtnLookUpAccount']")
	By lookupcorp = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarketsSearch_ddlCorporation']")
	By lookupmarket = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_CorpsAndMarketsSearch_ddlMarket']")
	By lookupsearchtext = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_txtSearchText']")
	By accountdescradiobtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_rblSearchCriteria_0']")
	By lookupaccountname = By.xpath("//table[@id='ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_gvUnlistedAccountSearchResults']/tbody/tr[@class = 'GridViewRow']/td[3]")
	By lookupaccountbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_btnSearch']")
	By newrecordmssg = By.xpath("//li[contains(text(),'New Record Created')]")
	By addsalespersonbtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_btnAddSalesPerson']")
	By salespersonddn = By.xpath("//select[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_ddlAvailableSalesPersons']")

	By jobpagecorporationddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlCorporation")
	By jobpagemarketddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlMarket")
	By jobpagesalespersonddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlSalesPerson")
	By accountddn = By.id("ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_ddlAccount")
	By headerjobtab = By.xpath("//a[@title = 'JOBS']/span")
	By newjob = By.xpath("(//span[contains(text(),'NEW')])[1]")
	By acc_select_btn = By.xpath("(//a[contains(text(),'Select')])[1]")
	By acc_retire_btn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_ckRetired']")
	By updatebtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_UpdateButton']")
	By update_success_mssg = By.xpath("//li[contains(text(),'Update Succeeded')]")
	By lookupsearchbtn = By.xpath("//li[contains(text(),'Update Succeeded')]")
	By notlistedlink = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_lbtnAddUnlistedAccount']")
	By lookuptext = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_txtUnlistedAccountSearchText']")
	By lookupaccountbtn1 = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvNewJob_CorpsAndMarkets_btnUnlistedAccountSearch']")
	By lookupname = By.xpath("//table[@id='ctl00_ctl00_cphMain_cphMain_gvSearchResults']/tbody/tr[2]/td[3]")
	By deletesalespersonbtn = By.xpath("//a[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_gvSalesPersonsInMarket_ctl02_lbtnDelete']")
	By deletesuccessmssg = By.xpath("//li[contains(text(),'deleted successfully')]")
	By allsalespeoplebtn = By.xpath("//input[@id='ctl00_ctl00_cphMain_cphMain_fvAccount_btnAssociateAllSalesPerson']")
	By allsalespeoplesuccessmssg = By.xpath("//li[contains(text(),'All Sales People were associated to the account')]")

	@Keyword
	public void VerifyAccountsPage(){
		try{
			action.VerifyCurrentPage("Account/Account.aspx")
		}
		catch(Exception e){
			Assert.fail("Verify Accounts page failed due to "+ e)
		}
	}

	@Keyword
	public void validaterequiredfields()
	{
		try
		{
			action.MouseHoverOnElement(siteadmintab)
			action.Click(accounts)
			action.Click(insertbtn)
			
			Assert.assertTrue(action.IsElementDisplayed(corprequiredmssg))
			Assert.assertTrue(action.IsElementDisplayed(marketrequiredmssg))
			Assert.assertTrue(action.IsElementDisplayed(descrequiredmssg))
			Assert.assertTrue(action.IsElementDisplayed(clientidrequiredmssg))
		}
		catch(Exception e)
		{
			Assert.fail("validaterequiredfields Failed due to "+e)
		}

	}


	@Keyword
	public void ValidateAccountsfields()
	{
		try
		{
			action.MouseHoverOnElement(siteadmintab)
			action.Click(accounts)
			
			Assert.assertTrue(action.IsElementDisplayed(corpDropDown))
			Assert.assertTrue(action.IsElementDisplayed(marketDropDown))
			Assert.assertTrue(action.IsElementDisplayed(description))
			Assert.assertTrue(action.IsElementDisplayed(city))
			Assert.assertTrue(action.IsElementDisplayed(state))
			Assert.assertTrue(action.IsElementDisplayed(zip))
			Assert.assertTrue(action.IsElementDisplayed(phonenumber))
			Assert.assertTrue(action.IsElementDisplayed(clientaccountid))

		}
		catch(Exception e)
		{
			Assert.fail("ValidateAccountsfields Failed due to "+e)
		}

	}


	@Keyword
	public void CreateAccountAndLookUp()
	{
		try
		{
			LocalDateTime dateTime = LocalDateTime.now()

			action.MouseHoverOnElement(siteadmintab)
			action.Click(accounts)
			action.SelectByText(corpDropDown, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketDropDown, "Chicago Beverage Systems")
			String acc_name = "QATest"+dateTime
			println("DATE TIME -"+acc_name)
			action.Type(description, acc_name)
			action.Type(city,"Cleveland")
			action.Type(state, "OH")
			action.Type(zip, "44114")
			action.Type(phonenumber, "976-767-6768")
			String id = "123"+dateTime
			action.Type(clientaccountid,id)
			action.Click(insertbtn)
			action.IsElementDisplayed(newrecordmssg)
			action.SelectByText(salespersonddn,"ADMIN1, TEST (testadmin1@brandmuscle.com)")
			action.Click(addsalespersonbtn)
			action.Click(lookupaccount)
			action.SelectByText(lookupcorp,"Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(lookupmarket, "Chicago Beverage Systems")
			action.Type(lookupsearchtext, acc_name)
			action.Click(lookupaccountbtn)
			action.IsElementDisplayed(lookupname)

			String account_name = action.GetText(lookupname)
			Assert.assertEquals(account_name, acc_name)
		}
		catch(Exception e)
		{
			Assert.fail("CreateAccount Failed due to "+e)
		}

	}


	@Keyword
	public void ValidateAccountInJobCreation()
	{
		try
		{
			LocalDateTime dateTime = LocalDateTime.now()
			action.MouseHoverOnElement(siteadmintab)
			action.Click(accounts)

			action.SelectByText(corpDropDown, "Instant Impact 4.0 Demo Corp (Dist.)")
	
			action.SelectByText(marketDropDown, "Chicago Beverage Systems")
			
			String acc_name = "QATest"+dateTime
			action.Type(description, acc_name)

			action.Type(city,"Cleveland")

			action.Type(state, "OH")

			action.Type(zip, "44114")

			action.Type(phonenumber, "976-767-6768")
			//WebUI.delay(1)
			String id = "123"+dateTime
			action.Type(clientaccountid,id)
			//WebUI.delay(1)
			action.Click(insertbtn)
			action.IsElementDisplayed(newrecordmssg)
			//WebUI.delay(1)
			action.WaitVisible(addsalespersonbtn)

			//WebUI.delay(2)
			action.SelectByText(salespersonddn,"ADMIN2, TEST (testadmin2@brandmuscle.com)")
			//WebUI.delay(1)
			action.Click(addsalespersonbtn)
			//WebUI.delay(3)
			action.Click(headerjobtab)
			action.WaitVisible(newjob)
			action.Click(newjob)
			action.WaitVisible(jobpagecorporationddn)
			action.SelectByText(jobpagecorporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			//WebUI.delay(2)
			action.SelectByText(jobpagemarketddn, "Chicago Beverage Systems")
			//WebUI.delay(2)
			action.IsElementDisplayed(jobpagesalespersonddn)

			action.SelectByValue(jobpagesalespersonddn,"ADMIN2, TEST (testadmin2@brandmuscle.com)")
			//WebUI.delay(2)

			action.Click(notlistedlink)
			action.WaitVisible(lookuptext)
			action.Click(lookuptext)
			action.Type(lookuptext,acc_name)
			//WebUI.delay(3)
			action.Click(lookupaccountbtn1)
			action.WaitVisible(lookupaccountname)
			String acc_name_txt =  action.GetText(lookupaccountname)

			if (acc_name_txt == acc_name)
			{
				println("Account name is "+acc_name)
			}
			else
			{
				Assert.fail("Account Name Not present")
			}


		}
		catch(Exception e)
		{
			Assert.fail("CreateAccount Failed due to "+e)
		}

	}


	@Keyword
	public void RetireAccountAndValidate()
	{
		try
		{
			LocalDateTime dateTime = LocalDateTime.now()
			action.MouseHoverOnElement(siteadmintab)
			action.Click(accounts)
			action.SelectByText(corpDropDown, "Instant Impact 4.0 Demo Corp (Dist.)")
			action.SelectByText(marketDropDown, "Chicago Beverage Systems")
			String acc_name = "QATest"+dateTime
			action.Type(description, acc_name)
			action.Type(city,"Cleveland")
			action.Type(state, "OH")
			action.Type(zip, "44114")
			action.Type(phonenumber, "976-767-6768")
			String id = "123"+dateTime
			action.Type(clientaccountid,id)
			action.Click(insertbtn)
			action.IsElementDisplayed(newrecordmssg)
			action.SelectByText(salespersonddn,"ADMIN1, TEST (testadmin1@brandmuscle.com)")
			action.Click(addsalespersonbtn)
			action.Click(lookupaccount)
			
			action.SelectByText(lookupcorp,"Instant Impact 4.0 Demo Corp (Dist.)")
			
			action.SelectByText(lookupmarket, "Chicago Beverage Systems")
			
			action.Type(lookupsearchtext, acc_name)
			
			action.Click(lookupaccountbtn)
			////WebUI.delay(3)
			action.IsElementDisplayed(lookupname)
			action.WaitVisible(acc_select_btn)
			action.Click(acc_select_btn)
			action.WaitVisible(acc_retire_btn)
			action.Click(acc_retire_btn)
			action.Click(updatebtn)
			//WebUI.delay(2)
			action.IsElementDisplayed(update_success_mssg)
			action.Click(headerjobtab)
			action.WaitVisible(newjob)
			action.Click(newjob)
			action.WaitVisible(jobpagecorporationddn)
			action.Type(jobpagecorporationddn, "Instant Impact 4.0 Demo Corp (Dist.)")
			//WebUI.delay(2)
			action.WaitVisible(jobpagecorporationddn)
			action.SelectByText(jobpagemarketddn, "Chicago Beverage Systems")
			//WebUI.delay(2)
			action.IsElementDisplayed(jobpagesalespersonddn)

			action.SelectByValue(jobpagesalespersonddn,"ADMIN1, TEST (testadmin1@brandmuscle.com)")
			//WebUI.delay(2)


			action.Click(notlistedlink)
			action.WaitVisible(lookuptext)
			action.Click(lookuptext)
			action.Type(lookuptext,acc_name)
			//WebUI.delay(3)
			action.Click(lookupaccountbtn1)
			action.IsElementDisplayed(lookupaccountname)

			//String acc_name_txt =  action.GetText(lookupaccountname)


		}
		catch(Exception e)
		{
			Assert.fail("RetireAccountAndValidate Failed due to "+e)
		}
	}


	@Keyword
	public void CreateAccount()
	{
		try
		{
			LocalDateTime dateTime = LocalDateTime.now()

			action.WaitVisible(siteadmintab)
			action.MouseHoverOnElement(siteadmintab)
			
			action.WaitVisible(accounts)
			action.Click(accounts)
			action.WaitVisible(insertbtn)
			action.SelectByText(corpDropDown, "Instant Impact 4.0 Demo Corp (Dist.)")
			
			action.SelectByText(marketDropDown, "Chicago Beverage Systems")

			String acc_name = "QATest"+dateTime
			println("DATE TIME -"+acc_name)
			action.Type(description, acc_name)
			//WebUI.delay(1)
			action.Type(city,"Cleveland")
			//WebUI.delay(1)
			action.Type(state, "OH")
			//WebUI.delay(1)
			action.Type(zip, "44114")
			//WebUI.delay(1)
			action.Type(phonenumber, "976-767-6768")
			//WebUI.delay(1)
			String id = "123"+dateTime
			action.Type(clientaccountid,id)
			//WebUI.delay(1)
			action.Click(insertbtn)
			action.IsElementDisplayed(newrecordmssg)
			//WebUI.delay(1)
			action.IsElementDisplayed(newrecordmssg)
			action.WaitVisible(addsalespersonbtn)

			//WebUI.delay(2)
			action.SelectByText(salespersonddn,"ADMIN1, TEST (testadmin1@brandmuscle.com)")
			//WebUI.delay(2)
			action.Click(addsalespersonbtn)

		}
		catch(Exception e)
		{
			Assert.fail("CreateAccount Failed due to "+e)

		}

	}


	@Keyword
	public void DeassociateSalesPersonFromAccount()
	{
		try
		{
			LocalDateTime dateTime = LocalDateTime.now()

			action.WaitVisible(siteadmintab)
			action.MouseHoverOnElement(siteadmintab)
			
			action.WaitVisible(accounts)
			action.Click(accounts)
			action.WaitVisible(insertbtn)
			action.SelectByText(corpDropDown, "Instant Impact 4.0 Demo Corp (Dist.)")
			
			action.SelectByText(marketDropDown, "Chicago Beverage Systems")
			
			String acc_name = "QATest"+dateTime
			action.Type(description, acc_name)
			
			action.Type(city,"Cleveland")
			action.Type(state, "OH")
			action.Type(zip, "44114")
			action.Type(phonenumber, "976-767-6768")
			String id = "123"+dateTime
			
			action.Type(clientaccountid,id)
			
			action.Click(insertbtn)
			
			action.IsElementDisplayed(newrecordmssg)
			action.WaitVisible(addsalespersonbtn)
			
			action.SelectByText(salespersonddn,"ADMIN1, TEST (testadmin1@brandmuscle.com)")
			
			action.Click(addsalespersonbtn)

			action.WaitVisible(deletesalespersonbtn)
			action.Click(deletesalespersonbtn)

		}
		catch(Exception e)
		{
			Assert.fail("DeassociateSalesPersonFromAccount Failed due to "+e)

		}
	}


	@Keyword
	public void AssociateAllSalesPerson()
	{
		try
		{
			LocalDateTime dateTime = LocalDateTime.now()

			action.WaitVisible(siteadmintab)
			action.MouseHoverOnElement(siteadmintab)
			
			action.WaitVisible(accounts)
			action.Click(accounts)
			action.WaitVisible(insertbtn)
			action.SelectByText(corpDropDown, "Instant Impact 4.0 Demo Corp (Dist.)")
			
			action.SelectByText(marketDropDown, "Chicago Beverage Systems")
			
			String acc_name = "QATest"+dateTime
			action.Type(description, acc_name)
			
			action.Type(city,"Cleveland")
			action.Type(state, "OH")
			action.Type(zip, "44114")
			action.Type(phonenumber, "976-767-6768")
			String id = "123"+dateTime
			
			action.Type(clientaccountid,id)
			
			action.Click(insertbtn)
			
			action.IsElementDisplayed(newrecordmssg)
			action.WaitVisible(addsalespersonbtn)
			
			action.Click(allsalespeoplebtn)
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			//WebUI.delay(2)
			action.IsElementDisplayed(allsalespeoplesuccessmssg)
		}
		catch(Exception e)
		{
			Assert.fail("AssociateAllSalesPerson Failed due to "+e)
		}
	}


}
