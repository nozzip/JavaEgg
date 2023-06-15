package Main;

import Servicios.ParDeNumerosServicios;



public class ParDeNumerosMain {

    public static void main(String[] args) {
        ParDeNumerosServicios servicio = new ParDeNumerosServicios();
        servicio.mostrarValores();

        double mayor = servicio.devolverMayor();
        System.out.println("El número mayor es: " + mayor);

        double potencia = servicio.calcularPotencia();
        System.out.println("La potencia del mayor elevado al menor es: " + potencia);

        double raiz = servicio.calcularRaiz();
        System.out.println("La raíz cuadrada del menor número es: " + raiz);
    }
}
