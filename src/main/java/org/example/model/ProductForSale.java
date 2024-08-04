package org.example.model;

public abstract class ProductForSale {
   private String type;
    private int price;
    private String description;

    ProductForSale(String type,int price,String description){
        this.type=type;
        this.price=price;
        this.description=description;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    public int getSalesPrice(int quantity){
        return quantity*getPrice();
    }
    public abstract void showDetails();

    @Override
    public String toString() {
        return "ProductForSale{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
