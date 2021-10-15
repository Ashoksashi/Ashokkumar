package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//WebElement eleusername = driver.findElement(By.id("username"));
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//WebElement elepassword = driver.findElement(By.id("password"));
		
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ashokkumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Naganathan");
		WebElement dataSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown= new Select(dataSource);
		dropdown.selectByVisibleText("Direct Mail");
		
		WebElement industryEnumId = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown1= new Select(industryEnumId);
		dropdown1.selectByIndex(7);
		
		WebElement ownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown2= new Select(ownershipEnumId);
		dropdown2.selectByValue("OWN_PARTNERSHIP");
		
		WebElement marketingCampaignId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		marketingCampaignId.sendKeys("Affiliate Sites");
		//Select dropdown3= new Select(marketingCampaignId);
		
		

		
		
		//driver.findElement(By.className("smallSubmit")).click();
		//Thread.sleep(5500);
		//driver.close();
	}

}
