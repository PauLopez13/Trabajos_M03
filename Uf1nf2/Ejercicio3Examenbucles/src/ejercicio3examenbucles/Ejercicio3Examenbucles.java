/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3examenbucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio3Examenbucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int metroshabitacion;
        char mashabitacion ;
        char nomashabitacion ;
        int sumametros = 0;
        char eleccion;

        do {

            System.out.println("Metros cuadrados habitacion");
            metroshabitacion = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Hay mas habitaciones(s/n)");
            eleccion = teclado.nextLine().charAt(0);
            
            
            sumametros = sumametros + metroshabitacion; 
         
            
        
        } while (eleccion != 'n');

        System.out.println("Tu casa mide " + sumametros + " metros cuadrados");

    }

}
