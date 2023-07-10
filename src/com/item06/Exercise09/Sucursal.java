package com.item06.Exercise09;

import java.util.HashMap;

public class Sucursal {

    private static HashMap<String, Cliente> clientes;

    private String pais;
    private int cantEmpleados;
    private String ciudad;

    public Sucursal(String pais, int cantEmpleados, String ciudad) {
        this.pais = pais;
        this.cantEmpleados = cantEmpleados;
        this.ciudad = ciudad;
    }

    public void crearCliente(Cliente cliente) {
        clientes.put(String.valueOf(cliente.getCedula()), cliente);
    }

    public Cliente buscarCliente(int cedula) throws Exception {
        for(int i = 0; i <  clientes.size(); i++) {
            if(clientes.get(i).getCedula() == cedula) {
                return clientes.get(i);
            }
        }

        throw new Exception();
    }

    public void eliminarCliente(int cedula){
        for(int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCedula() == cedula) {
                clientes.remove(String.valueOf(cedula));
                break;
            }
        }
    }

    public HashMap<String, Cliente> consultarClientes() {
        return clientes;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
