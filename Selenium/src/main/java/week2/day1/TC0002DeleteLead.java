package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC0002DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\Chromedriver\\chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps");
	WebElement userElement = driver.findElementById("username");
	userElement.sendKeys("DemoSalesManager");
	
	WebElement passElement = driver.findElementById("password");
	passElement.sendKeys("crmsfa");
	
	WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
	loginButton.click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//span[text()='Phone']").click();
	driver.findElementByName("phoneNumber").sendKeys("111");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(5000);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
	driver.findElementByClassName("subMenuButtonDangerous").click();
	driver.close();
	
	
	
	}

}
