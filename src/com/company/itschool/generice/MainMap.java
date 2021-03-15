package com.company.itschool.generice;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "Animal");
        map.put("B", "Burta");
        map.put("C", "Cozonac");
        map.put("A", "Avion");

        String valoare = map.get("B");
        System.out.println(valoare);
        for (Map.Entry<String, String> elem : map.entrySet()) {
            String key = elem.getKey();
            System.out.println("La cheia:" + key);
            String value = elem.getValue();
            System.out.println(value);
        }
    }
}
