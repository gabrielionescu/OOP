package com.company.itschool.exceptions;

public class Calculator {

    public int impartire(int x, int y) throws MyCustomException {
        int rezultat;
        if (y == 0) {
            MyCustomException exception = new MyCustomException();
            throw exception;
        } else {
            rezultat = x / y;
        }
        return rezultat;
    }
}
