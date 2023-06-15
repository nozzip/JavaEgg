package Service;

import java.util.Random;

public class Cine {

    private String pelicula;
    private String[][] sala;
    private int precioEntrada;

    public Cine(String pelicula, int filas, int columnas, int precioEntrada) {
        this.pelicula = pelicula;
        this.sala = new String[filas][columnas];
        this.precioEntrada = precioEntrada;
        llenarSalaVacia();
    }

    private void llenarSalaVacia() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = " ";
            }
        }
    }

    public boolean estaLleno() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean estaOcupado(int fila, int columna) {
        return sala[fila][columna].equals("X");
    }

    public void ocuparAsiento(int fila, int columna) {
        sala[fila][columna] = "X";
    }

    public void desocuparAsiento(int fila, int columna) {
        sala[fila][columna] = " ";
    }

    public boolean ubicarEspectador(Espectador espectador) {
        if (espectador.getDinero() >= precioEntrada) {
            Random random = new Random();
            while (!estaLleno()) {
                int fila = random.nextInt(sala.length);
                int columna = random.nextInt(sala[0].length);
                if (!estaOcupado(fila, columna)) {
                    if (espectador.getEdad() >= pelicula.getEdadMinima()) {
                        ocuparAsiento(fila, columna);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void mostrarSala() {
        System.out.println("----- Sala de Cine -----\n");
        for (int i = sala.length - 1; i >= 0; i--) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
