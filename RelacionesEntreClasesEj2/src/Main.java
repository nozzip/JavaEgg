
import Service.Juego;
import Service.RevolverDeAgua;
import Service.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = sc.nextInt();
        sc.close();

        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }

        Juego juego = new Juego();
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();

        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
    }
}
