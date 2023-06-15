package Persona;

import PersonaServicio.PersonaServicio;
import PersonaEntidad.PersonaEntidad;
import java.util.Scanner;

public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Se pide nombre, fecha de nacimiento y calcula la edad.
        PersonaServicio servicio = new PersonaServicio();

        PersonaEntidad persona = servicio.crearPersona();
        
        System.out.println("Indique la edad consultada para comparar");
        
        int edadConsultada = sc.nextInt();

        servicio.mostrarPersona(persona, edadConsultada);
    }

}
