package tests;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(false);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test =extent.createTest("TC_001", "Create Lead");
		test.assignAuthor("Sankar");
		test.pass("UserName Entered Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpg").build());
		test.pass("Password Entered Successfully");
		test.pass("Submitted Successfully");
		//test.fail("Unable to Login");
		
		extent.flush();

	}

}
