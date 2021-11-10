/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio6funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero;
        double mostrarcompleto;
        int cont;
        for (cont = 0; cont <= 5; cont++) {
        System.out.println("Dime el precio que quieres añadirle el iva:");
        numero = sc.nextDouble();
       
        mostrarcompleto = precioConIVA(numero);

            System.out.println("Tu precio + el iva és = " + mostrarcompleto);
        }

    }

    public static double precioConIVA(double numero) {

        double iva ;
        double resultado;

        iva = numero * 0.21;
        resultado = numero + iva;
        return resultado;

    }
}
