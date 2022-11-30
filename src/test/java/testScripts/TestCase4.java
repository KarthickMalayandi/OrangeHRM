package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.HomePage;
import pomPages.LoginPage;
import pomPages.PimModuleEmpListPage;
import pomPages.PimModuleEmpListPersonalDetailsPage;
import pomPages.PimModuleEmpListReportToPage;

public class TestCase4 extends BaseClass{
	
	@Test(priority=4)
	public void tc4() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.userNameTextBox(efd.getData("Sheet1", 1, 1));
		lp.passwordTextBox(efd.getData("Sheet1", 2, 1));
		lp.getLoginbutton().click();
		
		HomePage hp=new HomePage(driver);
		wdu.explicitWait(driver, hp.getPimpagelink());
		hp.getPimpagelink().click();
		
		PimModuleEmpListPage elp=new PimModuleEmpListPage(driver);
		wdu.explicitWait(driver, elp.getaTOzSortbutton());
		elp.getaTOzSortbutton().click();
		wdu.explicitWait(driver, elp.getDescendingOrder());
		elp.getDescendingOrder().click();
		
		try
		{
			elp.getVEditIcon().click();
		}
		catch(NoSuchElementException e)
		{
			elp.getFirstEditButton().click();
		}
		PimModuleEmpListPersonalDetailsPage elpdp=new PimModuleEmpListPersonalDetailsPage(driver);
		wdu.explicitWait(driver, elpdp.getReportToLink());
		elpdp.getReportToLink().click();
		PimModuleEmpListReportToPage elrtp=new PimModuleEmpListReportToPage(driver);
		wdu.explicitWait(driver, elrtp.getSupervisorAddbtn());
		elrtp.getSupervisorAddbtn().click();
		wdu.explicitWait(driver, elrtp.getNameTextBox());
		elrtp.supervisorNameTextBox(pf.getData("SupervisorName"));
		wdu.explicitWait(driver, elrtp.getSupervisorNameautosugOpt());
		elrtp.getSupervisorNameautosugOpt().click();
		Thread.sleep(1000);
		elrtp.getReportingMethodDd().click();
		wdu.selectOptionfromDd(elrtp.getReportingMethodDdOpts(), pf.getData("ReportingMethod"));
		elrtp.getSupervisorSaveButton().click();
		wdu.explicitWait(driver, elrtp.getAssignedSupervisorRow());
		elrtp.getSubordinateAddbtn().click();
		wdu.explicitWait(driver, elrtp.getNameTextBox());
		elrtp.subordinateNameTextBox(pf.getData("SubordinateName"));
		wdu.explicitWait(driver, elrtp.getSubordinateNameautosugOpt());
		elrtp.getSubordinateNameautosugOpt().click();
		Thread.sleep(1000);
		elrtp.getReportingMethodDd().click();
		wdu.selectOptionfromDd(elrtp.getReportingMethodDdOpts(), pf.getData("ReportingMethod"));
		elrtp.getSupervisorSaveButton().click();
		wdu.explicitWait(driver, elrtp.getSuccessPopup());
		Reporter.log("Assigning Supervisor and Subordinate to new employee was Successfull",true);
	}

}
