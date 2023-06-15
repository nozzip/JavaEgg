/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232,
este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos
(llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package holamundojava;

import java.util.Scanner;

/**
 *
 * @author nozzip
 */
public class G3EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cadenaCorr = 0, cadenaInco = 0;

        Scanner scanner = new Scanner(System.in);
        String cadena, letraX, letraO;

        do {

            System.out.println("Ingrese su cadena de 5 caracteres con formato (X###O)");
            cadena = scanner.nextLine();

            int longitud = cadena.length();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (cadena.substring(0, 1).equals("X") && (cadena.substring(3, 4).equals("O")) && (cadena.length() == 5)) {
                cadenaCorr++;

            } else {
                cadenaInco++;

            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de cadenas ingresadas correctas es: " + cadenaCorr);
        System.out.println("La cantidad de cadenas ingresadas Incorrectas es: " + cadenaInco);

    }

}
