package com.example.moneytransfer.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> icHandler(InvalidCredentials msg){
        log.error(msg.getMessage());
        return new ResponseEntity<>("400 Error input data", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InternalServer.class)
    public ResponseEntity<String> isHandler(InternalServer msg){
        log.error(msg.getMessage());
        return new ResponseEntity<>("500 Error transfer", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}