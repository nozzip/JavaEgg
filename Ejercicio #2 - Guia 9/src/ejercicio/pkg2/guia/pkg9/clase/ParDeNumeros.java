/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. 
La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números.
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
    -   Método mostrarValores que muestra cuáles son los dos números guardados.
    -   Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    -   Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
    Previamente se deben redondear ambos valores.
    -   Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio.pkg2.guia.pkg9.clase;

public class ParDeNumeros {
    private double real1;
    private double real2;

    public ParDeNumeros() {
        real1 = Math.random()*10;
        real2 = Math.random()*10;
    }

    public double getReal1() {
        return real1;
    }

    public void setReal1(double real1) {
        this.real1 = real1;
    }

    public double getReal2() {
        return real2;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }
    
}
