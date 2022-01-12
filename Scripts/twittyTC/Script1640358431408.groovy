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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://sauron.dev.commsult.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/twitty/Page_Twitty/div_Log in'))

WebUI.setText(findTestObject('Object Repository/twitty/Page_Twitty/input_Login_email'), 'josep')

WebUI.setEncryptedText(findTestObject('Object Repository/twitty/Page_Twitty/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/twitty/Page_Twitty/div_Login'))

WebUI.setText(findTestObject('Object Repository/twitty/Page_Twitty/input_Home_tweetInput'), 'yohana')

WebUI.click(findTestObject('Object Repository/twitty/Page_Twitty/input_News_checkboxAds'))

WebUI.click(findTestObject('Object Repository/twitty/Page_Twitty/input_Ads_checkboxCommercial'))

WebUI.click(findTestObject('Object Repository/twitty/Page_Twitty/div_EntertainmentNewsAdsCommercial Tweet'))

WebUI.click(findTestObject('Object Repository/twitty/Page_Twitty/div_Tweet'))

WebUI.closeBrowser()

