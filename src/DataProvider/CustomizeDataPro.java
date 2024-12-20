package DataProvider;

import org.testng.annotations.DataProvider;

public class CustomizeDataPro {
	@DataProvider(name="LoginData")
	public Object[][] getData()
	{
		Object[][] data= {{"ambikahj12@gmail.com","456"},
				{"yasu45@gmail.com","789"},
				{"sagarb@gmal.com","748"},
		};
		return data;
	}

}
