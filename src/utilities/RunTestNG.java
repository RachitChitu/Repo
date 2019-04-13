package utilities;

import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.testng.TestNG;

public class RunTestNG implements Job{

public void execute(JobExecutionContext context) throws JobExecutionException {
	// TODO Auto-generated method stub
	// Create object of TestNG Class
	TestNG runner=new TestNG();

	// Create a list of String 
	List<String> suitefiles=new ArrayList<String>();

	// Add xml file which you have to execute
	suitefiles.add("C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\Sanity.xml");
	//suitefiles.add("C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\VerifyFilterCategorySearch.xml");
	//suitefiles.add("C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\MyAccount.xml");
	//suitefiles.add("C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\CakeAddOns.xml");
	
	// now set xml file for execution
	runner.setTestSuites(suitefiles);

	// finally execute the runner using run method
	runner.run();
	
}

}