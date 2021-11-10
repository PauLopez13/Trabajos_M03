/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio1examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double dinero;
        double cripto;
        int bitcoin;
        double XMR;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas monedas tienes?");
        dinero = teclado.nextDouble();

        System.out.println("Seleccione opción = (1) De bitcoin a euros, (2) De XMR a euros");
        cripto = teclado.nextDouble();
        
        if (cripto == 1)
        {
        dinero = dinero * 49561 ;
        }
            
        else if (cripto == 2)
        {
            dinero = dinero * 233.81 ;
        
        }
        
        else
        {
            System.out.println("Tienes que elegir la opción 1 o 2.");
        }
        
        System.out.println("Ahora mismo en euros tienes = " + dinero + "€");
        
    }
    
}
