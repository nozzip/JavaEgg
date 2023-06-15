package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner sc = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        System.out.println("Ingrese el numero de cuenta: ");
        int numeroCuenta = sc.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        long dniCliente = sc.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        double saldoActual = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        return cuenta;

    }

    public void ingresar(CuentaBancaria cuenta, double cantidad) { // toma como parametro la variable cuenta que se hizo en la linea 19

        System.out.println("Indique un monto a INGRESAR a la cuenta: ");
        cantidad = sc.nextDouble();

        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad); // y aquí modifica el valor de dicha cuenta, seteando el saldo con parametros de traer el saldo actual y sumarle la cantidad que se deposito
        System.out.println("Ingreso realizado con éxito. Saldo actual: " + cuenta.getSaldoActual());
    }

    public void retirar(CuentaBancaria cuenta, double retirar) {

        System.out.println("Ingrese el monto a RETIRAR de la cuenta: ");
        retirar = sc.nextDouble();

        if (retirar > cuenta.getSaldoActual()) {
            retirar = cuenta.getSaldoActual();
        }

        cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);
        System.out.println("Retiro realizado con éxito. Saldo actual: " + cuenta.getSaldoActual());

    }

    public void extraccionRapida(CuentaBancaria cuenta, double extraccion) {
        extraccion = cuenta.getSaldoActual() * 0.2;
        cuenta.setSaldoActual(cuenta.getSaldoActual() - extraccion);
        System.out.println("Extracción rápida realizada con éxito. Saldo actual: " + cuenta.getSaldoActual());
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

}
