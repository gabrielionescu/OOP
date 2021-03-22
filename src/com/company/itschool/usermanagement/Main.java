package com.company.itschool.usermanagement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int optiune = -1;
        while (optiune != 3) {
            System.out.println("1.Adaugare utilizator");
            System.out.println("2.Afisare utilizatori");
            optiune = scanner.nextInt();
            scanner.nextLine();
            FileService fileService = new FileService();
            if (optiune == 1) {
                System.out.println("Introduce-ti numele:");
                String nume = scanner.nextLine();
                System.out.println("Introduce-ti prenumele:");
                String prenume = scanner.nextLine();

                User user = new User(nume, prenume);
                List<User> currentUsers = fileService.readFromFile();
                currentUsers.add(user);
                fileService.writeToFile(currentUsers);
            }
            if (optiune == 2) {
                List<User> currentUsers = fileService.readFromFile();
                for (User user : currentUsers) {
                    System.out.println(user.getNume() + " " + user.getPrenume());
                }
            }
        }
    }
}
