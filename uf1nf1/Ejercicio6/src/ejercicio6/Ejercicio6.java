/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    double Part;
    double Pventa;
    double Descuento;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Cuanto és el precio del articulo?");
    Part = teclado.nextDouble();
        System.out.println("El precio del articulo és = " + Part);
    
        System.out.println("Cuanto és el precio de venta?");
        Pventa = teclado.nextDouble();
        System.out.println("El precio de venta és = " + Pventa);

        Descuento = (Part-Pventa)*100/Part;
     
        System.out.println("El descdoubleuento és: " + Descuento + "%");
     
    }
    
}
    


