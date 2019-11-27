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

//import internal.GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert


public class ii4crosscorpadmin
{

	WebDriver driver = DriverFactory.getWebDriver()
	Interaction action = new Interaction()


	By FromCorp = By.xpath("//span[@aria-labelledby='select2-cphMain_ddlFromCorp-container']")
	By ToCorp = By.xpath("//span[@aria-labelledby='select2-cphMain_ddlToCorp-container']")
	By searchcorpfield = By.xpath("//input[@class = 'select2-search__field']")
	By FromCorpVal = By.xpath("//li[contains(text(),'300 - Instant Impact 4.0 Demo Corp (Dist.)')]")
	By ToCorpVal = By.xpath("//li[contains(text(),'320 - Instant Impact 4.0 Demo Corp (Supp.)')]")
	By corptocorpchkbox = By.xpath("//span[contains(text(),'Corp To Corp')]//preceding-sibling::span")
	By choosetemplatebtn = By.xpath("//span[@id='cphMain_spncontinuebtntext']")
	By selectallchkbox = By.xpath("//input[@id = 'ctl00_cphMain_gvSearchResults_ctl00_ctl02_ctl00_chkSelect']//following-sibling::span")
	By firstchkbox = By.xpath("//input[@id = 'ctl00_cphMain_gvSearchResults_ctl00_ctl04_chkSelect']//following-sibling::span")
	By saveandexitbtn = By.xpath("//input[@id = 'cphMain_btnApply']")
	By confirmmssg = By.xpath("//div[contains(text(),'The Cross Corp Association is being set up')]")
	By updatebtn = By.xpath("//input[@id='cphMain_btnApply']")
	By templatesearchbox = By.xpath("//input[@id='txtTemplateSearch']")
	By ddtemplate = By.xpath("//input[@class = '132061']")
	By ddtemplatetoclick = By.xpath("//input[@class = '132061']//following-sibling::span")
	By corpremoveassociationlink = By.xpath("//div[@id='rmCorpAssociation']/a")
	By noresultmssg = By.xpath("//div[@class = 'row']//div[contains(text(),'No result found')]")


	@Keyword
	public void ValidateCrossCorpTimeout()
	{
		try
		{
			action.WaitVisible(FromCorp)
			action.WaitVisible(ToCorp)
			action.Click(FromCorp)
			action.WaitVisible(searchcorpfield)
			action.Type(searchcorpfield, "300")
			action.Click(FromCorpVal)
			WebUI.delay(2)
			action.Click(ToCorp)
			action.WaitVisible(searchcorpfield)
			action.Type(searchcorpfield, "320")
			action.Click(ToCorpVal)

			action.WaitVisible(corptocorpchkbox)
			action.Click(corptocorpchkbox)
			action.Click(choosetemplatebtn)
			WebUI.delay(5)
			action.WaitVisible(selectallchkbox)
			action.Click(selectallchkbox)
			WebUI.delay(5)
			action.Click(firstchkbox)
			WebUI.delay(4)

			if(action.IsDisplayed(saveandexitbtn))
			{
				action.Click(saveandexitbtn)
			}
			else
			{
				action.Click(updatebtn)
			}


		}
		catch(Exception e)
		{
			Assert.fail("ValidateCrossCorpTimeout Failed due to "+e)
		}
	}

	@Keyword
	public void CrossCorpDDTemplate()
	{
		try
		{
			action.WaitVisible(FromCorp)
			action.WaitVisible(ToCorp)
			action.Click(FromCorp)
			action.WaitVisible(searchcorpfield)
			action.Type(searchcorpfield, "300")
			action.Click(FromCorpVal)
			WebUI.delay(2)
			action.Click(ToCorp)
			action.WaitVisible(searchcorpfield)
			action.Type(searchcorpfield, "320")
			action.Click(ToCorpVal)

			action.WaitVisible(corptocorpchkbox)



			if(action.IsDisplayed(corpremoveassociationlink))
			{
				action.Click(corptocorpchkbox)
				action.Click(choosetemplatebtn)
				action.WaitVisible(templatesearchbox)
				action.Type(templatesearchbox, "132061")
				action.WaitVisible(ddtemplatetoclick)
				println("VALUE IS-->"+ action.isAttribtuePresent(ddtemplate, "checked"))

				if(!action.isAttribtuePresent(ddtemplate, "checked"))
				{
					action.Click(ddtemplatetoclick)
					action.Click(saveandexitbtn)
				}



			}

			else
			{
				action.Click(corptocorpchkbox)
				action.Click(choosetemplatebtn)
				action.WaitVisible(templatesearchbox)
				action.Click(selectallchkbox)
				action.Type(templatesearchbox, "132061")
				action.WaitVisible(ddtemplatetoclick)
				action.Click(ddtemplatetoclick)
				action.Click(saveandexitbtn)
			}




		}
		catch(Exception e)
		{
			Assert.fail("CrossCorpDDTemplate Failed due to "+e)
		}
	}
	
	@Keyword
	public void ValidateStaticouponTemplateInCrossCorp()
	{
		try
		{
			action.WaitVisible(FromCorp)
			action.WaitVisible(ToCorp)
			action.Click(FromCorp)
			action.WaitVisible(searchcorpfield)
			action.Type(searchcorpfield, "300")
			action.Click(FromCorpVal)
			WebUI.delay(2)
			action.Click(ToCorp)
			action.WaitVisible(searchcorpfield)
			action.Type(searchcorpfield, "320")
			action.Click(ToCorpVal)

			action.WaitVisible(corptocorpchkbox)
			action.Click(corptocorpchkbox)
			action.Click(choosetemplatebtn)
			action.WaitVisible(templatesearchbox)
			action.Type(templatesearchbox, "108477")
			action.IsElementDisplayed(noresultmssg)

		}
		catch(Exception e)
		{
			Assert.fail("ValidateStaticouponTemplateInCrossCorp Failed due to "+e)
		}
	}

}
