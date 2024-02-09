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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Amazon_Delete_Item_FromCart_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'chemistry book')

WebUI.click(findTestObject('Object Repository/Amazon_Delete_Item_FromCart_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Delete_Item_FromCart_OR/Page_Amazon.com  chemistry book/span_Workman Publishing Company - To Ace Ch_e4e63f'))

WebUI.click(findTestObject('Object Repository/Amazon_Delete_Item_FromCart_OR/Page_Chemistry Made Easy An Illustrated Study Guide For Students To Easily Learn Chemistry NEDU 9781952914058 Amazon.com Books/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Shopping Cart/span_Go to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Shopping Cart/input_Chemistry Made Easy An Illustrated Study Guide For Students To Easily Learn Chemistry_submit.delete.7f574522-d287-4868-9a9b-3bd222b033d4'))

WebUI.closeBrowser()

