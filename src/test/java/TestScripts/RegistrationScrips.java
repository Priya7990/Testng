package TestScripts;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import BaseTests.baseTests;
import PageObjectClasses.HomePageClassPF;
import PageObjectClasses.RegistrationPage; 

public class RegistrationScrips extends baseTests {		
	@Test
	public void registration() { 
		HomePageClassPF homePage =new HomePageClassPF(driver);
		RegistrationPage registrationpage =new RegistrationPage(driver);		
		homePage.clickmyAccountTab();
		homePage.clickRegister();	
		registrationpage.setfirstname("ishu");
		registrationpage.setlastname("priya");
		registrationpage.setEmail("ishupriya2000@gmail.com");
		registrationpage.setpassword("820317@");
		registrationpage.setconfrim("820317@");
		registrationpage.settelephone("9311111111");
		registrationpage.clickonContinue();
	}	
}