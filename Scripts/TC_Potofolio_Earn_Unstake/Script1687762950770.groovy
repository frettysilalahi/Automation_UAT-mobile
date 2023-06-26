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

Mobile.startApplication('D:\\11419057_Fretty L M Silalahi\\Tokenomy\\2.9.2-UAT.apk', true)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - SKIP (1)'), 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - Get started'), 0)

Mobile.setText(findTestObject('Object Repository/unstake/android.widget.EditText - E-mail'), 'fretty.s@tokenomy.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/unstake/android.widget.EditText - Password'), 'M8WMB2P9gOTVnYMOk4llWg==', 
    0)

Mobile.tapAndHold(findTestObject('unstake/android.widget.EditText - email'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/unstake/android.widget.EditText - passwords'), 0, 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - Log in'), 0)

Mobile.setText(findTestObject('Object Repository/unstake/android.widget.EditText'), '121212', 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - Not now'), 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - Unstake'), 0)

Mobile.setText(findTestObject('Object Repository/unstake/android.widget.EditText - 0.0'), '1', 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - Unstake (1)'), 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - Confirm unstake'), 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - View My Earnings'), 0)

Mobile.tap(findTestObject('Object Repository/unstake/android.widget.TextView - Earn'), 0)

Mobile.closeApplication()

