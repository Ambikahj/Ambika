package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoQdataPrvider {
	@Test(dataProvider="testData"
			
			,
	dataProviderClass= DemoQdataProvider1.class)
	public void launch(String req,String min,String eq,String ceq,String max, String ran,String mail,String minV,String url,String maxV,String dig,String RangeV,String no,String Alp) throws InterruptedException
	{
		 System.setProperty("webdriver.gecko.driver", "./st/geckodriver.exe");
		 WebDriver driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@class='requiredfield shadow-sm bg-gray-50 border border-gray-400 text-gray-900 text-sm rounded  block w-full p-2.5 focus:outline-blue-500']")).sendKeys(req);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@class='minlength shadow-sm bg-gray-50 border border-gray-400 text-gray-900 text-sm rounded  block w-full p-2.5 focus:outline-blue-500']")).sendKeys(min);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(eq);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Re-Type Password']")).sendKeys(ceq);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Max 6 chars.']")).sendKeys(max);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Text between 5 - 10 chars length']")).sendKeys(ran);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter a valid e-mail']")).sendKeys(mail);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Min value is 6']")).sendKeys(minV);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='URL']")).sendKeys(url);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Max value is 6']")).sendKeys(maxV);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter only digits']")).sendKeys(dig);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Number between 6 - 100']")).sendKeys(RangeV);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']")).sendKeys(no);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']")).sendKeys(Alp);
		 
	}	
	
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
