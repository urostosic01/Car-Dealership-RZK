package com.pmf.rzk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomErrorHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler
	public ResponseEntity<ErrorDetails> handleProizvodjacNijePronadjenError(WebRequest request, ProizvodjacNijePronadjenError ex) {
		ErrorDetails ed = new ErrorDetails(ex.getMessage(), ex.getVrednost());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorDetails> handleModelNijePronadjenError(WebRequest request, ModelNijePronadjenError ex) {
		ErrorDetails ed = new ErrorDetails(ex.getMessage(), ex.getVrednost());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.NOT_FOUND);
	}
}