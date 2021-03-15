package com.company.itschool.gestiunetelefoane;

import java.util.ArrayList;

public class Telefon {
    private String nume;
    private ArrayList<Contact> contacte = new ArrayList<>();

    public Telefon(String nume) {
        this.nume = nume;
    }

    public void addContact(Contact contact){
        contacte.add(contact);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    public void setContacte(ArrayList<Contact> contacte) {
        this.contacte = contacte;
    }

    public ArrayList<Contact> getContacte() {
        return contacte;
    }
}
