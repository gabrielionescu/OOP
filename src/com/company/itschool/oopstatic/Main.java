package com.company.itschool.oopstatic;

public class Main {

    public static void main(String[] args) {

        User userMihai = new User();
        userMihai.setName("Mihai");

        User userGabi =  new User();
        userGabi.setName("Gabi");

        System.out.println(userMihai.getName());
        System.out.println(userGabi.getName());

        Cerc cerc1 = new Cerc();
        Cerc cerc2 = new Cerc();
    }
}
