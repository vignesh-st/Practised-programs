package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		// driver.findElement(By.id("username").id("crmsfa")).sendKeys("");
		WebElement userElement = driver.findElementById("username");
		userElement.sendKeys("DemoSalesManager");

		WebElement passElement = driver.findElementById("password");
		passElement.sendKeys("crmsfa");

		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		loginButton.click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[text()='Leads']").click();
		// driver.findElementByXPath("(//ul[@class='shortcuts']//a)[2]").click();
		driver.findElementByXPath("(//ul[@class='shortcuts']//a)[3]").click();
		// driver.findElementByXPath("").sendKeys("12114");
		Thread.sleep(5000);
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sa831@gmail.com");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(5000);
		String name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"))
				.getText();
		System.out.println(name);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("Confirm Duplicate Lead Title is present");
		} else {
			System.out.println("Not present");
		}
		driver.findElementByXPath("//input[@name='submitButton']").click();

		String dupName = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		System.out.println(dupName);
		if (name.equals(dupName)) {
			System.out.println("I confirm duplicate name is same as captured lead");
		} else {
			System.out.println("No Matching");
		}
		driver.close();
	}

}
