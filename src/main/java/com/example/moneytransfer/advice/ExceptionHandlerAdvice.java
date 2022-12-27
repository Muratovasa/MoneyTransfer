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
        return new ResponseEntity<>("400 InvalidCredentials in thrownException method", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> uuHandler(UnauthorizedUser msg){
        log.error(msg.getMessage());
        return new ResponseEntity<>("401 UnauthorizedUser in thrownException method", HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(InternalServer.class)
    public ResponseEntity<String> isHandler(InternalServer msg){
        log.error(msg.getMessage());
        return new ResponseEntity<>("500 InternalServer in thrownException method", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}