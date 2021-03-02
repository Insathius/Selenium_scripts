package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\insat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // chromedriver is the class
		driver.get("https://demoqa.com/date-picker");
		System.out.println(driver.getTitle()); // check title is correct
		System.out.println(driver.getCurrentUrl()); // validate URL has been passed correctly
		
		//select date picker
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		//select future date
		driver.findElement(By.xpath("//button[contains(text(),'Next Month')]")).click();
		driver.findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--001.react-datepicker__day--weekend.react-datepicker__day--outside-month")).click();
		
		//quit
		driver.quit(); // closes all the browsers including popups
	}

}
