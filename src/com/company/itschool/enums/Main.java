package com.company.itschool.enums;

public class Main {
    public static void main(String[] args) {

        for(ProductType type :  ProductType.values()){
            System.out.println(type);
        }

        Product product = new Product();
        product.setProductType(ProductType.DULCIURI);

        ProductType productType = ProductType.HAINE;
        System.out.println(productType);
    }
}
