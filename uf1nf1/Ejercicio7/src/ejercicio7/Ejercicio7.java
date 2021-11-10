/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   int edad;
   int menor;
   int mayor;
   Scanner teclado = new Scanner(System.in);
    System.out.println("Cual és tu edad?");
    edad = teclado.nextInt();
    System.out.println("Tu edad és: " + edad);
   
        
    if (edad >= 18)
    {
        System.out.println("Eres mayor de edad");
    }
        
    else 
    {
        System.out.println("Eres menor de edad");
    }
    
    }
    
}
