package com.item06.Exercise09;

public class Cuenta {
    private int numeroCuenta;
    private int cedula;
    private double monto;

    public Cuenta(int numeroCuenta, int cedula, double monto) {
        this.numeroCuenta = numeroCuenta;
        this.cedula = cedula;
        this.monto = monto;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
