package demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\insat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // chromedriver is the class
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println(driver.getTitle()); // check title is correct
		System.out.println(driver.getCurrentUrl()); // validate URL has been passed correctly
		
		//Autocomplete form
		
		//Basic details - firstname lastname
		driver.findElement(By.id("firstName")).sendKeys("firstname");
		driver.findElement(By.id("lastName")).sendKeys("lastname");
		driver.findElement(By.id("userEmail")).sendKeys("firstname.lastname@email.com");
		driver.findElement(By.id("userNumber")).sendKeys("07590116142");
		
		//Gender button - male
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

		//Date of birth - hardcoded to 31/03/86
		driver.findElement(By.cssSelector("input[id='dateOfBirthInput']")).click();
		driver.findElement(By.cssSelector(".react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select")).click();
		driver.findElement(By.xpath("//option[contains(text(),'March')]")).click();
		driver.findElement(By.cssSelector(".react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select")).click();
		driver.findElement(By.xpath("//option[contains(text(),'1986')]")).click();
		driver.findElement(By.cssSelector("input[id='dateOfBirthInput']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'31')]")).click();
		
		//Subjects - English, Computer Science
		driver.findElement(By.id("subjectsInput")).sendKeys("English");
		Thread.sleep(1000);
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("subjectsInput")).sendKeys("Computer");
		Thread.sleep(1000);
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		
		//Hobbies
		driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Music')]")).click();
		
		//Picture
		WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
		uploadElement.sendKeys("C:\\Users\\insat\\Downloads\\Image from iOS.jpg");
		
		//Current Address
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("Test Address");
		
		//State and City
		driver.findElement(By.xpath("//label[contains(text(),'Select State')]")).sendKeys("NCR");
		Thread.sleep(1000);
		
		
		
		//all fields must be complete

		//validate fields and popup?
		
		
		//submission
		//Thread.sleep(1000);
		//driver.findElement(By.id("submit")).submit();
		//driver.quit(); // closes all the browsers including popups
		
	}

}
