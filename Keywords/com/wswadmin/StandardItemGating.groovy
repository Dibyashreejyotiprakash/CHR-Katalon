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

import internal.GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert
import org.openqa.selenium.WebElement
import com.wswadmin.LoginPage
import com.wswadmin.HomePage
import com.wswadmin.ItemSearchpage



public class StandardItemGating {
	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()
	LoginPage l = new LoginPage()
	HomePage hm = new HomePage()
	ItemSearchpage im = new ItemSearchpage()



	By corpddn = By.xpath(".//*[@id='ctl00_cphMain_rcbCorporation']/span/button")
	By corpddnvalue = By.xpath("//*[text()='300 - Instant Impact 4.0 Demo Corp (Dist.)']")
	By distributorddn = By.xpath(".//*[@id='ctl00_cphMain_rcbDistributor']/span/button")
	By groupddn = By.xpath(".//*[@id='ctl00_cphMain_rcbUserGroups']/span/button")
	By addnewgroupvalue = By.xpath("//*[text()='+ Add New']")
	By chicagobeverage = By.xpath("//span[contains(text(),'Chicago Beverage Systems')]")
	By email = By.xpath("//label[contains(text(),'(test123@brandmuscle.com)')]")
	By distributorcorpval = By.xpath("//li[contains(text(),'300 - Instant Impact')]")
	By distributorval = By.xpath("//li[contains(text(),'Chicago Beverage Systems')]")
	By distributorgroupval = By.xpath("//li[contains(text(),'Jeremy')]")
	By suppliercorpval = By.xpath("//li[contains(text(),'Demo Supplier')]")
	By suppliergroupval = By.xpath("//li[contains(text(),'Test')]")
	By demoSuppQA = By.xpath("//span[contains(text(),'Demo Supplier QA')]")
	By supp_email = By.xpath("//label[contains(text(),'(test321@brandmuscle.com)')]")
	By groupmetataglist = By.xpath("//div[@id = 'ctl00_cphMain_rcbUserGroups_DropDown']//ul[@class = 'rcbList' ]/li")
	By itemgatingmetatags = By.xpath("//table[@typeid = '44']//label[@class = 'checkbox dropdown-text checkbox-padding']//div")
	By brandnamemetatagcount = By.xpath("//div[@id='10']")
	By itemgatingcategory = By.xpath("//span[text()='Item Gating']")

	By groupnametextbox = By.xpath("//*[@id='ctl00_cphMain_txtGroupName']")
	By savebtn = By.xpath("//*[@id='ctl00_cphMain_rbtnSave']")

	@Keyword
	public void ValidateUserOnWswAdminForDistributor() {
		try {
			action.WaitVisible(corpddn)
			action.WaitVisible(distributorddn)
			WebUI.delay(2)
			action.Click(corpddn)
			WebUI.delay(2)
			action.Click(distributorcorpval)
			WebUI.delay(4)
			action.Click(distributorddn)
			WebUI.delay(2)
			action.Click(distributorval)
			WebUI.delay(4)
			action.Click(groupddn)
			WebUI.delay(2)
			action.Click(distributorgroupval)
			action.WaitVisible(chicagobeverage)
			action.Click(chicagobeverage)
			action.IsElementDisplayed(email)
		}
		catch(Exception e) {
			Assert.fail("ValidateUserOnWswAdminForDistributor Failed due to "+e)
		}
	}

	@Keyword
	public void ValidateUserOnWswAdminForSupplier() {
		try {
			action.WaitVisible(corpddn)
			action.WaitVisible(distributorddn)
			WebUI.delay(2)
			action.Click(corpddn)
			WebUI.delay(2)
			action.Click(suppliercorpval)
			WebUI.delay(4)
			action.Click(groupddn)
			WebUI.delay(2)
			action.Click(suppliergroupval)
			action.WaitVisible(demoSuppQA)
			action.Click(demoSuppQA)
			action.IsElementDisplayed(supp_email)
		}
		catch(Exception e) {
			Assert.fail("ValidateUserOnWswAdminForSupplier Failed due to "+e)
		}
	}

	@Keyword
	public void CreateItemGatingGroupMetatag() {
		try {
			action.Click(corpddn)
			action.Type(corpddn, "300 - Instant Impact 4.0 Demo Corp (Dist.)")
			action.Click(distributorddn)
			action.Click(distributorval)
			action.Click(groupddn)

			List<WebElement> listname = action.GetElements(groupmetataglist)

			List<String> metatag_names = new ArrayList<String>()

			for (int i=0;i <listname.size();i++) {
				metatag_names.add(listname[i].getText())
			}

			/*action.GetUrl(GlobalVariable.bunamewswadmin, GlobalVariable.testtyperegression, GlobalVariable.environment)
			 l.WSWlogin(GlobalVariable.wswadminusername,GlobalVariable.wswpassword)*/
			WebUI.delay(3)
			hm.NavigateToItemSearchPage()
			WebUI.delay(3)
			im.openTemplateConfigurationPage()
			action.WaitVisible(brandnamemetatagcount)
			//action.ScrollToViewelement(itemgatingcategory)
			action.WaitVisible(itemgatingcategory)
			WebUI.delay(8)
			List<WebElement> itemgatingmetatag = action.GetElements(itemgatingmetatags)
			println("Below List")

			for (int j=0;j<itemgatingmetatag.size();j++)
			{
				//println("Gorup Name -->"+metatag_names[j])
				println("Metatag name-->"+itemgatingmetatag[j].getText())



			}




		}




		catch(Exception e)
		{
			Assert.fail("CreateItemGatingGroupMetatag Failed due to"+e)
		}
	}

	@Keyword
	public void VerifyCreateItemGatingGroup(){
		try{
			action.Click(corpddn)
			action.Click(corpddnvalue)
			action.Click(distributorddn)
			action.Click(distributorval)
			action.Click(groupddn)
			action.Click(addnewgroupvalue)
			String newgroup = "Test Group "+ action.GenerateRandomAplphabaticString(10)
			action.Type(groupnametextbox,newgroup)
			action.Click(savebtn)
		}
		catch(Exception e){
			Assert.fail("Verify Create Item Gating Group failed due to "+ e)
		}
	}
}
