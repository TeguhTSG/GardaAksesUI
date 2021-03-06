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

//Login//
String UserID = 'DNS'

String Password = 'Password95'

//Home
String Menu = 'General'

String SubMenu = 'Create Ticket'


//Create Ticket//
def ContactLine = 'Customer'

def Product = 'Non Health'

def ChannelType = 'Call' //Bebas

def ContactName = findTestData('ContactName').getValue(1, 1)

def ContactType = 'Teman' //Bebas

def ServiceType = 'Inquiry'

def InterruptedCall = 'No' //Yes or Null

String CustomerGender = 'Male'

def ActionCT = 'Next'

//Choose Customer
def ChooseCategoryCustomer = 'Policy Holder / Relatives' // Policy Holder / Relatives or Others

def ActionCC1 = 'Next'

def SearchBy = 'Policy Number'

def Parameter = findTestData('ParameterPolicyNo').getValue(4, 1)

def ActionCC2 = 'Next'

def ActionCC3 = 'Finish'

//Inquiry//
def ProductI = 'Garda Oto'

def Category = 'Others'

def FUStatus = 'On Progress'

def FURemarks = 'Currently testing by Automation. Thanks. Regards - Me'

def Action = 'Save'

def MultipleServiceType = null

def ButtonDirection1 = 'Back'

def ButtonDirection2 = 'Process'

def ExitConfirmation1 = 'No'

def ExitConfirmation2 = 'Puas'

def ExitConfirmation3 = null

def Comment = null

//Script//
WebUI.callTestCase(findTestCase('Pages/Web/GEN5/Login/Login'), [('UserID') : UserID, ('Password') : Password])

//==================== PHASE 1 ====================
WebUI.callTestCase(findTestCase('Pages/Web/GEN5/Home/Home'), [('Menu') : Menu, ('SubMenu') : SubMenu])

WebUI.callTestCase(findTestCase('Pages/Web/Garda Akses/Create Ticket/Create Ticket'), [('ContactLine') : ContactLine, ('Product') : Product
        , ('ChannelType') : ChannelType, ('ContactName') : ContactName, ('ContactType') : ContactType, ('ServiceType') : ServiceType
        , ('InterruptedCall') : InterruptedCall, ('CustomerGender') : CustomerGender, ('Action') : ActionCT])

CustomKeywords.'querySQL.Query.QueryContactName'()

WebUI.callTestCase(findTestCase('Pages/Web/Garda Akses/Choose Customer/Choose Customer'), [('ChooseCategoryCustomer') : ChooseCategoryCustomer
        , ('ActionCC1') : ActionCC1, ('SearchBy') : SearchBy, ('Parameter') : Parameter, ('ActionCC2') : ActionCC2, ('ActionCC3') : ActionCC3])

WebUI.callTestCase(findTestCase('null'), [('Product') : ProductI, ('Categorys') : Category
        , ('FUStatus') : FUStatus, ('FURemarks') : FURemarks, ('Action') : Action, ('MultipleServiceType') : MultipleServiceType
        , ('ExitConfirmation1') : ExitConfirmation1, ('ExitConfirmation2') : ExitConfirmation2])

WebUI.comment(GlobalVariable.TicketID1)