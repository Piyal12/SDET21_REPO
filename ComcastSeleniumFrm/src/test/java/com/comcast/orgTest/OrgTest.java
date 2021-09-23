package com.comcast.orgTest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "smokeTesting")
	public void createOrgTest() {
		System.out.println("createOrgTest is running");
	}
	@Test(groups = "regressionTesting")
	public void editOrgTest() {
		System.out.println("editOrgTest is running");
	}
	@Test(groups = "regressionTesting")
	public void deleteOrgTest() {
		System.out.println("deleteOrgTest is running");
	}

}