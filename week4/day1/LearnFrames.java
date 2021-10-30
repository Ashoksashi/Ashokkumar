package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		WebElement fran1 = driver.findElement(By.xpath("//div[@id='iframewrapper']//iframe"));
		driver.switchTo().frame(fran1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String str1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		System.out.println(str1);
		if (driver.findElement(By.xpath("//p[@id='demo']")).getText().equals("You pressed OK!"))
		{
			System.out.println("Alert is accepted");			
		}
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		alert.dismiss();
		String str2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
				
		System.out.println(str2);
		if (driver.findElement(By.xpath("//p[@id='demo']")).getText().equals("You pressed Cancel!"))
		{
			System.out.println("Alert is dismiss");			
		}
	}

}
