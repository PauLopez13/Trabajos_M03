/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nota;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuanto és el numero 1?");
        nota = teclado.nextInt();
        System.out.println("Tu primero numero és: " + nota);

        if (nota < 3 && nota >= 0) {
            System.out.println("Tu nota ha sido muy deficiente, suerte la proxima vez");
        } else if (nota <= 5 && nota > 3) {
            System.out.println("Tu nota ha sido infuficiente, suerte la proxima vez");
        } else if (nota > 5 && nota <= 6) {
            System.out.println("Tu nota ha sido un bien, felicidades pero sigue esforzandote");
        } else if (nota > 6 && nota < 9) {
            System.out.println("Tu nota ha sido un notable, Felicidades!! casi lo tienes.");
        } else {
            System.out.println("Tu nota ha sido excelenteee!!! muchas felicidades");
        }

    }

}
