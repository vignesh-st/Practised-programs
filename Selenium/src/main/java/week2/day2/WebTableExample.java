package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("CBE",Keys.TAB);
		//table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		//Row Count
		List<WebElement> allRow = table.findElements(By.tagName("tr"));
		System.out.println(allRow.size());
		//Second row
		WebElement secondRow = allRow.get(1);
		//All Column
		List<WebElement> allColumn = secondRow.findElements(By.tagName("td"));
		//Second Column
		String secondTrainName = allColumn.get(1).getText();
		System.out.println(secondTrainName);
}
}
