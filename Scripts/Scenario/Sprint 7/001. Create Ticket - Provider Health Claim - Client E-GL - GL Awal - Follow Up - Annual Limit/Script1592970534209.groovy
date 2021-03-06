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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.keyword.GEN5 as GEN5
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//Login//
String UserID = 'DNS'

String Password = 'Password95'

//Home
String Menu = 'General'

String SubMenu = 'Create Ticket'

//Create Ticket//
String ContactLine = 'Provider'

String Product = 'Health'

String ChannelType = 'Call'

String ContactName = findTestData('ContactName').getValue(1, 1)

String ContactType = 'Farmasi'

String ServiceType = 'Claim'

String InterruptedCall = 'No'

String ProviderName = 'OJKSH00001 - SILOAM HOSPITALS KEBON JERUK'

String ActionCT = 'Next'

//Create GL Inquiry
String Phase = '1'

//Claim
//String Member = 'Existing' //Member = Existing  / New / Check

//String MemberName = '00091 - A/00136451 - ANANG MAZFUAD - PT Sahabat Finansial Keluarga'

//String MemberName = '00003 - M/00080165 - MUHAMMAD KURNIAWAN - PT SAHABAT FINANSIAL KELUARGA'

String MemberName = '00038 - L/00016180 - LIM BUI HO - PT SAHABAT FINANSIAL KELUARGA'

String ProductType = 'Inpatient'

String GLType = 'Awal'

String EditTreatmentPeriodStart = 'No'

String TreatmentPeriodStart = ''

String EditTreatmentPeriodEnd = 'No'

String SpecialCondition = 'No'

String SpecialConditionReason = ''

ArrayList StatusDiagnosa = ['Initial Primary']

ArrayList DiagnosisID = ['A09']

String DoctorName = 'Automation Doctor - Me'

String Rujuk = 'No'

String Reason = ''

String AppropriateRBClass = 'STANDARD'

String TreatmentRBClass = 'STANDARD'

String RoomOptionAvailability = 'NAPS - Room Not Available'

String NewDocument = 'No'

String EditDocument = 'No'

String DeleteDocument = 'No'

String ActionGL = 'Process'

ArrayList Validasi = [GlobalVariable.ValidasiAnnualLimit]

//Exit Confirmation
String ECAction1 = 'Tidak'

String ECAction2 = 'Puas'

String Comment = 'Currently testing by Automation. Thanks. Regards - Me'

//Login
String UserIDFU = 'LKT'

String PasswordFU = 'P@ssw0rd'

//Home
String MenuFU = 'General'

String SubMenuFU = 'Follow Up'

//Follow Up
String FUContactName = 'Siloam Hospitals Kebon Jeruk'

String FUClientName = findTestData('MemberNameSahabatFinansialKeluarga').getValue(5, 1)

String FUMemberName = findTestData('MemberNameSahabatFinansialKeluarga').getValue(4, 1)

String DiagnosisConfirmation = 'New'

String PIC = 'Head Contact Center'

String HeadCCO = ''

String EditDateTimeConfirmation = 'No'

String DTC = null

//Follow Up Inquiry
//Script//
WebUI.callTestCase(findTestCase('Pages/Web/GEN5/Login/Login'), [('UserID') : UserID, ('Password') : Password])

//==================== PHASE 1 ====================
WebUI.callTestCase(findTestCase('Pages/Web/GEN5/Home/Home'), [('Menu') : Menu, ('SubMenu') : SubMenu])

WebUI.callTestCase(findTestCase('Pages/Web/Garda Akses/Create Ticket/Create Ticket'), [('ContactLine') : ContactLine, ('Product') : Product
        , ('ChannelType') : ChannelType, ('ContactName') : ContactName, ('ContactType') : ContactType, ('ServiceType') : ServiceType
        , ('InterruptedCall') : InterruptedCall, ('ProviderName') : ProviderName, ('Action') : ActionCT])

CustomKeywords.'querySQL.Query.QueryContactName'()

WebUI.callTestCase(findTestCase('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim Inquiry'), [('Phase') : '1'])

