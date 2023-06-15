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
public class G4EX3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Escriba una letra");
        letra = leer.next();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra no es una vocal, por favor reintente con otra letra.");
        }
    }

}
