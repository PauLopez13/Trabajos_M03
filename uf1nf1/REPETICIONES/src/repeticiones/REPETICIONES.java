/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticiones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class REPETICIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int respuesta;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique cual és su paga:");
        respuesta = teclado.nextInt();
        System.out.println("Su paga és = " + respuesta);
        
        while (respuesta < 5)
        {
          respuesta = respuesta + 1;
            System.out.println("Tienes que sumarle 1 = " + respuesta);
        }

    }
    
}
