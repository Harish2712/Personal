package week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftaps {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sele");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BouTestF1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BouTestL1");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("BouTestFNLocal1");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BouTestDep1");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("BouTestDesc1");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Boutest1@gmail.com");
		WebElement dd= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s= new Select(dd);
		s.selectByValue("AK");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle()); 
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("BouTestnotes1");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle()); 
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButton']")).click();
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this one is duplicate");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Delete")).click();
	    driver.close();
	}
	
}
