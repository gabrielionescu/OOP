package com.company.itschool.personalfacultate;

public class Student extends Persoana {
    private int anCurent;

    public Student(String name, String prenume, int varsta, int anCurent) {
        super(name, prenume, varsta);
        this.anCurent =  anCurent;
        System.out.println("Student -ul s-a creat");
    }

    public void schimbaNume(String numeNou){
        super.setNume(numeNou);
    }


    public void setAnCurent(int anCurent) {
        this.anCurent = anCurent;
    }

    public int getAnCurent() {
        return anCurent;
    }
}
