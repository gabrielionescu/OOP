package com.company.itschool.paint;

public abstract class FormaGemetrica implements Desenabil{

    private double startPointX;
    private double startPointY;

    public double getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(double startPointX) {
        this.startPointX = startPointX;
    }

    public double getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(double startPointY) {
        this.startPointY = startPointY;
    }
}
