package com.company.itschool.paint;

public class Main {
    public static void main(String[] args) {
        Plansa plansa = new Plansa();
        Cerc cerc = new Cerc();
        cerc.setStartPointX(2);
        cerc.setStartPointY(2);
        cerc.setRaza(3);

        Patrat patrat = new Patrat();
        patrat.setStartPointX(5);
        patrat.setStartPointY(10);
        patrat.setLatura(20);

        plansa.add(cerc);
        plansa.add(patrat);

        plansa.deseneaza();
    }
}
