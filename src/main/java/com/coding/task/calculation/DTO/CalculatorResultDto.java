package com.coding.task.calculation.DTO;

/**
 * The CircleCalculationResultsDTO class is the wrapper for result to displayed
 * to the client.
 *
 * @author vineet karandikar
 * @version 1.0
 * @since 2017-09-08
 */
public class CalculatorResultDto {

	private String operationName;

	private Double value;

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "CircleCalculationResultsDTO [operationName=" + operationName + ", value=" + value + "]";
	}

}
