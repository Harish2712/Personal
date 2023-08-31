package week2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbnewaccount {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("leaf");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("test@123");
		
		WebElement date = driver.findElement(By.id("day"));
		Select d = new Select(date);
		d.selectByValue("1");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("1");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("2000");
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label")).click();
		
		
	}

}
