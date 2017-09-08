package com.coding.task.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.coding.task.calculation.DTO.CalculatorResultDto;
import com.coding.task.common.InvalidInputException;
import com.coding.task.service.CalculatorService;

/**
 * The CalculatorServiceImpl class calculates performs general mathematical calculations.
 *
 * @author vineet karandikar
 * @version 1.0
 * @since 2017-09-08
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

	private static final Logger logger = LoggerFactory.getLogger(CalculatorServiceImpl.class);

	/**
	 * This method does addition of two numbers.
	 * 
	 * @param firstParam
	 *            This is first number.
	 * @param secondParam
	 *            This is second number.
	 * @return CalculatorResultDTO
	 */
	@Override
	@Cacheable("calculator")
	public CalculatorResultDto addOperation(Double firstParam, Double secondParam) {
		CalculatorResultDto calculatorResultDTO = null;
		logger.info("Addition operation started=====> ");
		calculatorResultDTO = new CalculatorResultDto();
		calculatorResultDTO.setOperationName("Addition");
		double result = firstParam + secondParam;
		calculatorResultDTO.setValue(result);
		return calculatorResultDTO;
	}

	/**
	 * This method does subtraction of two numbers.
	 * 
	 * @param firstParam
	 *            This is first number.
	 * @param secondParam
	 *            This is second number.
	 * @return CalculatorResultDTO
	 */
	@Override
	@Cacheable("calculator")
	public CalculatorResultDto subtractOperation(Double firstParam, Double secondParam) {
		CalculatorResultDto calculatorResultDTO = null;
		logger.info("Subtraction operation started =====> ");
		calculatorResultDTO = new CalculatorResultDto();
		calculatorResultDTO.setOperationName("Subtraction");
		double result = firstParam - secondParam;
		calculatorResultDTO.setValue(result);
		return calculatorResultDTO;
	}

	/**
	 * This method does division of two numbers.
	 * 
	 * @param firstParam
	 *            This is first number.
	 * @param secondParam
	 *            This is second number.
	 * @return CalculatorResultDTO
	 */
	@Override
	@Cacheable("calculator")
	public CalculatorResultDto divideOperation(Double firstParam, Double secondParam) {
		CalculatorResultDto calculatorResultDTO = null;
		if (Double.doubleToRawLongBits(secondParam.doubleValue()) == 0) {
			logger.error("Divsion by zero.Second argument is zero.");
			throw new InvalidInputException("CalculatorServiceImpl", "Second argument is having zero value");
		}
		logger.info("Division operation started=====> ");
		calculatorResultDTO = new CalculatorResultDto();
		calculatorResultDTO.setOperationName("Divison");
		double result = firstParam / secondParam;
		calculatorResultDTO.setValue(result);
		return calculatorResultDTO;
	}

	/**
	 * This method does multiplication of two numbers.
	 * 
	 * @param firstParam
	 *            This is first number.
	 * @param secondParam
	 *            This is second number.
	 * @return CalculatorResultDTO
	 */
	@Override
	@Cacheable("calculator")
	public CalculatorResultDto multiplyOperation(Double firstParam, Double secondParam) {
		CalculatorResultDto calculatorResultDTO = null;
		logger.info("Multiplication operation  started=====> ");
		calculatorResultDTO = new CalculatorResultDto();
		calculatorResultDTO.setOperationName("Multiplication");
		double result = firstParam * secondParam;
		calculatorResultDTO.setValue(result);
		return calculatorResultDTO;
	}
}
