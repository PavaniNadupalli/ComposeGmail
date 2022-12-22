package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class composeGmailPage {
	
	
	@FindBy (xpath= "//div[text()='Compose']")
	private WebElement composeButton;
	
	@FindBy (xpath = "(//input[@type='text'])[4]")
	private WebElement toTextBox;
	
	
	@FindBy (name = "subjectbox")
	private WebElement subjectTextBox;
	
	
	@FindBy (xpath = "//div[@role='textbox']")
	private WebElement bodyTextBox;
	
	@FindBy (xpath = "//div[text()='Send']")
	private WebElement sendButton;
	
	 public composeGmailPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	  
	 public void Compose() {
		 composeButton.click();
	 }
	 
	 public void ToTextBox(String mailId)
	 {
		 toTextBox.sendKeys(mailId);
	 }
	 
	 public void SubjectTextBox(String subject) {
		 subjectTextBox.sendKeys(subject);
	 }
	 
	 public void BodyTextBox(String body) {
		 bodyTextBox.sendKeys(body);
	 }
	 public void Send()
	 {
		 sendButton.click();
	 }
	 
	

}
