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
public class G3EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = scanner.nextDouble();

        if (num % 2 == 0) {
            System.out.println("Tu numero es par");
        } else {
            System.out.println("Tu numero es impar");
        }
    }
}
