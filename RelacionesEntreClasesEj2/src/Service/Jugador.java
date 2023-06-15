package Service;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean disparo(RevolverDeAgua r) {
        if (r.mojar()) {
            mojado = true;
            return true;
        } else {
            r.siguienteChorro();            
            return false;
        }
    }

    public boolean estaMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
