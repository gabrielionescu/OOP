package com.company.itschool.generice;

import com.company.itschool.oopstatic.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainParcurgere {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gabi");
        list.add("Alex");
        list.add("Vlad");
        //for clasic // 0 < 3 // 1 <  3 // 2 < 2
        for (int i = 0; i < list.size(); i++) {
            String nume = list.get(i);
            list.remove(nume);
        }

        System.out.println("--------------------");
        //For each NU SE FACE STERGE
        for (String nume : list) {
//                list.remove(nume);

        }


        System.out.println("--------------------");
        //iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String nume = it.next();
            it.remove();
            // list.remove(nume);
            //Nu se face stergerea cu list.remove() in parcurgerea cu iterator
        }

    }
}
