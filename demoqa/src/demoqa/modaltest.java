package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\insat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // chromedriver is the class
		driver.get("https://demoqa.com/modal-dialogs");
		System.out.println(driver.getTitle()); // check title is correct
		System.out.println(driver.getCurrentUrl()); // validate URL has been passed correctly
		
		//Click on small modal
		driver.findElement(By.xpath("//button[@id='showSmallModal']")).click();
		
		//Dismiss modal
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//button[@id='closeSmallModal']")).click();

	}

}
