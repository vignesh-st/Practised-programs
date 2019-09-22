package selfLearnings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartExample {

	
	public static void main(String[] arg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--diable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3000, )
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions builder = new Actions(driver);
		WebElement obj = driver.findElementByXPath("(//div[@id='container']//li/span)[1]");
		builder.moveToElement(obj).perform();
		driver.findElementByXPath("//a[@title='Laptops']").click();
		Thread.sleep(3000);
		WebElement dropdownwe = driver.findElementByXPath("(//div[@id='container']//select)[2]");
		Select sc= new Select(dropdownwe);
		
		sc.selectByIndex(3);
		driver.findElementByXPath("//div[text()='Core i5']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()='Core i3']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()='Dell']").click();
		Thread.sleep(3000);
		List<WebElement> searchList = driver.findElementsByXPath("//div[@class='_1UoZlX']");
		
		System.out.println(searchList.size());
		Map<String,Integer> lapandPrice = new LinkedHashMap<String,Integer>();
		for(int i=1;i<=searchList.size();i++)
		{
			String laptopanme = driver.findElementByXPath("(//div[@class='_3wU53n'])["+i+"]").getText();
			String price = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])["+i+"]").getText();
			int price1 = Integer.parseInt(price.replaceAll("\\D", ""));
			lapandPrice.put(laptopanme, price1);
			
		}
		
		
		List<Integer> price = new ArrayList<Integer> ();
		price.addAll(lapandPrice.values());
		Collections.sort(price);

		System.out.println(price);
		Set<Entry<String, Integer>> entrySet = lapandPrice.entrySet();
		
		String key ;
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()==price.get(price.size()-1))
			{
				 key = entry.getKey();
				System.out.println(key);
				System.out.println(entry.getValue());
				
			}
			
			
			
			for(int j=1;j<=searchList.size();j++)
			{
				String price3 = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])["+j+"]").getText();
				int price4 = Integer.parseInt(price3.replaceAll("\\D", ""));
				System.out.println(price4);
				if(price.get(price.size()-1) == price4 )
				{
					
					driver.findElementByXPath("(//div[@class='_3wU53n'])["+j+"]").click();
					//break;
				}
			
			}
			
				
		}
		
		
	}
	
}
