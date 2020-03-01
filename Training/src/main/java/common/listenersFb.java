package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersFb extends browsers implements ITestListener {
public void onTestSuccess(ITestResult result) {
	try {
		screenshots("C:\\Users\\Alex & Maryna\\eclipse-workspace\\Training\\Screenshots\\Passed\\");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void onTestFailure(ITestResult result) {
	try {
		screenshots("C:\\Users\\Alex & Maryna\\eclipse-workspace\\Training\\Screenshots\\Failed");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}