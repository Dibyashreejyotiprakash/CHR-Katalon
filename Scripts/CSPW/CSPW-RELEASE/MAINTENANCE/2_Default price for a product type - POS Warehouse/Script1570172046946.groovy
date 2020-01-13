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

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameposw, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.poswm.LoginPage.PoswLogin'(GlobalVariable.posusername, GlobalVariable.pospassword)

CustomKeywords.'com.poswm.Homepage.HoverOnWareHouseMenu'()

CustomKeywords.'com.poswm.Homepage.ClickOnItemProperties'()

CustomKeywords.'com.poswm.TypesAdmin.ClickOnItemPropertyDropDown'()

CustomKeywords.'com.poswm.TypesAdmin.SelectProductType'()

CustomKeywords.'com.poswm.TypesAdmin.VerifyDefoultPriceLabel'()

String itemPropertyName =  CustomKeywords.'com.poswm.TypesAdmin.ClickAndAddNewItemProperty'()
println "==========" + itemPropertyName

CustomKeywords.'com.poswm.TypesAdmin.SearchItemProperty'(itemPropertyName)

 String actualDefoultPrice  = CustomKeywords.'com.poswm.TypesAdmin.GetDefoultPrice'()
 
 println "==========" + actualDefoultPrice
 
 CustomKeywords.'com.poswm.Homepage.HoverOnWareHouseMenu'()
 
 CustomKeywords.'com.poswm.Homepage.ClickOnNewItem'()
 
 CustomKeywords.'com.poswm.WarehouseItem.SelectSpecificProductType'(itemPropertyName)
 
 CustomKeywords.'com.poswm.WarehouseItem.VerifyUnitCostPrice'(actualDefoultPrice)
 