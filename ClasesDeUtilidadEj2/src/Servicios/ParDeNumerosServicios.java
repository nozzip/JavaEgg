package Servicios;

import Entidad.ParDeNumerosEntidad;

public class ParDeNumerosServicios {

    ParDeNumerosEntidad numEntidad = new ParDeNumerosEntidad();

    public void mostrarValores() {

        double num1 = numEntidad.getNum1();
        double num2 = numEntidad.getNum2();

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);

    }

    public double devolverMayor() {

        double numMayor1 = numEntidad.getNum1();
        double numMayor2 = numEntidad.getNum2();

        if (numMayor1 > numMayor2) {

            return numMayor1;
        } else {
            return numMayor2;
        }
    }

    public double calcularPotencia() {

        double numPotencia1 = numEntidad.getNum1();
        double numPotencia2 = numEntidad.getNum2();

        if (numPotencia1 > numPotencia2) {
            return Math.pow(numPotencia1, Math.round(numPotencia2));
        } else {
            return Math.pow(numPotencia2, Math.round(numPotencia1));
        }

    }

    public double calcularRaiz() {

        double menor = Math.min(numEntidad.getNum1(), numEntidad.getNum2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }

}
