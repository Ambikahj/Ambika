package Parallel;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	@Test
	public void test1()
	{
		ExtentReports rep=new ExtentReports("./Reports/r1.html",false);
	    ExtentTest test = rep.startTest("Testcase1");
		test.log(LogStatus.PASS, "test case passed");
		test.log(LogStatus.FAIL, "test case Failed");
		test.log(LogStatus.SKIP, "test case Skipped");
		rep.endTest(test);
		rep.flush();
				
		
	}

}
