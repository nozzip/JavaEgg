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
public class G3EJ3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        String frase;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabras");
        frase = scanner.nextLine();

        if (frase.length() > 8) {
            System.out.println("Incorrecto, pruebe con una palabra o frase de menos de 8 caracteres");
        } else {
            System.out.println("Correcto");
        }

    }

    private static String length(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
