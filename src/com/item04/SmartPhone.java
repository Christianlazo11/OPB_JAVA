package com.item04;

public class SmartPhone extends SmartDevice{

    private String cpu;
    private String so;
    private int camPX;

    public SmartPhone(){}

    public SmartPhone(String name, String brand, int storage, int ram, int battery, double price, String cpu, String so, int camPX){
        super(name,brand,storage,ram,battery,price);
        this.cpu = cpu;
        this.so = so;
        this.camPX = camPX;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cpu='" + cpu + '\'' +
                ", so='" + so + '\'' +
                ", cam='" + camPX + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getCam() {
        return camPX;
    }

    public void setCam(int cam) {
        this.camPX = cam;
    }
}
