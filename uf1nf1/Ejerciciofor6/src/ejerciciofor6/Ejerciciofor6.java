/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofor6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejerciciofor6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int cont;
        boolean negativo = false;
        System.out.println("Escribe los 10 numeros");

        for (cont = 1; cont <= 10; cont++) {
            num = teclado.nextInt();

            if (num < 0) {
                negativo = true;
            }
            
            
            
            
        }
        if (negativo == true)
            {
                System.out.println("Hay un numero negativo");
            }

    }

}
