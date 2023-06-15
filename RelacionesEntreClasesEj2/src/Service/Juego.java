/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Service.Jugador;
import Service.RevolverDeAgua;
import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;

    }

    public void ronda() {
        int jugadorActual = 0;
        boolean mojado = false;

        while (!mojado) {
            Jugador player = jugadores.get(jugadorActual);
            mojado = player.disparo(revolver);
            if (!mojado) {
                jugadorActual = (jugadorActual + 1) % jugadores.size();
            }
        }

        for (Jugador jugador : jugadores) {
            if (jugador.estaMojado()) {
                System.out.println("El jugador mojado es: " + jugador);
                break;
            }
        }

        System.out.println("\nJuego terminado.");
    }

}
