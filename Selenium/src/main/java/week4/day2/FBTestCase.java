package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FBTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("9566322262");
		driver.findElementById("pass").sendKeys("v1kk1@123");
		driver.findElementByXPath("//label[@id='loginbutton']/input").click();
		WebElement searchBox = driver.findElementByName("q");
		searchBox.sendKeys("TestLeaf");
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.ENTER).perform();
		String textTL = driver.findElementByLinkText("TestLeaf").getText();
		if(textTL.contains("TestLeaf"))
		{
			System.out.println("TestLeaf is Displayed");
			
		}
		else
		{
			System.out.println("TestLeaf is not Displayed");
		}
		
		String textLikeButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]")).getText();
		if(textLikeButton.contains("Like"))
		{
			//System.out.println("TestLeaf page is not yet liked.");
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			System.out.println("");
		}
		else
		{
			System.out.println("TestLeaf page is already liked");
		}
		
		driver.findElementByLinkText("TestLeaf").click();
		String title = driver.getTitle();
		if(title.contains("TestLeaf"))
		{
			System.out.println("TestLeaf Title is present");
		}
		else
		{
			System.out.println("testLeaf Title is not present");
		}
		String textPeopleLiked = driver.findElementByXPath("//div[contains(text(),'people like')]").getText();
		System.out.println("Number of Likes: "+textPeopleLiked.replaceAll("\\D", ""));
		driver.close();
	}

}
