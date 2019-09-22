package week2.assignments;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import week5.day1.ProjectSpecificMethods;

public class TC001EditLead extends ProjectSpecificMethods{
	@Test
	public void editLead() throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", ".//drivers//Chromedriver//chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps");
//		// driver.findElement(By.id("username").id("crmsfa")).sendKeys("");
//		WebElement userElement = driver.findElementById("username");
//		userElement.sendKeys("DemoSalesManager");
//
//		WebElement passElement = driver.findElementById("password");
//		passElement.sendKeys("crmsfa");

		//WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		//loginButton.click();
		//driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[text()='Leads']").click();
		// driver.findElementByXPath("(//ul[@class='shortcuts']//a)[2]").click();
		driver.findElementByXPath("(//ul[@class='shortcuts']//a)[3]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ppp@gmail.com");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		System.out.println(driver.getTitle());

		if (driver.getTitle().contains("View Lead")) {
			System.out.println("Title has View Lead");
		} else {
			System.out.println("Tile doesnot have View Lead");
		}

		driver.findElementByXPath("(//div[@class='frameSectionExtra'])[2]/a[3]").click();
		// driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear().sendkey=
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("HCL Tech");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		System.out.println(driver.findElementByXPath("(//td[@class='label']/following::td)").getText());
		if (driver.findElementByXPath("(//td[@class='label']/following::td)").getText().contains("HCL Tech")) {
			System.out.println("Company name updated");

		}

		else {
			System.out.println("company name not updated");
		}

		
	}

}
