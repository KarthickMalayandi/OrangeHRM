package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//nav[@aria-label='Sidepanel']//img[@alt='client brand banner']")
	private WebElement orangeHRMLogo;
	
	@FindBy(xpath="//div[@class='oxd-sidepanel-body']//input[@placeholder='Search']")
	private WebElement searchtextbox;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Admin']")
	private WebElement adminpagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='PIM']")
	private WebElement pimpagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Leave']")
	private WebElement leavepagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Time']")
	private WebElement timepagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Recruitment']")
	private WebElement recruitmentpagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='My Info']")
	private WebElement myinfopagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Performance']")
	private WebElement performancepagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Dashboard']")
	private WebElement dashboardpagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Directory']")
	private WebElement directorypagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Maintenance']")
	private WebElement maintenancepagelink;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']//span[text()='Buzz']")
	private WebElement buzzpagelink;
	
	@FindBy(xpath="//header[@class='oxd-topbar']//li[@class='oxd-userdropdown']//p")
	private WebElement userdropdown;
	
	@FindBy(xpath="//header[@class='oxd-topbar']//li[@class='oxd-userdropdown']//p[text()='Venkatesh Raman']")
	private WebElement vuserdropdown;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']//a[text()='About']")
	private WebElement aboutopt;
	
	public WebElement getVuserdropdown() {
		return vuserdropdown;
	}


	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']//a[text()='Support']")
	private WebElement supportopt;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']//a[text()='Change Password']")
	private WebElement changepwdopt;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']//a[text()='Logout']")
	private WebElement logoutopt;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrangeHRMLogo() {
		return orangeHRMLogo;
	}


	public WebElement getSearchtextbox() {
		return searchtextbox;
	}
	
	public void searchbox(String text)
	{
		searchtextbox.sendKeys(text);
	}


	public WebElement getAdminpagelink() {
		return adminpagelink;
	}


	public WebElement getPimpagelink() {
		return pimpagelink;
	}


	public WebElement getLeavepagelink() {
		return leavepagelink;
	}


	public WebElement getTimepagelink() {
		return timepagelink;
	}


	public WebElement getRecruitmentpagelink() {
		return recruitmentpagelink;
	}


	public WebElement getMyinfopagelink() {
		return myinfopagelink;
	}


	public WebElement getPerformancepagelink() {
		return performancepagelink;
	}


	public WebElement getDashboardpagelink() {
		return dashboardpagelink;
	}


	public WebElement getDirectorypagelink() {
		return directorypagelink;
	}


	public WebElement getMaintenancepagelink() {
		return maintenancepagelink;
	}


	public WebElement getBuzzpagelink() {
		return buzzpagelink;
	}


	public WebElement getUserdropdown() {
		return userdropdown;
	}


	public WebElement getAboutopt() {
		return aboutopt;
	}


	public WebElement getSupportopt() {
		return supportopt;
	}


	public WebElement getChangepwdopt() {
		return changepwdopt;
	}


	public WebElement getLogoutopt() {
		return logoutopt;
	}
	
	

}
