package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Visit demoqa.com/alerts
		
		// create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\insat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // chromedriver is the class
		driver.get("https://demoqa.com/alerts");
		System.out.println(driver.getTitle()); // check title is correct
		System.out.println(driver.getCurrentUrl()); // validate URL has been passed correctly
		
		//Click on second button
		driver.findElement(By.id("timerAlertButton")).click();
		
		//Wait for alert
		Thread.sleep(6000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		//Accept alert
		driver.switchTo().alert().accept();
		
		driver.quit(); // closes all the browsers including popups

	}

}
