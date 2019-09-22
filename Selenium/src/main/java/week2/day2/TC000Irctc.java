package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC000Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.switchTo().alert().
		Actions builder = new Actions(driver);
		WebElement fromTextBox = driver.findElementByXPath("//span[@class='ui-autocomplete ui-widget']/input");
		fromTextBox.sendKeys("MAS");
		builder.sendKeys(fromTextBox, Keys.TAB).perform();;
		
		WebElement toTextBox = driver.findElementByXPath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[2]");
		toTextBox.sendKeys("SA");
		builder.sendKeys(toTextBox, Keys.TAB).perform();;
		
		
		
		
	}

}
