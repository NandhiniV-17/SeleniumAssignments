package week6.day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SalesforceStaticParameterization {
	@Parameters({ "url", "username", "password", "companyName", "description" })

	@Test
	public void saleForce(String url, String username, String password, String companyName, String description) {
		// To handle alerts
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get(url);
		driver.manage().window().maximize();
		// To click on username, password and click button
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		// To click on the app launcher
		WebElement appLauncher = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-icon-waffle']")));
		appLauncher.click();
		// To click on the View all button
		WebElement viewAllBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']")));
		viewAllBtn.click();
		// To click on Legal Entities
		WebElement searchField = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search apps or items...']")));
		searchField.sendKeys("Legal Entities");
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		// To click on New button
		WebElement newBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("forceActionLink")));
		newBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']/input[@name='CompanyName']"))
				.sendKeys(companyName);
		driver.findElement(By.xpath("//label[text()='Description']/following-sibling::div/textarea"))
				.sendKeys(description);

		// To click the status as active
		driver.findElement(By.xpath("//label[text()='Status']/following-sibling::div")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item//span[@title='Active']")).click();
		// To click on Save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		// To verify the alert
		String alert = driver.findElement(By.xpath("//h2[@class='slds-truncate slds-text-heading_medium']")).getText();

		System.out.println("Validation message is displayed: " + alert);

	}
}
