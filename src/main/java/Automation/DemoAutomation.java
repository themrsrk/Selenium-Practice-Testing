package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
	
	
	public static WebDriver driver;
	
	public static String browser = "chrome";
	
	
	public static void main (String args[]) throws InterruptedException {
	
	if ( browser.equals("chrome"))  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	driver.get("https://www.github.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("themrsrk@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("hkurhahs199999");
	driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
	driver.navigate().to("https://www.sugarcrm.com/uk/request-demo/");
	WebElement dropdown = driver.findElement(By.name("employees_c"));
	Select select = new Select(dropdown); //select is a class which is used to handle options
//	select.selectByValue("level4");
	select.selectByVisibleText("501 - 1,000 employees");
	List<WebElement> allItems = select.getAllSelectedOptions();
	select.deselectAll();
	
	select.selectByValue("level1");
	select.deselectAll();
	Thread.sleep(2000);
	select.selectByIndex(4);
//	driver.close();
	
}
}
