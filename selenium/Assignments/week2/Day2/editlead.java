package week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tech Solutions");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("David");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joseph");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("David"); 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT"); 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("nothing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s1 = new Select(state);
		s1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	}

}
