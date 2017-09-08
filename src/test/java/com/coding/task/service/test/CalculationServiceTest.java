package com.coding.task.service.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coding.task.calculation.DTO.CalculatorResultDto;
import com.coding.task.service.CalculatorService;
import com.coding.task.service.impl.CalculatorServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class CalculationServiceTest {

	CalculatorService calculatorService = new CalculatorServiceImpl();

	@Test
	public void testAddition() {
		assertEquals("Addition was correct", 2.0, calculatorService.addOperation(2.0, 0.0).getValue(), 0);

	}

	@Test
	public void testSubtraction() {
		assertEquals("Addition was correct", -4.0, calculatorService.subtractOperation(-2.0, 2.0).getValue(), 0);

	}

	@Test
	public void testDivison() {
		assertEquals("Addition was correct", 25.0, calculatorService.divideOperation(50.0, 2.0).getValue(), 0);

	}

	@Test
	public void testMultiplication() {
		assertEquals("Addition was correct", -2.0, calculatorService.multiplyOperation(2.0, -1.0).getValue(), 0);

	}

}
