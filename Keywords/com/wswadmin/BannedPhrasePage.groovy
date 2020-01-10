package com.wswadmin

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
import internal.GlobalVariable
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory


public class BannedPhrasePage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By bannedphrasegrid = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate']")
	By addnewwordbtn = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl02_ctl00_AddNewRecordButton']")
	By desctextbox = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl02_ctl03_radExternalItem']")
	By addbtn = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl02_ctl03_btnSave_input']")
	By cancelbtn = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl02_ctl03_btnCancel_input']")
	By wordpopup = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl02_ctl03_ctl00']")
	By popupdesc = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl02_ctl03_radExternalItem']")
	By popupaddbtn = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl02_ctl03_btnSave_input']")
	By popupcancelbtn = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate_ctl00_ctl02_ctl03_btnCancel_input']")
	By allbannedwordsingrid = By.xpath("//*[@id='ctl00_cphMain_RadGridTemplate']//tr//td[4]")
	By successfulmsg = By.xpath("//*[@id='cphMain_lblMessage']")
	By firstdeletebtn = By.xpath("ctl00_cphMain_RadGridTemplate_ctl00_ctl04_lnkDelete")
	By deletemsg = By.xpath("//*[@id='cphMain_lblMessage']")

	@Keyword
	public void VerifyBannedPhrasesPage() {
		String acuurenturl = action.GetCurrentURL()
		if(acuurenturl.contains("BannedPhrases.aspx")) {
			println ("Banned Phrases page is verified")
		}
		else {
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyBannedWordsGrid() {
		try {
			boolean statusofgrid = action.IsElementDisplayed(bannedphrasegrid)
			Assert.assertTrue(statusofgrid)
		}
		catch(Exception e) {
			println ("Verify Banned Words Grid failed due to "+ e)
		}
	}

	@Keyword
	public void AddNewBannedWordAndVerify() {
		try {
			action.WaitUntilElementClickable(addnewwordbtn)
			boolean statusofaddnewbtn = action.IsElementEnabled(addnewwordbtn)
			if(statusofaddnewbtn == true) {
				action.Click(addnewwordbtn)
				boolean sttausofpopup = action.IsElementDisplayed(wordpopup)
				if(sttausofpopup == true) {
					String bannedword = action.GenerateRandomAplphabaticString(8)
					action.Type(popupdesc, bannedword)
					//WebUI.delay(5)
					action.Click(popupaddbtn)
					//WebUI.delay(10)
					boolean statusofmsg = action.IsElementDisplayed(successfulmsg)
					Assert.assertTrue(statusofmsg)
					List<WebElement> allbannedword = action.GetElements(allbannedwordsingrid)
					for(int i=0;i< allbannedword.size();i++) {
						String expectedbannedword = GlobalVariable.bannedword
						if(allbannedword.get(i).getText().equalsIgnoreCase(expectedbannedword)) {
							println ("Banned word found ")
							break
						}
					}
				}
				else {
					Assert.fail()
				}
			}
			else {
				Assert.fail()
			}
		}
		catch(Exception e) {
			println ("Add new word failed due to "+ e)
		}
	}


	@Keyword
	public void DeleteBannedPhrases() {
		try {
			action.WaitUntilElementClickable(addnewwordbtn)
			boolean statusofaddnewbtn = action.IsElementEnabled(addnewwordbtn)
			if(statusofaddnewbtn == true) {
				action.Click(addnewwordbtn)
				boolean sttausofpopup = action.IsElementDisplayed(wordpopup)
				if(sttausofpopup == true) {
					String bannedword = action.GenerateRandomAplphabaticString(8)
					action.Type(popupdesc, bannedword)
					//WebUI.delay(5)
					action.Click(popupaddbtn)
					//WebUI.delay(10)
					boolean statusofmsg = action.IsElementDisplayed(successfulmsg)
					Assert.assertTrue(statusofmsg)
					List<WebElement> allbannedword = action.GetElements(allbannedwordsingrid)
					for(int i=0;i< allbannedword.size();i++) {
						String expectedbannedword = GlobalVariable.bannedword
						if(allbannedword.get(i).getText().equalsIgnoreCase(expectedbannedword)) {
							println ("Banned word found ")
							break
						}
					}
				}
				else {
					Assert.fail()
				}
			}
			else {
				Assert.fail()
			}

			action.Click(firstdeletebtn)
			action.AcceptAlert()

			boolean statusofdeletemsg = action.IsElementDisplayed(deletemsg)
			Assert.assertTrue(statusofdeletemsg)
		}
		catch(Exception e) {
			println ("Add new word failed due to "+ e)
		}
	}
}
