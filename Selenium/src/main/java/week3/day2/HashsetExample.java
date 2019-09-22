package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashsetExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("KSR B",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");

		List<WebElement> tableRow = table.findElements(By.tagName("tr"));
		int rowSize = tableRow.size();
		System.out.println("RowSize:" +rowSize);
		//List<WebElement> tableData = table.findElements(By.tagName("td"));
		
		
		
		Set<String> hashSet = new HashSet<String> ();
		
		
		for (WebElement nTableRow : tableRow) {
			
			hashSet.add(nTableRow.findElements(By.tagName("td")).get(0).getText());
			System.out.println(nTableRow.findElements(By.tagName("td")).get(0).getText());
		}
		
System.out.println("ArrayList Value:" +hashSet.size());
		
		if(hashSet.size()==rowSize)
		{
			System.out.println("Size are equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		
		
		

	}

}
