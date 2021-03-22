package com.company.itschool.exceptions;

public class ToLongNameException extends RuntimeException {

    public ToLongNameException(){
        super("To long name.Max length is 10");
    }
}
