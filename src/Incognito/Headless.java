package Incognito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./st/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
	    WebDriver driver= new ChromeDriver(opt);

	}

}
