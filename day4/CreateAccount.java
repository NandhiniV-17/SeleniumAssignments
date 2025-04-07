package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();//Initialize the WebDriver
		driver.get("http://leaftaps.com/opentaps");// Load the URL
		driver.manage().window().maximize();//Maximize the browser window
		driver.findElement(By.id("username")).sendKeys("democsr");//Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter a password
		driver.findElement(By.className("decorativeSubmit")).click();//Click the "Login" button
		driver.findElement(By.linkText("CRM/SFA")).click();//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("Accounts")).click();//Click on the "Accounts" tab
		driver.findElement(By.linkText("Create Account")).click();//Click on the "Create Account" button
		driver.findElement(By.id("accountName")).sendKeys("Nandhini-4");//Enter a Accountname
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");//Enter the Description
		// Select "ComputerSoftware" as the industry.
		WebElement sourceElement = driver.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(sourceElement);
		dropdown.selectByValue("IND_SOFTWARE");
		// Select "S-Corporation" as ownership using SelectByVisibleText
		sourceElement = driver.findElement(By.name("ownershipEnumId"));
		dropdown = new Select(sourceElement);
		dropdown.selectByVisibleText("S-Corporation");
		// Select "Employee" as the source using SelectByValue.
		sourceElement = driver.findElement(By.id("dataSourceId"));
		dropdown = new Select(sourceElement);
		dropdown.selectByValue("LEAD_EMPLOYEE");
		// Select "eCommerce Site Internal Campaign" as the marketing campaign using
		// SelectByIndex.
		sourceElement = driver.findElement(By.id("marketingCampaignId"));
		dropdown = new Select(sourceElement);
		dropdown.selectByIndex(6);
		// Select "Texas" as the state/province using SelectByValue.
		sourceElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		dropdown = new Select(sourceElement);
		dropdown.selectByValue("TX");
		// Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		// Verify that the account name is displayed correctly.
		String actualAccountName = driver.findElement(By.xpath("//tr[1]/td[2]/span[@class = 'tabletext']")).getText();
		String expectedAccountName = "Nandhini-4";
		if (actualAccountName.contains(expectedAccountName))
		{
			System.out.println("The Account name is displayed correctly. " + "The name is " + actualAccountName );
		}else
			System.out.println("The account name is not displayed correctly. " + "The name is " + actualAccountName);
		driver.quit();//Close the browser window);
	}

}
