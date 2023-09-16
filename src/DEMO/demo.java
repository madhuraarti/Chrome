package DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo 
{
 public static void main(String[] args) 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\ChromeChanges\\drivers\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.setBinary("C:\\Users\\HP\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe"); 
	 WebDriver driver = new  ChromeDriver(options);
	driver.get("https://www.facebook.com/");
}
}
