package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ZoomCarTestCase {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai");
		driver.findElement(By.xpath("//a[@title='Start your wonderful journey']")).click();
		driver.findElementByXPath("(//div[@class='component-popular-locations']/div)[3]").click();
		driver.findElementByClassName("proceed").click();
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int tomorrow = Integer.parseInt(today)+1;
		System.out.println(tomorrow);
		driver.findElement(By.xpath("//div[contains(text(),"+tomorrow+")]")).click();
		driver.findElementByClassName("proceed").click();
		driver.findElementByClassName("proceed").click();
		List<WebElement> carList = driver.findElementsByXPath("//div[@class='car-item']");
		System.out.println(carList.size());
		Map<String,Integer> carNameAndPriceMap = new LinkedHashMap<String,Integer>();
		for(int i =1;i<=carList.size();i++)
		{
			WebElement carname = driver.findElement(By.xpath("(//div[@class='details']/h3)["+i+"]"));
			 String carPrice = driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText();
			 int price = Integer.parseInt(carPrice.replaceAll("\\D", ""));
			carNameAndPriceMap.put(carname.getText(), price );
		}
		
		System.out.println(carNameAndPriceMap);
		
		System.out.println(carNameAndPriceMap.entrySet());
		List<Integer> price = new ArrayList<Integer>(); 
		price.addAll(carNameAndPriceMap.values());
		Collections.sort(price);
		
		Set<Entry<String, Integer>> entrySet = carNameAndPriceMap.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue() == price.get(price.size()-1))
		{
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" = "+value);
			
		}
		}
		for(int i =1;i<=carList.size();i++)
		{
			 driver.findElement(By.xpath("(//div[@class='details']/h3)["+i+"]"));
			 String carPrice = driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText();
			 int price1 = Integer.parseInt(carPrice.replaceAll("\\D", ""));
			if(price.get(price.size()-1) == price1 )
			{
				driver.findElementByXPath("(//button[@class='book-car'])["+i+"]").click();
			}
		}
			
	}

}
