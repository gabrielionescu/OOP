package com.company.itschool.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:/test/user.txt");
        List<String> text = new ArrayList<>();
        text.add("Gabriel merge la piata");
        text.add("Gabriel merge la magazin");
        Files.write(path, text);
    }
}
