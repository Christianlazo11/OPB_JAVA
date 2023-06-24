package com.item04;

public class item04 {

    public static void main(String[] args) {

        SmartDevice device01 = new SmartDevice("SecurityCam", "Honeywell", 12, 2, 2500, 1500);
        SmartDevice device02 = new SmartPhone("MotoG60", "Motorola", 128, 6, 6000, 350, "Snapdragon 732G", "Android12", 108);
        SmartDevice device03 = new SmartWatch("Xiaomi redmi watch 2 lite", "Xiaomi", 1, 1, 256, 60, "IP40", "IP56", true);

        System.out.println(device01);
        System.out.println(device02);
        System.out.println(device03);
    }
}
