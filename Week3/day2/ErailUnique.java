package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
//		Launch the browser
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
				
		//		Launch the URL - https://erail.in/
			driver.get("https://erail.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		//		Uncheck the check box - sort on date
			driver.findElement(By.id("chkSelectDateOnly")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//		clear and type in the source station
			driver.findElement(By.id("txtStationFrom")).clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("txtStationFrom")).sendKeys("MS", Keys.ENTER);
		//		clear and type in the destination station
			driver.findElement(By.id("txtStationTo")).clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("txtStationTo")).sendKeys("TPJ", Keys.ENTER);
			Thread.sleep(2000);
			
		//		Find all the train names using xpath and store it in a list
			List<WebElement> trainNameAtt = driver.findElements(By.xpath("//div[@id='divTrainsList']//tr/td[@style=';']/a"));
			int trainCount = trainNameAtt.size();
			System.out.println("Total trains from chennai to Tiruchchirappalli  are " +trainCount);
			Set<String> strset = new HashSet<String>();
			for (WebElement eachTrain : trainNameAtt) {
				System.out.println(eachTrain.getText());
				String trainNameEach = eachTrain.getText();
				strset.add(trainNameEach);
			}
		
			System.out.println("Train Name in without Duplicate");
			for (String eachTrain : strset) {
				System.out.println(eachTrain);

			}
			System.out.println(strset.size());
		driver.close();
	}

}
