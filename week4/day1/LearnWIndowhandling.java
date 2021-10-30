package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWIndowhandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//ChromeOptions option
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windset = driver.getWindowHandles();
		
		List<String> windlist = new ArrayList<String>(windset);
		System.out.println("count of window opened :"+ windlist.size());
		
		driver.switchTo().window(windlist.get(1));
		
		System.out.println("Customer Care Number :" + driver.findElement(By.xpath("//a[@class='d-block font-weight-bold']")).getText());
	}

}
