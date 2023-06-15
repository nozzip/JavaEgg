/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapooejercicio4.rectangulo;

import java.util.Scanner;

/**
 *
 * @author CDRCONS02
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void valores() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base ");
        base = leer.nextDouble();
        System.out.println("Ingrese el valor de la altura ");
        altura = leer.nextDouble();
    }
    
    public double superficie(){
        return base * altura;        
    }
    
    public double perimetro(){
        return (base+altura)*2;
    }

    public void dibujo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
               if (i>0 && i<altura && j>0 && j<base){
                   System.out.print("* ");
               } else {
                   System.out.print("* ");
            }
                   
                
            }
            System.out.println(" "); 
        }
        System.out.println(" ");
    }
}