WebUI.callTestCase(findTestCase('Pages/Web/Garda Akses/Service Type/Provider - Health - Claim'), [('Member') : Member, ('MemberName') : MemberName
        , ('ProductType') : ProductType, ('GLType') : GLType, ('SpecialCondition') : SpecialCondition, ('EditTreatmentPeriodStart') : EditTreatmentPeriodStart
        , ('TreatmentPeriodStart') : TreatmentPeriodStart, ('EditTreatmentPeriodEnd') : EditTreatmentPeriodEnd, ('StatusDiagnosa') : StatusDiagnosa
        , ('DiagnosisID') : DiagnosisID, ('DoctorName') : DoctorName, ('Rujuk') : Rujuk, ('Reason') : Reason, ('SpecialCondition') : SpecialCondition
        , ('SpecialConditionReason') : SpecialConditionReason, ('AppropriateRBClass') : AppropriateRBClass, ('TreatmentRBClass') : TreatmentRBClass
        , ('RoomOptionAvailability') : RoomOptionAvailability, ('NewDocument') : NewDocument, ('EditDocument') : EditDocument
        , ('DeleteDocument') : DeleteDocument, ('ActionGL') : ActionGL, ('Validasi') : Validasi, ('Phase') : '1'])

WebUI.callTestCase(findTestCase('Pages/Web/Garda Akses/Exit Confirmation/Exit Confirmation'), [('ECAction1') : ECAction1
        , ('ECAction2') : ECAction2, ('Comment') : Comment])

WebUI.comment(MemberName)

WebUI.comment(GlobalVariable.TicketID1)

String URL = '172.16.94.70'

String DB_Name = 'SEA'

String Query = ('SELECT UPPER(CONCAT(RTRIM(ProviderID), SPACE(1), \'-\', SPACE(1), RTRIM(( ProviderName )))) AS ProviderName, ProviderPhoneNo AS ProviderPhoneNo, ProviderEmail AS ProviderEmail, TicketNo AS TicketNo, UPPER(CONCAT(RTRIM(EmpID), SPACE(1), \'-\', SPACE(1), RTRIM(LTRIM(MemberNo)), SPACE(1), \'-\', SPACE(1), RTRIM(MemberName), SPACE(1), \'-\', SPACE(1), RTRIM(ClientName))) AS MemberName, FamilyPhone AS FamilyPhone, Doctor AS Doctor FROM CONTACTCENTER.TempGL WHERE TicketNo = \'' +
GlobalVariable.TicketID1) + '\' ORDER BY CreatedDate DESC'

ArrayList VerifyTicket1 = [ProviderName, GlobalVariable.PhoneNumber, GlobalVariable.Email, GlobalVariable.TicketID1, MemberName
	, GlobalVariable.PhoneNumber, DoctorName]

GEN5.compareRowDBtoArray(URL, DB_Name, Query, VerifyTicket1)

WebUI.callTestCase(findTestCase('Pages/Web/GEN5/Login/Login'), [('UserID') : UserIDFU, ('Password') : PasswordFU])

WebUI.callTestCase(findTestCase('Pages/Web/GEN5/Home/Home'), [('Menu') : MenuFU, ('SubMenu') : SubMenuFU])

WebUI.callTestCase(findTestCase('Pages/Web/Garda Akses/Follow Up/Follow Up - Inquiry'),
	[('FUContactName') : FUContactName
		, ('FUClientName') : FUClientName
		, ('FUMemberName') : FUMemberName])

WebUI.callTestCase(findTestCase('Pages/Web/Garda Akses/Follow Up/Follow Up - Provider Health Claim'),
	[('Phase') : '1'
		, ('FUContactName') : FUContactName
		, ('FUClientName') : FUClientName
		, ('FUMemberName') : FUMemberName
		, ('MemberName') : MemberName
		, ('ProductType') : ProductType
		, ('GLType') : GLType
		, ('Provider') : ProviderName
		, ('RoomOptionAvailability') : RoomOptionAvailability])