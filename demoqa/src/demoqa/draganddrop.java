package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\insat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // chromedriver is the class
		driver.get("https://demoqa.com/droppable");
		System.out.println(driver.getTitle()); // check title is correct
		System.out.println(driver.getCurrentUrl()); // validate URL has been passed correctly		
         
		//Element which needs to drag.    		
        WebElement From=driver.findElement(By.xpath("//div[@id='draggable']"));	
         
        //Element on which need to drop.		
        WebElement To=driver.findElement(By.xpath("//div[@id='droppable']"));					
         		
        //Using Action class for drag and drop.		
        Actions act=new Actions(driver);					

	//Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();	

	}

}
