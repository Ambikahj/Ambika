package qsp;

import org.testng.annotations.Test;

public class Runner {
	@Test
	public void Compose()
	{
		System.out.println("message composed");
	}
	@Test(dependsOnMethods = "Compose")
	public void Sentitems()
	{
		System.out.println("message sent");
	}
	@Test(dependsOnMethods = "Sentitems")
	public void Trash()
	{
		System.out.println("message deleted");
	}
	

}
