package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@Test(dataProvider="testData")
	public void launch(String un, String psw) throws InterruptedException
	{
		 System.setProperty("webdriver.gecko.driver", "./st/geckodriver.exe");
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);


	}
	@DataProvider(name="testData")
	public Object[][] createData(){
		
		return new Object[][] {
			{"admin","manager"},
			{"preethi","Test Engineer"},
			{"Ambika","Director"},
		};
	}
	

}
