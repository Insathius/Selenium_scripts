package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltips {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Visit demoqa.com/tool-tips
		
		// create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\insat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // chromedriver is the class
		driver.get("https://demoqa.com/tool-tips");
		System.out.println(driver.getTitle()); // check title is correct
		System.out.println(driver.getCurrentUrl()); // validate URL has been passed correctly
		
		//Hover over the hover me to see button
		
		WebElement hover = driver.findElement(By.xpath(".//*[@id='toolTipTextField']"));
		Actions thehover = new Actions(driver);
		thehover.moveToElement(hover).build().perform();
		Thread.sleep(1000);
		
		//Validation
		
		WebElement TextElement = driver.findElement(By.cssSelector("#toolTipTextField"));
		String thetext = TextElement.getText();
		System.out.println("Tooltip message is "+thetext);
		
		//Quit browser
		driver.quit(); // closes all the browsers including popups
	}

}
