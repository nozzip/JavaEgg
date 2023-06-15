/*
Realizar un programa que pida dos números enteros 
positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar 
el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente
, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa 
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package holamundojava;

import java.util.Scanner;

/**
 *
 * @author nozzip
 */
public class G3EJ6 {

    public static void main(String[] args) {

        int num1;
        int num2;
        int opcion;
        String salir = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el primer numero entero");
        num1 = scanner.nextInt();

        System.out.println("Indique el segundo numero entero");
        num2 = scanner.nextInt();

        do {
            System.out.println("Indique una opcion");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int resultadoOp1;
                    resultadoOp1 = num1 + num2;
                    System.out.println("Tu suma es: " + resultadoOp1);
                    break;
                case 2:
                    int resultadoOp2;
                    resultadoOp2 = num1 - num2;
                    System.out.println("Tu resta es: " + resultadoOp2);
                    break;
                case 3:
                    int resultadoOp3;
                    resultadoOp3 = num1 * num2;
                    System.out.println("Tu multiplicacion es: " + resultadoOp3);
                    break;
                case 4:
                    int resultadoOp4;
                    resultadoOp4 = num1 / num2;
                    System.out.println("Tu division es: " + resultadoOp4);
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir del programa (S/N)?");
                    salir = scanner.next();

            }
        } while (!salir.equalsIgnoreCase("S"));
    }
}
