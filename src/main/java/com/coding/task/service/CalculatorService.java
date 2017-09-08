package com.coding.task.service;

import com.coding.task.calculation.DTO.CalculatorResultDto;
/**
 * The CalculatorService interface.
 *
 * @author vineet karandikar
 * @version 1.0
 * @since 2017-09-08
 */
public interface CalculatorService {

	public CalculatorResultDto addOperation(Double firstParam ,Double secondParam);

	public CalculatorResultDto subtractOperation(Double firstParam ,Double secondParam);

	public CalculatorResultDto divideOperation(Double firstParam ,Double secondParam);
	
	public CalculatorResultDto multiplyOperation(Double firstParam ,Double secondParam);
}
