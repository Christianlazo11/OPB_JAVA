package com.item06.Exercise01;

public class Main {

    public static void main(String[] args) {

        /*Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.*/

        String data[] = {"a",  "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"};

        for(String n : data) {
            System.out.print(n + " | ");
        }
    }
}
