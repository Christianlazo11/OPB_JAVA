package com.item05;

import java.util.List;

public interface CocheCRUD {

    void save(Coche coche);

    List<Coche> findAll(String name);

    void delete(Coche coche);
}
