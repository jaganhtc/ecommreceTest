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

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/CheckOut/Page_Customer Login/input_Email_loginusername'), 'mskrish@123.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CheckOut/Page_Customer Login/input_Password_loginpassword'), 'sdGpgyGk7wy70wWFNp6bxA==')

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Home Page/input_Search_q'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Home Page/span_Whats New'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Whats New/a_Pants'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Whats New/a_Hoodies  Sweatshirts'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Hoodies  Sweatshirts - Tops - Women/a_Circe Hooded Ice Fleece'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Circe Hooded Ice Fleece/div_L'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Circe Hooded Ice Fleece/div_Color_option-label-color-93-item-53'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Circe Hooded Ice Fleece/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Circe Hooded Ice Fleece/span_2'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Circe Hooded Ice Fleece/button_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/CheckOut/Page_Checkout/input_Company_company'), 'demo')

WebUI.setText(findTestObject('Object Repository/CheckOut/Page_Checkout/input_Street Address Line 1_street0'), 'line1')

WebUI.setText(findTestObject('Object Repository/CheckOut/Page_Checkout/input_City_city'), 'chennapattinam')

WebUI.selectOptionByValue(findTestObject('Object Repository/CheckOut/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    '18', true)

WebUI.setText(findTestObject('Object Repository/CheckOut/Page_Checkout/input_ZipPostal Code_postcode'), '12345')

WebUI.setText(findTestObject('Object Repository/CheckOut/Page_Checkout/input_Phone Number_telephone'), '1234567890')

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Checkout/input_Best Way_ko_unique_8'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Checkout/input_Carrier Title_ko_unique_7'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Checkout/span_Place Order'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Success Page/button_Change'))

WebUI.click(findTestObject('Object Repository/CheckOut/Page_Success Page/a_Sign Out'))

WebUI.rightClick(findTestObject('Object Repository/CheckOut/Page_/span_You are signed out'))

