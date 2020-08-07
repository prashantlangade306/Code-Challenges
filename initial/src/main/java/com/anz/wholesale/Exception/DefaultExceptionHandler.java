package com.anz.wholesale.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * This is a default exception handler class handling more specific exception AccountTransactionNotFoundException
 * and Exception.
 *
 */
@ControllerAdvice
public class DefaultExceptionHandler  extends ResponseEntityExceptionHandler {

    /**
     * This method handles any generic exception scenario.
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorMessage> handleAnyException(Exception ex){
        ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage());
        return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    /**
     * This method handles scenario when there are no transactions associated with any given account number.
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(AccountTransactionNotFoundException.class)
    public final ResponseEntity<ErrorMessage> handleAccountTransactionException(AccountTransactionNotFoundException ex){
        ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage());
        return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.OK);
    }
}

class ErrorMessage {
    private String message;

    public ErrorMessage(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
