package com.item04;

public class item04Main {

    public static void main(String[] args) {

        SmartDevice device01 = new SmartDevice("SecurityCam", "Honeywell", 12, 2, 2500, 1500);
        SmartDevice device02 = new SmartPhone("MotoG60", "Motorola", 128, 6, 6000, 350, "Snapdragon 732G", "Android12", 108);
        SmartDevice device03 = new SmartWatch("Xiaomi redmi watch 2 lite", "Xiaomi", 1, 1, 256, 60, "IP40", "IP56", true);

        SmartDevice device04 = new SmartDevice();
        SmartPhone device05 = new SmartPhone();
        SmartWatch device06 = new SmartWatch();

        device04.setName("IPAD Pro");
        device04.setBrand("Apple");
        device04.setStorage(128);
        device04.setRam(8);
        device04.setBattery(8000);
        device04.setPrice(1000);

        device05.setName("Redmi note 15");
        device05.setBrand("Xiaomi");
        device05.setStorage(128);
        device05.setRam(6);
        device05.setBattery(5000);
        device05.setPrice(400);
        device05.setSo("Android 12");
        device05.setCpu("Snapdragon 820");
        device05.setCam(80);

        device06.setName("Galaxy Watch 4");
        device06.setBrand("Samsung");
        device06.setStorage(16);
        device06.setRam(2);
        device06.setBattery(247);
        device06.setPrice(150);
        device06.setDustResistent("IP68");
        device06.setHealthMonitoring(true);
        device06.setWaterResistance("IP68");




        System.out.println(device01);
        System.out.println(device02);
        System.out.println(device03);
        System.out.println(device04);
        System.out.println(device05);
        System.out.println(device06);
    }
}
