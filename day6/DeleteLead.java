package week3.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");// Load the URL
		driver.manage().window().maximize();// Maximize the browser window.
		driver.findElement(By.id("username")).sendKeys("democsr");// Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");// Enter a password
		driver.findElement(By.className("decorativeSubmit")).click();// Click the "Login" button
		driver.findElement(By.linkText("CRM/SFA")).click();// Click on the "CRM/SFA" link
		driver.findElement(By.linkText("Leads")).click();// Click on the "Leads" tab
		driver.findElement(By.xpath("//li/a[text() = 'Find Leads']")).click();// Click "Find leads."
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();// Click on the "Phone" tab.
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div/table/tbody/tr/td[3]/div/div/div/input"))
				.sendKeys("1123456789");// Enter the phone number
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();// Click the "Find leads" button.
		String leadId = driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td[1]/div/a")).getText(); 
																// Capture the lead ID of the first resulting lead.
		System.out.println("The id of the lead that is to be deleted is: " + leadId);
		driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td[1]/div/a")).click(); // Click the first resulting
																						// lead.
		driver.findElement(By.xpath("//a [text()='Delete']")).click(); // Click the "Delete" button.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li/a[text() = 'Find Leads']")).click();// Click "Find leads" again
		driver.findElement(By.xpath("//span [text()='Name and ID']")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following-sibling::div/input")).sendKeys(leadId);//Enter the captured lead ID
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();// Click the "Find leads" button.
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='No records to display']")));
		if (message.isDisplayed()) {
		    System.out.println("Message verified: " + message.getText());
		} else {
		    System.out.println("Message not displayed.");
		}
		driver.quit();
	}
}
