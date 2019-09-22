package week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	
	@BeforeMethod
	public void startApp()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
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
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
