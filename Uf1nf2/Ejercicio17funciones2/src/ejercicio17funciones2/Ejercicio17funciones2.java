/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17funciones2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio17funciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num;
        boolean es_primo;

        do {
            System.out.println("Introduce un numero:");
            num = teclado.nextDouble();

            if (num != 0) {
                es_primo = primoop(num);

                if (es_primo == true) {
                    System.out.println("Numero primo!!");
                } else {
                    System.out.println("No es primo");
                }
            }
        } while (num != 0);
        System.out.println("Saliendo del programa");
    }

    /**
     * Mira si el numero es primo o sea que no se puede dividir por ninguni qye
     * bi sea el mismo t el numero 1 (2...numero -1).
     *
     * @param num
     * @return
     */
    private static boolean primoop(double num) {

        for (int cont = 2; cont <= num - 1; cont++) {

            if (num % cont == 0) {
                return false;
            }

        }

        return true;

    }

}
