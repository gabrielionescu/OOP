package com.company.itschool.paint;

public class Cerc extends FormaGemetrica {

    private double raza;

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    @Override
    public void deseneaza() {
        System.out.println("Punct de desenare");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());
        System.out.println("Raza de:" + raza);
    }
}
