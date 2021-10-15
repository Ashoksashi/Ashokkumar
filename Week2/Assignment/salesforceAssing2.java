package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforceAssing2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver= new ChromeDriver();
		
		// Step 3: Load the URL 		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		Thread.sleep(2500);
		
		// Step 6: Fill in all the text boxes
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("ashkkumar@domin.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9876543210");
		
		// Step 7: Handle all the dropdowns
		WebElement userTitle= driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select dropdown=new Select(userTitle);
		dropdown.selectByValue("Marketing_PR_Manager_AP");
		
		WebElement companyEmployees= driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropdown1=new Select(companyEmployees);
		dropdown1.selectByValue("1600");
				
		WebElement companyCountry= driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropdown3=new Select(companyCountry);
		dropdown3.selectByValue("IN");
		
		// Step 8: Click the check box
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		// Step 9: Close the browser
		driver.close();

	}

}
