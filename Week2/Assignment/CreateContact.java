package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
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
		
		//5. Click on contacts Button
	    driver.findElement(By.linkText("Contacts")).click();
	    
	    //6. Click on Create Contact
	    driver.findElement(By.linkText("Create Contact")).click();
	    
	    //7. Enter FirstName Field Using id Locator
	    driver.findElement(By.id("firstNameField")).sendKeys("Ashok");
	    
	    //8. Enter LastName Field Using id Locator
	    driver.findElement(By.id("lastNameField")).sendKeys("kumar");
	    
	    //9. Enter FirstName(Local) Field Using id Locator
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Servesh");
	    
	    //10. Enter LastName(Local) Field Using id Locator
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("waran");
	    
	    //11. Enter Department Field Using any Locator of Your Choice
	    driver.findElement(By.name("departmentName")).sendKeys("IT");
	    
	    //12. Enter Description Field Using any Locator of your choice 
	    driver.findElement(By.name("description")).sendKeys("Testing");
	    
	    //13. Enter your email in the E-mail address Field using the locator of your choice
	    driver.findElement(By.xpath("(//input[@name=\"primaryEmail\"])[4]")).sendKeys("mail@testleaf.com");
	    
	    //14. Select State/Province as NewYork Using Visible Text
	    WebElement stateProvinceGeoId = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select dropdown = new Select(stateProvinceGeoId);
	    dropdown.selectByVisibleText("New York");
	    
	    //Click on Create Contact
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    //Click on edit button
	    driver.findElement(By.linkText("Edit")).click();
	    
	    //Clear the Description Field using .clear
	    driver.findElement(By.name("description")).clear();
	    
	    //18. Fill ImportantNote Field with Any text
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testleaf");
	    
	    //19. Click on update button using Xpath locator
	    driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
	    
	    //20. Get the Title of Resulting Page.
		System.out.println(driver.findElement(By.id("sectionHeaderTitle_contacts")).getText());
	}

}
