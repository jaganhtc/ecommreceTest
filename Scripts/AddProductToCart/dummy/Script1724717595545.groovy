import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'mskrish@123.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'sdGpgyGk7wy70wWFNp6bxA==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'), 'juno jaket')

WebUI.click(findTestObject('Object Repository/Page_Home Page/span_Juno Jaket'))

WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/span_Add to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Juno Jacket/div_You need to choose options for your item'), 
    'You need to choose options for your item.')

WebUI.mouseOver(findTestObject('Object Repository/Page_Juno Jacket/div_You need to choose options for your item'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_Color_option-label-color-93-item-53'))

WebUI.setText(findTestObject('Object Repository/Page_Juno Jacket/input_Qty_qty'), '4')

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/span_Add to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Juno Jacket/div_You added Juno Jacket to your shopping cart'), 
    'You added Juno Jacket to your shopping cart.')

