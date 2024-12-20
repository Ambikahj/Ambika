package Parallel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.gecko.driver","./st/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get(Propertyfile.getData());
       driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("1");
       driver.findElement(By.xpath("//button[.='Start']")).click();
       Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    	       .withTimeout(Duration.ofSeconds(30))
    	       .pollingEvery(Duration.ofSeconds(5))
    	       .ignoring(NoSuchElementException.class);

    	   WebElement ele1 = wait.until(new Function<WebDriver, WebElement>() {
    	     public WebElement apply(WebDriver driver) {
    	       return driver.findElement(By.id("(//select)[2]"));
    	       
    	     }
    	   });
    	   ele1.click();
       
       
      
       

	}

}
