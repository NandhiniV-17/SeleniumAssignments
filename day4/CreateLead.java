package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();//Initialize the WebDriver
		driver.get ("http://leaftaps.com/opentaps");// Load the URL
		driver.manage().window().maximize();//Maximize the browser window.
		driver.findElement(By.id("username")).sendKeys("democsr");//Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter a password
		driver.findElement(By.className("decorativeSubmit")).click();//Click the "Login" button
		driver.findElement(By.linkText("CRM/SFA")).click();//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("Leads")).click();//Click on the "Leads" tab
		driver.findElement(By.linkText("Create Lead")).click();//Click on the "Create Lead" button
		//Enter a FirstName
		driver.findElement(By.xpath("(//input[@id='createLeadForm_firstName'])[1]")).sendKeys("Nandhini1");
		//Enter a LastName
		driver.findElement(By.xpath("(//input[@id='createLeadForm_lastName'])[1]")).sendKeys("Nandhini11");
		//Enter a CompanyName
		driver.findElement(By.xpath("(//input[@id='createLeadForm_companyName'])[1]")).sendKeys("Company1");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");//Enter a Title
		driver.findElement(By.className("smallSubmit")).click();//Click the "Create Lead" button
		String actualTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		String expectedTitle = "Tester";
		if (actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("The Title is displayed correctly. " + "The Given title is " + actualTitle );
		}else
			System.out.println("The Title is not displayed correctly. " + "The shown title is " + actualTitle);
		driver.quit();//Close the browser window
		

	}

}
