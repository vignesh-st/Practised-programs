package week5.day2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.ReadExcel;
import week5.day2.ProjectSpecificMethods;

public class CreateLead extends  ProjectSpecificMethods{

	
	@DataProvider(name = "fetchData")
	public Object[][] sendData() throws IOException {
		/*String[][] data= new String[2][3];
		data[0][0]  ="HCL";
		data[0][1] = "Divahar";
		data[0][2]="R";
		
		data[1][0]  ="HCL";
		data[1][1] = "Vignesh";
		data[1][2]="ST";
		*/
		
		
		return ReadExcel.readData();
	}
  	
		@Test(dataProvider ="fetchData" )
		public void createLead(String cName,String fName, String lName)  {
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys(cName);
			driver.findElementById("createLeadForm_firstName").sendKeys(fName);
			driver.findElementById("createLeadForm_lastName").sendKeys(lName);
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
