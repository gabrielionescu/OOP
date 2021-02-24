package com.company.itschool.personalfacultate;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Ionescu", "Gabriel", 27, 1);
        student.schimbaNume("Popescu");

        Profesor profesor = new Profesor("Popescu", "Ion", 30, "Engleza");

        Persoana persoana = new Persoana("Alex", "Vlad", 23);

        //Polymorfsim
        Persoana[] persoane = new Persoana[5];
        persoane[0] =  persoana;
        persoane[1] = profesor;
        persoane[2] =  student;

        for(int  i = 0 ; i <  persoane.length ; i++){
            Persoana per =  persoane[i];
            if(per != null) {
                afisarePersona(per);
            }
        }
    }

    //Polymorfism
    //O alta forma a clasei Persoana si anume forma de student / profesor
    public static void afisarePersona(Persoana persoana) {
        String name = persoana.getNume();
        String prenume = persoana.getPrenume();
        System.out.println(name + " " + prenume);
    }
}
