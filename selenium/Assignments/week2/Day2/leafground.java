package week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='col-12']/input")).sendKeys("Bouvanesswary");
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys("India");
		WebElement box3=driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]"));

		if(box3.isEnabled())
		{
			System.out.println("The text box 3 is enabled");
		}
		else
		{
			System.out.println("The text box 3 is disabled");
		}
		

		driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
		

		WebElement text=driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		String t= text.getAttribute("value");
		System.out.println(t);
		driver.close();
		

		WebElement tab=driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]"));
		tab.sendKeys("bouvanaa@gmail.com");
		tab.sendKeys(Keys.ENTER);
		

		driver.findElement(By.xpath("//div[@class='col-12']/textarea")).sendKeys("about me nothing to say");
		

		driver.findElement(By.xpath("//button[@class='ql-italic']")).click();
		driver.findElement(By.xpath("//div[@class='ui-texteditor']//div[@class='ql-editor ql-blank']")).sendKeys("qDWFSFVDBNEG BKJADFNBJDHBFVAEJHBAJDNBV");
		
		WebElement e=driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input"));
	    e.sendKeys(Keys.ENTER);
	    WebElement error = driver.findElement(By.xpath("(//div[contains(@class,'ui-message ui-message-error')]//span)[2]"));
	    String er=error.getText();
	    if(er.contains("mandatory"))
	    {
	    	System.out.println("Error message displayed");
	    }
	    else
	    {
	    	System.out.println("Error message not displayed");
	    }
		

	   driver.navigate().back();
	   WebElement la= driver.findElement(By.xpath("//span[@class='ui-float-label']//input"));
	   Point l=la.getLocation();
	   System.out.println(l);
	   la.click();
	   WebElement label= driver.findElement(By.xpath("//span[@class='ui-float-label']//label"));
	   Point l1= label.getLocation();
	   System.out.println(l1);
	   
	   if(l==l1)
	   {
		   System.out.println("No change in location");
	   }
	   else
	   {
		   System.out.println(" Change in Location");
	   }
	  

		WebElement enter=driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input"));
		enter.click();
		enter.sendKeys("Bouvana");
		Thread.sleep(2000);
		WebElement dd=driver.findElement(By.xpath("(//li[contains(@class,'ui-autocomplete-item ui-autocomplete-list-item')]/following-sibling::li)[3]"));
	    dd.click();
	    

		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-keyboard-input')]")).click();
        WebElement key=driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content "
        		+ "ui-corner-all ui-shadow keypad-popup ui-input-overlay']"));
        boolean k= key.isDisplayed();
        
        if(k=true)
        {
        	System.out.println("Keypad displayed");
        }
        else
        {
        	System.out.println("Keypad not displayed");
        } 
       driver.findElement(By.xpath("//button[@title='Close the keypad']")).click();
 
       driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
       driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/span[2]/span[1]/span[1]")).click();
       driver.findElement(By.xpath("(//span[@data-value='serif'])[2]")).click();
	   WebElement custom=driver.findElement(By.xpath("//div[@id=\"j_idt106:j_idt124_editor\"]/div[1]"));
	   custom.sendKeys("customized text entered");
		
	   driver.close();	
		
	}
}
