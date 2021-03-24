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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bo.uat.seapay88.com/login')

WebUI.click(findTestObject('Object Repository/Page_SEAPay88 - Admin/button_Login'))

KeywordUtil.markPassed('Empty Login')

WebUI.setText(findTestObject('Object Repository/Page_SEAPay88 - Admin/input_Login_email'), 'dasdas')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SEAPay88 - Admin/input_Login_password'), 'anCg4ipU56Ivx87l0vN4Xw==')

WebUI.click(findTestObject('Object Repository/Page_SEAPay88 - Admin/button_Login'))

KeywordUtil.markPassed('login with Incorrect password and email ')

WebUI.click(findTestObject('Object Repository/Page_SEAPay88 - Admin/form_Login                  Sign In to your_aec750'))

WebUI.setText(findTestObject('Object Repository/Page_SEAPay88 - Admin/input_Login_email'), 'merchant@seapay88.com')

WebUI.setText(findTestObject('Object Repository/Page_SEAPay88 - Admin/input_Login_password'), 'sdasasdasG5Uz+cGeg==')

WebUI.click(findTestObject('Object Repository/Page_SEAPay88 - Admin/button_Login'))

KeywordUtil.markPassed('login with Incorrect password only ')

WebUI.click(findTestObject('Object Repository/Page_SEAPay88 - Admin/form_Login                  Sign In to your_aec750'))

WebUI.setText(findTestObject('Object Repository/Page_SEAPay88 - Admin/input_Login_email'), 'merchant@seapay88.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SEAPay88 - Admin/input_Login_password'), 'IfQe85NBQPy6jG5Uz+cGeg==')

WebUI.click(findTestObject('Object Repository/Page_SEAPay88 - Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_SEAPay88 - Admin/img_IP Whitelist_c-avatar-img'))

WebUI.click(findTestObject('Object Repository/Page_SEAPay88 - Admin/a_Logout'))

WebUI.closeBrowser()

