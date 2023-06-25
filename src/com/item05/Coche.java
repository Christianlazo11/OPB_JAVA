package com.item05;

public class Coche {

    private String name;
    private String brand;
    private int cc;
    private String color;
    private double price;

    public Coche(){}

    public Coche(String name, String brand, int cc, String color, double price) {
        this.name  = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", cc=" + cc +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
