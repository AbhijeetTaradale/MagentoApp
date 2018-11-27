

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Main 
{
	By myacc=By.linkText("My Account");
	WebDriver driver;
	
	public Main(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void clickOnMyAcc()
	{
		driver.findElement(myacc).click();
		
	}

}
