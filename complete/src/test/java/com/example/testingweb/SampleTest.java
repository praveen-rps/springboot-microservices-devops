package com.example.testingweb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
	
	@Test
	public void testExepctedException() {
		ArithmeticException thrown = 
				Assertions.assertThrows(ArithmeticException.class, ()->{
					int x=1/0;
				});
		
		assertEquals(thrown.getMessage(),"/ by zero");
	}


}
