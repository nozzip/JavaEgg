/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapooejercicio4;

import guiapooejercicio4.rectangulo.Rectangulo;
import java.io.PrintStream;

/**
 *
 * @author CDRCONS02
 */
public class GuiaPOOEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo formulas = new Rectangulo();
        
        formulas.valores();
        System.out.println(" ");
        System.out.println("el perimero es " + formulas.perimetro());
        System.out.println(" ");
        System.out.println("la superficie es " +  formulas.superficie());
        System.out.println(" ");
        formulas.dibujo();
        
    }
    
}
