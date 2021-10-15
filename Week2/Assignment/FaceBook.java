package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//MAXIMISE WINDOW
		driver.manage().window().maximize();
		
		//Click New Account
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//Add implicit wait
		Thread.sleep(2500);
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2500);
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nandhini");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("chandrasekaran");
		
		// Step 9: Enter the Email Id
		driver.findElement(By.name("reg_email__")).sendKeys("Test@gmail.com");
		
		// Step 10: Enterthe password
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		
		// Step 11: Handle all the three drop downs year, month & day
		WebElement year = driver.findElement(By.id("year"));
		Select dropDown = new Select(year);
		dropDown.selectByVisibleText("2000");
		
		WebElement month = driver.findElement(By.id("month"));
		Select dropDown1 = new Select(month);
		dropDown1.selectByIndex(7);
		
		WebElement day = driver.findElement(By.id("day"));
		Select dropDown2 = new Select(day);
		dropDown2.selectByIndex(8);
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
