package com.item05;

public class Item05Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpI();

        Coche newCoche01 = new Coche("Swift", "Suzuki", 150, "blue", 5000);
        Coche newCoche02 = new Coche("Picanto", "Kia", 180, "red", 2500);
        Coche newCoche03 = new Coche("Sandero", "Renauld", 230, "green", 8500);

        cocheCRUD.save(newCoche01);
        cocheCRUD.save(newCoche02);
        cocheCRUD.save(newCoche03);

        cocheCRUD.delete(newCoche02);
        cocheCRUD.findAll("Kia");
        cocheCRUD.delete(newCoche03);


    }
}
