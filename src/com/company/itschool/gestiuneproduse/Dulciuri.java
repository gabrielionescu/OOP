package com.company.itschool.gestiuneproduse;

public class Dulciuri extends Produs{

    private  int gramaj;

    public Dulciuri(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public int getGramaj() {
        return gramaj;
    }
}
