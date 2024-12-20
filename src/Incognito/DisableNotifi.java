package Incognito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotifi {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./st/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
	    WebDriver driver= new ChromeDriver(opt);
	    driver.get("https://www.zomato.com/");
	   
		
	}

}
