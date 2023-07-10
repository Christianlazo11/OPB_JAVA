package com.item06.Exercise05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        /*Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando
        únicamente el valor de cada elemento.*/

        //Creamos el Arraylist y agregamos los valores
        ArrayList<String> data = new ArrayList<>();
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");

        //Creamos el linkedList y copiamos los valores de Arraylist
        LinkedList<String> copia = new LinkedList<>();
        copia.addAll(data);

        //Indicamos los valores del LinkedList
        for(String n : copia) {
            System.out.println(n);
        }
    }
}
