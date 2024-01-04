package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	
	@Test(priority=1,description="Launching Gmail Application")
	
	public void gmailapplicationLaunch() {
		System.out.println("gmail launch");
	}
	

}
