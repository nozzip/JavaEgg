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
package ejercicio.pkg2.guia.pkg9.clase.service;

import ejercicio.pkg2.guia.pkg9.clase.ParDeNumeros;

public class ParDeNumerosService {
    
    ParDeNumeros clase = new ParDeNumeros();
    
    public void mostrarValores(){
        
        System.out.println(clase.getReal1());
        
        System.out.println(clase.getReal2());
    }
    
    public double devolverMayor(){
        double mayor = Math.max(clase.getReal1(), clase.getReal2());
        return mayor;
    }
    public double devolverMenor(){
        double menor = Math.min(clase.getReal1(), clase.getReal2());
        return menor;
    }
    public void calcularPotencia(){
        long red1 = (long) Math.round(devolverMayor());
        long red2 = (long) Math.round(devolverMenor());
        double potencia = Math.pow(red1, red2);
        
        System.out.println("Mayor ^ Menor = " + potencia);
    }
    
    public void calcularRaiz(){
        long red2 = (long) Math.abs( (long) devolverMenor() );
        double raiz = Math.sqrt(red2);
        
        System.out.println("Menor sqrt = " + raiz);
    }
}
