package com.company.itschool.compozitie;

public class Main {
    public static void main(String[] args) {

        Telefon primulTelefon = new Telefon("Iphone X");
        primulTelefon.setDiagonala(10);
        primulTelefon.setMemorie(8);

        Telefon alDoileaTelefon =  new Telefon("Samsung S9");
        alDoileaTelefon.setDiagonala(12);
        alDoileaTelefon.setMemorie(6);

        CardSim cardSim1 = new CardSim(3,"Vodafone");
        CardSim cardSim2 = new CardSim(5,"Orange");

        Contact[] contacts = new Contact[2];

        Contact contactAcasa = new Contact("0351414198");
        contactAcasa.setNume("Acasa");
        contactAcasa.setPrenume("");

        Contact contactMircea =  new Contact("0784170970");
        contactMircea.setNume("Popescu");
        contactMircea.setPrenume("Mircea");

        contacts[0] = contactAcasa;
        contacts[1] =  contactMircea;

        cardSim1.setContacte(contacts);

        primulTelefon.setSim(cardSim1);
        alDoileaTelefon.setSim(cardSim2);
        afiseaza(primulTelefon);
        afiseaza(alDoileaTelefon);
    }

    public static void afiseaza(Telefon telefon){
        String model =  telefon.getModel();
        int diagonala =  telefon.getDiagonala();
        int memorie =  telefon.getMemorie();
        CardSim sim = telefon.getSim();
        String operator =  sim.getOperator();
        String numeFrecventa = sim.getNumeFrecventa();
//                          Iphone X diagonala:12 memorie:6 operator:Vodafone 3G
        System.out.println(model + " diagonala:" + diagonala + " memorie:" + memorie
                + " operator:" + operator + " " + numeFrecventa);

        Contact[] contactes =  sim.getContacte();

        if(contactes != null){
            for(int i = 0; i <  contactes.length; i++){
                Contact contact =  contactes[i];
                String nume = contact.getNume();
                String prenume = contact.getPrenume();
                String nrTelefon = contact.getTelefon();
                System.out.println(nume + " " + prenume + " " + nrTelefon);
            }
        }

    }

}
