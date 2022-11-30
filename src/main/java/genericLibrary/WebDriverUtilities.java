package genericLibrary;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {

	public void dropDown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement ele1, WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	public void alertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void switchToFrame(WebDriver driver,WebElement frame)
	{
		driver.switchTo().frame(frame);
	}
	public void switchBackfromFrame(WebDriver driver,WebElement frame)
	{
		driver.switchTo().defaultContent();
	}
	public void explicitWait(WebDriver driver,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public String getURL(WebDriver driver)
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	public void selectOptionfromDd(List<WebElement> lw,String text)
	{
		
		for(WebElement ele:lw)
		{
			if(ele.getText().equals(text))
			{
				ele.click();
				break;
			}
		}
	}
	public void javaScriptclick(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", ele);
	}
	public void actionsClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.click(ele).perform();
	}
	public void scrollto(WebDriver driver,WebElement ele)
	{
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		
	}
}
