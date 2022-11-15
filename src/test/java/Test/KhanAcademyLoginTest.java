package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.LoginPage;

public class KhanAcademyLoginTest {

	WebDriver driver;
	
	@BeforeMethod
	
	public void openBrowser() {
		
	 driver=Browser.lauchBrowser();
	}
	
	@Test
	
	public void khanAcademyLoginTest() {
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterCourses();
		
		loginpage.clickOnClass1();
	}
}
