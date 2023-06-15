package Entidad;

import java.util.Random;

public class ParDeNumerosEntidad {

    double num1;
    double num2;

    public ParDeNumerosEntidad(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ParDeNumerosEntidad() {
        
        num1 = Math.random();
        num2 = Math.random();
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

}
