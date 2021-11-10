/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio1Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int cont;
        int sumanumeros=0;
        for (cont = 0; cont < 3;) {

            System.out.println("Fica un numero?");
            numero = teclado.nextInt();
            if (numero > 20) {
                System.out.println("No puedes escribir un numero mayor que 20.");
            } else if (numero < 10) {
                System.out.println("No puedes escribir un numero menor a 10.");
            } else if (numero >= 10 && numero <= 20) {
                cont++;
                sumanumeros = sumanumeros + numero;
            }

        }

        System.out.println("has introduit un total de = " + cont  + " numeros.");
        System.out.println("La suma de los " + cont + " Numeros és = " + sumanumeros);

    }

}
