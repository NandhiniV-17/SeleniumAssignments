package week3.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");// Load the URL
		driver.manage().window().maximize();// Maximize the browser window.
		driver.findElement(By.id("username")).sendKeys("democsr");// Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");// Enter a password
		driver.findElement(By.className("decorativeSubmit")).click();// Click the "Login" button
		driver.findElement(By.linkText("CRM/SFA")).click();// Click on the "CRM/SFA" link
		driver.findElement(By.linkText("Leads")).click();// Click on the "Leads" tab
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();//Click on "create Lead"
		driver.findElement(By.xpath("//td/input[@name='companyName']")).sendKeys("ABC");//Enter the CompanyName Field Using Xpath
		driver.findElement(By.xpath("//td/input[@name='firstName']")).sendKeys("N");//Enter the FirstName Field Using Xpath
		driver.findElement(By.xpath("//td/input[@name='lastName']")).sendKeys("N");//Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//td/input[@name='lastNameLocal']")).sendKeys("N");//Enter the FirstName (Local) Field Using Xpath
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA"); //Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test");//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@test.com");//Enter your email in the E-mail address Field
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(sourceElement);
		dropdown.selectByVisibleText("New York");;// Select State/Province as NewYork Using Visible Tex
		driver.findElement(By.xpath("//tbody/tr[24]/td[2]/input")).click();//To click on Create button
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();//Click on the edit button
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();//Clear the Description Field
		driver.findElement(By.name("importantNote")).sendKeys("important note");//Fill the Important Note Field with Any text
		driver.findElement(By.xpath("//input[@value='Update']")).click();//Click on the update button
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);
		//Get the Title of the Resulting Page
		driver.quit();// the browser window

	}

}
