package mavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshootHandling {
	
	@Test
	public void screenshoothandle() throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		TakesScreenshot scr=(TakesScreenshot)driver;
		
		File ss1=scr.getScreenshotAs(OutputType.FILE);
		
		File destop=new File("C:\\Users\\Hp\\Desktop\\java ss and excel\\screenshoot\\ss.png");
		
		FileUtils.copyFile(ss1, destop);
		
		System.out.println("ss1done");
		Thread.sleep(2000);
		
		WebElement user=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		Thread.sleep(2000);
		
		File ss2=user.getScreenshotAs(OutputType.FILE);
        File destop2=new File("C:\\Users\\Hp\\Desktop\\java ss and excel\\screenshoot\\ss2.png");
		FileUtils.copyFile(ss2, destop2);
		
		driver.close();
		
		
		
		
		
		
	}

}
