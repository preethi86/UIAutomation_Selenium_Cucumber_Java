package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {
	
	
	@FindBy(how=How.XPATH,using=".//a[contains(text(),'Signup / Login')]")
	public WebElement signIn;
	
	@FindBy(how=How.XPATH,using=".//form[@id='loginForm']/h3")
	public WebElement loginAssertionText;
	
	@FindBy(how=How.XPATH,using=".//input[@name= 'username']")
	public WebElement userName;
	
	@FindBy(how=How.XPATH,using=".//input[@name= 'password']")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using=".//input[@type='submit'][@value='Login']")
	public WebElement login;
}
