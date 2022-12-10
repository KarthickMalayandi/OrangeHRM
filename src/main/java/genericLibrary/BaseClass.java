package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public ExcelFileData efd=new ExcelFileData();
	public PropertyFile pf=new PropertyFile();
	public WebDriverUtilities wdu=new WebDriverUtilities();
	public static ExtentReports reports=new ExtentReports();
	public static ExtentSparkReporter htmlreports=new ExtentSparkReporter(Constants.reportsFolderPath);
	
	
	@BeforeSuite
	public void configBS()
	{
		htmlreports.config().setTheme(Theme.DARK);
		reports.attachReporter(htmlreports);
	}
	
	
	
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
		String name=res.getName().toUpperCase();
		if(status==1)
		{
			
			reports.createTest(name).pass(name+" is passed");
			
		}
		else if(status==2)
		{
			TakePhoto tp=new TakePhoto();
			tp.takeScreenShot(driver,name);
			
			reports.createTest(name).fail(name+" is Failed").info("Exception : "+res.getThrowable());
			
		}
		else if(status==3)
		{
			reports.createTest(name).skip(name+" is skipped");
		}
		driver.quit();
		
	}
	@AfterSuite
	public void configAS()
	{
		reports.flush();
		
	}
	
}
