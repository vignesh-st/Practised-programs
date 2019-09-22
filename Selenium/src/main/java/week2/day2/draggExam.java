package week2.day2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draggExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement dragElem = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		Point location = dragElem.getLocation();
		
		
		builder.dragAndDropBy(dragElem, location.getX()+100, location.getY()+100).perform();
		

	}

}
