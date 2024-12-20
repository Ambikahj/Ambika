package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CustomizeDataPro1 {
	@Test(dataProvider = "LoginData",
	dataProviderClass= CustomizeDataPro.class)
	public void loginTest(String un, String pwd) throws InterruptedException
	{
		 System.setProperty("webdriver.gecko.driver", "./st/geckodriver.exe");
		 WebDriver driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 driver.findElement(By.id("email")).sendKeys(un);
		 driver.findElement(By.id("pass")).sendKeys(pwd);
		 driver.findElement(By.xpath("//button[.='Log in']")).click();
		 System.out.println(un+""+pwd);
	}

}
