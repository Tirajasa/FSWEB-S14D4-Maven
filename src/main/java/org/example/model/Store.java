package org.example.model;

public class Store {
    public static void main(String[] args) {
    ProductForSale[] products=new ProductForSale[3];
    products[0]=new Coke("sweet",5,"Coca","bottle");
    products[1]=new Bread("grained",1,"handmade","German");
    products[2]=new Chocolate("bitter",5,"premium","drop");

    listProducts(products);
    }
    public void showDetails(){
        System.out.println("it is fun");
    }
    public static void listProducts(ProductForSale[] products) {
for (ProductForSale product:products){
    if(product!=null){
        product.showDetails();
    }
}
    }
}