package mavenProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelHandling {
	
	@Test
	public void excel() throws InterruptedException, IOException {
		
	   FileInputStream fs=new FileInputStream("C:\\Users\\Hp\\Desktop\\java ss and excel\\excel\\ID AND PASSWORD.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell1=row.getCell(0);
		
		XSSFCell cell2=row.getCell(1);
		
		Thread.sleep(2000);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement us=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		Thread.sleep(2000);
		us.click();
		us.sendKeys(cell1.getStringCellValue());
		Thread.sleep(2000);
		
		WebElement psd=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		Thread.sleep(2000);
		psd.click();
		psd.sendKeys(cell2.getStringCellValue());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
		driver.close();
	}


	}


