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

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'mskrish@123.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'sdGpgyGk7wy70wWFNp6bxA==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'), 'juno jaket')

WebUI.click(findTestObject('Object Repository/Page_Home Page/span_Juno Jaket'))

WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/div_View asGridList1 Item Show12 24 36 per _f0dbd4'))

WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Search results for Juno Jaket/span_Add to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Juno Jacket/div_You need to choose options for your item'), 
    'You need to choose options for your item.')

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_You need to choose options for your item'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_Color_option-label-color-93-item-57'))

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/div_Juno Jacket Rating87 of 1003ReviewsAdd _7d8147'))

WebUI.setText(findTestObject('Object Repository/Page_Juno Jacket/input_Qty_qty'), '2')

WebUI.click(findTestObject('Object Repository/Page_Juno Jacket/span_Add to Wish List'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Wish List/div_Juno Jacket has been added to your Wish_2102e2'), 
    'Juno Jacket has been added to your Wish List. Click here to continue shopping.')

WebUI.click(findTestObject('Object Repository/Page_My Wish List/div_Juno Jacket has been added to your Wish_2102e2'))

WebUI.click(findTestObject('Object Repository/Page_My Wish List/span_Add All to Cart'))

WebUI.click(findTestObject('Object Repository/Page_My Wish List/a_My Cart33items'))

WebUI.click(findTestObject('Object Repository/Page_My Wish List/button_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Best Way_ko_unique_2'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/div_3                        Items in Cart'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/div_Order Summary                          _e5aaed'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/div_'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Apply Discount Code'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Enter discount code_discount_code'), '1234')

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Apply Discount'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/div_The coupon code isnt valid. Verify the _726a8b'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Checkout/input_Enter discount code_discount_code'), 0)

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

WebUI.click(findTestObject('Object Repository/Page_Success Page/div_Thank you for your purchase Print receipt'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Success Page/body_div classmessage global noscript      _622716'), 
    '<div class="message global noscript">\n <div class="content">\n <p>\n <strong>JavaScript seems to be disabled in your browser.</strong>\n <span>For the best experience on our site, be sure to turn on Javascript in your browser.</span>\n </p>\n </div>\n </div>\n \n\n\nThis is a demo store to test your test automaiton scripts. No orders will be fulfilled. If you are facing any issue, email us at hello@softwaretestingboard.com.\n\n\n\n window.cookiesConfig = window.cookiesConfig || {};\n window.cookiesConfig.secure = true;\n\n\n require.config({\n map: {\n \'*\': {\n wysiwygAdapter: \'mage/adminhtml/wysiwyg/tiny_mce/tinymce4Adapter\'\n }\n }\n });\n\n\n\nSkip to Content \n\n \n\nWelcome, krish ms!\n\n\n\n\n\n\n\nChange\n\n\n\n\nMy Account\nMy Wish List \n\n\n\n\n\nSign Out \n\n \n\n\n\nSign Out \n\nToggle Nav\n\n\n\n\n\nMy Cart\n\n0\n\n\n\n\n\n\n\n window.checkout = {"shoppingCartUrl":"https:\\/\\/magento.softwaretestingboard.com\\/checkout\\/cart\\/","checkoutUrl":"https:\\/\\/magento.softwaretestingboard.com\\/checkout\\/","updateItemQtyUrl":"https:\\/\\/magento.softwaretestingboard.com\\/checkout\\/sidebar\\/updateItemQty\\/","removeItemUrl":"https:\\/\\/magento.softwaretestingboard.com\\/checkout\\/sidebar\\/removeItem\\/","imageTemplate":"Magento_Catalog\\/product\\/image_with_borders","baseUrl":"https:\\/\\/magento.softwaretestingboard.com\\/","minicartMaxItemsVisible":5,"websiteId":"1","maxItemsToDisplay":10,"storeId":"1","storeGroupId":"1","customerLoginUrl":"https:\\/\\/magento.softwaretestingboard.com\\/customer\\/account\\/login\\/referer\\/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jaGVja291dC9vbmVwYWdlL3N1Y2Nlc3Mv\\/","isRedirectRequired":false,"autocomplete":"off","captcha":{"user_login":{"isCaseSensitive":false,"imageHeight":50,"imageSrc":"","refreshUrl":"https:\\/\\/magento.softwaretestingboard.com\\/captcha\\/refresh\\/","isRequired":false,"timestamp":1724673132}}};\n \n\n\n\n\n\n \n My Cart\n 0\n \n\n\n\n \n Close\n \n\n \n\n \n\n \n You have no items in your shopping cart.\n \n \n\n \n\n \n\n\n\n\n\n\nSearch\n\n\n\n\nSearch\n\n\n\n\n\n\nAdvanced Search \n\n\n\n\n\nSearch\n\n\n\n\n\n\n\nCompare Products 0 items\n\n\n\n \n\n\n\nMenu \n\n\n\n\nWhat\'s NewWomenTopsJacketsHoodies & SweatshirtsTeesBras & TanksBottomsPantsShortsMenTopsJacketsHoodies & SweatshirtsTeesTanksBottomsPantsShortsGearBagsFitness EquipmentWatchesTrainingVideo DownloadSale \n\n\n\n\nAccount \n\n\n \n\nWelcome, krish ms!\n\n\n\n\n\n\n\nChange\n\n\n\n\nMy Account\nMy Wish List \n\n\n\n\n\nSign Out \n\n \n\n\n\nSign Out \n\n\n\n\n\n\n\nThank you for your purchase! \n\nPrint receipt \n\n\n\n\n\n\n\n\n\n window.authenticationPopup = {"autocomplete":"off","customerRegisterUrl":"https:\\/\\/magento.softwaretestingboard.com\\/customer\\/account\\/create\\/","customerForgotPasswordUrl":"https:\\/\\/magento.softwaretestingboard.com\\/customer\\/account\\/forgotpassword\\/","baseUrl":"https:\\/\\/magento.softwaretestingboard.com\\/"};\n \n\n\n\n\n\n\n\n\n\n\n\n <div id="map-popup-click-for-price" class="map-popup">\n <div class="popup-header">\n <strong class="title" id="map-popup-heading-price"></strong>\n </div>\n <div class="popup-content">\n <div class="map-info-price" id="map-popup-content">\n <div class="price-box">\n <div class="map-msrp" id="map-popup-msrp-box">\n <span class="label">Price</span>\n <span class="old-price map-old-price" id="map-popup-msrp">\n <span class="price"></span>\n </span>\n </div>\n <div class="map-price" id="map-popup-price-box">\n <span class="label">Actual Price</span>\n <span id="map-popup-price" class="actual-price"></span>\n </div>\n </div>\n <form action="" method="POST" class="map-form-addtocart">\n <input type="hidden" name="product" class="product_id" value="" />\n <button type="button"\n title="Add&#x20;to&#x20;Cart"\n class="action tocart primary">\n <span>Add to Cart</span>\n </button>\n <div class="additional-addtocart-box">\n </div>\n </form>\n </div>\n <div class="map-text" id="map-popup-text">\n Our price is lower than the manufacturer&#039;s &quot;minimum advertised price.&quot; As a result, we cannot show you the price in catalog or the product page. <br><br> You have no obligation to purchase the product once you know the price. You can simply remove the item from your cart. </div>\n </div>\n </div>\n \n\n <div id="map-popup-what-this" class="map-popup">\n <div class="popup-header">\n <strong class="title" id="map-popup-heading-what-this"></strong>\n </div>\n <div class="popup-content">\n <div class="map-help-text" id="map-popup-text-what-this">\n Our price is lower than the manufacturer&#039;s &quot;minimum advertised price.&quot; As a result, we cannot show you the price in catalog or the product page. <br><br> You have no obligation to purchase the product once you know the price. You can simply remove the item from your cart. </div>\n </div>\n </div>\n \n\nYour order number is: 000016181.\nWe\'ll email you an order confirmation with details and tracking info.\n\n\nContinue Shopping\n\n\n\n\n\nNotes \nPractice API Testing using Magento 2\nWrite for us\nSubscribe\n\nSearch TermsPrivacy and Cookie PolicyAdvanced Search\nEarn money testing websites and apps Join our freelance testing community Become a Testerjoin.test.ioAds by EthicalAds×\n\nWe know you have an assignment to complete. If this site is not functioning as expected, drop us an email. Copyright © 2013-present Magento, Inc. All rights reserved.\n\n \n\nid("maincontent")/div[@class="page-title-wrapper"]/h1[@class="page-title"]/span[@class="base"]\n\n\n \n \n \n \n \n Close\n \n \n \n \n \n Checkout as a new customer\n \n \n Creating an account has many benefits:\n \n See order and shipping status\n Track order history\n Check out faster\n \n \n \n \n Create an Account\n \n \n \n \n \n\n \n \n Checkout using your account\n \n \n \n\n \n \n\n\n \n \n \n \n \n \n Email Address\n \n \n \n \n \n Password\n \n \n \n \n \n \n\n\n\n \n \n \n \n \n Sign In\n \n \n \n \n Forgot Your Password?')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Success Page/p_Well email you an order confirmation with_2423d5'), 
    'We\'ll email you an order confirmation with details and tracking info.')

WebUI.click(findTestObject('Object Repository/Page_Success Page/div_Skip to Content  Welcome, krish msChang_e9730d'))

WebUI.click(findTestObject('Object Repository/Page_Success Page/button_Change'))

WebUI.click(findTestObject('Object Repository/Page_Success Page/a_Sign Out'))

