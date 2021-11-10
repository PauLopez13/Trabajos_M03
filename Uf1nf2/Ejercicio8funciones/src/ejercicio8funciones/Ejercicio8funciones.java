/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio8funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma;
        int producto;
        int division;
        System.out.println("Escriba su numero = ");
        numero = sc.nextInt();

        suma = sumanumeros(numero);
        producto = producto(numero);
        division = division(numero);
        
        System.out.println("Esta és la suma = " + suma);
        System.out.println("el producto és = " + producto);
        System.out.println("La división es = " + division);

    }

    private static int sumanumeros(int numero) {

        int resultado;
        int sumatotal = 0;
        int cont;

        for (cont = 0; cont <= numero; cont++) {
            cont++;
            sumatotal = sumatotal + numero;

        }
        resultado = sumatotal;

        return resultado;

    }

    private static int producto(int numero) {
        int resultado;
        int productototal = 1;
        int cont;
        for (cont = 0; cont <= numero; cont++) {
            cont++;
            productototal = productototal * numero;

        }
        resultado = productototal;
        return resultado;
    }

    private static int division(int numero) {

        int divi = 0;
        
        divi = numero / 2;
        return divi;

    }

}
