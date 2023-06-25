package com.item05;

import java.util.List;

public class CocheCRUDImpI implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("Saving " + coche.getName());
    }

    @Override
    public List<Coche> findAll(String name) {
        System.out.println("Finding all " + name);
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Deleting coche " + coche.getName());
    }
}
