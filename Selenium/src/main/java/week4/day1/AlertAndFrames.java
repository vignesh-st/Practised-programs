package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//System.setProperty("webdriver.chrome.driver","")
		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Vignesh");
		alert.accept();
		String text1 = driver.findElementById("demo").getText();
		if(text1.contains("Vignesh"))
		{
			System.out.println("Name is present");
		}
		else
		{
			System.out.println("Name is not there");
		}
		driver.switchTo().defaultContent();
	}

}
