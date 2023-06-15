/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundojava;

import java.util.Scanner;

/**
 *
 * @author nozzip
 */
public class G4EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        String respuesta = "S";
   
               
        mostrarMayor(nombre, edad, respuesta);
        
        
   
    }

    public static void mostrarMayor(String nombre, int edad, String respuesta) {

            

        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("ingrese nombre");
            nombre = leer.nextLine();
            System.out.println("ingrese edad");
            edad = leer.nextInt();
            
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad ");
            } else {
                System.out.println(nombre + " No es mayor de edad ");
            }         
            
            System.out.println("desea seguir mostrando personas (S/N)");
            respuesta = leer.next();           
            
        } while ("S".equals(respuesta));

    }
}
  

/*public static void main(String[] args) {
        String nombre;
        int edad;
        String respuesta;
      do{       
       Scanner leer= new Scanner(System.in);
       System.out.println("ingrese nombre");
       nombre= leer.nextLine();
       System.out.println("ingrese edad");
       edad= leer.nextInt();
       
       mostrarMayor(nombre, edad);
       leer.nextLine();
      System.out.println("desea seguir mostrando personas");
      respuesta=leer.nextLine();
      }while (!respuesta.equalsIgnoreCase("no"));
    }
    public static void mostrarMayor( String nombre, int edad){
        if (edad >=18){
            System.out.println(nombre +" es mayor de edad ");    
        }else{
          System.out.println(nombre +" No es mayor de edad ");  
        }
    }   
}*/
