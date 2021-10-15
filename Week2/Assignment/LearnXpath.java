package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//WebElement eleusername = driver.findElement(By.id("username"));
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//WebElement elepassword = driver.findElement(By.id("password"));
		
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Thread.sleep(2500);
		
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]")).click();
		
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("TestLeaf");
		
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ashokkumar");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Ashokkumar");
		
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Naganathan");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("Naganathan");
		//driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(5500);
		//driver.close();
	}

}
