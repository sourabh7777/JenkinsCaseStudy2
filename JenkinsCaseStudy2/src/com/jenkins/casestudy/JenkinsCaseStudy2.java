package com.jenkins.casestudy;

import org.testng.annotations.Test;

public class JenkinsCaseStudy2 {

	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Test Apple device");
	}
	
	
	@Test(groups = {"MI"})
	public void m1() {
		System.out.println("Test MI device");
	}
	
	@Test(groups = {"Moto"})
	public void motog1() {
		System.out.println("Test moto device");
	}
	
	@Test(groups = {"Lenova"})
	public void lenova1() {
		System.out.println("Test Lenova device");
	}
	
}

