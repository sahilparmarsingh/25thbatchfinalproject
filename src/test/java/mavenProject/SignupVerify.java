package mavenProject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.SignupPageObject;
import resorces.BaseClass;

@Test

public class SignupVerify extends BaseClass{
	
	public void signup() throws IOException, InterruptedException {
		
		driverinitialize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		SignupPageObject obj=new SignupPageObject(driver);
		
		obj.enterfirstname().sendKeys("SAHIL");
		Thread.sleep(2000);
		obj.enterfirstname().clear();

		
		obj.enterfirstname().sendKeys("sahil");
		Thread.sleep(2000);
		obj.enterfirstname().clear();
		
		obj.enterfirstname().sendKeys("Sahil");
		Thread.sleep(2000);
		
		obj.enterlastname().sendKeys("Singh Parmar");
		Thread.sleep(2000);
		
		obj.enteremail().sendKeys("sahilsinghparmar@gmail.com");
		Thread.sleep(2000);
		
	    obj.selectjobtitle().click();
		
		Select s=new Select(obj.selectjobtitle());
		
		s.selectByIndex(5);
		Thread.sleep(2000);
		
		obj.entercompanyname().sendKeys("goal educational pvt ltd");
		Thread.sleep(2000);
		
		obj.selectemployees().click();
		
		Select s2=new Select(obj.selectemployees());
		
		s2.selectByIndex(3);

		
		Thread.sleep(2000);
		obj.enterphonenumber().sendKeys("9006357328");
		
		Thread.sleep(2000);
		obj.selectcountry().click();
		
		Select s3=new Select(obj.selectcountry());
		
		List<WebElement> l2=s3.getOptions();
		
		for(int j=0; j<l2.size(); j++) 
		{
		   l2.get(j).getText().equalsIgnoreCase("india");
			 break;
		}
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		
		ac.click(obj.selectcheckbox()).build().perform();
		
		
		
		
	}

}
