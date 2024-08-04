package org.example.model;

public class Coke extends ProductForSale{
    private String style;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, String style) {
        super(type, price, description);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public void showDetails() {
        System.out.println("coke's style is: " + getStyle());
    }

}
