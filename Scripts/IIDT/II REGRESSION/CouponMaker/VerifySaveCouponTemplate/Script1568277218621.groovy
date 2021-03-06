import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameiiusersite, GlobalVariable.testtypesmoke, GlobalVariable.environment)

CustomKeywords.'com.couponmaker.LoginPage.VerifyLoginPage'()

CustomKeywords.'com.couponmaker.LoginPage.LoginToCouponDemoCorp'()

CustomKeywords.'com.couponmaker.HomePage.VerifyHomePage'()

CustomKeywords.'com.couponmaker.HomePage.ClickOnPosTemplate'()

CustomKeywords.'com.couponmaker.ItemSearchPage.VerifyItemSearchPage'()

CustomKeywords.'com.couponmaker.ItemSearchPage.SelectCouponType'()

CustomKeywords.'com.couponmaker.ItemSearchPage.SelectCouponType'()

CustomKeywords.'com.couponmaker.ItemSearchPage.VerifyCouponSearchResults'()

WebUI.delay(10)

CustomKeywords.'com.couponmaker.CreateDesignPage.VerifyCreateDesignPage'()

WebUI.delay(10)

CustomKeywords.'com.couponmaker.CreateDesignPage.EnterallvaliddataAndClickOnBuyNowBtn'()

String savedcouponname = CustomKeywords.'com.couponmaker.CreateDesignPage.ClickYesAndSaveCouponTemplate'()

CustomKeywords.'com.couponmaker.ProductionSelectionPage.ClickOnLogoAndNavigateToHomepage'()

CustomKeywords.'com.couponmaker.HomePage.ClickOnProjectsLink'()

CustomKeywords.'com.couponmaker.ProjectsPage.VerifyProjectsPage'()

CustomKeywords.'com.couponmaker.ProjectsPage.VerifyFieldsInProjectsPage'(savedcouponname)



