package ru.netology.ProductManager;

public class Smartphone extends Product {
    private String fabric;

    public Smartphone(int id, String name, int price, String fabric) {
        super(id, name, price);
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

}
