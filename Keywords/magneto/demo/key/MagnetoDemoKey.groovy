package magneto.demo.key

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetText

import groovy.transform.ConditionalInterrupt
import internal.GlobalVariable

public class MagnetoDemoKey {


	@Keyword
	def openBrowser (String url) {

		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()

	}

	@Keyword
	def closeBrowser () {

		WebUI.closeBrowser()
	}

	@Keyword
	def SignOut () {

		WebUI.click(findTestObject('Object Repository/SignOn/Page_My Account/button_Change'))
		WebUI.click(findTestObject('Object Repository/SignOn/Page_My Account/btnSignOut'))
	}

	@Keyword
	public String getEmail(String suffix,String prefix){
		int randomNo = (int)(Math.random() * 1000);
		return suffix + randomNo + "@" + prefix;
	}

	@Keyword
	def Login (String username,String password) {

		WebUI.click(findTestObject('Object Repository/Login/Page_Home Page/btnSignIn'))

		WebUI.sendKeys(findTestObject('Object Repository/Login/linkCustomerLogin/txtusername'), GlobalVariable.username)
		WebUI.sendKeys(findTestObject('Object Repository/Login/linkCustomerLogin/txtpassword'), GlobalVariable.password)

		WebUI.click(findTestObject('Object Repository/Login/linkCustomerLogin/span_Sign In'))

		WebUI.takeScreenshot('C:\\Users\\Dell\\Katalon Studio\\MagentoSoftwareTestingBoard\\Screenshots\\Login.PNG')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Home Page/button_Change'), 5)
	}

	@Keyword
	def addProducToCart (String product,String info,String addtocart) {

		WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'), product)

		WebUI.click(findTestObject('Object Repository/Page_Home Page/li_Juno Jaket1'))

		WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/div_M'))

		WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/span_Add to Cart'))

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Juno Jacket/div_You need to choose options for your item'),
				info)

		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/div_SizeL'))

		WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/selectColor'))

		WebUI.setText(findTestObject('Object Repository/Page_Juno Jacket/input_Quantity'), '2')
		//WebUI.setText(findTestObject('Object Repository/Page_Juno Jacket/input_Quantity'), 2)
		//WebUI.setText(findTestObject('Object Repository/Page_Juno Jacket/input_Quantity'), quantity)

		WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/span_Add to Cart'))

		WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/span_1'))

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Juno Jacket/div_You added Juno Jacket to your shopping cart'),
				addtocart)

		String productscountinbasket =

				WebUI.getAttribute(findTestObject("Object Repository/AddToCart/Page_Juno Jacket/labelProductCount"),
				"data-qty-value")

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Wish List/button_Proceed to Checkout'), 0)

		WebUI.takeScreenshot('C:\\Users\\Dell\\Katalon Studio\\MagentoSoftwareTestingBoard\\Screenshots\\Cart.PNG')

		WebUI.click(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/btnClose'))
	}


	@Keyword
	def CheckOutProduct (String product) {

		WebUI.verifyElementPresent(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/linkShoppingCart'), 1)
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/linkShoppingCart'))

		WebUI.click(findTestObject('Object Repository/CheckOut/btnProceedToCheckOut'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Checkout/selectShippingMethod'), 0)

		WebUI.click(findTestObject('Object Repository/Page_Checkout/selectShippingMethod'))

		WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))

		WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Success Page/span_Thank you for your purchase'), 'Thank you for your purchase!')

		WebUI.click(findTestObject('Object Repository/Page_Success Page/span_Continue Shopping'))

		WebUI.takeScreenshot('C:\\Users\\Dell\\Katalon Studio\\MagentoSoftwareTestingBoard\\Screenshots\\Checkout.PNG')
	}


	@Keyword

	def createAnAccount(String firstname,String lastname,String email,String password,String confirmpassword,String message) {

		WebUI.click(findTestObject('Object Repository/SignOn/Page_Home Page/linkCreate an Account'))


		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtFirstName'), GlobalVariable.firstname)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtLastName'), GlobalVariable.lastname)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtEmail'),getEmail(firstname, 'test.com'))
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtPassword'), GlobalVariable.password)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtConfirmPassword'), GlobalVariable.password)
		WebUI.click(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/labelCreate an Account'))

		WebUI.getText(findTestObject('Object Repository/SignOn/Page_My Account/labelMessage'))
		WebUI.verifyElementText(findTestObject('Object Repository/SignOn/Page_My Account/labelMessage'),message)

		WebUI.takeScreenshot('C:\\Users\\Dell\\Katalon Studio\\MagentoSoftwareTestingBoard\\Screenshots\\CreateAnAccount.PNG')
	}

	@Keyword

	def duplicateUserValidation(String firstname,String lastname,String email,String password,String confirmpassword,String message) {

		WebUI.click(findTestObject('Object Repository/SignOn/Page_Home Page/linkCreate an Account'))


		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtFirstName'), GlobalVariable.firstname)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtLastName'), GlobalVariable.lastname)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtEmail'),GlobalVariable.email)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtPassword'), GlobalVariable.password)
		WebUI.sendKeys(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/txtConfirmPassword'), GlobalVariable.password)
		WebUI.click(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/labelCreate an Account'))

		WebUI.getText(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/divAccountAlreadyExist'))
		WebUI.verifyElementText(findTestObject('Object Repository/SignOn/Page_Create New Customer Account/divAccountAlreadyExist'),message)

		WebUI.takeScreenshot('C:\\Users\\Dell\\Katalon Studio\\MagentoSoftwareTestingBoard\\Screenshots\\CreateAnAccount.PNG')
	}


	@Keyword
	def invalidSearch (String product) {

		WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'),GlobalVariable.invalidSearch)

		WebUI.click(findTestObject('Object Repository/Page_Home Page/btnSearch'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/alertInfo'), 1)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Home Page/alertInfo'), GlobalVariable.info)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/infoItemsToCompare'), 1)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Home Page/infoItemsToCompare'), GlobalVariable.noitemstocompare)
	}

	@Keyword
	def validSearch (String product) {

		WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'),product)
		WebUI.click(findTestObject('Object Repository/Page_Home Page/btnSearch'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/labelTotal'), 1)
		WebUI.getText(findTestObject('Object Repository/Page_Home Page/labelTotal'))
	}


	/*@Keyword
	 def removeItemsFromCart (String alert,String message) {
	 WebUI.wait(2)
	 WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/btnCartBasket'))
	 WebUI.click(findTestObject('Object Repository/AddToCart/Page_Home Page/btnRemove'))
	 WebUI.verifyAlertPresent(1)
	 WebUI.getText(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/alertToConfirmRemoveProduct'))
	 WebUI.verifyElementText(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/alertToConfirmRemoveProduct'), alert)
	 WebUI.click(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/span_OK'))
	 WebUI.verifyElementText(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/infoCartEmpty'), message)
	 WebUI.click(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/btnClose'))	
	 }*/

	@Keyword
	def removeItemsFromCart(String alert, String message) {
		try {
			WebUI.waitForElementVisible(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/btnCartBasket'), 10)
			WebUI.click(findTestObject('Object Repository/AddToCart/Page_Juno Jacket/btnCartBasket'))

			WebUI.waitForElementVisible(findTestObject('Object Repository/AddToCart/Page_Home Page/btnRemove'), 10)
			WebUI.click(findTestObject('Object Repository/AddToCart/Page_Home Page/btnRemove'))
			WebUI.verifyElementText(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/alertToConfirmRemoveProduct'), alert)
			WebUI.click(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/span_OK'))
			WebUI.verifyElementText(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/infoCartEmpty'), message)
			WebUI.click(findTestObject('Object Repository/AddToCart/ModalPopup/Page_Home Page/btnClose'))
		} catch (Exception e) {
			println("Exception encountered: " + e.getMessage())
			throw e
		}
	}

	@Keyword
	def addProductToWishListAndCompare(String messagewlist, String messagecompare) {
		try {

			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Watches - Gear/span_Gear'))

			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Gear/a_Watches'))

			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Watches - Gear/a_Bolo Sport Watch'))

			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Bolo Sport Watch/span_Add to Wish List'))

			WebUI.verifyElementText(findTestObject('Object Repository/AddToCart/AddToWishList/Page_My Wish List/div_Bolo Sport Watch has been added to your_c1ac09'),
					messagewlist)

			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Watches - Gear/span_Gear'))

			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Gear/a_Watches'))

			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Watches - Gear/a_Didi Sport Watch'))

			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Bolo Sport Watch/span_Add to Compare'))

			WebUI.verifyElementText(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Bolo Sport Watch/div_You added product Bolo Sport Watch to t_e69686'),
					messagecompare)

			WebUI.click(findTestObject('Object Repository/AddToCart/AddToWishList/Page_Bolo Sport Watch/a_comparison list'))

			WebUI.verifyElementText(findTestObject("Object Repository/AddToCart/AddToWishList/Page_Watches - Gear/pageCompareProducts"), 'Compare Products')
		} catch (Exception e) {
			println("Exception encountered: " + e.getMessage())
			throw e
		}
	}
}
