package com.company.itschool.paint;

public class Dreptunghiul extends FormaGemetrica {

    private int lungime;
    private int latime;

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }


    @Override
    public void deseneaza() {
        System.out.println("Punct de desenare");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());
        System.out.println("Dreptunghi cu lungimea " + lungime + "si latimea:" + latime );
    }
}
