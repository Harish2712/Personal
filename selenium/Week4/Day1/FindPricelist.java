package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindPricelist {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		Thread.sleep(10);
		driver.findElement(By.id("nav-search-submit-button")).click();		
		
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		List<Integer> prices = new ArrayList<>();

		for (WebElement each : price) {
			String text = each.getText();
			String replacedString = text.replaceAll(",", "");
			int mobileprices = Integer.parseInt(replacedString);
			prices.add(mobileprices);	
			
		}
		
		Collections.sort(prices);
		System.out.println(prices.get(0));
	}
}
