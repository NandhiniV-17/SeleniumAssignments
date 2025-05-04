package week6.day11;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	@DataProvider
	public String[][] sendData(){
		String[][] data = new String[2][3];
		data [0][0] = "TestLeaf";
		data [0][1] = "Name";
		data [0][0] = "1";
		data [1][0] = "TestLeaf";
		data [1][1] = "Name";
		data [1][2] = "2";
		return data;
	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String companyName, String firstName, String lastName )

	{
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("companyName");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastName");
		driver.findElement(By.name("submitButton")).click();
	}
	
}
