package com.example.testingweb;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotationTests {
	
	@Order(5)
	@Test
	void testE() {
		System.out.println("Inside Test E");
	}

	@Order(4)
	@Test
	void testA() {
		System.out.println("Inside Test A");
	}

	@Order(3)
	@Test
	void testD() {
		System.out.println("Inside Test D");
	}

	@Order(2)
	@Test
	void testC() {
		System.out.println("Inside Test C");
	}

	@Order(1)
	@Test
	void testB() {
		System.out.println("Inside Test B");
	}
}