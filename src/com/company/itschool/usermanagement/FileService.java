package com.company.itschool.usermanagement;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public void writeToFile(List<User> userList) throws IOException {
        List<String> text = new ArrayList<>();
        for (User user : userList) {
            String numeString = user.getNume() + " " + user.getPrenume();
            text.add(numeString);
        }
        Path path = Paths.get("E:/test/user.txt");
        Files.write(path, text);
    }

    public List<User> readFromFile() throws IOException {
        Path path = Paths.get("E:/test/user.txt");
        List<String> text = Files.readAllLines(path);
        List<User> utilizatori = new ArrayList<>();
        for (String linie : text) {
            //line = "Ionescu Gabriel"
            String[] parts = linie.split(" ");
            String nume = parts[0];
            String prenume = parts[1];
            User user = new User(nume, prenume);
            utilizatori.add(user);
        }
        return utilizatori;
    }
}
