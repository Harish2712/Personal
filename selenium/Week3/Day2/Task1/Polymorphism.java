package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Polymorphism implements InterfacePoly{

	public RemoteWebDriver driver;
	
	public void startApp(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
	
}
	public void startApp() {
		driver = new ChromeDriver();
	
}
}
