package com.company.itschool.gestiuneproduse;

public class Fruct extends Produs {

    // false
    private boolean bio;

    public Fruct(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    @Override
    public String getCategory() {
        return "Fructe";
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }
}
