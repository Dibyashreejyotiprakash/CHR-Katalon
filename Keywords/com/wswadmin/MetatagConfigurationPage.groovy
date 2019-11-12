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
//import internal.GlobalVariable
import java.time.LocalTime
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory

public class MetatagConfigurationPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By metatag = By.xpath("//*[@class='ExternalItemPlaceHolder']/fieldset[1]//div/span")
	By backtotemplatesbtn = By.xpath("//*[text()='Back to Templates']")
	By templateid = By.xpath("//*[@id='cphMain_cphMain_lblTemplateInfo']")
	By searchmetatagtextbox = By.xpath("//*[@id='search']")
	By allexternalitemtypename = By.xpath("//*[@class='ExternalItemPlaceHolder']//fieldset/legend/div[1]/span")
	By firstmetatagcheckbox = By.cssSelector(".ExternalItemPlaceHolder .itemFieldset:nth-of-type(1) .check")
	By saveselectedbtn = By.xpath("//*[@id='cphMain_cphMain_btnSave']")

	@Keyword
	public void VerifyMetatagConfigurationPage()
	{
		try{
			action.VerifyCurrentPage("MetatagConfiguration.aspx")
		}catch(Exception e)
		{
			Assert.fail("Verify Meta tag Configuration Page failed due to "+  e)
		}
	}

	@Keyword
	public void VerifySelectedTemplatedId()
	{
		try{
			boolean statusoftemplateid = action.IsElementDisplayed(templateid)
			Assert.assertTrue(statusoftemplateid)
		}
		catch(Exception e)
		{
			Assert.fail("Verify Selected Templated Id failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyNewlyCreatedExternalItemType(String newlycreatedexternalitemtype)
	{
		try{
			List<WebElement> allexternaltyepes = action.GetElements(allexternalitemtypename)
			for(int i=0;i< allexternaltyepes.size();i++)
			{
				String appearingexternalitemname = allexternaltyepes.get(i).getText()
				println ("External Item Name is -----------"+ appearingexternalitemname)
				if(appearingexternalitemname.equals(newlycreatedexternalitemtype))
				{
					println ("Newly created external item type found")
				}else{
					throw new Exception("Newly external item type is not found")
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("Verify Newly Created External Item Type failed due to "+ e)
		}
	}


	@Keyword
	public void VerifyMetaTag() {
		List<WebElement> metatags = driver.findElements(By.xpath("//*[@class='ExternalItemPlaceHolder']/fieldset[1]/table//tr/td/label//div"))
		for(Object name : metatags) {
			LocalTime currenttime = LocalTime.now()
			String expmetatag = "Test"+ currenttime
			String metatagname = name.getText()
			if(metatagname.contains("Test")) {
				println ("Created New Meta tag found")
			}
		}
	}

	@Keyword
	public void BackToItemSearchPage()
	{
		try{
			action.Click(backtotemplatesbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Back To Item Search Page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyNewlyCreatedMetatag(String newlycreatedmetatag)
	{
		try{
			action.Type(searchmetatagtextbox, newlycreatedmetatag)
			action.Enter(searchmetatagtextbox)
		}
		catch(Exception e)
		{
			Assert.fail("Verify Newly Created Metatag failed due to "+ e)
		}
	}

	@Keyword
	public void AssignMetatagWithTemplate()
	{
		try{
			action.Click(firstmetatagcheckbox)
			action.ScrollToBottomOfPage()
			boolean statusofsavebtn = action.IsElementEnabled(saveselectedbtn)
			if(statusofsavebtn == true){
				action.Click(firstmetatagcheckbox)
			}
			else{
				throw new Exception("Save Selected button is not enabled")
			}

		}catch(Exception e){
			Assert.fail("Assign Meta tag With Template failed due to "+ e)
		}
	}
}
