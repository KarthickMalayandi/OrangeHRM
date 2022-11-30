package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimModuleAddEmpPage {
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="middleName")
	private WebElement middlename;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement employeeid;
	
	@FindBy(xpath="//p[text()='Create Login Details']/..//span")
	private WebElement loginDetailSwitch;
	
	@FindBy(xpath="//button[@class='oxd-icon-button employee-image-action']")
	private WebElement imageUploadbutton;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement savebutton;
	
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement cancelbutton;
	
	@FindBy(xpath="//label[text()='Username']/../following-sibling::div/input")
	private WebElement usernametextbox;
	
	@FindBy(xpath="//label[text()='Password']/../following-sibling::div/input")
	private WebElement passwordtextbox;
	
	@FindBy(xpath="//label[text()='Confirm Password']/../following-sibling::div/input")
	private WebElement confirmpasswordtextbox;
	
	@FindBy(xpath="//label[text()='Enabled']/input")
	private WebElement enabledradiobutton;
	
	@FindBy(xpath="//label[text()='Disabled']/input")
	private WebElement disabledradiobutton;

	public PimModuleAddEmpPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstname() {
		return firstname;
	}
	public void firstName(String text)
	{
		firstname.sendKeys(text);
	}

	public WebElement getMiddlename() {
		return middlename;
	}
	public void middleName(String text)
	{
		middlename.sendKeys(text);
	}

	public WebElement getLastname() {
		return lastname;
	}
	public void lastName(String text)
	{
		lastname.sendKeys(text);
	}

	public WebElement getEmployeeid() {
		return employeeid;
	}

	public WebElement getLoginDetailSwitch() {
		return loginDetailSwitch;
	}

	public WebElement getImageUploadbutton() {
		return imageUploadbutton;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	public WebElement getUsernametextbox() {
		return usernametextbox;
	}
	public void usernametextbox(String text)
	{
		usernametextbox.sendKeys(text);
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}
	public void passwordtextbox(String text)
	{
		passwordtextbox.sendKeys(text);
	}

	public WebElement getConfirmpasswordtextbox() {
		return confirmpasswordtextbox;
	}
	public void confirmpasswordtextbox(String text)
	{
		confirmpasswordtextbox.sendKeys(text);
	}

	public WebElement getEnabledradiobutton() {
		return enabledradiobutton;
	}

	public WebElement getDisabledradiobutton() {
		return disabledradiobutton;
	}

	
	
	
	
	

}
