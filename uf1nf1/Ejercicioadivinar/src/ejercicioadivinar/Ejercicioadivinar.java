/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioadivinar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicioadivinar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random numero = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("adivina el numero que he pensado");
        int respuesta;
        int numaleatorio = numero.nextInt(50) + 1;
        System.out.println("El numero es mayor a 50");
int intentos=0;
        do {

            System.out.println("Que numero és?");
            respuesta = teclado.nextInt();
            System.out.println("Su respuesta és  = " + respuesta);
            intentos++;
            if (respuesta > numaleatorio) {
                System.out.println("El numero és menor :)");

            } else if (respuesta < numaleatorio) {
                System.out.println("El numero és mayor :)");
            }

               System.out.println("Te quedan " + (8-intentos) + " Intentos");
        } while (respuesta != numaleatorio && intentos <= 8);
        
        if(respuesta == numaleatorio){
        System.out.println("Felicidades, lo has adivinado!!");
            System.out.println("Lo has adivinado en " + intentos + " Intentos");
        }
        else {
            System.out.println("LOSER!");
        }
        
        
    }

}
