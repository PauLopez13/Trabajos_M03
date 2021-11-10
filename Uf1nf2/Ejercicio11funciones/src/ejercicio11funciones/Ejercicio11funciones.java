/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio11funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tablaresultado;
        int numero;

        System.out.println("Que numero de la tabla és ");
        numero = teclado.nextInt();

        funcionproducto(numero);

    }

    private static void funcionproducto(int numero) {

        int multi;
        int cont;
        for (cont = 1; cont <= 10; cont++) {
            System.out.println(numero + "*" + cont + "=" + numero * cont);

        }
        
}

}
