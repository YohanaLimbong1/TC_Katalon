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

WebUI.openBrowser('https://www.wish.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('wish/halamanUtama/firstNameEditText'), 'Yohana')

WebUI.setText(findTestObject('wish/halamanUtama/lastNameEditText'), 'Limbong')

WebUI.setText(findTestObject('wish/halamanUtama/emailAddressEditText'), 'yohanaclimbong@gmail.com')

WebUI.setEncryptedText(findTestObject('wish/halamanUtama/passwordEditText'), 'sKwWg7Q9GUpzCbvaGSmbJg==')

WebUI.click(findTestObject('wish/halamanUtama/signUpButton'))

WebUI.setText(findTestObject('wish/halamanUtama/searchEditText'), 'android')

WebUI.delay(1)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

