package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.HomePage;
import pomPages.LoginPage;
import pomPages.PimModuleEmpListJobDetailsPage;
import pomPages.PimModuleEmpListPage;
import pomPages.PimModuleEmpListPersonalDetailsPage;


public class TestCase3 extends BaseClass{
	
	@Test
	public void tc3() throws EncryptedDocumentException, IOException, InterruptedException {
	
	LoginPage lp=new LoginPage(driver);
	lp.userNameTextBox(efd.getData("Sheet1", 1, 1));
	lp.passwordTextBox(efd.getData("Sheet1", 2, 1));
	lp.getLoginbutton().click();
	
	HomePage hp=new HomePage(driver);
	wdu.explicitWait(driver,hp.getPimpagelink());
	
	hp.getPimpagelink().click();
	PimModuleEmpListPage elp=new PimModuleEmpListPage(driver);
	wdu.explicitWait(driver, elp.getListOfEmp());
	try {
		elp.getaTOzSortbutton().click();
		wdu.mouseHover(driver, elp.getDescendingOrder());
		elp.getDescendingOrder().click();
		elp.getEditIcon().click();
	}
	catch(NoSuchElementException e)
	{
		elp.getFirstEditButton().click();
	}
	PimModuleEmpListPersonalDetailsPage epdp=new PimModuleEmpListPersonalDetailsPage(driver);
	wdu.explicitWait(driver, epdp.getJoblink());
	epdp.getJoblink().click();
	
	PimModuleEmpListJobDetailsPage eljdp=new PimModuleEmpListJobDetailsPage(driver);
	wdu.explicitWait(driver, eljdp.getJobDetails());
	Thread.sleep(1000);
	eljdp.getJoiningDate().click();
	wdu.explicitWait(driver, eljdp.getTodaysDate());
	wdu.mouseHover(driver, eljdp.getTodaysDate());
	eljdp.getTodaysDate().click();
	Thread.sleep(2000);
	eljdp.getJobTitleDd().click();
	wdu.selectOptionfromDd(eljdp.getJobTitleDdOpts(), pf.getData("JobTitle"));
	Thread.sleep(1000);
	eljdp.getJobCategoryDd().click();
	wdu.selectOptionfromDd(eljdp.getJobCategoryDdOpts(), pf.getData("JobCategory"));
	Thread.sleep(1000);
	eljdp.getSubUnitDd().click();
	wdu.selectOptionfromDd(eljdp.getSubUnitDdOpts(), pf.getData("SubUnit"));
	Thread.sleep(1000);
	eljdp.getLocationDd().click();
	wdu.selectOptionfromDd(eljdp.getLocationDdOpts(), pf.getData("Location"));
	Thread.sleep(1000);
	eljdp.getEmpStatusDd().click();
	wdu.selectOptionfromDd(eljdp.getEmpStatusDdOpts(), pf.getData("EmpStatus"));
	Thread.sleep(1000);
	eljdp.getSaveButton().click();
	
	wdu.explicitWait(driver, eljdp.getSuccessPopup());
	
	}
}
