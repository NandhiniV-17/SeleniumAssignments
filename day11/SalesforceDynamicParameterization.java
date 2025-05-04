package week6.day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SalesforceDynamicParameterization {
	
	WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void preCondition() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-notifications");
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test(dataProvider = "legalEntityData")
    public void createLegalEntity(String entityName) throws InterruptedException {
        // Login
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Sales@123");
        driver.findElement(By.id("Login")).click();

        // Wait and click App Launcher
        WebElement appLauncher = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-icon-waffle']")));
		appLauncher.click();
		// To click on the View all button
				WebElement viewAllBtn = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']")));
				viewAllBtn.click();
        // Search and click Legal Entities
        driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Legal Entities");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mark[text()='Legal Entities']"))).click();

        // Click dropdown on Legal Entities tab (if applicable)
        // Optional: driver.findElement(By.xpath("//a[@title='Show more actions']")).click();

        // Click "New" button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']"))).click();

        // Fill in the Name field (parameterized)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Name']"))).sendKeys(entityName);

        // Click Save
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

        // Wait for confirmation
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//lightning-formatted-text[contains(@class,'custom-truncate')]")));
        String actualName = header.getText();
        System.out.println(actualName);
    }

    @DataProvider(name = "legalEntityData")
    public Object[][] provideData() {
        return new Object[][] {
            {"Salesforce Automation by A"},
            {"Salesforce Automation by B"},
            {"Salesforce Automation by C"}
        };
    }

    @AfterClass
    public void quit() {
        driver.quit();
    }
}
