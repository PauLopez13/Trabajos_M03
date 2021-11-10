/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.clashroyale2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EJERCICIOCLASHROYALE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String mascopas;
        String menoscopas;
        int numerodecopas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu numero de copas?");
        numerodecopas = teclado.nextInt();

        if (numerodecopas < 2000) {
            String magoelectrico0;
            String esbirro1;
            int eleccion;

            magoelectrico0 = 0;
            esbirro1 = 1;

            System.out.println("Escoge entre Mago electrico y esbirro (magoelectrico, 0. y Esbirro, 1. :");
            eleccion = teclado.nextInt();

            if (eleccion == 0) {
                System.out.println("Has elegido magoelectrico");
            } else if (eleccion == 1) {
                System.out.println("Has elegido Esbirro, felicidades");
            } else {
                System.out.println("Tienes que elegir un numero del 1 - 0, el 0 és el mago electrico y el 1 és el esbirro");
            }

        } else {
            int bandida;
            int caballero;
            int eleccion;

            caballero = 0;
            bandida = 1;

            System.out.println("Escoge entre Bandida y caballero (bandida, 0. y Caballero, 1. :");
            eleccion = teclado.nextInt();

            if (eleccion == 0) {
                System.out.println("Has elegido Bandida, felicidades");
            } else if (eleccion == 1) {
                System.out.println("Has elegido Caballero, felicidades");
            } else {
                System.out.println("Tienes que elegir un numero del 1 - 0, el 0 és el Bandida y el 1 és el Caballero");
            }

        }

    }

}
