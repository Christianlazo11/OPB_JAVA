package com.item06.Exercise07;

public class Main {

    public static void main(String[] args) {

        try {
            int result = dividePorCero(5,0);
            System.out.println("El resultado de la división es: " + result);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerce");
        }

    }

    //Función que lanza la Excepción
    public static int dividePorCero(int val01, int val02) throws Exception{
        int result = 0;
        try {
            result = val01 / val02;
        } catch (Exception e) {
            throw new Exception();
        }

        return result;
    }
}
