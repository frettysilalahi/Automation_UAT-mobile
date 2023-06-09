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

Mobile.tap(findTestObject('Object_Login/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object_Login/android.widget.TextView - SKIP Welcome'), 0)

Mobile.tap(findTestObject('Object_Login/android.widget.TextView - Get started'), 0)

Mobile.setText(findTestObject('Object_Login/android.widget.EditText - E-mail'), 'fretty.s@tokenomy.com', 0)

Mobile.setText(findTestObject('Object_Login/android.widget.EditText - Password'), 'Laguboti1!', 0)

Mobile.tap(findTestObject('Object_Login/android.widget.TextView - Log in'), 0)

Mobile.setText(findTestObject('Object_Login/android.widget.EditText OTP'), '121212', 0)

Mobile.tap(findTestObject('Object_Login/android.widget.ImageView Home'), 0)

Mobile.tap(findTestObject('Object_Exchange/android.view.ViewGroup Exchange Menu'), 0)

Mobile.setText(findTestObject('Object_Exchange/android.widget.EditText - 0 send amount idk'), '2000', 0)

Mobile.tap(findTestObject('Object_Exchange/android.view.ViewGroup Exchange List'), 0)

Mobile.tap(findTestObject('Object_Exchange/android.view.ViewGroup USDT Prod'), 0)

Mobile.tap(findTestObject('Object_Exchange/android.widget.TextView - Review'), 0)

Mobile.tap(findTestObject('Object_Exchange/android.widget.TextView - Confirm exchange'), 0)

Mobile.tap(findTestObject('Object_Exchange/android.view.ViewGroup view exchange success'), 0)

Mobile.tap(findTestObject('Object_Exchange/android.widget.TextView - View Portfolio'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()