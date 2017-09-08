package com.coding.task.common;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The GlobalExceptionHandler class is the intercepter for every exception
 * coming out of the application and giving meaning full response to the client.
 *
 * @author vineet karandikar
 * @version 1.0
 * @since 2017-09-08
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid input")
	@ExceptionHandler(InvalidInputException.class)
	public String handlesInvalidInputExaception(HttpServletRequest request, Exception ex) {
		logger.info("InvalidInputExaception occured: URL=" + request.getRequestURL());
		return ex.getMessage();
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Server Error")
	@ExceptionHandler(Exception.class)
	public String handlesException(HttpServletRequest request, Exception ex) {
		logger.info("Exception occured: URL=" + request.getRequestURL());
		logger.info("Exception stacktrace: " + ex.getStackTrace());
		return ex.getMessage();
	}

}
