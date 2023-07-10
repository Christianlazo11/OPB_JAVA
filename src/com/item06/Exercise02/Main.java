package com.item06.Exercise02;

public class Main {

    public static void main(String[] args) {
        /*Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento
        en ambas dimensiones.*/

        int data[][] = {{4,5,6}, {5,6,7,10,25,60}};

        for(int i = 0; i < data.length; i++) {

            for(int j = 0; j < data[i].length; j++) {
                System.out.print("Fila => " + i + " Columna => " + j + " Valor: " + data[i][j] + "\n");
            }
        }
    }
}
