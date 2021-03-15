package com.company.itschool.colectie;

public class Lista {

    private Product[] produse = new Product[20];
    private int index = 0;

    public void addProduct(Product product) {
        produse[index] = product;
        index++;
    }

    public void removeProduct(Product deleteProduct) {
        int foundProduct = 0;
        for (int i = 0; i < produse.length; i++) {
            Product prod = produse[i];
            if(prod !=  null) {
                if (prod.equals(deleteProduct)) {
                    foundProduct = i;
                }
            }
        }
        for (int i = foundProduct; i < produse.length - 1; i++) {
            produse[i] = produse[i + 1];
        }
        index--;
    }

    public Product get(int index){
        return produse[index];
    }

    public Product[] getProduse() {
        return produse;
    }

    public void setProduse(Product[] produse) {
        this.produse = produse;
    }

    public int getSize() {
        return index;
    }

}
