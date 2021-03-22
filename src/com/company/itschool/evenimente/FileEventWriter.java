package com.company.itschool.evenimente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileEventWriter {

    public void write(List<Evenimente> evenimenteList){
        File file = new File("E:/test/event.txt");
        try {
            FileOutputStream fileOutputStream =  new FileOutputStream(file);
            ObjectOutputStream objectOutputStream =  new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(evenimenteList);
        } catch (FileNotFoundException e) {
            System.out.println("Erroare nu a gasit calea!");
        } catch (IOException e) {
            System.out.println("Erroare la scriere in fiser");
        }
    }
    public List<Evenimente> read(){
        File file =  new File("E:/test/event.txt");
        List<Evenimente> evenimenteList =  new ArrayList<>();
        try {
            FileInputStream fileInputStream =  new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            evenimenteList = (List<Evenimente>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fiserul nu s-a gasit");
        } catch (IOException e) {
            System.out.println("Exceptie la citire din fisier");
        } catch (ClassNotFoundException e) {
           System.out.println("Class not found");
        }
        return evenimenteList;
    }
}
