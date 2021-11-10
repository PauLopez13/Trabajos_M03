/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg15;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int n1;
        int n2;
        int n3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuanto és el numero 1?");
        n1 = teclado.nextInt();
        System.out.println("Tu primero numero és: " + n1);
        
    
        System.out.println("Cuanto és el numero 2?");
        n2 = teclado.nextInt();
        System.out.println("Tu segundo numero és: " + n2);
        
        System.out.println("Cuanto és el numero 3?");
        n3 = teclado.nextInt();
        System.out.println("Tu tercer numero és: " + n3);
        
        
        if (n1 > n2 && n1 > n3)
        {
            System.out.println("Tu primer numero és mas grande que tu tercer numero y tu segundo numero.");
        }

        else if (n2 > n1 && n2 > n3)
        {   
            System.out.println("Tu segundo numero és mayor que tu primer numero y tu tercer numero");
        }    
    
        else
        {
            System.out.println("El tercer numero és mayor que tu primer numero y tu segundo numero");
        }
    
    }
    
}
