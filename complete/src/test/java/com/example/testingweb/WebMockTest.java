package com.example.testingweb;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(GreetingController.class)
public class WebMockTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Mock
	GreetingController controller;

	@InjectMocks
	private GreetingServiceImpl service;
	
	@BeforeEach
	public void init() {
	
	}

	@Test
	public void greetingShouldReturnHaiFromService() throws Exception {
		when(service.greetHai()).thenReturn("Hello, World Hai");
		this.mockMvc.perform(get("/hai")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, World Hai")));
	}
	
	@Test
	public void greetingShouldReturnByeFromService() throws Exception {
		when(service.greetBye()).thenReturn("Hello, World Bye");
		this.mockMvc.perform(get("/bye")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello, World Bye")));
		
}
	
}
