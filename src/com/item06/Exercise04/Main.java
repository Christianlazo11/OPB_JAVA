package com.item06.Exercise04;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        /*Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos
        para ser añadidos al mismo.*/

        Vector<Integer> data = new Vector<Integer>(1000);

        for(int i = 1; i <= 1000; i++ ) {
            data.add(i);
        }

        System.out.println("Tamaño: " + data.size());
        System.out.println("Capacidad: " + data.capacity());

        //Agregamos un elemento
        data.add(5);
        System.out.println("Tamaño: " + data.size());
        System.out.println("Capacidad: " + data.capacity());


        /*El problema de la capacidad por defecto es que al ser superada esta aumenta un 100% lo que en el caso
        * dado que queramos agregar pocos elementos, la capacidad del vector seria mucho mayor, por ejemplo el vector de los
        * 1000 elementos, si agregamos uno mas, el tamaño seria de 1001 y su capacidad de 2000.*/
    }
}
