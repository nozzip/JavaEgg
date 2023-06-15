package G8E3Servicios;

import G8E3Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Persona datosPersona = new Persona();
    Scanner sc = new Scanner(System.in);

    /**
     *
     * @return
     */
    public boolean esMayorDeEdad() {

        boolean mayor = false;

        if (datosPersona.getEdad() >= 18) {

            mayor = true;
        }

        return mayor;
    }

    ;
    
    public static class crearPersona extends PersonaServicio {

        public Persona[] personas = new Persona[2];

        public crearPersona() {

            String genero = "";

            for (int i = 0; i < 2; i++) {

                System.out.println("Ingrese el nombre de la persona " + (i + 1));
                datosPersona.setNombre(sc.next());
                System.out.println("Ingrese la edad de la persona " + (i + 1));
                datosPersona.setEdad(sc.nextInt());

                System.out.println("Ingrese el sexo de la persona " + (i + 1) + "M/F/O");
                genero = sc.next();

                while (!(genero.equals("M") || genero.equals("F") || genero.equals("O"))) {

                    System.out.println("Ingrese un sexo valido ");
                    System.out.println("Ingrese el sexo de la persona " + (i + 1) + "M/F/O");
                    genero = sc.next();
                }

                datosPersona.setSexo(genero);

                System.out.println("Ingrese el peso de la persona " + (i + 1));
                datosPersona.setPeso(sc.nextDouble());
                System.out.println("Ingrese la altura de la persona " + (i + 1));
                datosPersona.setAltura(sc.nextDouble());

                personas[i] = datosPersona;
            }
            sc.close();
        }
    }

    public double calcularIMC() {

        double imc = datosPersona.getPeso() / (datosPersona.getAltura() * datosPersona.getAltura());

        int[] resultadosIMC = new int[3];

        if (imc < 20) {
            System.out.println("Estás por debajo de tu peso ideal");
            return -1;
            resultadosIMC[0]++;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Estás por en tu peso ideal, genial!");
            return 0;
            resultadosIMC[1]++;
        } else {
            System.out.println("Estás con sobrepeso");
            return 1;
            resultadosIMC[2]++;
        }
    }
}
