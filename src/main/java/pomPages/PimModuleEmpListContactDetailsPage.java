package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimModuleEmpListContactDetailsPage {
	
	@FindBy(xpath="//label[text()='Street 1']/../following-sibling::div/input")
	private WebElement street1textbox;
	
	@FindBy(xpath="//label[text()='Street 2']/../following-sibling::div/input")
	private WebElement street2textbox;
	
	@FindBy(xpath="//label[text()='City']/../following-sibling::div/input")
	private WebElement cityTextbox;
	
	@FindBy(xpath="//label[text()='State/Province']/../following-sibling::div/input")
	private WebElement stateTextbox;
	
	@FindBy(xpath="//label[text()='Zip/Postal Code']/../following-sibling::div/input")
	private WebElement zipCodetextbox;
	
	@FindBy(xpath="//label[text()='Country']/../following-sibling::div//div[text()='-- Select --']")
	private WebElement countryDd;
	
	@FindAll(@FindBy(xpath="//div[@role='option']/span"))
	private List<WebElement> countryDdopts;
	
	@FindBy(xpath="//label[text()='Home']/../following-sibling::div/input")
	private WebElement hometextbox;
	
	@FindBy(xpath="//label[text()='Mobile']/../following-sibling::div/input")
	private WebElement mobiletextbox;
	
	@FindBy(xpath="//label[text()='Work']/../following-sibling::div/input")
	private WebElement worktextbox;
	
	@FindBy(xpath="//label[text()='Work Email']/../following-sibling::div/input")
	private WebElement workEmailtextbox;
	
	@FindBy(xpath="//label[text()='Other Email']/../following-sibling::div/input")
	private WebElement otherEmailtextbox;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement saveButton;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	private WebElement successPopup;
	
	public WebElement getSuccessPopup() {
		return successPopup;
	}

	public PimModuleEmpListContactDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getWorkEmailtextbox() {
		return workEmailtextbox;
	}

	public WebElement getCountryDd() {
		return countryDd;
	}

	public WebElement getStreet1textbox() {
		return street1textbox;
	}

	public List<WebElement> getCountryDdopts() {
		return countryDdopts;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	public void cityTextbox(String text)
	{
		cityTextbox.sendKeys(text);
	}
	public void street2textbox(String text)
	{
		street2textbox.sendKeys(text);
	}
	public void stateTextbox(String text)
	{
		stateTextbox.sendKeys(text);
	}
	public void zipCodetextbox(String text)
	{
		zipCodetextbox.sendKeys(text);
	}
	public void hometextbox(String text)
	{
		hometextbox.sendKeys(text);
	}
	public void mobiletextbox(String text)
	{
		mobiletextbox.sendKeys(text);
	}
	public void worktextbox(String text)
	{
		worktextbox.sendKeys(text);
	}
	public void workEmailtextbox(String text)
	{
		workEmailtextbox.sendKeys(text);
	}
	public void otherEmailtextbox(String text)
	{
		otherEmailtextbox.sendKeys(text);
	}
	public void street1textbox(String text)
	{
		street1textbox.sendKeys(text);
	}

}
