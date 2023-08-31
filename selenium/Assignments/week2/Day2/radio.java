package week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[2]/div[1]/div[2]/span[1]")).click();
		System.out.println("1. Radio button selected ");
		System.out.println("2. is there any Radio button  unselectable ?");
		WebElement radio1 = driver.findElement(By.xpath("//div[@class='ui-g-12 ui-md-4']//span"));
		radio1.click();
		boolean r1=	radio1.isSelected();
		System.out.println("Chennai Radio button : " + r1);
		
		WebElement radio2 = driver.findElement(By.xpath("(//div[@class='ui-g-12 ui-md-4']//span)[2]"));
		radio2.click();
		boolean r2=	radio1.isSelected();
		System.out.println("Baganlore Radio button : " + r2);
		
		WebElement radio3 = driver.findElement(By.xpath("(//div[@class='ui-g-12 ui-md-4']//span)[3]"));
		radio3.click();
		boolean r3=	radio1.isSelected();
		System.out.println("Hyderabed Radio button : " + r3);
		int i;
		for(i=1;i<=4;i++)
		{
		WebElement chrome = driver.findElement(By.xpath("(//input[contains(@id,'j_idt87:console2')])[" +i+ "]"));
		boolean b=chrome.isSelected();
		
		if(b==true)
		{
		WebElement label = driver.findElement(By.xpath("(//input[contains(@id,'j_idt87:console2')]/following::label)[" +i+ "]"));
		String s=label.getText();
		System.out.println("Default Radio button is :" +s);
		}
		}
		WebElement age = driver.findElement(By.xpath("//input[@value='21-40 Years']"));
		boolean a2 = age.isSelected();
		System.out.println(a2);
		if(a2==true)
		{
			System.out.println("21 - 40 age Radio button is already selected ");
			
		}
		else
		{
		   age.click();
		   boolean b2= age.isSelected();
		   System.out.println("21 - 40 age Radio button is selected now");
		}	
}	
}
