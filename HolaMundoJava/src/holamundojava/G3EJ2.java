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
public class G3EJ2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        String frase;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase = scanner.next();
        
        if ("eureka".equals(frase)) {
        System.out.println("Correcto");
            
        } else {
        System.out.println("Incorrecto");
        };
        
    }
    
}
