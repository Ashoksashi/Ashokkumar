package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		//Search by Name
		driver.findElement(By.name("firstName")).sendKeys("Ashokkumar");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		Thread.sleep(2000);
		//Click on first resulting lead
		driver.findElement(By.xpath("//div[text()='Lead ID']/following::div/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[1]")).click();
		
		String text= driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		//Verify title of the page
		System.out.println(text);
		driver.findElement(By.linkText("Edit")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
