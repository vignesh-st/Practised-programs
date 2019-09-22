package week2.day1;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import week5.day1.ProjectSpecificMethods;

public class TC001LoginAndCreateLead extends ProjectSpecificMethods{
	@Test
	public void CreateLead()  {
		
		
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("http://leaftaps.com/opentaps");
//		
//		WebElement userElement = driver.findElementById("username");
//		userElement.sendKeys("DemoSalesManager");
//		
//		WebElement passElement = driver.findElementById("password");
//		passElement.sendKeys("crmsfa");
//		
//		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
//		loginButton.click();
//		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vignesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("ST");
		WebElement drpdn = driver.findElementById("createLeadForm_dataSourceId");
		
		
		Select sc = new Select (drpdn);
		sc.selectByVisibleText("Public Relations");
		
		WebElement drpDn2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select sc1 = new Select (drpDn2);
		List<WebElement> options = sc1.getOptions();
		System.out.println(options.size());
		sc1.selectByIndex(options.size()-2);
		driver.findElementByClassName("smallSubmit").click();
				
			
		

	}

}
