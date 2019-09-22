package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002DeleteLead2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		// driver.findElement(By.id("username").id("crmsfa")).sendKeys("");
		WebElement userElement = driver.findElementById("username");
		userElement.sendKeys("DemoSalesManager");

		WebElement passElement = driver.findElementById("password");
		passElement.sendKeys("crmsfa");

		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		loginButton.click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[text()='Leads']").click();
		// driver.findElementByXPath("(//ul[@class='shortcuts']//a)[2]").click();
		driver.findElementByXPath("(//ul[@class='shortcuts']//a)[3]").click();
		//driver.findElementByXPath("").sendKeys("12114");
		Thread.sleep(5000);
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("lssan@gmail.com");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(5000);
		WebElement leadID = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a");
		String idVal = leadID.getText();
		leadID.click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//ul[@class='shortcuts']//a)[3]").click();
		Thread.sleep(5000);
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(idVal);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(3000);
		//String message1 =driver.findElementByName("No records to display").getText();
		
		String message1 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		
		System.out.println(message1);
		if(message1.contains("No records"))
		{
			System.out.println(message1+" :is available ");
			
		}
		else
		{
			System.out.println("Message not displayed");
		}
		//driver.close();
	}

}
