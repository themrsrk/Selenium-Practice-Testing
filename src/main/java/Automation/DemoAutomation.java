package Automation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
	
//	driver.get("https://bookme.pk/book-flights-online");
//	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("themrsrk@gmail.com");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("hkurhahs199999");
//	driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
//	driver.navigate().to("https://www.sugarcrm.com/uk/request-demo/");
//	WebElement dropdown = driver.findElement(By.name("employees_c"));
//	Select select = new Select(dropdown); //select is a class which is used to handle options
////	select.selectByValue("level4");
//	select.selectByVisibleText("501 - 1,000 employees");
//	List<WebElement> allItems = select.getAllSelectedOptions();
//	select.deselectAll();
//	
//	select.selectByValue("level1");
//	select.deselectAll();
//	Thread.sleep(2000);
//	select.selectByIndex(4);
	
//	driver.close();
	
//	List<WebElement> alltags = driver.findElements(By.tagName("a")); //how to iterate all the anchor tags and print them in console
//	
//	for (int i=0; i<alltags.size(); i++) {
//		System.out.println("Total tags are: " + alltags.get(i) );
//		System.out.println("\n");
//		System.out.println(alltags.get(i).getAttribute("class"));
//		System.out.println(alltags.get(i).getText());
//		
//	}
	
	//How to handle auto suggested dropdowns, Let's Test Airline webistes.	
//	driver.get("https://www.makemytrip.com/flights/");
//	driver.manage().window().maximize();
////	Thread.sleep(5000);
////	
////	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")).click();
////	driver.findElement(By.xpath("//span[text()='From']")).click();
////	WebElement input = driver.findElement(By.xpath("//input[@placeholder='From']"));
////	input.click();
////	input.sendKeys("Karachi");
////	input.sendKeys(Keys.ARROW_DOWN);
//////	input.sendKeys(Keys.ARROW_DOWN);
////	input.sendKeys(Keys.ENTER);
////	

	//How to handle Checkbox
//	WebElement radio = driver.findElement(By.id("radio"));
//	Actions action = new Actions(driver);
//	action.moveToElement(radio);
//	action.perform(); //these four lines of code will used to scroll the page according to the given id which is 'radio'
//	
//	driver.findElement(By.id("checkbox")).click(); //this will click on the checkbox
//	Thread.sleep(2000);
//	driver.findElement(By.id("checkbox")).click(); //this will unclick on the checkbox
	
	
	//How to handle radio buttons, simply handle find elements by id	
//	WebElement radio1 = driver.findElement(By.id("radio-flight"));
//	radio1.click();
//	System.out.println(radio1.isSelected()); //this well tell you that radio1 is selected or not, return boolean value
	
	
	
	//how to check that how many radio buttons are ion the webpage
//	System.out.println(driver.findElement(By.xpath("//*[@type='radio']")).size());
	
	
	//how to switch   from one frame   to anooother frame
//	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//	driver.manage().window().maximize();
//	
//	WebElement frame1 = driver.findElement(By.id("iframeResult"));
//	driver.switchTo().frame(frame1); 
//	driver.findElement(By.xpath("/html/body/button")).click();
//	driver.switchTo().alert().accept(); //thats how you ca naccept that alert
////	driver.switchTo().alert().dismiss(); //thats how you can dismiss that alert
//	driver.switchTo().alert().sendKeys("shahrukh"); //thats how you can send keys in prompt alerts
//	
//	//how to get back to parent frame
//	driver.switchTo().parentFrame(); //this will go to parent frame and perform given actions
//	System.out.println(driver.getTitle());
	
	
	
//	
//	//How to handle multiple windows
//	driver.get("https://www.salesforce.com/in/?ir=1");
//	driver.manage().window().maximize();
//	
//	driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
//	
//	Set<String> windowsHandler = driver.getWindowHandles(); //this will store windows Handler in sets
//	Iterator<String> iterate = windowsHandler.iterator(); //this will store iterate methods of window in iterate variable
//	
//	String parent = iterate.next();
//	String child = iterate.next();
//	
//	driver.switchTo().window(child);
//	
//	driver.findElement(By.name("UserFirstName")).sendKeys("Shahrukh");
//	driver.findElement(By.name("UserLastName")).sendKeys("Siddiqui");
	
	driver.get("https://www.salesforce.com/in/?ir=1");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"support-service_menu_item\"]/button/span[1]"));
	
	Actions action = new Actions(driver); //this is the action class which is used to mouse hover functionalities
	
	action.moveToElement(element).perform();
	
}
}









