/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author nozzip
 */
public class Espectador {

    private String nombre;
    private int edad;
    private int dinero;

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public int getEdad() {
        return edad;
    }

    public int getDinero() {
        return dinero;
    }
}
