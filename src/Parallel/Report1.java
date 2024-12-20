package Parallel;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Report1 {
	@Test
	public void console()
	{
		BasicConfigurator.configure();
		Logger log1 = Logger.getLogger(getClass().getName());
		log1.warn("tc warnings");
		log1.error("error in test case");
		log1.info("testcase info");
	}
	

	@Test
	public void folder() throws IOException
	{
		Layout lay=new PatternLayout("%d %c %m %n");
		Appender append=new FileAppender(lay,"./reports/r2.log");
		BasicConfigurator.configure(append);
		Logger log1 = Logger.getLogger(this.getClass().getName());
		log1.warn("tc warnings");
		log1.error("error in test case");
		log1.info("testcase info");
		
		
	}

}
