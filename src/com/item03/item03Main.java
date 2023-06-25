package com.item03;

public class item03Main {

    public static void main(String[] args) {

        String[] text = {"hi", "how", "are", "you", "today"};

        String result = concatText(text);

        System.out.println("El resultado es: " + result);
    }

    static String concatText(String[] data) {
        String resultData = "";

        for(String n : data) {
            resultData += n + " ";
        }

        return resultData;
    }
}
