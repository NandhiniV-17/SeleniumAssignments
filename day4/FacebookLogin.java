package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();// Instantiate the Browser driver
		driver.get("https://www.facebook.com/");// Load the URL
		driver.manage().window().maximize();// Maximize the browser window
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");//Enter the email id
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");//Enter a password
		driver.findElement(By.name("login")).click();//Click the "Login" button
		driver.findElement(By.linkText("Find your account and log in.")).click();//Click on the link
		//Verify the title of the current web page
		String actualTitle = driver.findElement(By.tagName("h2")).getText();
		System.out.println("Page heading: " + actualTitle);
		if (actualTitle.contains("Find Your Account")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Title is not correct");
		}
		driver.quit();
	}

}
