package com.company.itschool.generice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        set.add(2.0);
        set.add(25.0);
        set.add(13.0);
        set.add(3.0);
        for(Double numar: set){
            System.out.println(numar);
        }
        System.out.println("----------------------");
        Set<Double> treeSet = new TreeSet<>();
        treeSet.add(2.0);
        treeSet.add(25.0);
        treeSet.add(13.0);
        treeSet.add(3.0);
        for(Double num : treeSet){
            System.out.println(num);
        }

        System.out.println("----------------");
        Set<Double> linkedSet = new LinkedHashSet<>();
        Double a =  new Double(2.0);
        linkedSet.add(a);
        linkedSet.add(25.0);
        linkedSet.add(13.0);
        linkedSet.add(3.0);
        for(Double numar: linkedSet){
            System.out.println(numar);
        }


    }
}
