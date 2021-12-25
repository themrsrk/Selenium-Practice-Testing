package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
	
	
	public static WebDriver driver;
	
	public static String browser = "chrome";
	
	
	public static void main (String args[]) {
	
	if ( browser.equals("chrome"))  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	driver.get("https://www.github.com/login");
	driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("themrsrk@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("hkurhahs199999");
	driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
	

}
}
