package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By username=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");

	private By password=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	
	private By loginButton=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterUsername() 
	{
		return driver.findElement(username);	
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);	
	}
	
	public WebElement clickLoginbutton()
	{
		return driver.findElement(loginButton);
	}
	
}
