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

Mobile.tap(findTestObject('Object_Dual Currency/android.view.ViewGroup Earn Menu'), 0)

Mobile.tap(findTestObject('Object_Dual Currency/android.widget.TextView - Button Earn now'), 0)

Mobile.tap(findTestObject('Object Fixed Deposit/android.widget.LinearLayout Fixed Deposit'), 0)

Mobile.tap(findTestObject('Object Fixed Deposit/android.view.ViewGroup 1st product'), 0)

Mobile.tap(findTestObject('Object Fixed Deposit/android.widget.TextView - 25'), 0)

Mobile.tap(findTestObject('Object Fixed Deposit/android.widget.TextView - 1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Fixed Deposit/android.widget.TextView - Button Subscribe'), 0)

Mobile.tap(findTestObject('Object Fixed Deposit/android.widget.TextView - Button Confirm subscribe'), 0)

Mobile.tap(findTestObject('Object Fixed Deposit/android.view.ViewGroup view success'), 0)

Mobile.tap(findTestObject('Object Fixed Deposit/android.widget.ImageView Close'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

