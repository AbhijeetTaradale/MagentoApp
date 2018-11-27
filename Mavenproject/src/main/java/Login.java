

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class Login 
{
	
	WebDriver driver;
	
	
	public Login(WebDriver driver)
	{
		this.driver=driver;

	}
	
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.id("send2");

	
	
	public void typeEmail(String data) 
	{
		
		driver.findElement(email).sendKeys(data);
				
	}
	


	public void typePassword(String pass)
	{
		
		driver.findElement(password).sendKeys(pass);
		
	}

public void clickOnLogin()
	{
		driver.findElement(login).click();
		
	}
}
