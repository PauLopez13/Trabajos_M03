/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int N1;
        int N2;
        int Suma;
        int Resta;
        int Producto;
        double Division;      
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuanto és el numero 1?");
        N1 = teclado.nextInt();
        System.out.println("N1 = " + N1);
      
        System.out.println("Cuanto és el numero 2?");
        N2 = teclado.nextInt();    
        System.out.println("N2 = " + N2);
        

        Suma = N1+N2;
        Resta = N1- N2;
        Producto = N1*N2;
        Division = (double) N1/N2;
        System.out.println("La suma és = " + Suma);
        System.out.println("La Resta és = " + Resta);
        System.out.println("El producto és = " + Producto);
        System.out.println("La division és = " + Division);
      
        
    }
    
}
