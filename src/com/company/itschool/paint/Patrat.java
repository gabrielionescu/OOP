package com.company.itschool.paint;

public class Patrat extends FormaGemetrica {

    private double latura;

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    @Override
    public void deseneaza() {
        System.out.println("Punct de desenare");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());
        System.out.println("Patract cu latura de: " + latura);
    }
}
