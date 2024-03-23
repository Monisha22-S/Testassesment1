package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class irctc {
	WebDriver driver;
	@Given("I am on the MakeMyTrip IRCTC Create Account page")
	public void i_am_on_the_make_my_trip_irctc_create_account_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Driverstest\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.makemytrip.com/railways/irctc-create-account.html");
	    driver.manage().window().maximize();
	    
	   
	}

	@When("I click the {string} link")
	public void i_click_the_link(String string) {
		System.out.println("redirected to makemytrip page");
	}

	@Then("I should be redirected to the Register page")
	public void i_should_be_redirected_to_the_register_page() {
		System.out.println("redirected to makemytrip page");
	    
	}

	@Given("I have entered a Title")
	public void i_have_entered_a_title() {
		Assert.assertTrue(driver.getTitle().contains("Create IRCTC Account | IRCTC Registration | IRCTC Login - MakeMyTrip"), "Title does not match");
	    
	}

	@Given("I have entered a First Name")
	public void i_have_entered_a_first_name() {
		driver.findElement(By.xpath("//input[@placeholder='Type a username']")).sendKeys("monisha407");
		driver.findElement(By.xpath("//input[@placeholder='Enter your first Name']")).sendKeys("monisha");
	}

	@Given("I have entered a Middle Name")
	public void i_have_entered_a_middle_name() {
		System.out.println("I have entered a Middle Name");
	    
	}

	@Given("I have entered a Surname")
	public void i_have_entered_a_surname() {
		driver.findElement(By.xpath("//input[@placeholder='Enter your last Name']")).sendKeys("S");
	}

	@Given("I have entered a Date of Birth")
	public void i_have_entered_a_date_of_birth() {
	//driver.findElement(By.xpath("//input[@placeholder='Open calendar and select date']")).click();
//		driver.findElement(By.xpath("//select[@name='month']")).click();
//		driver.findElement(By.xpath("//select[@name='year']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Open calendar and select date']")).sendKeys("22/1/2003");
		
	    
	}

	@Given("I have entered a Gender")
	public void i_have_entered_a_gender() {
		driver.findElement(By.xpath("//input[@placeholder='Enter your residential address']")).sendKeys("jpet,indranagar");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("6382989892");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your Pincode']")).sendKeys("600098");
	    
	}

	@Given("I have entered an Email")
	public void i_have_entered_an_email() {
		driver.findElement(By.xpath("//input[@placeholder='OTP will be sent to this email']")).sendKeys("monisha22sekar@gmail.com");
	    
	}

	@Given("I have entered a Mobile")
	public void i_have_entered_a_mobile() {
		driver.findElement(By.xpath("//input[@placeholder='OTP will be sent to this mobile number']")).sendKeys("9360326462");
	   
	}

	@Given("I have entered a Password")
	public void i_have_entered_a_password() {
		driver.findElement(By.xpath("//input[@placeholder='Type a password for your IRCTC account']")).sendKeys("Moni@2003");
	}

	@Given("I have entered a Confirm Password")
	public void i_have_entered_a_confirm_password() {
		System.out.println("I have entered a Confirm Password");
	    
	}

	@Given("I have entered a Password Reminder Question")
	public void i_have_entered_a_password_reminder_question() {
		driver.findElement(By.xpath("//div[@class='appendRight30 selectItem']//select")).click();
	}

	@Given("I have entered a Password Reminder Answer")
	public void i_have_entered_a_password_reminder_answer() {
		driver.findElement(By.xpath("//input[@placeholder='Type an answer for your security question']")).sendKeys("moni");
	    
	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/main[1]/div[3]/div[1]/button[1]")).click();
		System.out.println("created account");
	    
	}

	@Then("I should receive a popup displaying my account details")
	public void i_should_receive_a_popup_displaying_my_account_details() {
		System.out.println("received popup");
	}

	@Then("I should receive an email with my account details")
	public void i_should_receive_an_email_with_my_account_details() {
		System.out.println("received an email");
	    
	}

	@Then("I should be redirected to the MakeMyTrip IRCTC Admissions Portal login page")
	public void i_should_be_redirected_to_the_make_my_trip_irctc_admissions_portal_login_page() {
		driver.navigate().to("https://www.makemytrip.com/");
	}

}
