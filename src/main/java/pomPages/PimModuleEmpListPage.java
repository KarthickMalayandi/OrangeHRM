package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimModuleEmpListPage {
	
	@FindBy(xpath="//label[text()='Employee Name']/../following-sibling::div//input")
	private WebElement empNametextbox;
	
	@FindBy(xpath="//label[text()='Employee Id']/../following-sibling::div/input")
	private WebElement empIdtextbox;
	
	@FindBy(xpath="//label[text()='Employment Status']/../following-sibling::div//div[text()='-- Select --']")
	private WebElement empStatusdd;
	
	@FindAll(@FindBy(xpath="//div[@role='option']/span"))
	private List<WebElement> empStatusddOpts;
	
	@FindBy(xpath="//label[text()='Include']/../following-sibling::div//div[text()='Current Employees Only']")
	private WebElement includedd;
	
	@FindAll(@FindBy(xpath="//div[@role='option']/span"))
	private List<WebElement> includeddOpts;
	
	@FindBy(xpath="//label[text()='Supervisor Name']/../following-sibling::div//input")
	private WebElement supervisorNametextbox;
	
	@FindBy(xpath="//label[text()='Job Title']/../following-sibling::div//div[text()='-- Select --']")
	private WebElement jobTitledd;
	
	@FindAll(@FindBy(xpath="//div[@role='option']/span"))
	private List<WebElement> jobTitleddOpts;
	
	@FindBy(xpath="//label[text()='Sub Unit']/../following-sibling::div//div[text()='-- Select --']")
	private WebElement subUnitdd;
	
	@FindAll(@FindBy(xpath="//div[@role='option']/span"))
	private List<WebElement> subUnitddOpts;
	
	@FindBy(xpath="//button[text()=' Reset ']")
	private WebElement resetButton;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement searchButton;
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement addButton;
	
	@FindBy(xpath="//div[text()='First (& Middle) Name']//i[contains(@class,'table-header-sort-icon')]")
	private WebElement aTOzSortbutton;
	
	@FindBy(xpath="//div[text()='First (& Middle) Name']//li//span[text()='Decending']")
	private WebElement descendingOrder;
	
	@FindBy(xpath="//div[text()='Venkatesh Sedhu']/../..//div//button/i[@class='oxd-icon bi-pencil-fill']")
	private WebElement editIcon;
	
	@FindBy(xpath="//div[@class='orangehrm-container']")
	private WebElement listOfEmp;
	
	@FindBy(xpath="(//div[@role='table']//div[contains(@class,'oxd-table-row--clickable')]//button/i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement firstEditButton;
	
	
	public WebElement getFirstEditButton() {
		return firstEditButton;
	}

	public WebElement getListOfEmp() {
		return listOfEmp;
	}

	public WebElement getEditIcon() {
		return editIcon;
	}

	public WebElement getDescendingOrder() {
		return descendingOrder;
	}

	public WebElement getaTOzSortbutton() {
		return aTOzSortbutton;
	}

	public PimModuleEmpListPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getEmpNametextbox() {
		return empNametextbox;
	}

	public WebElement getEmpIdtextbox() {
		return empIdtextbox;
	}

	public WebElement getEmpStatusdd() {
		return empStatusdd;
	}

	public List<WebElement> getEmpStatusddOpts() {
		return empStatusddOpts;
	}

	public WebElement getIncludedd() {
		return includedd;
	}

	public List<WebElement> getIncludeddOpts() {
		return includeddOpts;
	}

	public WebElement getSupervisorNametextbox() {
		return supervisorNametextbox;
	}

	public WebElement getJobTitledd() {
		return jobTitledd;
	}

	public List<WebElement> getJobTitleddOpts() {
		return jobTitleddOpts;
	}

	public WebElement getSubUnitdd() {
		return subUnitdd;
	}

	public List<WebElement> getSubUnitddOpts() {
		return subUnitddOpts;
	}

	public WebElement getResetButton() {
		return resetButton;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	
	
	

}
