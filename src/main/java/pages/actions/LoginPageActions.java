package pages.actions;


import org.openqa.selenium.support.PageFactory;
import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;
import utils.ElementHelper;


public class LoginPageActions {

	//WebDriver driver=null;

	pages.locators.LoginPageLocators LoginPageLocators=null;
	public LoginPageActions()
	{
		//this.driver=driver;
		this.LoginPageLocators= new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), LoginPageLocators);
	}

	public void clickLogin()
	{
		LoginPageLocators.login.click();
	}

	public void clickSignin()
	{
		LoginPageLocators.signIn.click();
	}

	public void checkLoginText(String expectedText)
	{
		ElementHelper.waitForElementToBeVisible(LoginPageLocators.loginAssertionText);
		String actualText = LoginPageLocators.loginAssertionText.getText();
		String trunctest = actualText.substring(0,5);
		System.out.println("actualText  " +trunctest);
		ElementHelper.textCheck(trunctest,expectedText );

	}

	public void enterCredentials(String userName, String password)
	{
		LoginPageLocators.userName.sendKeys(userName);
		LoginPageLocators.password.sendKeys(password);

	}

	
	
	
}
