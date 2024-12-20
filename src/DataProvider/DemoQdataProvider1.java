package DataProvider;

import org.testng.annotations.DataProvider;

public class DemoQdataProvider1
{
	@DataProvider(name="testData")
	public Object[][] createData(){
		
		Object[][] data ={
			{"fghjk","fghjkl","dfghj@56","dfghj@56","kijhgt","kijhgtkj","kijh@gmail.com","tyjhnb","http:www.jio.com","tyjhnb","678654","kijnhgtylkbv","678654","fghj6789"},
			{"fghjk","fghjkl","dfghj@56","dfghj@56","kijhgt","kijhgtkj","kijh@gmail.com","tyjhnb","http:www.jio.com","tyjhnb","678654","kijnhgtylkbv","678654","fghj6789"},
			
		};
		return data;

}
}
