package week3.day2;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajiolist {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Count = driver.findElement(By.className("length")).getText();
		System.out.println("Number of the items Found :"+ Count);
		List <WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		int BrandCount = brandList.size();
		System.out.println("Number of brand displayed in the page :"+ BrandCount);
		System.out.println("Brand Names ");
		for(WebElement WebElement : brandList)
		{
			System.out.println(WebElement.getText());
		}
		List <WebElement> nameList = driver.findElements(By.xpath("//div[@class='name']"));
		int productcount = nameList.size();
		System.out.println("Total product :"+ productcount);
		System.out.println("Product Names ");
		for(WebElement WebElement : nameList)
		{
			System.out.println(WebElement.getText());
		}
		//driver.close();
	}

}
