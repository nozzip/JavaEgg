/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

import Service.Pelicula;
import Service.Cine;


/**
 *
 * @author nozzip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Titanic", 180, 13, "James Cameron");
        Cine cine = new Cine(pelicula, 8, 6, 10);

        cine.mostrarSala();

        // Generar espectadores aleatorios
        Espectador[] espectadores = {
            new Espectador("Juan", 25, 15),
            new Espectador("Ana", 10, 5),
            new Espectador("Carlos", 35, 20),
            new Espectador("Luisa", 14, 10),
            new Espectador("Pedro", 18, 8),
            new Espectador("María", 22, 12),
            new Espectador("Sara", 40, 10),
            new Espectador("David", 30, 15)
        };

        for (Espectador espectador : espectadores) {
            if (cine.ubicarEspectador(espectador)) {
                System.out.println("El espectador " + espectador.getNombre() + " ha sido ubicado en un asiento.");
            } else {
                System.out.println("El espectador " + espectador.getNombre() + " no cumple los requisitos o no hay asientos disponibles.");
            }
        }

        cine.mostrarSala();
    }
}

}
