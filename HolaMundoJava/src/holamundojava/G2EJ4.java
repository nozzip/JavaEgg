/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundojava;

import java.util.Scanner;

/**
 *
 * @author nozzip
 */
public class G2EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double grados;
        double F;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de grados C°");
        grados = scanner.nextDouble();
        
        F = (32 + (9 * grados / 5));
        
        System.out.println("Tu valor en Fahrenheit es : " + F);
        
        
    }
    
}
