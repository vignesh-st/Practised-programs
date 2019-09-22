package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> objList = new ArrayList<String> ();
		objList.addAll(windowHandles);
		driver.switchTo().window(objList.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(objList.get(0)).close();
		
				

	}

}
