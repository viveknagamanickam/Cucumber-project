package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	
	@Given("^I am in the CRM index page$") 	
	public void i_am_in_the_index_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\Desktop\\other\\selenium\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 	
		driver.manage().deleteAllCookies(); 	
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); 	
		driver.get("https://www.freecrm.com/index.html"); 			    	
		}
	
	@When("^I enter userid and password$")
	public void login() throws Throwable{
		driver.findElement(By.name("username")).sendKeys("Sarvika_Udayam");
		driver.findElement(By.name("password")).sendKeys("Sarvika23");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Given("^I am in the home page$")
	public void NewTask() throws Throwable{
		Select tasks = new Select(driver.findElement(By.id("navmenu")));
		tasks.selectByVisibleText("New Task");

}
	
		
}
