package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h5[text( )=' Alert (Prompt Dialog)']/following::span")).click();
		Alert prompt = driver.switchTo().alert();
		String text1 = prompt.getText();
		System.out.println(text1);
		prompt.sendKeys("Harish");
		prompt.accept();
		String text = driver.findElement(By.id("confirm_result")).getText();
		if (text.contains("Harish")) {
			System.out.println("Validated");
		}
		else {
			System.out.println("Not validated");
		}
		
	}

}
