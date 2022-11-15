package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//span[@data-test-id='learn-menu-button']") private WebElement courses;
	
	@FindBy(xpath="//span[text()='Class 1']") private WebElement class1;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void enterCourses() {
		courses.click();
	}
	
	public void clickOnClass1() {
		class1.click();
	}
}
