package com.rupinder.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
@RunWith(SpringRunner.class)
@WebMvcTest(UnixUserController.class)
public class UnixUserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetListPwdUser() {
		
	}

	@Test
	public void testGetListPwdUserById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListGroupOfUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testFilterUser() {
		fail("Not yet implemented");
	}

}
