package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Alert alert= driver.switchTo().alert();
		String str = alert.getText();
		System.out.println(str);
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String str1 = alert.getText();
		System.out.println(str1);
		alert.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		String str2 = alert.getText();
		System.out.println(str2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		alert.sendKeys("Test");
		alert.accept();
		
		
	}

}
