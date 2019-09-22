package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MergeLead extends ProjectSpecificMethods {
		@Test 
		//(dependsOnMethods = {"week5.day2.CreateLead.createLead"})
		public void mergeLead() throws InterruptedException {
			// TODO Auto-generated method stub

			
			driver.findElementByXPath("(//div[@class='x-panel-header']/a)[2]").click();
			driver.findElementByXPath("//a[text()='Merge Leads']").click();
			driver.findElementByXPath("(//table[@id='widget_ComboBox_partyIdFrom']/following::img)[1]").click();
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> objList = new ArrayList<String>();
			objList.addAll(windowHandles);
			System.out.println(objList.size());
			driver.switchTo().window(objList.get(1));
			String title = driver.getTitle();
			System.out.println(title);
			//driver.findElementByXPath("//input[@class=' x-form-text x-form-field ']");
			driver.findElementByXPath("//input[@name='id']").sendKeys("10064");
			driver.findElementByXPath("//button[text()='Find Leads']").click();	
			Thread.sleep(5000);
			driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]").click();
			driver.switchTo().window(windowHandle);
			driver.findElementByXPath("(//table[@id='widget_ComboBox_partyIdFrom']/following::img)[2]").click();
			Thread.sleep(5000);
			//String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles1 = driver.getWindowHandles();
			List<String> objList1 = new ArrayList<String>();
			objList1.addAll(windowHandles1);
			driver.switchTo().window(objList1.get(1));
			String title1 = driver.getTitle();
			System.out.println(title1);
			driver.findElementByXPath("//input[@name='id']").sendKeys("10065");
			driver.findElementByXPath("//button[text()='Find Leads']").click();	
			Thread.sleep(3000);
			driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]").click();
			//driver.switchTo().defaultContent();	
			driver.switchTo().window(windowHandle);
			driver.findElementByXPath("//a[@class='buttonDangerous']").click();
			driver.switchTo().alert().accept();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("(//div[@class='x-form-item x-tab-item']/div/input)[1]").sendKeys("10060");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(5000);
			String text = driver.findElementByXPath("//div[@class='x-toolbar x-small-editor']/table").getText();
			System.out.println(text);
		}




}
