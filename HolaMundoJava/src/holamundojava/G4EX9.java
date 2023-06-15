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
public class G4EX9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, pares = 0, impares = 0, suma = 0;

        do {
            System.out.println("Ingrese numeros enteros");
            num = leer.nextInt();
            if (num > 0) {
                if ((num % 2) == 0) {
                    pares++;

                } else {
                    impares++;
                }
                suma = suma + num;
            }

        } while (!(num % 5 == 0));

        System.out.println(pares + " pares");
        System.out.println(impares + " impares");
        System.out.println("La cantidad total de numeros ingresados es " + (pares + impares));
    }

}
