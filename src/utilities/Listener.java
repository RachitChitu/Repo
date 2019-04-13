package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.IExecutionListener;


public class Listener implements IExecutionListener {

	@Override
	public void onExecutionStart() {
		// TODO Auto-generated method stub
		System.out.println("Execution is going to start");
	}

	@Override
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		System.out.println("Execution is going to finish");
		try {
			SendEmail.sendEmail();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
