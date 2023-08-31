package week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createcontact {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Tech");
		driver.findElement(By.id("lastNameField")).sendKeys("Solutions");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("testfirst");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("testlast"); 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT"); 
		driver.findElement(By.id("createContactForm_description")).sendKeys("nothing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select s1 = new Select(state);
		s1.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	}

}
