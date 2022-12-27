package com.example.moneytransfer.advice;

public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String msg){
        super(msg);
    }
}