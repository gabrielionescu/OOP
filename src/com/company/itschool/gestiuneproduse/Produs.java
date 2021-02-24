package com.company.itschool.gestiuneproduse;

public class Produs {
    private String name;
    private double pret;
    private String producator;

    public Produs(String name, double pret, String producator) {
        this.name = name;
        this.pret = pret;
        this.producator = producator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }
}
