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
public class G3EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
       
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabras");
        frase = scanner.nextLine();
               
        
        if (frase.substring(0).equals("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, intento con una palabra o frase que comience con 'A' ");
        }

    }

    private static boolean Substring(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
