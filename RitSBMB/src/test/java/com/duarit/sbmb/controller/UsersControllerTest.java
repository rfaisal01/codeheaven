package com.duarit.sbmb.controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringJUnit4ClassRunner.class)
public class UsersControllerTest {
	
	
	private MockMvc mockMvc;

	@InjectMocks
	private UsersController usersController;
	
	@Before
	public void setup() throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(usersController).build();
	}
	
	@Test
	public void testUsers() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/rest/users"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("application/json"));
		
	
		
	}
	

}
