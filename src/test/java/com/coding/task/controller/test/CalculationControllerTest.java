package com.coding.task.controller.test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CalculationControllerTest {

	@Autowired
	private MockMvc mvc;

	private static final String responseForAddition = "{ \"operationName\": \"Addition\", \"value\": 4}";

	private static final String responseForSubtraction = "{ \"operationName\": \"Subtraction\", \"value\": -12}";

	private static final String responseForMultiplication = "{ \"operationName\": \"Multiplication\", \"value\": 0}";

	private static final String responseForDivision = "{ \"operationName\": \"Divison\", \"value\": 10}";

	@Test
	public void testForNullAsAValueArgument() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/coding/task/calculator/v1/addition/?paramOne=2&paramSecond=null")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isInternalServerError());
	}

	@Test
	public void testForBadArgument() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/coding/task/calculator/v1/divison/?paramOne=6&paramSecond=0")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest());
	}

	@Test
	public void testForAddition() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/coding/task/calculator/v1/addition/?paramOne=2&paramSecond=2")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().json(responseForAddition));
	}

	@Test
	public void testForSubtraction() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/coding/task/calculator/v1/subtraction/?paramOne=-8&paramSecond=4")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().json(responseForSubtraction));
	}

	//
	@Test
	public void testForDivision() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/coding/task/calculator/v1/divison/?paramOne=100&paramSecond=10")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().json(responseForDivision));
	}

	@Test
	public void testForMultiplication() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/coding/task/calculator/v1/multipliction/?paramOne=2&paramSecond=0")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().json(responseForMultiplication));
	}
}