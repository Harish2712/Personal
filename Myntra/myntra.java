package com.myntra;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//opening browser

public class BrowserLaunching {

	WebDriver obj;
	WebElement home, web, web1, web2, web3, tool;
	Actions a, b, c, d, tooltip;

	void browserLaunch() {
		System.setProperty("webdriver.geckodriver.driver",
				"/Users/leoharish/eclipse-workspace/firefoxdriver/geckodriver");
		obj = new FirefoxDriver();
		obj.get("https://www.myntra.com/");
		obj.manage().window().maximize();
	}

	// Selecting curtain

	void curtain() throws InterruptedException {
		home = obj.findElement(By.linkText("HOME & LIVING"));
		a = new Actions(obj);
		a.moveToElement(home).perform();
		Thread.sleep(1000);
		web = obj.findElement(By.xpath(".//*[text()='Curtains']"));
		web.click();
	}

	// price

	void price() throws InterruptedException {

		c = new Actions(obj);
		c.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		obj.findElement(By.xpath("(//DIV[@class='common-checkboxIndicator'])[11]")).click();
		Thread.sleep(5000);
		c.sendKeys(Keys.PAGE_UP).build().perform();
	}

	// Recommended

	void recommended() throws InterruptedException {

		web2 = obj.findElement(By.xpath("//div[@class=\"sort-sortBy\"]"));
		b = new Actions(obj);
		b.moveToElement(web2).perform();
		// b.moveToElement(SortBy).perform();
		Thread.sleep(4000);
		web1 = obj.findElement(By.xpath("(//LABEL[@class='sort-label '])[4]"));
		web1.click();
	}

	// discount

	void discount() throws InterruptedException {
		c.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		web3 = obj.findElement(By.xpath("(//LABEL[@class='common-customRadio vertical-filters-label'])[2]"));
		web3.click();
		Thread.sleep(5000);
		d = new Actions(obj);
		d.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		obj.findElement(By.xpath("(//DIV[@class='common-checkboxIndicator'])[11]")).click();
		Thread.sleep(5000);
		d.sendKeys(Keys.PAGE_UP).build().perform();
		obj.findElement(By.xpath("(//a[@style='display: block;'])[1]")).click(); // first item select
	}

	// window handling

	void windowHandling() throws InterruptedException {
		Set<String> Handle = obj.getWindowHandles();
		for (String NewWindow : Handle) {
			obj.switchTo().window(NewWindow);
		}
		Thread.sleep(2000);

	}

	// size

	void size() throws InterruptedException {
		obj.findElement(By.xpath("//p[@class=\'size-buttons-unified-size\'][text()='Window']")).click();
		Thread.sleep(5000);
	}

	// add to bag

	void addBag() throws InterruptedException {
		obj.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']"))
				.click();
		Thread.sleep(5000);
	}

	// click bag

	void clickBag() throws InterruptedException {

		obj.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		Thread.sleep(5000);
	}

	// alert

	void alert() {
		tool = obj.findElement(By.xpath("//div[@class='itemComponents-base-toolTipCTA']"));
		tooltip = new Actions(obj);
		tooltip.clickAndHold().moveToElement(tool);
		tooltip.moveToElement(tool).click().build().perform();
	}

	// pincode

	void pincode() throws InterruptedException {
		// click pincode

		obj.findElement(By.xpath("//button[@class='css-1qjnrii']")).click();
		Thread.sleep(2000);

		// enter pincode

		obj.findElement(By.xpath("//input[@id='pincode']")).sendKeys("632006");
		Thread.sleep(2000);

		// check pincode

		obj.findElement(
				By.xpath("//div[@class='checkDelivery-base-checkBtn checkDelivery-base-valid'][text()='CHECK']"))
				.click();
		Thread.sleep(2000);
	}

	void placeOrder() throws InterruptedException {
		obj.findElement(By.xpath("//DIV[@class='css-xjhrni'][text()='PLACE ORDER']")).click();
		Thread.sleep(2000);
		boolean l = obj.getPageSource().contains("Login");
		System.out.println(l);
	}

	public static void main(String[] args) throws InterruptedException {

		BrowserLaunching b = new BrowserLaunching();
		b.browserLaunch();
		b.curtain();
		b.price();
		b.recommended();
		b.discount();
		b.windowHandling();
		b.size();
		b.addBag();
		b.clickBag();
		b.alert();
		b.pincode();
		b.placeOrder();

	}
}
