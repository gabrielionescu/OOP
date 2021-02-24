package com.company.itschool.personalfacultate;

public class Profesor extends Persoana {

    private String specializare;

    public Profesor(String name, String prenume, int varsta, String specializare) {
        super(name, prenume, varsta);
        this.specializare = specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public String getSpecializare() {
        return specializare;
    }
}
