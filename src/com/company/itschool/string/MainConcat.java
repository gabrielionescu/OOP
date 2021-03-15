package com.company.itschool.string;

public class MainConcat {

    public static void main(String[] args) {
        String cuvant = "Gabi";
        String spatiu = " ";
        String verb = "merge";

        String propozitie = cuvant + "\n" +  spatiu + verb;

        if(propozitie.toUpperCase().contains("GABI")){
            System.out.println("Il are pe gabi");
        }

        System.out.println(propozitie);
    }
}
