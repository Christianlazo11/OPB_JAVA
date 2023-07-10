package com.item06.Exercise09;

import java.util.ArrayList;

public class Cliente extends Usuario{

    private static ArrayList<Cuenta> cuentas;

    public Cliente(){
        super();
        this.cuentas = new ArrayList<Cuenta>();
    }

    public Cliente(String nombre, String apellido, int id) {
        super(nombre,apellido,id);
        this.cuentas = new ArrayList<Cuenta>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public Cuenta buscarCuenta(int numeroCuenta) throws Exception{
        for(int i = 0; i < cuentas.size(); i++) {
            if(cuentas.get(i).getNumeroCuenta() == numeroCuenta) {
                return cuentas.get(i);
            }
        }

        throw new Exception();
    }

    public void eliminarCuenta(int numeroCuenta) throws Exception {
        for(int i = 0; i < cuentas.size(); i++) {
            if(cuentas.get(i).getNumeroCuenta() == numeroCuenta) {
                cuentas.remove(i);
                break;
            }
        }

        throw new Exception();
    }

    public ArrayList<Cuenta> consultarCuentas() {
        return cuentas;
    }



}
