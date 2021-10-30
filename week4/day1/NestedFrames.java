package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

	public static void main(String[] args) throws IOException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leafground.com/pages/frame.html");
		WebElement frames = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe[1]"));
		driver.switchTo().frame(frames);
		
		File scr = driver.findElement(By.id("Click")).getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/pic1.jpg");
		FileUtils.copyFile(scr, des);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frameslist = driver.findElements(By.xpath("//div[@id='wrapframe']/iframe"));
		System.out.println("Number of frames visible to the main page : "+ frameslist.size());
		driver.close();

	}

}
