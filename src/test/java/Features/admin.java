package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class admin {
	WebDriver driver;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Driverstest\\chromedriver-win64\\chromedriver.exe");
		  driver= new ChromeDriver();					
		  driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		 driver.get(string);
	    
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
		WebElement ur=driver.findElement(By.name("Email"));
	    ur.sendKeys(string);
	    WebElement ps=driver.findElement(By.name("Password"));
	    ps.sendKeys(string2);
	   
	}

	@When("Click on Login")
	public void click_on_login() {
		//WebElement l=driver.findElement(By.className("button-1 login-button"));
		WebElement login_button = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		login_button.click();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		 String actualTitle = driver.getTitle();
	     Assert.assertEquals("Page title mismatch", string, actualTitle);
		
	    
	}

	@When("User click on Logout link")
	public void user_click_on_logout_link() {
		WebElement logout_button = driver.findElement(By.xpath("//a[@class='nav-link' and @href='/logout']"));
		logout_button.click();
	    
	}
	
	@Then("close browser")
	public void close_browser() {
		driver.quit();
	    
	}

}
