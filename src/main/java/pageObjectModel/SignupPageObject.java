package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	public WebDriver driver;
	
	private By firstname=By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[1]/div/div/input");

	public SignupPageObject(WebDriver driver2) {
	   this.driver=driver2;
	}

	public WebElement enterfirstname()
	{
		return driver.findElement(firstname);
		
	}
	
	private By lastname=By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/input");
	
	public WebElement enterlastname()
	{
		return driver.findElement(lastname);
		
	}
	
	private By email=By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[1]/div/div/input");
	
	public WebElement enteremail()
	{
		return driver.findElement(email);
		
	}
	
	private By jobtitle=By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/select");
	
	public WebElement selectjobtitle()
	{
		return driver.findElement(jobtitle);
		
	}
	
	private By company=By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[3]/div/div[1]/div/div/input");
	
	public WebElement entercompanyname()
	{
		return driver.findElement(company);
		
	}
	
    private By employees=By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[3]/div/div[2]/div/div/select");
	
	public WebElement selectemployees()
	{
		return driver.findElement(employees);
		
	}
	
	  private By phonenumber=By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[4]/div/div[1]/div/div/input");
		
		public WebElement enterphonenumber()
		{
			return driver.findElement(phonenumber);
			
		}
		
		 private By country=By.xpath("/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[4]/div/div[2]/div/div[1]/div/div/select");
			
			public WebElement selectcountry()
			{
				return driver.findElement(country);
				
			}
			
			private By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
			
			public WebElement selectcheckbox()
			{
				return driver.findElement(checkbox);
				
			}
}
