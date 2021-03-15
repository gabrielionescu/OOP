package com.company.itschool.abstractex;

public class Car implements Desenabil{

    private String color;

    @Override
    public void deseneaza(String color) {
        System.out.println("Se deseneaza masina");
    }
}
