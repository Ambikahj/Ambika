package Incognito;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlePopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./st/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C://Users/whynew/Desktop/Karthikfile.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("a1"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\whynew\\Desktop\\Html\\Scit1.exe");
		
		

	}

}
