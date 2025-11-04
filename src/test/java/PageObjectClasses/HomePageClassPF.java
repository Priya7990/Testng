package PageObjectClasses;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePage.basePage;

public class HomePageClassPF extends basePage{
	
	WebDriver driver;
//constructor
	public HomePageClassPF(WebDriver driver) {		
		super(driver);
	}
	
//locators
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myAccountTab;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement Register;
	
//methods
	public void clickmyAccountTab() {
		myAccountTab.click();		
	}
	public void clickRegister() {
		Register.click();		
	}
}
