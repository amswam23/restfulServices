package com.example.restfulwebservices;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class RestfulWebServicesApplicationTests {
	
	private MockMvc mvc;
	
	@Test
	public void testHellow() {

		String uri ="/home";
		String stringHellow="Hello";
		String outputstring="";
		RequestBuilder requestBuilder= MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON);
		try{
		MvcResult result=mvc.perform(requestBuilder).andReturn();
		outputstring=result.getResponse().getContentAsString();
		}catch(Exception e){
				return;
		}
		assertEquals(outputstring,stringHellow);

	
	}
}
