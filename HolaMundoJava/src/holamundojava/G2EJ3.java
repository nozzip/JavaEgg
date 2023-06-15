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
public class G2EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena;       
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        cadena = scanner.nextLine();
        
                
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        
        
    }
    
}
