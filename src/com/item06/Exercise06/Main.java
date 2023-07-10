package com.item06.Exercise06;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
         con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y
         muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando
         cumplas el primer "for" de relleno.*/

        ArrayList<Integer> data =  new ArrayList<Integer>();

        //Llenamos el arraylist con valores del 1 al 10 que no sean pares
        for(int i = 1; i <= 10; i++) {
            if(i % 2 != 0) {
                data.add(i);
            }
        }


        //Indicamos el resultado por consola
        System.out.println(data.toString());
    }
}
