/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio17funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros;
        int operación;
        boolean primo;
        do {
            System.out.println("Introduce un numero:");
            numeros = teclado.nextInt();

            operacionprimo(numeros);

            if (primo = true) {
                System.out.println("Tu numero és primo.");
            } else if (primo = false) {
                System.out.println("Tu numero no és prmio.");
            }

        } while (numeros != 0);

    }

    private static boolean operacionprimo(int numeros) {
        int cont;
        boolean primo = true;
        for (cont = 0; cont!=2; cont++) {
            if ((numeros / cont) % 2 == 0) {
                primo = false;

            } else {
                primo = true;
            }

        }
        return primo;

    }

}
