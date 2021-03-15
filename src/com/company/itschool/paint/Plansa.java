package com.company.itschool.paint;

import java.util.ArrayList;

public class Plansa implements Desenabil{

    private int width;
    private int height;

    private ArrayList<FormaGemetrica> formeGeometrice = new ArrayList<>();

    public void add(FormaGemetrica formaGemetrica){
        formeGeometrice.add(formaGemetrica);
    }

    @Override
    public void deseneaza() {
        for(int i = 0 ; i <  formeGeometrice.size() ; i++){
            FormaGemetrica formaGemetrica =  formeGeometrice.get(i);
            formaGemetrica.deseneaza();
        }
    }
}
