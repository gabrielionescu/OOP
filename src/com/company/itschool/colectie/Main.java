package com.company.itschool.colectie;

public class Main {

    public static void main(String[] args) {
        Lista lista =  new Lista();
        Product mere =  new Product();
        mere.setName("Mere");
        lista.addProduct(mere);

        Product pere =  new Product();
        pere.setName("Pere");
        lista.addProduct(pere);

        Product ananas = new Product();
        ananas.setName("Ananas");
        lista.addProduct(ananas);

        lista.removeProduct(pere);

        Product[] produseDinLista = lista.getProduse();
        for(int i = 0; i < produseDinLista.length ; i++){
            Product produs = produseDinLista[i];
            if(produs != null) {
                System.out.println(produs.getName());
            }
        }

    }
}
