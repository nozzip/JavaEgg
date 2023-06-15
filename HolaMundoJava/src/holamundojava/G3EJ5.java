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
public class G3EJ5 {

    public static void main(String[] args) {

        int num;
        int valorsuma;
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique un valor máximo");
        num = scanner.nextInt();

        do {
            System.out.println("Ingrese un numero a sumar");
            valorsuma = scanner.nextInt();

            resultado = valorsuma + resultado;

        } while (resultado <= num);

        System.out.println("Sobrepasaste el valor máximo, tu numero inicial fue : " + num + ".Y el valor que ingresaste fue de: " + resultado);
    }

}
