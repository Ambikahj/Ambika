package Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParExc {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void par(String browser)
	{
		System.setProperty("webdriver.gecko.driver","./st/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./st/chromedriver.exe");
		if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
			driver.get("https://www.facebook.com/");

		}
		else
		{
			driver= new ChromeDriver();
			driver.get("https://www.instagram.com/");
		}
	}

}
