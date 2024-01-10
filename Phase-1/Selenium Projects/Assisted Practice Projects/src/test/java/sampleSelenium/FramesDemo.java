package sampleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		Thread.sleep(1000);
		
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		a.clickAndHold(e1).moveToElement(e2).release().perform();
	}

}
