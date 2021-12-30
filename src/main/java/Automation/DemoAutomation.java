package Automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
	
	
	private static final String Output = null;

	public static WebDriver driver;
	
	public static String browser = "chrome";
	
	
	@SuppressWarnings("deprecation")
	public static void main (String args[]) throws InterruptedException, IOException {
	
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
//	
	
	//How to handle Mouse hover
//	driver.get("https://www.salesforce.com/in/?ir=1");
//	driver.manage().window().maximize();
//	
//	WebElement element = driver.findElement(By.xpath("//*[@id=\"support-service_menu_item\"]/button/span[1]"));
//	
//	Actions action = new Actions(driver); //this is the action class which is used to perform mouse hover functionalities
//	
//	action.moveToElement(element).perform();
	
	
	
//	//How to handle drag and drop actions
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		
//		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//		driver.switchTo().frame(frame);
//		
//		
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		Actions action = new Actions(driver);
//		action.dragAndDrop(drag, drop).perform(); //this is drag and drop method with 2 parameters source which is dragable element and destination which is droppable element
	
	
	
	
//	//How to handle resizeable elements
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
//		
//		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//		driver.switchTo().frame(frame);
//		
//		
//		WebElement drag = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
//		//WebElement drop = driver.findElement(By.id("droppable"));
//		
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(drag, 100, 150).perform(); //this is drag and drop by offset method with 2 parameters source which is dragable element and offsets which are axis in X and Y
		
	
	
	
////	//How to handle Slider 
//	driver.get("https://jqueryui.com/slider/");
//	driver.manage().window().maximize();
//	
//	WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//	driver.switchTo().frame(frame);
//	
//	
//	WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
//	//WebElement drop = driver.findElement(By.id("droppable"));
//	
//	Actions action = new Actions(driver);
//	action.dragAndDropBy(slider, 100, 150).perform();
//	Thread.sleep(2000);
//	action.dragAndDropBy(slider, -100, 150).perform();	//y value is not changing thats why we have done change in X cordinate
		
		
	
//////How to handle Right click 
//driver.get("https://jqueryui.com/slider/#colorpicker");
//driver.manage().window().maximize();
//
//WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//driver.switchTo().frame(frame);
//
//
////WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
////WebElement drop = driver.findElement(By.id("droppable"));
//
//WebElement swatch = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
//
//Actions action = new Actions(driver);
//action.contextClick(swatch).perform();	// contextclick is the right click method
	
	
	
//	//How to handle Keyboard Events
//	driver.get("https://extendsclass.com/text-compare.html");
//	driver.manage().window().maximize();
//
//	WebElement source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre"));
//	WebElement destination = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre"));
////	driver.switchTo().frame(frame);
//
//	
//	//WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
//	//WebElement drop = driver.findElement(By.id("droppable"));
//
////	WebElement swatch = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
//
//	Actions action = new Actions(driver);
//	action.keyDown(source, Keys.COMMAND).sendKeys("a").sendKeys("c").build().perform(); //here we've used build method because here are multiple actions so when we have multiple actions we used build for sequence
//	action.keyDown(destination, Keys.COMMAND).sendKeys("a").sendKeys("v").build().perform();
	
	
	
	
//How to perform Implicit waits
//	driver.get("https://www.ebay.com/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //this is implicit wait we use this wait so as soon as webdriver found an element it performs actions and it won't wait for given time, the maximum, this is the max wait in parameters
//	//and it is applicable for all the webelements on the webpage
//	
//
//	
//	WebElement hover_element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//
//	Actions action = new Actions(driver); //this is the action class which is used to perform mouse and keyboard functions
//	
//	action.moveToElement(hover_element).perform();
//	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();

	
	
	//How to handleExplicit waits.
//	driver.get("https://www.ebay.com/");
//	driver.manage().window().maximize();
//
//	
//	WebElement hover_element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//
//	Actions action = new Actions(driver); //this is the action class which is used to perform mouse and keyboard functions
//	
//	action.moveToElement(hover_element).perform();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));     //this is explicit wait we use this wait when webelemet takes more time than the given time, e:g here in this example if the web element takes more than 10 seconds, it will handle
//
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
	
	
	

//	//How to perform Fluent wait
//	driver.get("https://www.ebay.com/");
//	driver.manage().window().maximize();
//
//	
//	WebElement hover_element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//
//	Actions action = new Actions(driver); //this is the action class which is used to perform mouse and keyboard functions
//	
//	action.moveToElement(hover_element).perform();
//	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) //this is fluent wait we use this wait when we want to create our custom error message or something else
//		       .withTimeout(Duration.ofSeconds(10))
//		       .pollingEvery(Duration.ofSeconds(2))
//		       .withMessage("This is Custom Error Message")
//		       .ignoring(NoSuchElementException.class);
//	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
//	
	
	
	
	
	//How to handle Web Tables (Rows and columns)
//	driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/todays-announcements");
//	driver.manage().window().maximize();
//	
//	WebElement frame = driver.findElement(By.xpath("//*[@id=\"multi-column-0\"]/div/div/div/div/div/iframe"));
//	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//	driver.switchTo().frame(frame);
//	
//	
//	List<WebElement>  rows = driver.findElements(By.xpath("//*[@id=\"content\"]/div/announcement_data/table/tbody/tr"));
//	System.out.println(rows.size());
//	int rowSize = rows.size();
//	
//	List<WebElement>  columns = driver.findElements(By.xpath("//*[@id=\"content\"]/div/announcement_data/table/tbody/tr[2]/td"));
//	System.out.println(columns.size());
//
//	int colSize = columns.size();
//	
//	for (int i=2; i<= rowSize; i++) { //loops to iterate over rows
//		for (int j=1; j<= colSize; j++) { //loop to iterate over columns
//			System.out.print(driver.findElement(By.xpath("//*[@id=\"content\"]/div/announcement_data/table/tbody/tr[" + i + "]/td[" + j + "]")).getText()+ "  "); 
//		}
//		System.out.println();
//	}
//	
	
	
	
	
	
	
//	//Perform operations using javascript executor
//	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//	driver.manage().window().maximize();
//	
//	WebElement frame = driver.findElement(By.id("iframeResult"));
//
//	
//	JavascriptExecutor jsExe = (JavascriptExecutor) driver;
//	
//	//Get Title through javascript executor
//	String script = "document.getTitle;";
//	String title = (String) jsExe.executeScript(script);
//	System.out.println(title);
//	
//	
//	//Click button thorugh JS Executor
//	driver.switchTo().frame(frame);
//	jsExe.executeScript("myFunction()");
//	driver.switchTo().alert().accept();
//	
//	
//	//Change border colours of button
//	WebElement button = driver.findElement(By.xpath("/html/body/button"));
//	jsExe.executeScript("arguments[0].style.border = '5px solid green'", button);
//	
//	//Scroll and navigate thorugh JS executor
//	driver.navigate().to("https://www.w3schools.com/");
//	WebElement certify = driver.findElement(By.xpath("//*[@id=\"bgcodeimg2\"]/div/a"));
//	jsExe.executeScript("arguments[0].scrollIntoView(true);", certify);
	
	
	
	
	
	
	
	//How to take screenshot 
//	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//	driver.manage().window().maximize();
//	
//	Date date = new Date();
//	String fileNameWithDate = date.toString().replace(" ", "_").replace(":", "_");
//	
//	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenshot, new File(".//screenshot//"+fileNameWithDate+".png"));
	

	
	//How to handle SSL Certificates
	
//		DesiredCapabilities dc = new DesiredCapabilities();
////		dc.setAcceptInsecureCerts(true);
//		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		
//		ChromeOptions chrop = new ChromeOptions();
//		chrop.merge(dc);
//	
//		
////		driver = new ChromeDriver(chrop);
//		driver.get("https://expired.badssl.com/");
//		driver.manage().window().maximize();
//		
		
	
	
	
	
	//How to handle Authentication popups	
//	String username = "admin";
//	String password = "admin";
//	
//	driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
//	driver.manage().window().maximize();
//	
	
	
	
	//How to read diles data from properties file

	
}
}









