/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
       int n1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuanto és el numero 1?");
        n1 = teclado.nextInt();
        System.out.println("Tu primero numero és: " + n1);
        
        
        if (n1 >=0)
        {
            System.out.println("Tu numero és positivo.");
        }

        else 
        {   
            System.out.println("Tu numero és negativo");
        }   
    
    
    }
    
}
