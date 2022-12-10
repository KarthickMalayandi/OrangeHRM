package testScripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibrary.BaseClass;
import pomPages.HomePage;
import pomPages.LoginPage;
import pomPages.PimModuleAddEmpPage;
import pomPages.PimModuleEmpListPage;
import pomPages.PimModuleEmpListPersonalDetailsPage;

public class TestCase1 extends BaseClass {

	@Test
	public void tc1() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.userNameTextBox(efd.getData("Sheet1", 1, 1));
		lp.passwordTextBox(efd.getData("Sheet1", 2, 1));
		lp.getLoginbutton().click();
		
		HomePage hp=new HomePage(driver);
		wdu.explicitWait(driver,hp.getPimpagelink());
		
		hp.getPimpagelink().click();
		PimModuleEmpListPage elp=new PimModuleEmpListPage(driver);
		elp.getAddButton().click();
		
		PimModuleAddEmpPage aep=new PimModuleAddEmpPage(driver);
		wdu.explicitWait(driver, aep.getLoginDetailSwitch());
		
		aep.firstName(pf.getData("firstname"));
		aep.middleName(pf.getData("middlename"));
		aep.lastName(pf.getData("lastname"));
		Thread.sleep(2000);
		aep.getLoginDetailSwitch().click();
		
		wdu.explicitWait(driver, aep.getUsernametextbox());
		aep.usernametextbox(pf.getData("username"));
		aep.passwordtextbox(pf.getData("password"));
		aep.confirmpasswordtextbox(pf.getData("password"));
		aep.getSavebutton().click();
		
		PimModuleEmpListPersonalDetailsPage elpdp=new PimModuleEmpListPersonalDetailsPage(driver);
		wdu.explicitWait(driver, elpdp.getSecondSaveButton());
		elpdp.nickName(pf.getData("nickname"));
		elpdp.otherId(pf.getData("otherID"));
		elpdp.dLNumber(pf.getData("DLNumber"));
		elpdp.licenseExDate(pf.getData("DLExpiryDate"));
		elpdp.ssnNumber(pf.getData("ssn"));
		elpdp.sinNumber(pf.getData("sin"));
		elpdp.getNationalityDd().click();
		Thread.sleep(1000);
		wdu.selectOptionfromDd(elpdp.getNationalityDdOptions(), pf.getData("Nationality"));
		Thread.sleep(1000);
		elpdp.getMaritalStatusDd().click();
		Thread.sleep(1000);
		wdu.selectOptionfromDd(elpdp.getMaritalStatusDdOptions(), pf.getData("MaritalStatus"));
		Thread.sleep(1000);
		elpdp.dateOfBirth(pf.getData("dateOfBirth"));
		Thread.sleep(2000);
		elpdp.getMaleRadioButton().click();
		elpdp.militaryService(pf.getData("Military"));
		elpdp.getSmokerCheckbox().click();
		elpdp.getFirstsaveButton().click();
		Thread.sleep(2000);
		elpdp.getBloodTypeDd().click();
		Thread.sleep(1000);
		wdu.selectOptionfromDd(elpdp.getBloodTypeDdOptions(), pf.getData("BloodGroup"));
		elpdp.getSecondSaveButton().click();
		Thread.sleep(2000);
		hp.getUserdropdown().click();
		hp.getLogoutopt().click();
		
		wdu.explicitWait(driver, lp.getUsernametextbox());
		lp.userNameTextBox(pf.getData("username"));
		lp.passwordTextBox(pf.getData("password"));
		lp.getLoginbutton().click();
		
		wdu.explicitWait(driver, hp.getVuserdropdown());
		Reporter.log("New Employee created Successfully",true);
		
	}
}
