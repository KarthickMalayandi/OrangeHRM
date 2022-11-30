package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimModuleEmpListReportToPage {
	
	@FindBy(xpath="//h6[text()='Assigned Supervisors']/following-sibling::button[text()=' Add ']")
	private WebElement supervisorAddbtn;
	
	@FindBy(xpath="//h6[text()='Assigned Subordinates']/following-sibling::button[text()=' Add ']")
	private WebElement subordinateAddbtn;
	
	@FindBy(xpath="//label[(text()='Name')]/../following-sibling::div//input")
	private WebElement nameTextBox;
	
	@FindBy(xpath="//div[@role='option']/span[contains(text(),'Paul')]")
	private WebElement supervisorNameautosugOpt;
	
	@FindBy(xpath="//label[text()='Reporting Method']/../following-sibling::div//div[text()='-- Select --']")
	private WebElement reportingMethodDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> reportingMethodDdOpts;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement supervisorSaveButton;
	
	@FindBy(xpath="//div[contains(text(),'Paul')]/../../../div[@role='row']")
	private WebElement assignedSupervisorRow;
	
	@FindBy(xpath="//div[@role='option']/span[contains(text(),'John  S')]")
	private WebElement subordinateNameautosugOpt;
	
	@FindBy(xpath="//div[contains(text(),'John')]/../../../div[@role='row']")
	private WebElement assignedSubordinateRow;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	private WebElement successPopup;
	
	public PimModuleEmpListReportToPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSupervisorAddbtn() {
		return supervisorAddbtn;
	}

	public WebElement getSubordinateAddbtn() {
		return subordinateAddbtn;
	}

	public WebElement getNameTextBox() {
		return nameTextBox;
	}

	public WebElement getSupervisorNameautosugOpt() {
		return supervisorNameautosugOpt;
	}

	public WebElement getReportingMethodDd() {
		return reportingMethodDd;
	}

	public List<WebElement> getReportingMethodDdOpts() {
		return reportingMethodDdOpts;
	}

	public WebElement getSupervisorSaveButton() {
		return supervisorSaveButton;
	}

	public WebElement getAssignedSupervisorRow() {
		return assignedSupervisorRow;
	}

	public WebElement getSubordinateNameautosugOpt() {
		return subordinateNameautosugOpt;
	}

	public WebElement getAssignedSubordinateRow() {
		return assignedSubordinateRow;
	}

	public WebElement getSuccessPopup() {
		return successPopup;
	}
	public void supervisorNameTextBox(String text)
	{
		nameTextBox.sendKeys(text);
	}
	public void subordinateNameTextBox(String text)
	{
		nameTextBox.sendKeys(text);
	}
	
	

}
