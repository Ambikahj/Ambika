package GroupClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test(groups= {"Smoke"})
public class Class1 {
	@Test
	public void Group1() throws InterruptedException
	{
		 System.setProperty("webdriver.gecko.driver", "./st/geckodriver.exe");
		    WebDriver driver= new FirefoxDriver();
		    driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ambika12@gmail.com");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[.='Submit']")).click();
	}

}
