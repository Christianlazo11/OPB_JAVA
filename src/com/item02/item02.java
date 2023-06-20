package com.item02;


public class item02 {

    public static void main(String[] args) {

        double precioFinal = getIva(10000);

        System.out.println("El precio con iva incluido es: " + precioFinal);
    }

    static double getIva(double price) {
        int iva = 19;
        return  price * (((double) iva / 100) + 1);
    }
}
