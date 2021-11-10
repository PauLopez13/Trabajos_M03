/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuanto és el numero 1?");
        n1 = teclado.nextInt();
        System.out.println("Tu primero numero és: " + n1);
        
    
        System.out.println("Cuanto és el numero 2?");
        n2 = teclado.nextInt();
        System.out.println("Tu segundo numero és: " + n2);
        
        
        if (n1 > n2)
        {
            System.out.println("  " + n1 + "  " + n2 );
        }

        else 
        {   
            System.out.println("   " + n2 + "   " + n1);
        }

    }
    
}
