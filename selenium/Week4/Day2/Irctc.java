package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> cWindowHandle = driver.getWindowHandles();
		for (String newWindow : cWindowHandle) {
			driver.switchTo().window(newWindow);
		}
		String cTitle = driver.getTitle();
		System.out.println(cTitle);
		if (cTitle.contains("Flight")) {
			System.out.println("Validated");
		}
		else {
			System.out.println("Not validated");
		}
		
	}

}
