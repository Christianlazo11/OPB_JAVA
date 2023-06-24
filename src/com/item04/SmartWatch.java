package com.item04;

public class SmartWatch extends SmartDevice{
    private String waterResistance;
    private String dustResistent;
    private boolean healthMonitoring;

    public SmartWatch(){}

    public SmartWatch(String name, String brand, int storage, int ram, int battery, double price, String waterResistance, String dustResistent, boolean healthMonitoring){
        super(name,brand,storage,ram,battery,price);
        this.waterResistance = waterResistance;
        this.dustResistent = dustResistent;
        this.healthMonitoring = healthMonitoring;
    }

    @Override
    public String toString() {
        return super.toString() +
                "waterResistance='" + waterResistance + '\'' +
                ", dustResistent='" + dustResistent + '\'' +
                ", healthMonitoring=" + healthMonitoring +
                '}';
    }

    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    public String getDustResistent() {
        return dustResistent;
    }

    public void setDustResistent(String dustResistent) {
        this.dustResistent = dustResistent;
    }

    public boolean isHealthMonitoring() {
        return healthMonitoring;
    }

    public void setHealthMonitoring(boolean healthMonitoring) {
        this.healthMonitoring = healthMonitoring;
    }
}
