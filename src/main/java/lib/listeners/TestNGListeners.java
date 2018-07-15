package lib.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGListeners implements IAnnotationTransformer, IRetryAnalyzer  {

	int count=1;
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor constructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(this.getClass());
		
		if(testMethod.getName().equals("createLead")) {
			annotation.setTimeOut(10);
		}
		
		
		
		System.out.println("ClassName:"+this.getClass());
		
		if(testMethod.getName().equals("deleteLead")) {
			annotation.setEnabled(false);
		}
		
		
		
		
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess() & count<2) {
			System.out.println("MyCount is: "+ count);
			count++;
			return true;
		}
		return false;
	}
	
	

}
