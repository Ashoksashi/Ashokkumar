package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("vijayvinod123@gmail.com");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		Thread.sleep(2000);
		//Capture name of First Resulting lead
		WebElement webvar=driver.findElement(By.xpath("//div[text()='Lead ID']/following::div/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[1]"));
		
		String leadname= webvar.getText();
		System.out.println("lead ID" + leadname);

		//Click First Resulting lead
		webvar.click();
		Thread.sleep(2000);
		
		//Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		//Verify the title as 'Duplicate Lead'
		String strTitle = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		System.out.println(strTitle);		  	            
		if (strTitle.contains("Duplicate Lead")) 
		{
			System.out.println("Title is displayed as expected");
		} 
		else
		{
			System.out.println("Title is not displayed as expected");
		}
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		String strName = driver.findElement(By.id("viewLead_firstName_sp")).getText(); 
		  if (strName.contains(leadname)) {
				System.out.println("Duplicate name is created");
			} 
			  else
			  {
					System.out.println("Duplicate name is not created");
				} 
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 driver.close();
		
		driver.findElement(By.className("smallSubmit")).click();
				
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		
	}

}
