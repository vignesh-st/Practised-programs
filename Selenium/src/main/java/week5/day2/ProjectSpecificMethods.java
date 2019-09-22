package week5.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	
	@Parameters({"url", "username", "password"})
	@BeforeMethod 
	public void startApp(String url,String UserName, String passWord)
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement userElement = driver.findElementById("username");
		userElement.sendKeys(UserName);

		WebElement passElement = driver.findElementById("password");
		passElement.sendKeys(passWord);

		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		loginButton.click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	
	
	//@AfterMethod
	public void closeApp()
	{
		driver.close();
	}


}
