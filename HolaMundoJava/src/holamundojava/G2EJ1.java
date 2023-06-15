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
public class G2EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int resultado;
        
        Scanner scanner = new Scanner(System.in);
        
        //almacenar numero 1
        System.out.println("Ingrese el numero 1");
        numero1 = scanner.nextInt();
               
        
        //almacenar numero 2
        System.out.println("Ingrese el numero 2");
        numero2 = scanner.nextInt();
        
        
       //resultado
       resultado = numero1 + numero2;
       
       System.out.println("Tu resultado de suma es: " + resultado);
    }
    
}
