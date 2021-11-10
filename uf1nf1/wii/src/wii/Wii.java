/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Wii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);
        int petardo1, petardo2, petardo3;
        int opción;
        int linea = 1;
        petardo1 = r.nextInt(20);
        petardo2 = r.nextInt(20);
        petardo3 = r.nextInt(20);

        System.out.println("Que petardo de los 3 eliges?");
        opción = teclado.nextInt();

        if (opción == 2) {
            if (petardo2 >= petardo1 && petardo2 >= petardo3) {
                System.out.println("has ganado, tu petardo volo hasta " + petardo2 + " Metros.");

            } else {
                System.out.println(" Has perdido, tu petardo volo hasta " + petardo2 + " Metros.");
            }
        } else if (opción == 1) {
            if (petardo1 >= petardo2 && petardo1 >= petardo3) {
                System.out.println("has ganado, tu petardo volo hasta " + petardo1 + " Metros.");

            } else {
                System.out.println(" Has perdido, tu petardo volo hasta " + petardo1 + " Metros");
            }
        } else if (opción == 3) {
            if (petardo3 >= petardo1 && petardo3 >= petardo2) {
                System.out.println("has ganado tu petardo volo hasta " + petardo3 + " Metros.");

            } else {
                System.out.println(" Has perdido, tu petardo volo hasta " + petardo3 + " Metros");
            }
        }
        
        System.out.println("P1    P2    P3");
        while (linea <= petardo1 || linea <= petardo2 || linea <= petardo3) {
            if (linea <= petardo1) {
                System.out.print("*     ");
            } else {
                System.out.print("      ");

            }
            if (linea <= petardo2) {
                System.out.print("*     ");
            } else {
                System.out.print("      ");

            }
            
            if (linea <= petardo3) {
                System.out.println("*     ");
            } else {
                System.out.println("      ");

            }
            Thread.sleep(500);
            System.out.println();
            linea++;

        }

    }

}
