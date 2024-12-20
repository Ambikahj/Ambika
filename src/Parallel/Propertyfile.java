package Parallel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Propertyfile {
	@Test
	public static String getData() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		String url=p.getProperty("baseurl");
		return url;
		
				
	}

}