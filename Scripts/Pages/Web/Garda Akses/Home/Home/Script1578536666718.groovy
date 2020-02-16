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


//def AlertPresent = WebUI.verifyElementVisible(findTestObject('Object Repository/Pages/Web/Garda Akses/Home/Button - Menu', ['Menu' : Menu]))
//
//if (!AlertPresent) {
//	WebUI.dismissAlert()
//} else {
//	WebUI.delay(0)
//}
//
//WebUI.delay(GlobalVariable.Delay0)

//WebUI.waitForElementVisible(findTestObject('Object Repository/Pages/Web/Garda Akses/Home/Text - Screen ARCWFMN01'), GlobalVariable.Delay7)

CustomKeywords.'gardaAkses.PopUp.TrayCTI'()

def SubMenuNotPresent = WebUI.verifyElementNotPresent(findTestObject('Object Repository/Pages/Web/Garda Akses/Home/Button - Sub Menu', ['SubMenu' : SubMenu]), GlobalVariable.Delay3)

if (SubMenuNotPresent) {
	WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Home/Button - Menu', ['Menu' : Menu]))
} else {
	WebUI.delay(0)
}

WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Home/Button - Sub Menu', ['Menu' : Menu, 'SubMenu' : SubMenu]))