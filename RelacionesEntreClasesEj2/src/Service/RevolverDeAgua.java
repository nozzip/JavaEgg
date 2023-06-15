package Service;

public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {

        posicionActual = (int) (Math.random() * 6);// Generar posición actual aleatoria (0-5)
        posicionAgua = (int) (Math.random() * 6); // Generar posición del agua aleatoria (0-5)
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual + 1) % 6;
    }

    @Override
    public String toString() {
        return "Revolver de Agua:\nPosición actual: " + posicionActual + "\nPosición del agua: " + posicionAgua;
    }
}
