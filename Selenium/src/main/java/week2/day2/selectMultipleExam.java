package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectMultipleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement opt1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement opt4 = driver.findElementByXPath("//li[text() = 'Item 4']");
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(opt1);
	}

}
