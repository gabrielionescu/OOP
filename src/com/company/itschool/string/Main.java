package com.company.itschool.string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prepozitie = scanner.nextLine();
        int endIndex = prepozitie.lastIndexOf('.');
        int startIndex = prepozitie.lastIndexOf(" ") + 1;
        String cuvant = prepozitie.substring(startIndex , endIndex);
        System.out.println("Ultimul cuvant este:" + cuvant);

        String[] cuvinte = prepozitie.split(" ");
        for(String cuv : cuvinte){
            if(cuv.contains(".")){
                cuv = cuv.replace(".","");
            }
            System.out.println(cuv);
        }


    }
}
