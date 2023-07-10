package com.item06.Exercise08;

import java.io.*;

public class Main {
    public static void main(String[] args)  {

        /*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
         "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado
         en el parámetro "fileIn" al fichero dado en "fileOut".*/

        try {
            //Leer archivos
            InputStream data = new FileInputStream("hola.txt");
            FileWriter dataCop =  new FileWriter("copiaHola.txt");

            //Pasar los archivos a la función/metodo
            copyFile(data, dataCop);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void copyFile(InputStream fileIn, FileWriter fileOut) {

        try {
            byte[] data = fileIn.readAllBytes();

            for(byte n : data) {
                fileOut.write(n);
            }
            System.out.println("Copia realizada con Exito");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
