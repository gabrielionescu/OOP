package com.company.itschool.abstractex;

public class Patrat implements FormaGeometrica {

    private double lun;

    @Override
    public double calculateArea() {
        return lun * lun;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * lun;
    }

    public void setLun(double lun) {
        this.lun = lun;
    }

    public double getLun() {
        return lun;
    }
}
