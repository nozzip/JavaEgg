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
public class G2EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
                   
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();
                  
        System.out.println("La suma del doble es: " + (numero * 2));
        System.out.println("La suma del triple es: " + Math.pow(numero, 3));
        System.out.println("La suma del numero multiplicado por 3 es: " + (numero * 3));
        System.out.println("La raiz es: " + Math.sqrt(numero));
        
    }
    
}
