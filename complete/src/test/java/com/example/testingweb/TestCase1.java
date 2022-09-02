package com.example.testingweb;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TestCase1 {

	@Test
	@Tag("production")
	void test1() {
		System.out.println("Inside test1");
	}
	
	@Test
	@Tag("smoke")
	void test2() {
		System.out.println("Inside test2");
	}
	
	@Test
	@Tag("sanity")
	void test5() {
		System.out.println("Inside test5");
	}
	
	

}
