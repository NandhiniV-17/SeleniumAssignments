package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	EdgeDriver driver;
	WebDriverWait wait;
	
	@Given("Login to Salesforce with the username as {string} and password as {string}")
	public void login_to_salesforce_with_the_username_as_and_password_as(String username, String password) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		driver = new EdgeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	@When("Open the toggle menu and select Sales from App Launcher")
	public void open_the_toggle_menu_and_select_sales_from_app_launcher() {
		WebElement appLauncher = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-icon-waffle']")));
		appLauncher.click();
		WebElement viewAllBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']")));
		viewAllBtn.click();
		WebElement salesBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Sales']")));
		salesBtn.click();   
	}

	@When("Click on the Accounts tab")
	public void click_on_the_accounts_tab() {
		WebElement accountsTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Accounts']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", accountsTab);

	}

	@When("Click on the New button")
	public void click_on_the_new_button() {
		wait
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']"))).click();
	    
	}

	@When("Enter {string} as account name")
	public void enter_as_account_name(String accountName) {
		
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//input[@name='Name']")));
			nameField.sendKeys(accountName);
	    
	}

	@When("Select Ownership")
	public void select_ownership() {
		driver.findElement(By.xpath("//button[@aria-label='Ownership']")).click();
	    
	}

	@Then("Click save and verify Account name is {string}")
	public void click_save_and_verify_account_name_is(String expectedName) {
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//h1/slot/lightning-formatted-text")));
			String actualName = nameField.getText();
		if (expectedName.equalsIgnoreCase(actualName))
			System.out.println("Account Verified");
		else
			System.out.println("Account not Verified. The actual text is "+actualName );
	}  
}
