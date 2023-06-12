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

Mobile.startApplication('D:\\11419057_Fretty L M Silalahi\\Tokenomy\\2.9.0-UAT.apk', true)

Mobile.tap(findTestObject('Object Repository/Object_Login/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Object_Login/android.widget.TextView - SKIP (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Object_Login/android.widget.TextView - Get started'), 0)

Mobile.setText(findTestObject('Object_Login/android.widget.EditText - E-mail'), 'fretty.s@tokenomy.com', 0)

Mobile.setEncryptedText(findTestObject('Object_Login/android.widget.EditText - Password'), 'M8WMB2P9gOTVnYMOk4llWg==', 0)

Mobile.tapAndHold(findTestObject('Object_Login/android.widget.EditText - email user'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/Object_Login/android.widget.EditText - pass'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Object_Login/android.widget.TextView - Log in'), 0)

Mobile.setText(findTestObject('Object Repository/Object_Login/android.widget.EditText'), '121212', 0)

Mobile.tap(findTestObject('Object Repository/Object_Login/android.widget.TextView - Not now'), 0)

Mobile.tap(findTestObject('Object_Menu/android.view.ViewGroup Profile Menu'), 0)

Mobile.tap(findTestObject('Object_Profile/General/android.view.ViewGroup Profile Setting'), 0)

Mobile.tap(findTestObject('Object_Profile/General/android.view.ViewGroup Setting Theme'), 0)

Mobile.tap(findTestObject('Object_Profile/General/android.view.ViewGroup Dark theme'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

