package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimModuleEmpListJobDetailsPage {
	
	@FindBy(xpath="//h6[text()='Job Details']/parent::div")
	private WebElement jobDetails;
	
	public WebElement getJobDetails() {
		return jobDetails;
	}

	@FindBy(xpath="//label[(text()='Joined Date')]/../following-sibling::div//input")
	private WebElement joiningDate;
	
	@FindBy(xpath="//div[text()='Today']")
	private WebElement todaysDate;
	
	@FindBy(xpath="//label[(text()='Job Title')]/../following-sibling::div//div[text()='-- Select --']")
	private WebElement jobTitleDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> jobTitleDdOpts;
	
	@FindBy(xpath="//label[(text()='Job Category')]/../following-sibling::div//div[text()='-- Select --']")
	private WebElement jobCategoryDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> jobCategoryDdOpts;
	
	@FindBy(xpath="//label[(text()='Sub Unit')]/../following-sibling::div//div[text()='-- Select --']")
	private WebElement subUnitDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> subUnitDdOpts;
	
	@FindBy(xpath="//label[(text()='Location')]/../following-sibling::div//div[text()='-- Select --']")
	private WebElement locationDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> locationDdOpts;
	
	@FindBy(xpath="//label[(text()='Employment Status')]/../following-sibling::div//div[text()='-- Select --']")
	private WebElement empStatusDd;
	
	@FindAll(@FindBy(xpath="//div[@role='listbox']/div/span"))
	private List<WebElement> empStatusDdOpts;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement saveButton;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']")
	private WebElement successPopup;
	
	public WebElement getSuccessPopup() {
		return successPopup;
	}
	
	public PimModuleEmpListJobDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getJoiningDate() {
		return joiningDate;
	}

	public WebElement getTodaysDate() {
		return todaysDate;
	}

	public WebElement getJobTitleDd() {
		return jobTitleDd;
	}

	public List<WebElement> getJobTitleDdOpts() {
		return jobTitleDdOpts;
	}

	public WebElement getJobCategoryDd() {
		return jobCategoryDd;
	}

	public List<WebElement> getJobCategoryDdOpts() {
		return jobCategoryDdOpts;
	}

	public WebElement getSubUnitDd() {
		return subUnitDd;
	}

	public List<WebElement> getSubUnitDdOpts() {
		return subUnitDdOpts;
	}

	public WebElement getLocationDd() {
		return locationDd;
	}

	public List<WebElement> getLocationDdOpts() {
		return locationDdOpts;
	}

	public WebElement getEmpStatusDd() {
		return empStatusDd;
	}

	public List<WebElement> getEmpStatusDdOpts() {
		return empStatusDdOpts;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
