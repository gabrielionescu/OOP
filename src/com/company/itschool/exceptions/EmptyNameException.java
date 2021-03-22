package com.company.itschool.exceptions;

public class EmptyNameException extends RuntimeException {
    public EmptyNameException(){
        super("Empty name!");
    }
}
