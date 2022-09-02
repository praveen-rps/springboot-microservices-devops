package com.example.testingweb;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SamnpleTestCase {
	
	@BeforeAll
	public static void beforeAllMethod() {
		System.out.println("This method is executed once per class before all tests");
	}
	
	@AfterAll
	public static void AfterAllMethod() {
		System.out.println("This method is executed once per class after all tests");
	}

	@Test
	void test1() {
		
		System.out.println("inside the test1");
		
	}
	
	@Test
	//@Disabled
	void test2() {
		
		System.out.println("inside the test2");
	}
	
	@BeforeEach
	public void beforeMethod() {
		System.out.println("this method is executed before every test method");
	}
	
	@AfterEach
	public void afterMethod() {
		System.out.println("this method is executed after every test method");
	}
	

}
