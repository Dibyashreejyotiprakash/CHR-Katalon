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

CustomKeywords.'com.poswm.Homepage.ClickOnWarehouse'()

CustomKeywords.'com.poswm.WarehouseAdminWarehousePage.NavigatetoBinlist'()

 String binName = CustomKeywords.'com.poswm.WarehouseAdminWarehousePage.AddBin'()
 println ("----------> " + binName )

CustomKeywords.'com.poswm.Homepage.ClickOnItemSearch'()

CustomKeywords.'com.poswm.WarehouseAdminWarehousePage.AssociateBinWithItem'(binName)
//println ("----------> " + binName )

CustomKeywords.'com.poswm.Homepage.ClickOnWarehouse'()

//CustomKeywords.'com.poswm.WarehouseAdminWarehousePage.NavigatetoBinlist'()

CustomKeywords.'com.poswm.WarehouseAdminWarehousePage.deletebin'()

