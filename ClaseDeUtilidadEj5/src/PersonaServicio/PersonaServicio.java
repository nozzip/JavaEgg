package PersonaServicio;

import PersonaEntidad.PersonaEntidad;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner sc = new Scanner(System.in);
    //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.

    public PersonaEntidad crearPersona() {
        PersonaEntidad p1 = new PersonaEntidad();
        System.out.println("Ingrese su nombre");
        p1.setNombre(sc.next());

        Date fechaNacimiento = new Date();

        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Indique el día de su fecha de nacimiento: ");
        int aa = sc.nextInt();

        System.out.print("Indique el mes de su fecha de nacimiento: ");
        int mm = sc.nextInt();

        System.out.print("Indique el año de su fecha de nacimiento: ");
        int yyyy = sc.nextInt();

        System.out.println("Fecha de nacimiento: " + aa + "/" + mm + "/" + yyyy);

        fechaNacimiento.setDate(aa);
        fechaNacimiento.setMonth(mm - 1);
        fechaNacimiento.setYear(yyyy - 1900);

        p1.setFechaNacimiento(fechaNacimiento);

        /*System.out.println(p1.getNombre());
        System.out.println(p1.getFechaNacimiento());*/
        return p1;
    }

    public int calcularEdad(Date fechaNacimiento) {
        int edad;
        Date fechaActual = new Date();
        Date birthday = new Date(fechaActual.getYear(), fechaNacimiento.getMonth(), fechaNacimiento.getDate());

        if (birthday.compareTo(fechaActual) < 0) {
            edad = fechaActual.getYear() - fechaNacimiento.getYear();
        } else {
            edad = fechaActual.getYear() - fechaNacimiento.getYear() - 1;
        }

        return edad;
    }

    public boolean menorQue(PersonaEntidad persona, int consultoEdad) {

        Date fechaNacimiento = persona.getFechaNacimiento();
        int edad = calcularEdad(fechaNacimiento);

        return edad < consultoEdad;
    }

    public void mostrarPersona(PersonaEntidad persona, int edadConsultada) {
        System.out.println("Información de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        int edad = calcularEdad(persona.getFechaNacimiento());
        System.out.println("Edad: " + edad + " años");

        boolean esMenor = menorQue(persona, edadConsultada);
        if (esMenor) {
            System.out.println(persona.getNombre() + " es menor que " + edadConsultada + " años.");
        } else {
            System.out.println(persona.getNombre() + " no es menor que " + edadConsultada + " años.");
        }
    }

}
