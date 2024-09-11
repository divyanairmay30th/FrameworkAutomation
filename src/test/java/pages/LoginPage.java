package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	//WebElements
	//methods on WebElements
	
	//WebElement usernameTextbox=driver.findElement(By.xpath("//input[@name='username']"));
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") 
	WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@name='login']") 
	WebElement loginButton;

	@FindBy(xpath="//a[text()='New User Register Here']")
	WebElement regiterLink;
	
	public void regiterLink()
	{
		regiterLink.click();
	}
	public void usernameTextbox(String text)
	{
		usernameTextbox.sendKeys(text);
	}
	
	public void passwordTextbox(String text)
	{
		passwordTextbox.sendKeys(text);
	}
	
	public void loginButton()
	{
		loginButton.click();
	}
	
	
}
