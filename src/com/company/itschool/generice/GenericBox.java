package com.company.itschool.generice;

public class GenericBox<TYPE,KEY> {

    private TYPE data;

    private KEY keyData;

    public void add(TYPE dataToBeAdded){
        this.data =  dataToBeAdded;
    }

    public void addKey(KEY keyData){
        this.keyData =  keyData;
    }

    public TYPE getData() {
        return data;
    }

    public KEY getKeyData() {
        return keyData;
    }
}
