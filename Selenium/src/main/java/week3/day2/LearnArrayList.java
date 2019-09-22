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

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		List<WebElement> tableData = table.findElements(By.tagName("td"));
		List<String> arryListValue = new ArrayList<String> ();
		
		for(int i=0;i<=rowSize-1;i++)
		{
			arryListValue.add(tableData.get(1).getText());
		}
		
		System.out.println("ArrayList Value:" +arryListValue.size());
		
		if(arryListValue.size()==rowSize)
		{
			System.out.println("Size are equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		
		}
		
	}

