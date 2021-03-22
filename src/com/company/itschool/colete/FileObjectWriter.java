package com.company.itschool.colete;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileObjectWriter {

    public void writeObject(List<Colet> coletList) throws IOException {
        //File
        // File Output Stream
        // Object OutputSteam
        File file = new File("E:/test/colet.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(coletList);
    }

    public List<Colet> citesteColete() throws IOException, ClassNotFoundException {
        File file = new File("E:/test/colet.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Colet> colete = (List<Colet>) objectInputStream.readObject();
            return colete;
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }

}
