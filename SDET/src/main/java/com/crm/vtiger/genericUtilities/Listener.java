package com.crm.vtiger.genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;

/**
 * Check with PcreateorgTest Program
 */
import org.testng.ITestResult;

import com.crm.vtiger.objectRepository.OBaseClass;

public class Listener extends OBaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {

		try {
			wu.takeScreenshot(OBaseClass.statWD, result.getName()+ju.getSystemDate());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void onStart(ITestContext context) {
		
	}

}
