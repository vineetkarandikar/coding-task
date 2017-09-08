package com.coding.task.calculation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding.task.calculation.DTO.CalculatorResultDto;
import com.coding.task.service.CalculatorService;

/**
 * The CalculationController class is the controller or the api gateway for the
 * calculator processing service.
 *
 * @author vineet karandikar
 * @version 1.0
 * @since 2017-09-08
 */
@RestController
@RequestMapping("/coding/task/calculator/v1/")
public class CalculationController {

	private static final Logger logger = LoggerFactory.getLogger(CalculationController.class);

	@Autowired
	private CalculatorService calculatorService;

	/**
	 * This controller method does addition of two numbers.
	 * 
	 * @param paramOne
	 *            This is first number.
	 * @param paramSecond
	 *            This is second number.
	 * @return CalculatorResultDto
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/addition/")
	public CalculatorResultDto addition(@RequestParam("paramOne") Double paramOne,
			@RequestParam("paramSecond") Double paramSecond) {
		logger.info("Addition operation invoked in CalculationController ===>");
		return calculatorService.addOperation(paramOne, paramSecond);
	}

	/**
	 * This controller method does subtraction of two numbers.
	 * 
	 * @param paramOne
	 *            This is first number.
	 * @param paramSecond
	 *            This is second number.
	 * @return CalculatorResultDto
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/subtraction/")
	public CalculatorResultDto subtraction(@RequestParam("paramOne") Double paramOne,
			@RequestParam("paramSecond") Double paramSecond) {
		logger.info("Subtraction operation invoked in CalculationController ===>");
		return calculatorService.subtractOperation(paramOne, paramSecond);
	}

	/**
	 * This controller method does division of two numbers.
	 * 
	 * @param paramOne
	 *            This is first number.
	 * @param paramSecond
	 *            This is second number.
	 * @return CalculatorResultDto
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/divison/")
	public CalculatorResultDto divison(@RequestParam("paramOne") Double paramOne,
			@RequestParam("paramSecond") Double paramSecond) {
		logger.info("Division operation invoked in CalculationController ===>");
		return calculatorService.divideOperation(paramOne, paramSecond);
	}

	/**
	 * This controller method does multiplication of two numbers.
	 * 
	 * @param paramOne
	 *            This is first number.
	 * @param paramSecond
	 *            This is second number.
	 * @return CalculatorResultDto
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/multipliction/")
	public CalculatorResultDto multiplication(@RequestParam("paramOne") Double paramOne,
			@RequestParam("paramSecond") Double paramSecond) {
		logger.info("Multipliction operation invoked in CalculationController ===>");
		return calculatorService.multiplyOperation(paramOne, paramSecond);
	}

}
