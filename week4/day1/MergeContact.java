package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@id='left-content-column']//li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='subSectionBlock']//tr//img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Set<String> windset= driver.getWindowHandles();
		List<String> windList = new ArrayList<String>(windset);
		System.out.println(windList.size());
		driver.switchTo().window(windList.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//div[@class='x-panel x-panel-noborder'][3]//tbody//td")).click();
		driver.findElement(By.xpath("//div[@style='overflow: visible;']//div/div//a")).click();
		
		driver.switchTo().window(windList.get(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr[2]//a/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Set<String> windset1= driver.getWindowHandles();
		List<String> windList1 = new ArrayList<String>(windset1);
		
		driver.switchTo().window(windList1.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@style='overflow: visible;']//div/div[2]//a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().window(windList1.get(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String str1= driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		
		if (str1.equals("View Contact")) {
			System.out.println("MergeConatact Completed");
		}else {
			System.out.println("Failed to MergeConatacts");
		}

	}

}
