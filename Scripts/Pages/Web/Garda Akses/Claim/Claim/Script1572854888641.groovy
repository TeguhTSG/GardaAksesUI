import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys1
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.delay(GlobalVariable.Delay2)

if (CheckNewMember == 1) {
	if (MemberStatus == 0) {
				WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - X'))
				
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Button - Add New Member'))
	
				WebUI.verifyElementNotPresent(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Text - New Member Name', [('NewMemberName') : NewMemberName]), GlobalVariable.Delay1)
	} else {
	WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Button - Add New Member'))
	
	WebUI.verifyElementNotPresent(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Text - New Member Name', [('NewMemberName') : NewMemberName]), GlobalVariable.Delay1)
	
	if (MemberStatus == 0) {
		WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - X'))
		}
	}
} else {
	if (Status != 3) {
		if (GLType == 'Awal') {
			if (StatusMember == '1') {
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Button - Add New Member'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Button - New Member Type'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Choose - New Member Type', [('NewMemberType') : NewMemberType]))
		
				WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Input - New Member Name'), NewMemberName)
		
				WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Input - Client Name'), ClientName)
		
				WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Input - Client Name'), ClientName)
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Choose - Client Name'))
		
				WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Input - Employee ID'), EmployeeID)
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Button - Date Picker'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Button - Month Year'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Button - Year'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Claim/Add New Member/Button - Prev Year'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Claim/Add New Member/Button - Prev Year'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Claim/Add New Member/Choose - Year', [('Year') : Year]))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Choose - Month', [('Month') : Month]))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Choose - Date'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Button - Classification'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Choose - Classification', [('Classification') : Classification]))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Button - Gender', [('Gender') : Gender]))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Add New Member/Button - Submit'))
				
				if (MemberStatus == 0) {
					WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - X'))
					}
			} else if (StatusMember == '2') {
				WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Input - Member'), Member)
		
				WebUI.delay(GlobalVariable.Delay1)
		
				WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Input - Member'), Member)
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Claim/Choose - Member'))
		
				if (MemberStatus == 0) {
					WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - X'))
				}
			}
			
			WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Input - Patient, Family Phone No'), FamilyPhoneNo)
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Button - Product Type'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Choose - Product Type', [('ProductType') : ProductType]))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Button - GL Type'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Choose - GL Type', [('GLType') : GLType]))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Button - Diagnosis'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Diagnosis/Combo - Status'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Diagnosis/List - Status', [('DiagnosisStatus') : DiagnosisStatus]))
		
			WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Diagnosis/Input - Diagnosis ID'), DiagnosisID)
		
			WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Diagnosis/Input - Diagnosis ID'), DiagnosisID)
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Diagnosis/Select - Diagnosis ID'))
		
			WebUI.delay(GlobalVariable.Delay1)
		
			WebDriver driver = DriverFactory.getWebDriver()
		
			WebUI.switchToFrame(findTestObject('Object Repository/Pages/Web/Garda Akses/Frame'), 3)
		
			WebElement diagnosis = driver.findElement(By.xpath('//*[@id="DiagnosisInfoPopUpSectionFullText-0"]/div[1]/div/div[3]/a2is-datatable/div[2]/div/table/tbody'))
		
			List<WebElement> additional_info = diagnosis.findElements(By.tagName('tr'))
		
			WebUI.switchToDefaultContent()
		
			int yes = additional_info.size()
		
			int i = 1
		
			for (a = i; a <= yes; a++) {
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Diagnosis/Radio Button - Yes', [('i') : a]))
		
				WebUI.delay(1)
			}
			
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Diagnosis/Button - Choose'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Diagnosis/Button - Submit'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Treatment Information/Look Up - Doctor'))
		
			WebUI.setText(findTestObject('Pages/Web/Garda Akses/Claim/Doctor/Input - Doctor Name'), DoctorName)
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Claim/Doctor/Button - Search'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Claim/Doctor/Choose - Doctor'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Claim/Doctor/Button - Choose'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Claim/Doctor/Button - Submit'))
		
			if (MemberStatus == 0) {
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Room Information/Look Up - Appropriate RB Class'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Room Information/Appropriate RB Class/Select - Appropriate RB Class'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Room Information/Appropriate RB Class/Button - Choose'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Room Information/Look Up - Treatment RB Class'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Room Information/Treatment RB Class/Select - Treatment RB Class'))
		
				WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Room Information/Treatment RB Class/Button - Choose'))
			}
		} else if (GLType == 'Lanjutan') {
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Button - GL Type'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Choose - GL Type', [('GLType') : GLType]))
		} else if (GLType == 'Akhir') {
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Button - GL Type'))
		
			WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Patient Information/Choose - GL Type', [('GLType') : GLType]))
		} else {
			WebUI.delay(GlobalVariable.Delay0)
		}
		
		if (Rujuk == 1) {
			WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Checkbox - Rujuk'))
		
			WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - Reason'))
		
			WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Reason Rujuk/Choose - Reason'))
		}
		
		if (NPNFU == 1) {
			WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/CheckBox - Need Follow Up'))
		}
	}
	
	if (GLType == 'Akhir') {
		WebUI.setText(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Room Information/Input - Total Billed'), TotalBilled)
	} 
		
	if (Status == 1) {
		WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - Pre-Admission'))
	} else if (Status == 2) {
		WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - Interupted Call'))
	} else if (Status == 3) {
		WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - Account Manager'))
		
		WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Account Manager/Choose - Account Manager'))
		
		WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Account Manager/Button - Submit'))
		
		WebUI.click(findTestObject('Object Repository/Pages/Web/Garda Akses/Claim/Button - Reject'))
	} else {
		WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Button - Process'))
	}
	
	WebUI.verifyElementPresent(findTestObject('Pages/Web/Garda Akses/Claim/Summary/Text - Status', [('Summary') : Summary]),
		GlobalVariable.Delay3, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.verifyElementPresent(findTestObject('Pages/Web/Garda Akses/Claim/Summary/Text - Validasi', [('Validasi') : Validasi]),
		GlobalVariable.Delay3, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim/Button - Close'))
}


