package com.company.itschool.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MainCitire {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:/test/user.txt");
        List<String> text = Files.readAllLines(path);
        for (String line : text) {
            System.out.println(line);
        }
    }
}
