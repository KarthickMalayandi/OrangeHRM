package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibrary.BaseClass;
import pomPages.HomePage;
import pomPages.LoginPage;
import pomPages.PimModuleEmpListPage;


public class TestCase5 extends BaseClass{

	@Test
	public void tc5() throws EncryptedDocumentException, IOException {

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
		try {
			elp.getVDeleteIcon().click();
		}
		catch(NoSuchElementException e)
		{
			elp.getFirstdeleteButton().click();
		}
		wdu.explicitWait(driver, elp.getYesButton());
		elp.getYesButton().click();
		wdu.explicitWait(driver, elp.getSuccessPopup());
		
		Reporter.log("Deletion of employee profile was Successfull",true);
		
		
	}
}
