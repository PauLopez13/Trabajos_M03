/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.clashroyale;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EJERCICIOCLASHROYALE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int magoelectrico0;
        int esbirro1;
        int eleccion;   
        
        magoelectrico0 = 0;
        esbirro1 = 1;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge entre Mago electrico y esbirro (magoelectrico, 0. y Esbirro, 1. :");
        eleccion = teclado.nextInt();
        
        if (eleccion==0)
        {
            System.out.println("Has elegido magoelectrico");
        }
        
        else if (eleccion == 1) 
        {System.out.println("Has elegido Esbirro, felicidades");}

        else
        {
            System.out.println("Tienes que elegir un numero del 1 - 0, el 0 és el mago electrico y el 1 és el esbirro");
        }
        
    }
    
}
