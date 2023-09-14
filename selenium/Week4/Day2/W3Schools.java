package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
	
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert prompt = driver.switchTo().alert();
		String text1 = prompt.getText();
		System.out.println(text1);
		prompt.accept();
		String text = driver.findElement(By.id("demo")).getText();
		if (text.contains("OK")) {
			System.out.println("Validated");
		}
		else {
			System.out.println("Not validated");
		}
}
}
