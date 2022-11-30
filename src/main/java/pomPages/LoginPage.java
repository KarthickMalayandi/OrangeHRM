package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="username")
	private WebElement usernametextbox;
	
	@FindBy(name="password")
	private WebElement passwordtextbox;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	private WebElement forgotpwdlink;
	
	@FindBy(linkText="OrangeHRM, Inc")
	private WebElement orangeHRMlink;
	
	@FindBy(xpath="(//div[@class='orangehrm-login-footer-sm']/a)[1]")
	private WebElement linkedinlink;
	
	@FindBy(xpath="(//div[@class='orangehrm-login-footer-sm']/a)[2]")
	private WebElement fblink;
	
	@FindBy(xpath="(//div[@class='orangehrm-login-footer-sm']/a)[3]")
	private WebElement twitterlink;
	
	@FindBy(xpath="(//div[@class='orangehrm-login-footer-sm']/a)[4]")
	private WebElement utubelink;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userNameTextBox(String username) 
	{
		usernametextbox.sendKeys(username);
	}
	
	public void passwordTextBox(String password) 
	{
		passwordtextbox.sendKeys(password);
	}	

	public WebElement getUsernametextbox() {
		return usernametextbox;
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getForgotpwdlink() {
		return forgotpwdlink;
	}

	public WebElement getOrangeHRMlink() {
		return orangeHRMlink;
	}

	public WebElement getLinkedinlink() {
		return linkedinlink;
	}

	public WebElement getFblink() {
		return fblink;
	}

	public WebElement getTwitterlink() {
		return twitterlink;
	}

	public WebElement getUtubelink() {
		return utubelink;
	}

}
