package mavenProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resorces.BaseClass;

public class VerifyLogin extends BaseClass {
	
	@Test
	 public void loginpage() throws IOException, InterruptedException {
		
	 driverinitialize();
		
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 
	 FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Desktop\\java ss and excel\\excel\\ID AND PASSWORD.xlsx");
	
	 XSSFWorkbook workbook=new XSSFWorkbook(file);
	 
	 XSSFSheet sheet=workbook.getSheetAt(0);
	 
	 XSSFRow row=sheet.getRow(0);
	 
	 XSSFCell cell1=row.getCell(0);
	 XSSFCell cell2=row.getCell(1);
	 
	 LoginPageObject obj=new LoginPageObject(driver);
	 
	 obj.enterUsername().sendKeys(cell1.getStringCellValue());
	 
	 Thread.sleep(2000);
	 
	 obj.enterPassword().sendKeys(cell2.getStringCellValue());
	 
	 Thread.sleep(2000);
	 
	 obj.clickLoginbutton().click();
	 
	 
		
		
	}

}
