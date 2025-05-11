import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.junit.runner.RunWith
import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
//@CucumberOptions(features="Include/features/VocaGameMobileLegends.feature",glue="",plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder.cucumber.json"],tags = "@VocaGameMobileLegends1")
//@CucumberOptions(features="Include/features/VocaGameRegister.feature",glue="",plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder.cucumber.json"],tags = "@VocaGameRegister1")

@CucumberOptions(features="Include/features/VocaGameForgetPasswordandResetPassword.feature",glue="",plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder.cucumber.json"],tags = "@VocaGameForgetPassword1")
//@CucumberOptions(features="Include/features/VocaGameLogin.feature",glue="",plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder.cucumber.json"],tags = "@VocaGameLogin1")
public class CucumberRunner {
}