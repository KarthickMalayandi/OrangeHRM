package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimModuleEmpListPersonalDetailsPage {
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middleName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//label[text()='Nickname']/../following-sibling::div/input")
	private WebElement nickName;
	
	@FindBy(xpath="//label[text()='Employee Id']/../following-sibling::div/input")
	private WebElement empId;
	
	@FindBy(xpath="//label[text()='Other Id']/../following-sibling::div/input")
	private WebElement otherId;
	
	@FindBy(xpath="//label[contains(text(),' License Number')]/../following-sibling::div/input")
	private WebElement dLNumber;
	
	@FindBy(xpath="//label[(text()='License Expiry Date')]/../following-sibling::div//input")
	private WebElement licenseExDate;
	
	@FindBy(xpath="//label[(text()='SSN Number')]/../following-sibling::div/input")
	private WebElement ssnNumber;
	
	@FindBy(xpath="//label[(text()='SIN Number')]/../following-sibling::div/input")
	private WebElement sinNumber;
	
	@FindBy(xpath="//label[(text()='Nationality')]/../following-sibling::div//div[text()='-- Select --']")
	private WebElement nationalityDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> nationalityDdOptions;
	
	@FindBy(xpath="//label[(text()='Marital Status')]/../following-sibling::div//div[text()='-- Select --']")
	private WebElement maritalStatusDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> maritalStatusDdOptions;
	
	@FindBy(xpath="//label[(text()='Date of Birth')]/../following-sibling::div//input")
	private WebElement dateOfBirth;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath="//label[(text()='Military Service')]/../following-sibling::div/input")
	private WebElement militaryService;
	
	@FindBy(xpath="//label[text()='Yes']")
	private WebElement smokerCheckbox;
	
	@FindBy(xpath="//p[text()=' * Required']/following-sibling::button[text()=' Save ']")
	private WebElement firstsaveButton;
	
	@FindBy(xpath="//label[(text()='Blood Type')]/../following-sibling::div//div[text()='-- Select --']")
	private WebElement bloodTypeDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> bloodTypeDdOptions;
	
	@FindBy(xpath="//h6[text()='Custom Fields']/..//button[text()=' Save ']")
	private WebElement secondSaveButton;
	
	@FindBy(xpath="//a[text()='Contact Details']")
	private WebElement contactDetailsLink;
	
	@FindBy(xpath="//a[text()='Job']")
	private WebElement joblink;
	
	@FindBy(xpath="//a[text()='Report-to']")
	private WebElement reportToLink;
	
	public WebElement getReportToLink() {
		return reportToLink;
	}

	public WebElement getJoblink() {
		return joblink;
	}

	public WebElement getContactDetailsLink() {
		return contactDetailsLink;
	}

	public PimModuleEmpListPersonalDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}
	public void firstName(String text)
	{
		firstName.sendKeys(text);
	}

	public WebElement getMiddleName() {
		return middleName;
	}
	public void middleName(String text)
	{
		middleName.sendKeys(text);
	}

	public WebElement getLastName() {
		return lastName;
	}
	public void lastName(String text)
	{
		lastName.sendKeys(text);
	}

	public WebElement getNickName() {
		return nickName;
	}
	public void nickName(String text)
	{
		nickName.sendKeys(text);
	}

	public WebElement getEmpId() {
		return empId;
	}
	public void empId(String text)
	{
		empId.sendKeys(text);
	}

	public WebElement getOtherId() {
		return otherId;
	}
	public void otherId(String text)
	{
		otherId.sendKeys(text);
	}

	public WebElement getdLNumber() {
		return dLNumber;
	}
	public void dLNumber(String text)
	{
		dLNumber.sendKeys(text);
	}

	public WebElement getLicenseExDate() {
		return licenseExDate;
	}
	public void licenseExDate(String text)
	{
		licenseExDate.sendKeys(text);
	}

	public WebElement getSsnNumber() {
		return ssnNumber;
	}
	public void ssnNumber(String text)
	{
		ssnNumber.sendKeys(text);
	}

	public WebElement getSinNumber() {
		return sinNumber;
	}
	public void sinNumber(String text)
	{
		sinNumber.sendKeys(text);
	}

	public WebElement getNationalityDd() {
		return nationalityDd;
	}

	public List<WebElement> getNationalityDdOptions() {
		return nationalityDdOptions;
	}

	public WebElement getMaritalStatusDd() {
		return maritalStatusDd;
	}

	public List<WebElement> getMaritalStatusDdOptions() {
		return maritalStatusDdOptions;
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}
	public void dateOfBirth(String text)
	{
		dateOfBirth.sendKeys(text);
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getMilitaryService() {
		return militaryService;
	}
	public void militaryService(String text)
	{
		militaryService.sendKeys(text);
	}

	public WebElement getSmokerCheckbox() {
		return smokerCheckbox;
	}

	public WebElement getFirstsaveButton() {
		return firstsaveButton;
	}

	public WebElement getBloodTypeDd() {
		return bloodTypeDd;
	}

	public List<WebElement> getBloodTypeDdOptions() {
		return bloodTypeDdOptions;
	}

	public WebElement getSecondSaveButton() {
		return secondSaveButton;
	}
	
	

	
}
