package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.basePage;

public class RegistrationPage extends basePage{
	WebDriver driver;
	//constructor
		public RegistrationPage(WebDriver driver) {		
			super(driver);
		}
	//
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement firstnameInput;
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement lastnameInput;
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement emailInput;
		
		@FindBy(xpath="//input[@name='telephone']")
		private WebElement telephoneInput;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement passwordInput;		
		
		@FindBy(xpath="//input[@name='confirm']")
		private WebElement confrimInput;
		
		@FindBy(xpath="//input[@type='checkbox']")
		private WebElement checkbox;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement submitBtn;
		
		public void setfirstname(String firstname) {
			firstnameInput.sendKeys(firstname);
		}
		
		public void setlastname(String lastname) {
			lastnameInput.sendKeys(lastname);
		}
		public void setEmail(String email) {
			emailInput.sendKeys(email);
		}
		public void settelephone(String telephone) {
			telephoneInput.sendKeys(telephone);
		}
		public void setpassword(String password) {
			passwordInput.sendKeys(password);
		}		
		public void setconfrim(String confirm) {
			confrimInput.sendKeys(confirm);
		}	
		public void clickcheckbox() {
			checkbox.click();
		}
		public void clickonContinue() {
			submitBtn.click();
		}
}
