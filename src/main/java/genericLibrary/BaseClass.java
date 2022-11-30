package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public ExcelFileData efd=new ExcelFileData();
	public PropertyFile pf=new PropertyFile();
	public WebDriverUtilities wdu=new WebDriverUtilities();
	public SoftAssert sa=new SoftAssert();
	@BeforeMethod
	public void openApp() throws EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(efd.getData("Sheet1", 0, 1));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status =res.getStatus();
		String name=res.getName();
		if(status==2)
		{
			TakePhoto tp=new TakePhoto();
			tp.takeScreenShot(driver,name);
		}
		driver.quit();
		//sa.assertAll();
	}
}
