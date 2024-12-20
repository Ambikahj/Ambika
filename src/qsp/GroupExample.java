package qsp;

import org.testng.annotations.Test;

public class GroupExample {
	@Test(groups= {"Sanity"})
	public void test1()
	{
		System.out.println("this is the test case1");
	}
	@Test(groups= {"Sanity","smoke"})
	public void test2()
	{
		System.out.println("this is the test case2");
	}
	@Test(groups= {"Smoke"})
	public void test3()
	{
		System.out.println("this is the test case3");
	}
	

}
