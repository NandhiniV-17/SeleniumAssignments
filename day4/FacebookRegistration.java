package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // Initialize the WebDriver (ChromeDriver)
		driver.get("https://en-gb.facebook.com/");// Load the URL
		driver.manage().window().maximize();// Maximize the browser window
		// implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();// Click on the Create new account button
		driver.findElement(By.name("firstname")).sendKeys("Smarty");// Enter the First name
		driver.findElement(By.name("lastname")).sendKeys("Surname");// Enter the Surname
		// Handle all three drop-downs in Date of birth
		WebElement sourceElement = driver.findElement(By.id("day"));
		Select dropdown = new Select(sourceElement);
		dropdown.selectByValue("25");
		sourceElement = driver.findElement(By.id("month"));
		dropdown = new Select(sourceElement);
		dropdown.selectByValue("2");
		sourceElement = driver.findElement(By.id("year"));
		dropdown = new Select(sourceElement);
		dropdown.selectByValue("2010");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"))
				.sendKeys("abc1@gmail.com");// Enter the Mobile number or email address
		driver.findElement(By.id("password_step_input")).sendKeys("TestLeaf@123");// Enter the New password
		driver.findElement(By.xpath("//label[text()='Female']")).click();// Select the radio button in Gender
		driver.findElement(By.name("websubmit")).click();// Click on Sign up button
	}

}
