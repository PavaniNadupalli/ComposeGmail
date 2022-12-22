package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.composeGmailPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComposeGmail {
	WebDriver driver = null;
	Properties p;
	composeGmailPage obj;
	
	@Given("login into gmail with valid user")
	public void login_into_gmail_with_valid_user() throws IOException, InterruptedException {
	
		System.out.println("Start");
	    p = new Properties();
		FileInputStream fis = new FileInputStream("./data.properties");
        p.load(fis);
        
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("identifierId")).sendKeys("sampletest.Incubyte@gmail.com");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		driver.findElement(By.name("Passwd")).sendKeys("Incubyte@123");
		driver.findElement(By.id("passwordNext")).click();
		 obj = new composeGmailPage(driver);
		obj.Compose();
		
       
	
	}

	@Given("enter required subject and body")
	public void enter_required_subject_and_body() {
		driver.get(p.getProperty("subject"));
		driver.get(p.getProperty("body"));
	}

	@When("user enters email in to column")
	public void user_enters_email_in_to_column() {
		obj.ToTextBox(p.getProperty("mailId"));
	}

	@Then("click on send")
	public void click_on_send() {
		obj.Send();
		driver.close();
		
	}




}
