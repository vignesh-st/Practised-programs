package implementation;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	public ChromeDriver driver;
	@Given("Open the browser")
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the browser")
	public void maximiseTheBrowser() {
	    driver.manage().window().maximize();
	}

	@Given("Set the timeout")
	public void setTheTimeout() {
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

	@Given("Load the URL")
	public void loadTheURL() {
	    driver.get("http://leaftaps.com/opentaps");
	}

	@Given("Enter the username in Loginpage")
	public void enterTheUsernameInLoginpage() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter the password in Loginpage")
	public void enterThePasswordInLoginpage() {
		driver.findElementById("password").sendKeys("crmsfa");	}

	@Given("Click Login button")
	public void clickLoginButton() {
	driver.findElementByClassName("decorativeSubmit").click();;
	}

	@Given("Click CRM hyperlink")
	public void clickCRMSFAHyperlink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click Create Lead button")
	public void clickCreateLeadButton() {
		driver.findElementByLinkText("Create Lead").click();
				
		}

	@Given("Enter the firstname as (.*) in CreateLead Page")
	public void enterTheFirstnameAsVigneshInCreateLeadPage(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@Given("Enter the lastname as (.*) in CreateLead Page")
	public void enterTheLastnameAsThangavelAsHCLInCreateLeadPage(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@Given("Enter the companyname as (.*) in CreateLead Page")
	public void enterTheCompanynameInCreateLeadPage(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@When("Click the submit button")
	public void clickTheSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("Lead created successfully")
	public void leadCreatedSuccessfully() {
	    System.out.println("Lead created successfully");
	}

}
