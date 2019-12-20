package com.ii4usersites

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
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class AccountPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By accoutlabel = By.xpath("//*[@id='Body_lblAccount']")
	By allbuttons = By.xpath("//*[@class='helpPage']/div[2]/div/div/div/h2")
	By profilelbel = By.xpath("//*[@id='Body_lblAccountPageProfile']")
	By accountlabel = By.xpath("//*[contains(text(),'AccountTest')]")



	List<WebElement> alltabslables = action.GetElements(allbuttons)

	@Keyword
	public void VerifyAccountsResourceMsg() {
		String expectedaccountlable = GlobalVariable.resourcemsgaccount
		println ("Expected Lable for Accounts "+ expectedaccountlable)
		String actualprofilelable = null
		String actualaccoutresourcemsg = action.GetText(accountlabel)
		println ("Profile resource message is appearing "+ actualaccoutresourcemsg )
		if(actualaccoutresourcemsg.equalsIgnoreCase(expectedaccountlable)) {
			println ("Profile resource message is appearing "+ actualaccoutresourcemsg )
		}
		else {
			Assert.fail("account name is not matching")
		}
	}

	@Keyword
	public void VerifyProfileResourceMsg() {
		String expectedprofilelable = GlobalVariable.resorcemsgprofile
		println ("Expected Lable for Profile "+ expectedprofilelable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualprofilelable = null
		for(int i=0;i<= alllables.size();i++) {
			actualprofilelable = alllables.get(0).getText()
			if(actualprofilelable.equals(expectedprofilelable)) {
				println ("Profile resource message is appearing "+ actualprofilelable )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}


	@Keyword
	public void VerifyReportsResourceMsg() {
		String expectedreportlable = GlobalVariable.resourcemsgreports
		println ("Expected Lable for Reports "+ expectedreportlable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualreprotlable = null
		for(int i=0;i<= alllables.size();i++) {
			actualreprotlable = alllables.get(1).getText()
			if(actualreprotlable.equals(expectedreportlable)) {
				println ("Report resource message is appearing "+ actualreprotlable )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}


	@Keyword
	public void VerifyAddressBookResourceMsg() {
		String expectedaddressbooklable = GlobalVariable.resourcemsgaddressbook
		println ("Expected Lable for Reports "+ expectedaddressbooklable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualaddressbooklable = null
		for(int i=0;i<= alllables.size();i++) {
			actualaddressbooklable = alllables.get(2).getText()
			println ("Report resource message is appearing "+ actualaddressbooklable )
			if(actualaddressbooklable.equals(expectedaddressbooklable)) {
				println ("Report resource message is appearing "+ actualaddressbooklable )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}



	@Keyword
	public void VerifyAddressListResourceMsg() {
		String expectedaddresslistlable = GlobalVariable.resourcemsgaddressList
		println ("Expected Lable for AddressList "+ expectedaddresslistlable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualaddresslistlable = null
		for(int i=0;i<= alllables.size();i++) {
			actualaddresslistlable = alllables.get(3).getText()
			println ("Report resource message is appearing "+ actualaddresslistlable )
			if(actualaddresslistlable.equals(expectedaddresslistlable)) {
				println ("Report resource message is appearing "+ actualaddresslistlable )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}



	@Keyword
	public void VerifyProjectsResourceMsg() {
		String expectedprojectslable = GlobalVariable.resourcemsgprojects
		println ("Expected Lable for Profile "+ expectedprojectslable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualprojectslables = null
		for(int i=0;i<= alllables.size();i++) {
			actualprojectslables = alllables.get(5).getText()
			if(actualprojectslables.equals(expectedprojectslable)) {
				println ("Profile resource message is appearing "+ actualprojectslables )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}

	@Keyword
	public void VerifyLogoLockerResourceMsg() {
		String expectedlogolockerlable = GlobalVariable.resourcemsglogolocker
		println ("Expected Lable for Profile "+ expectedlogolockerlable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actuallogolockerlable = null
		for(int i=0;i<= alllables.size();i++) {
			actuallogolockerlable = alllables.get(4).getText()
			if(actuallogolockerlable.equals(expectedlogolockerlable)) {
				println ("Profile resource message is appearing "+ actuallogolockerlable )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}

	@Keyword
	public void VerifyDeleteProfileGlobalMsg() {
		WebUI.delay(3)
		String expectedprofilelable = "Profile"
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualprofilelables = null
		for(int i=0;i<= alllables.size();i++) {
			actualprofilelables = alllables.get(0).getText()
			println ("Actual Profile Global msg "+ actualprofilelables)
			if(actualprofilelables.equals(expectedprofilelable)) {
				println ("Profile global message is appearing "+ actualprofilelables )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}


	@Keyword
	public void VerifyDeleteAddressBookResourceMsg() {
		String expectedaddressbooklable = "Address Book"
		println ("Expected Lable for Reports "+ expectedaddressbooklable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualaddressbooklable = null
		for(int i=0;i<= alllables.size();i++) {
			actualaddressbooklable = alllables.get(2).getText()
			println ("Report resource message is appearing "+ actualaddressbooklable )
			if(actualaddressbooklable.equals(expectedaddressbooklable)) {
				println ("Report resource message is appearing "+ actualaddressbooklable )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}


	@Keyword
	public void VerifyDeleteAddressListResourceMsg() {
		String expectedaddresslistlable = "Address List"
		println ("Expected Lable for AddressList "+ expectedaddresslistlable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualaddresslistlable = null
		for(int i=0;i<= alllables.size();i++) {
			actualaddresslistlable = alllables.get(3).getText()
			println ("Report resource message is appearing "+ actualaddresslistlable )
			if(actualaddresslistlable.equals(expectedaddresslistlable)) {
				println ("Report resource message is appearing "+ actualaddresslistlable )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}

	@Keyword
	public void VerifyDeleteLogoLockerResourceMsg() {
		String expectedlogolockerlable = "Logo Locker"
		println ("Expected Lable for Profile "+ expectedlogolockerlable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actuallogolockerlable = null
		for(int i=0;i<= alllables.size();i++) {
			actuallogolockerlable = alllables.get(4).getText()
			if(actuallogolockerlable.equals(expectedlogolockerlable)) {
				println ("Profile resource message is appearing "+ actuallogolockerlable )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}

	@Keyword
	public void VerifyDeleteProjectsResourceMsg() {
		String expectedprojectslable = "Projects"
		println ("Expected Lable for Profile "+ expectedprojectslable)
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualprojectslables = null
		for(int i=0;i<= alllables.size();i++) {
			actualprojectslables = alllables.get(5).getText()
			if(actualprojectslables.equals(expectedprojectslable)) {
				println ("Profile resource message is appearing "+ actualprojectslables )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}

	@Keyword
	public void VerifyDeleteReportsGlobalMsg() {
		WebUI.delay(3)
		String expectedprofilelable = GlobalVariable.globalmsgreport
		List<WebElement> alllables = action.GetElements(allbuttons)
		String actualprofilelables = null
		for(int i=0;i<= alllables.size();i++) {
			actualprofilelables = alllables.get(1).getText()
			println ("Actual Profile Global msg "+ actualprofilelables)
			if(actualprofilelables.equals(expectedprofilelable)) {
				println ("Profile global message is appearing "+ actualprofilelables )
			}
			else {
				Assert.fail()
			}
			break;
		}
	}
}


