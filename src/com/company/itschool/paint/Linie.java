package com.company.itschool.paint;

public class Linie extends FormaGemetrica {

    private double lungime;
    private double endPointX;
    private double endPointY;

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getEndPointX() {
        return endPointX;
    }

    public void setEndPointX(double endPointX) {
        this.endPointX = endPointX;
    }

    public double getEndPointY() {
        return endPointY;
    }

    public void setEndPointY(double endPointY) {
        this.endPointY = endPointY;
    }

    @Override
    public void deseneaza() {
        System.out.println("Punct de desenare");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());

        System.out.println("Punct final");
        System.out.println(getEndPointX() + " " + getEndPointY());
    }
}
