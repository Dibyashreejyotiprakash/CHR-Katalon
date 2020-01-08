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
	By TomarketCorpVal = By.xpath("//li[contains(text(),'339 - Demo Distributor (QA)')]")
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
	By mktremoveassociationlink = By.xpath("//div[@id='rmMarketAssociation']/a")
	By filter = By.xpath(".//*[@id='row_0_0']/td/label/span")
	By showallfilter = By.xpath("//input[@class = 'FilterCategory']")
	By viewbatchbtn = By.xpath(".//*[@id='132061']")
	By viewbatchcorptocorpassociation = By.xpath("(//span[contains(text(),'Corp To Corp')])[2]")
	By viewbatchcorptomktassociation = By.xpath("(//span[contains(text(),'Corp To Market')])[2]")
	By market = By.xpath("//span[contains(text(),'Demo Dist. 1 QA')]")
	By deleteconfirmcheckbox = By.xpath("//input[@id = 'deleteconfirm']//following-sibling::span[1]")
	By confirmremovebtn = By.xpath("//input[@id='cphMain_btnRemove']")
	By createassociationbtn = By.xpath("//button[@id='btnAdd']")
	By removebtn = By.xpath("(//a[@class = 'btn-delete'])[1]")
	By editbtn = By.xpath("(//a[@class = 'btn-edit'])[1]")
	By associationpagesearchbox = By.xpath("//input[@id='txtSearch']")
	By association = By.xpath("(//label[contains(text(),'300-Instant Impact')])[1]")
	By edittemplatebtn = By.xpath("//span[contains(text(),'Edit Template')]")


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
	public void ValidateCrossCorpPageFields()
	{
		try
		{
			action.WaitVisible(FromCorp)
			action.IsElementDisplayed(FromCorp)
			action.IsElementDisplayed(ToCorp)
			//action.IsElementDisplayed(corptocorpchkbox)
			//action.IsElementDisplayed(choosetemplatebtn)



		}
		catch(Exception e)
		{
			Assert.fail("ValidateCrossCorpPageFields Failed due to "+e)
		}


	}

	@Keyword
	public void CreateCorpToCorpAssociation()
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

				/*println("VALUE IS-->"+ action.isAttribtuePresent(ddtemplate, "checked"))
				 if(!action.isAttribtuePresent(ddtemplate, "checked"))
				 {
				 action.Click(ddtemplatetoclick)
				 action.Click(saveandexitbtn)
				 }*/



			}

			else
			{
				action.Click(corptocorpchkbox)
				action.Click(choosetemplatebtn)
				action.WaitVisible(templatesearchbox)
				action.Click(selectallchkbox)
				action.Type(templatesearchbox, "132061")
				//action.WaitVisible(ddtemplatetoclick)
				action.ScrollToViewElement(selectallchkbox)
				action.Click(ddtemplatetoclick)
				//action.ScrollToViewElement(saveandexitbtn)
				action.Click(saveandexitbtn)
			}


		}
		catch(Exception e)
		{
			Assert.fail("CreateCorpToCorpAssociation Failed due to "+e)
		}

	}


	@Keyword
	public void ValidateFilter()
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
			action.WaitVisible(filter)
			action.Click(filter)


		}
		catch(Exception e)
		{
			Assert.fail("ValidateFilter Failed due to "+e)
		}
	}

	@Keyword
	public void ValidateShowAllFilter()
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
			action.ScrollToBottomOfPage()
			action.WaitVisible(showallfilter)
			action.Click(showallfilter)


		}
		catch(Exception e)
		{
			Assert.fail("ValidateShowAllFilter Failed due to "+e)
		}
	}

	@Keyword
	public void ValidateViewBatchForCorpAssociation()
	{
		try
		{
			if(action.IsDisplayed(corptocorpchkbox))
			{
			 action.Click(corptocorpchkbox)
			 action.Click(choosetemplatebtn)
			 action.WaitVisible(templatesearchbox)
			 action.Type(templatesearchbox, "132061")
			 action.ScrollToViewElement(viewbatchbtn)
			 action.WaitVisible(viewbatchbtn)
			 action.Click(viewbatchbtn)
			 action.WaitVisible(viewbatchcorptocorpassociation)
			 action.IsElementDisplayed(viewbatchcorptocorpassociation)
			}
			else
			{
				action.ScrollToViewElement(viewbatchbtn)
				action.WaitVisible(viewbatchbtn)
				action.Click(viewbatchbtn)
				action.WaitVisible(viewbatchcorptocorpassociation)
				action.IsElementDisplayed(viewbatchcorptocorpassociation)
				
			}
			
			
		}
		catch(Exception e)
		{
			Assert.fail("ValidateViewBatchForCorpAssociation Failed due to "+e)
		}

	}

	@Keyword
	public void CreateCorpToMarketAssociation()
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
			action.Type(searchcorpfield, "339")
			action.Click(TomarketCorpVal)

			action.WaitVisible(corptocorpchkbox)
			action.ScrollToBottomOfPage()


			if(action.IsDisplayed(mktremoveassociationlink))
			{

				action.Click(market)
				action.Click(choosetemplatebtn)
				action.WaitVisible(templatesearchbox)
				action.Type(templatesearchbox, "132061")
				action.WaitVisible(ddtemplatetoclick)

				/*println("VALUE IS-->"+ action.isAttribtuePresent(ddtemplate, "checked"))
				 if(!action.isAttribtuePresent(ddtemplate, "checked"))
				 {
				 action.Click(ddtemplatetoclick)
				 action.Click(saveandexitbtn)
				 }*/



			}

			else
			{
				action.Click(market)
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
			Assert.fail("CreateCorpToMarketAssociation Failed Due to "+e)
		}

	}

	@Keyword
	public void ValidateViewBatchForMktAssociation()
	{
		try
		{
			if(action.IsDisplayed(market))
			{
			
				action.ScrollToBottomOfPage()	
				action.Click(market)
				action.Click(choosetemplatebtn)
				action.WaitVisible(templatesearchbox)
				action.Type(templatesearchbox, "132061")
				action.ScrollToBottomOfPage()
				action.WaitVisible(viewbatchbtn)
				action.Click(viewbatchbtn)
				action.WaitVisible(viewbatchcorptomktassociation)
			}
			
			action.ScrollToBottomOfPage()
			action.WaitVisible(viewbatchbtn)
			action.Click(viewbatchbtn)
			//action.WaitVisible(viewbatchcorptomktassociation)

		}
		catch(Exception e)
		{
			Assert.fail("ValidateViewBatchForMktAssociation Failed Due to "+e)

		}

	}

	@Keyword
	public void ValidateCorpRemoveAssociation()
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
				action.Click(corpremoveassociationlink)
				action.WaitVisible(deleteconfirmcheckbox)
				action.Click(deleteconfirmcheckbox)
				action.Click(confirmremovebtn)



			}

			else
			{
				action.Click(corptocorpchkbox)
				action.Click(choosetemplatebtn)
				//action.WaitVisible(templatesearchbox)
				action.ScrollToViewElement(selectallchkbox)
				action.Click(selectallchkbox)
				action.Type(templatesearchbox, "132061")
				action.WaitVisible(ddtemplatetoclick)
				action.Click(ddtemplatetoclick)
				action.Click(saveandexitbtn)
				action.WaitVisible(corpremoveassociationlink)
				action.Click(corpremoveassociationlink)
				action.WaitVisible(deleteconfirmcheckbox)
				action.Click(deleteconfirmcheckbox)
				action.Click(confirmremovebtn)
			}


		}
		catch(Exception e)
		{
			Assert.fail("ValidateCorpRemoveAssociation Failed Due to "+e)

		}

	}

	@Keyword
	public void ValidateMarketRemoveAssociation()
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
			action.Type(searchcorpfield, "339")
			action.Click(TomarketCorpVal)

			action.WaitVisible(corptocorpchkbox)
			action.ScrollToBottomOfPage()


			if(action.IsDisplayed(mktremoveassociationlink))
			{

				action.Click(mktremoveassociationlink)

				action.WaitVisible(deleteconfirmcheckbox)
				action.Click(deleteconfirmcheckbox)
				action.Click(confirmremovebtn)

				/*println("VALUE IS-->"+ action.isAttribtuePresent(ddtemplate, "checked"))
				 if(!action.isAttribtuePresent(ddtemplate, "checked"))
				 {
				 action.Click(ddtemplatetoclick)
				 action.Click(saveandexitbtn)
				 }*/



			}

			else
			{
				action.Click(market)
				action.Click(choosetemplatebtn)
				action.WaitVisible(templatesearchbox)
				action.Click(selectallchkbox)
				action.Type(templatesearchbox, "132061")
				//action.WaitVisible(ddtemplatetoclick)
				action.ScrollToViewElement(selectallchkbox)
				action.Click(ddtemplatetoclick)
				action.Click(saveandexitbtn)

				action.WaitVisible(mktremoveassociationlink)
				action.Click(mktremoveassociationlink)

				action.WaitVisible(deleteconfirmcheckbox)
				action.Click(deleteconfirmcheckbox)
				action.Click(confirmremovebtn)


			}

		}
		catch(Exception e)
		{
			Assert.fail("ValidateMarketRemoveAssociation Failed Due to "+e)
		}

	}

	@Keyword
	public void ValidateCrossCorpAssociationFields()
	{
		try
		{
			action.Refresh()
			action.WaitVisible(createassociationbtn)
			action.IsElementDisplayed(createassociationbtn)
			action.IsElementDisplayed(removebtn)
			action.IsElementDisplayed(editbtn)
			action.IsElementDisplayed(associationpagesearchbox)

		}
		catch(Exception e)
		{
			Assert.fail("ValidateCrossCorpAssociationFields Failed Due to "+e)
		}

	}

	@Keyword
	public void ValidateCreatedCorpAssociationOnAssociationPage()
	{
		try
		{
			action.Refresh()
			action.WaitVisible(associationpagesearchbox)
			action.Click(associationpagesearchbox)
			action.Type(associationpagesearchbox, "300")
			action.IsElementDisplayed(association)

		}
		catch(Exception e)
		{
			Assert.fail("ValidateCreatedCorpAssociationOnAssociationPage Failed Due to "+e)

		}

	}

	@Keyword
	public void CreateAssociationFromAssociationPage()
	{
		try
		{
			action.Refresh()
			action.WaitVisible(createassociationbtn)
			action.Click(createassociationbtn)
			action.WaitVisible(FromCorp)
			action.WaitVisible(ToCorp)

		}
		catch(Exception e)
		{
			Assert.fail("CreateAssociationFromAssociationPage Failed Due to "+e)

		}


	}

	@Keyword
	public void RemoveAssociationFromAssociationPage()
	{
		try
		{
			action.Refresh()
			action.WaitVisible(associationpagesearchbox)
			action.Type(associationpagesearchbox, "300")
			action.WaitVisible(removebtn)
			action.Click(removebtn)

		}
		catch(Exception e)
		{
			Assert.fail("RemoveAssociationFromAssociationPage Failed Due to "+e)

		}


	}

	@Keyword
	public void EditAssociationFromAssociationPage()
	{
		try
		{
			action.Refresh()
			action.WaitVisible(associationpagesearchbox)
			action.Type(associationpagesearchbox, "300")
			action.WaitVisible(editbtn)
			action.Click(editbtn)
			action.WaitVisible(edittemplatebtn)

		}
		catch(Exception e)
		{
			Assert.fail("EditAssociationFromAssociationPage Failed Due to "+e)

		}

	}

	@Keyword
	public void ValidateSearchInAssociationPage()
	{
		try
		{
			action.Refresh()
			action.WaitVisible(associationpagesearchbox)
			action.Type(associationpagesearchbox, "300")
			action.IsDisplayed(association)

		}
		catch(Exception e)
		{
			Assert.fail("ValidateSearchInAssociationPage Failed Due to "+e)
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
