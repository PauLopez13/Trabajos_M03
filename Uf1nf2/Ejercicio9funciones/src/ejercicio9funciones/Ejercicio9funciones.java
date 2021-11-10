/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio9funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;
        int masgrande;
        int respuesta;
        System.out.println("Tu numero 1 és :");
        n1 = sc.nextInt();
        System.out.println("Tu numero 2 és :");
        n2 = sc.nextInt();
        System.out.println("Tu numero 3 és :");
        n3 = sc.nextInt();

        masgrande = funcionMasGrande(n1, n2);
        
        masgrande = funcionMasGrande(masgrande, n3);
        

        System.out.println("Tu numero mayor és = " + masgrande);
    }

    private static int funcionMasGrande(int n1, int n2) {

        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }

    }

}
