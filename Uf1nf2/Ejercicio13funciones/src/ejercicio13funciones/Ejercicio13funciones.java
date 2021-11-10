/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio13funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double descuento;
        double preciosindecuento;
        double preciocondescuento;

        System.out.println("Indique su precio sin descuento:");
        preciosindecuento = teclado.nextInt();

        System.out.println("Indique su precio con descuento");
        preciocondescuento = teclado.nextInt();

        descuento = calculardescuento(preciosindecuento, preciocondescuento);

        
        System.out.println("Tienes un descuento de " + descuento + "%");
        
    }

    private static double calculardescuento(double preciosindecuento, double preciocondescuento) {

        double descuento;
        descuento = (100 * preciocondescuento) / preciosindecuento;

        descuento = 100 - descuento;
        
        return descuento;

    }

}
