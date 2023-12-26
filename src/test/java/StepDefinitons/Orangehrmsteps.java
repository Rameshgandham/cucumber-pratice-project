package StepDefinitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orangehrmsteps {
	WebDriver driver = null;
	@Given(": open browser")
	public void open_browser() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
	  
	}

	@Given(": user on login page")
	public void user_on_login_page() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	   
	}

	@When(": user given username and password")
	public void user_given_username_and_password() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
	    
	}

	@When(": click on login page")
	public void click_on_login_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	
	}

	@Then(":user navigate to home page")
	public void user_navigate_to_home_page() throws InterruptedException {
		driver.close();
		Thread.sleep(3000);
	  
	}



	}
