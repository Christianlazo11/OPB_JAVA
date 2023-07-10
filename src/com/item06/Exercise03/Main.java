package com.item06.Exercise03;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        /*Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y
        muestra el resultado final.*/

        Vector<Integer> pares = new Vector<Integer>();

        //Agregamos 5 elementos
        for(int i = 0; i < 5; i++) {
            pares.add(i + 2);
        }

        //2,3,4,5,6

        //Removemos el 2 y tercer elemento
        pares.remove(1);//3
        pares.remove(2);//5

        //Mostramos el resultado

        for(int i = 0; i <  pares.size(); i++) {
            System.out.println(pares.get(i));
        }



    }
}
