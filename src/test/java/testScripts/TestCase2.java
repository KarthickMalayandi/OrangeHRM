package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.HomePage;
import pomPages.LoginPage;
import pomPages.PimModuleEmpListContactDetailsPage;
import pomPages.PimModuleEmpListPage;
import pomPages.PimModuleEmpListPersonalDetailsPage;

public class TestCase2 extends BaseClass{
	
	@Test(priority=2)
	public void tc2() throws EncryptedDocumentException, IOException, InterruptedException
	{
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
			elp.getVEditIcon().click();
		}
		catch(NoSuchElementException e)
		{
			elp.getFirstEditButton().click();
		}
		
		PimModuleEmpListPersonalDetailsPage epdp=new PimModuleEmpListPersonalDetailsPage(driver);
		wdu.explicitWait(driver, epdp.getContactDetailsLink());
		epdp.getContactDetailsLink().click();
		
		PimModuleEmpListContactDetailsPage elcdp=new PimModuleEmpListContactDetailsPage(driver);
		wdu.explicitWait(driver, elcdp.getStreet1textbox());
		Thread.sleep(1000);
		elcdp.street1textbox(pf.getData("Street1"));
		Thread.sleep(1000);
		elcdp.street2textbox(pf.getData("Street2"));
		Thread.sleep(1000);
		elcdp.cityTextbox(pf.getData("City"));
		Thread.sleep(1000);
		elcdp.stateTextbox(pf.getData("State"));
		Thread.sleep(1000);
		elcdp.zipCodetextbox(pf.getData("Zipcode"));
		Thread.sleep(1000);
		
		elcdp.getCountryDd().click();
		Thread.sleep(2000);
		wdu.selectOptionfromDd(elcdp.getCountryDdopts(), pf.getData("Country"));
		
		elcdp.hometextbox(pf.getData("Home"));
		
		elcdp.mobiletextbox(pf.getData("Mobile"));
		
		elcdp.worktextbox(pf.getData("Work"));
		elcdp.getWorkEmailtextbox().clear();
		Thread.sleep(1000);
		elcdp.workEmailtextbox(pf.getData("WorkMail"));
		
		elcdp.otherEmailtextbox(pf.getData("OtherMail"));
		wdu.mouseHover(driver, elcdp.getSaveButton());
		elcdp.getSaveButton().click();
		try
		{
		wdu.explicitWait(driver, elcdp.getSuccessPopup());
		}
		catch(TimeoutException e)
		{
			elcdp.getSaveButton().click();
			wdu.explicitWait(driver, elcdp.getSuccessPopup());
		}
		
		Reporter.log("Contact Details Added to Employee Profile Successfully",true);
	}

}
