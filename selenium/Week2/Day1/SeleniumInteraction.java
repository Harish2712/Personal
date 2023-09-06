package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumInteraction {

			public static void main(String[] args) {
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://login.salesforce.com/");
				
				driver.manage().window().maximize();				
				
				WebElement classuser = driver.findElement(By.id("username"));
				
				classuser.sendKeys("hari.radhakrishnan@qeagle.com");
				
				WebElement classpass = driver.findElement(By.id("password"));
				
				classpass.sendKeys("Leaf$1234");
				
				WebElement login = driver.findElement(By.id("Login"));
				
				login.click();

			}
		}
