package Main;

import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;



public class CuentaMain {

    public static void main(String[] args) {
        CuentaBancariaServicio cuentaServicio = new CuentaBancariaServicio();
        CuentaBancaria cuenta = cuentaServicio.crearCuenta();

        System.out.println("Saldo actual: " + cuenta.getSaldoActual());

        cuentaServicio.ingresar(cuenta, 500);
        cuentaServicio.retirar(cuenta, 200);
        cuentaServicio.extraccionRapida(cuenta, 200);
        cuentaServicio.consultarSaldo(cuenta);
        cuentaServicio.consultarDatos(cuenta);
    }

}


