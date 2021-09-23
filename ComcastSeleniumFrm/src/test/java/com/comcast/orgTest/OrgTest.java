package com.comcast.orgTest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = {"smokeTesting","regressionTesting"} )
	public void createOrgTest() {
		
		System.out.println("execute createOrg Test");
		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("url");
		
		
		System.out.println("BROWSER======>"+BROWSER+"   , URL======>"+ENV);
	}
	@Test(groups = "regressionTesting")
	public void editOrgTest() {
		System.out.println("editOrgTest is running");
	}
	@Test(groups = "regressionTesting")
	public void deleteOrgTest() {
		System.out.println("deleteOrgTest is running");
	}
	@Test(groups = "regressionTesting")
	public void searchOrgTest() {
		System.out.println("searchOrgTest is running");
	}

}