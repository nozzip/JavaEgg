/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2nespresso;

import guia8ej2nespresso.entidades.Cafetera;
import guia8ej2nespresso.servicios.CafeteraServicios;
import java.util.Scanner;

/**
 *
 * @author CDRCONS02
 */
public class Guia8Ej2Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner leer = new Scanner(System.in);
        CafeteraServicios cS = new CafeteraServicios();
        int opc;
        do {
            System.out.println("ingrese una opcion");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cS.iniciarCafetera();
                    break;
                case 2:
                    cS.llenarCafetera();
                    break;
                case 3:
                    cS.llenarCafetera();
                    break;
                case 4:
                    cS.servirTaza();
                    break;
                case 5:
                    cS.vaciarCafetera();
                    break;
                case 6:
                    cS.agregarCafe();
                    break;

                default:
                   System.out.println("Opcion no validad, vuelva a intentar");
            }

        }while (opc != 7);
       
    }

}
