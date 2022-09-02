package com.example.testingweb;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TestCase2 {

	@Test
	@Tag("smoke")
	void test3() {
		System.out.println("inside the test3");
	}
	
	@Test
	@Tag("production")
	void test4() {
		System.out.println("inside the test4");
	}


	@Test
	@Tag("sanity")
	void test6() {
		System.out.println("Inside test6");
	}
}
