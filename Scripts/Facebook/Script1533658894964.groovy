import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Facebook/Page_Facebook  log in or sign up/input_email'), 'bubai.mitra94@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook/Page_Facebook  log in or sign up/input_pass'), 'moqCbhjTfbya7cD0kIp/Mg==')

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/Facebook/Page_Facebook  log in or sign up/input_u_0_2'))

//WebUI.waitForPageLoad(0)

//WebUI.click(findTestObject('Object Repository/Fb script/Page_Facebook/div_RemoveIf you change your m'))

not_run:WebUI.click(findTestObject('Object Repository/Facebook/Page_(2) Facebook/i__585_'))

Thread.sleep(100000)

WebUI.setText(findTestObject('Object Repository/Facebook/Page_(2) Facebook/input_q'), 'Rajesh dey')

WebUI.sendKeys(findTestObject('Object Repository/Facebook/Page_(2) Facebook/input_q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Facebook/Page_(2) Rajesh dey - Facebook Sear/div_Rajesh Dey'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_(2) Rajesh Dey/a_Message'))

WebUI.setText(findTestObject('Object Repository/Facebook/Page_(2) Rajesh Dey/textarea_message_body'), 'Hello')

WebUI.click(findTestObject('Object Repository/Facebook/Page_(2) Rajesh Dey/td_Send'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_(2) Rajesh Dey/button_Send'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_(2) Rajesh Dey/div_Account Settings'))

WebUI.click(findTestObject('Object Repository/Facebook/Page_(2) Rajesh Dey/span_Log Out'))

