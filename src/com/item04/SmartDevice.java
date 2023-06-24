package com.item04;

public class SmartDevice {

    private String name;
    private String brand;
    private int storage; // Gb
    private int ram;//Gb
    private int battery;//mA
    private double price;//Dollars

    public SmartDevice() {
    }

    public SmartDevice(String name, String brand, int storage, int ram, int battery, double price) {
        this.name = name;
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
        this.battery = battery;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                ", battery=" + battery +
                ", price=" + price+ " ";
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

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
