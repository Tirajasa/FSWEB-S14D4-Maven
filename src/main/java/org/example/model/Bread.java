package org.example.model;

public class Bread extends ProductForSale{
    private String name;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, String name) {
        super(type, price, description);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread's name is: " + getName()+super.toString()+this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "name='" + name + '\'' +
                '}';
    }
}
