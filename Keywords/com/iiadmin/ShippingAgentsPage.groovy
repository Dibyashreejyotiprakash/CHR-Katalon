package com.iiadmin

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

import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable
import org.testng.Assert

public class ShippingAgentsPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();


	By shippingagentsddn = By.xpath("//*[@id='ctl00_Body_ddlShippingAgents']")
	By availableshippingrules = By.xpath("//*[@id='ctl00_Body_fsRules']//tr//td[6]")
	By firstdeletelink = By.xpath("//*[@id='ctl00_Body_fsRules']//tr[2]//tr/td[1]/a[text()='Delete']")
	//By firstselectlink = By.xpath("//*[@id='ctl00_Body_fsRules']//tr[2]//tr/td[1]/a[text()='Select']")
	By firstselectlink = By.xpath("(//a[text()='Select'])[1]")
	//By firstnewlink = By.xpath("//*[@id='ctl00_Body_fsRules']//tr[2]//tr/td[2]/a[text()='New']")
	By firstnewlink = By.xpath("(//a[text()='New'])[1]")
	By startrange = By.xpath("//*[@id='ctl00_Body_fvShippingAgentRules_nStartOfRangeTextBox']")
	By endrange = By.xpath("//*[@id='ctl00_Body_fvShippingAgentRules_nEndOfRangeTextBox']")
	By corpidddn = By.xpath("//*[@id='ctl00_Body_fvShippingAgentRules_cmbCorps_Arrow']")
	By coridddntextbox = By.xpath("//input[@id='ctl00_Body_fvShippingAgentRules_cmbCorps_Input']")
	By democorpddnvalue = By.xpath("//*[text()=' - Demo Distributor (QA)']/input")
	By itemkeytextbox = By.xpath("//*[@id='ctl00_Body_fvShippingAgentRules_txtItemId']")
	By insertbtn = By.xpath("//*[@id='ctl00_Body_fvShippingAgentRules_InsertButton']")
	By updatebtn = By.xpath("//a[@id='ctl00_Body_fvShippingAgentRules_UpdateButton']")
	
	@Keyword
	public void VerifyShippingAgentsPage() {
		try{
			action.VerifyCurrentPage("ShippingAgents.aspx")
		}
		catch(Exception e) {
			Assert.fail("Verify Home Page failed due to "+ e)
		}
	}

	@Keyword
	public void SelectShippingAgent() {
		try{
			action.SelectByText(shippingagentsddn, "Centiv Demo and Test")
			//WebUI.delay(5)
		}
		catch(Exception e) {
			Assert.fail("Select Shipping Agent failed due to "+ e)
		}
	}

	@Keyword
	public int VerifyShippingRulesExistOrNot() {
		int noofrulesbeforeadding = 0
		try{
			action.ScrollToBottomOfPage()
			List<WebElement> allshipingrules = action.GetElements(availableshippingrules)
			noofrulesbeforeadding = allshipingrules.size()
			if(noofrulesbeforeadding >0) {
				for(int i=0;i< noofrulesbeforeadding;i++ ) {
					println (allshipingrules.get(i).getText())
				}
			}
			else{
				throw new Exception ("No Rules available")
			}
			return noofrulesbeforeadding
		}
		catch(Exception e) {
			Assert.fail("Verify Shipping Rules Exist Or Not failed due to "+ e)
		}
	}

	@Keyword
	public void CreateNewShippingRule() {
		try{
			int noofrulesbeforeadding = VerifyShippingRulesExistOrNot()
			action.Click(firstnewlink)
			//WebUI.delay(10)
			action.Type(startrange, "100")
			action.Type(endrange, "400")
			action.Click(corpidddn)
			WebUI.delay(2)
			action.Type(coridddntextbox, "339")
			//WebUI.delay(5)
			action.Click(democorpddnvalue)
			//WebUI.delay(5)
			action.Type(itemkeytextbox, "TTI04")
			action.Click(insertbtn)
			//WebUI.delay(10)

			action.ScrollToBottomOfPage()
			List<WebElement> allrulesafteradding = action.GetElements(availableshippingrules)
			int noofrukesafteradding = allrulesafteradding.size()
			//int noofrulesbeforeadding = VerifyShippingRulesExistOrNot()

			if((noofrulesbeforeadding+1)== noofrukesafteradding) {
				println ("New rule has been added successfully")
			}
			else{
				throw new Exception("Rules has not been added")
			}
		}
		catch(Exception e) {
			Assert.fail("Create New Shipping Rule failed due to "+ e)
		}
	}

	@Keyword
	public void ModifyExistingRuleAndVerify() {
		try{
			int noofrulesbeforemodifying = VerifyShippingRulesExistOrNot()
			action.Click(firstselectlink)
			//WebUI.delay(10)
			action.Clear(startrange)
			action.Type(startrange, "100")
			action.Clear(endrange)
			action.Type(endrange, "600")
			//action.Click(corpidddn)
			//WebUI.delay(5)
			//action.Type(coridddntextbox, "339")
			//WebUI.delay(5)
			//action.Click(democorpddnvalue)
			//WebUI.delay(5)
			//action.Type(itemkeytextbox, "TTI04")
			action.Click(updatebtn)
			//WebUI.delay(10)

			action.ScrollToBottomOfPage()
			List<WebElement> allrulesafteradding = action.GetElements(availableshippingrules)
			int noofrukesaftermodifying = allrulesafteradding.size()
			//int noofrulesbeforemodifying = VerifyShippingRulesExistOrNot()

			if((noofrulesbeforemodifying)== noofrukesaftermodifying) {
				println ("Modified existing rule successfully.")
			}
			else{
				throw new Exception("Rules has not been modied or added duplicate row")
			}
		}
		catch(Exception e) {
			Assert.fail("Modify Existing Rule failed due to "+ e)
		}
	}
}
