package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakePhoto {
	
	public void takeScreenShot(WebDriver driver, String name) throws IOException
	{
		Date d=new Date();
		String date =d.toString().replaceAll(":", "-");
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File desc=new File(Constants.photosFolderPath+name+date+".png");
		FileUtils.copyFile(src, desc);
	}

}
