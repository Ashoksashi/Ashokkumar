package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter phone number
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
		driver.findElement(By.name("phoneNumber")).sendKeys("9940009391");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Capture lead ID of First Resulting lead
		
		WebElement webvar=driver.findElement(By.xpath("//div[text()='Lead ID']/following::div/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a[1]"));
		
		String leadId= webvar.getText();
		System.out.println("lead ID" + leadId);
		//Click First Resulting lead

		Thread.sleep(2000);
		webvar.click();
		
		//Click Delete
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(2000);
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(leadId);
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		if (driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed())
		{
			System.out.println("ID is successfully Deleted");
		}else
		{
			System.out.println("ID is not Deleted");
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
	    driver.close();

	}

}
