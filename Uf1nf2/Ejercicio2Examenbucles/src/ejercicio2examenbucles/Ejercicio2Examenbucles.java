/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2examenbucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio2Examenbucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numerorespuesta;
        int cont;
        System.out.println("-----**MENU**----------------------");
        System.out.println("| 0- salir                        |");
        System.out.println("| 1- Escribir 10 veces            |");
        System.out.println("| 2- Cuenta atrás timbre          |");
        System.out.println("| 3- Numero pares entre 2 valores |");
        System.out.println("----ELIGE TU OPCIÓN----------------");
        numerorespuesta = teclado.nextInt();

        if (numerorespuesta == 0) {
            System.out.println("FIN DEL PROGRAMA.");
        } 
        else if (numerorespuesta == 1) {
            for (cont = 1; cont <= 10; cont++) {

                System.out.println(cont + "- A clase se viene a trabajar.");

            }

        } else if (numerorespuesta == 2) {
            
            for (cont = 10; cont >= 0; cont--) {
                    System.out.println(cont);
                    if (cont == 0)
                    {System.out.println("RINGGG!!!");} 
                        
            }
        }
        else if (numerorespuesta == 3)
        {
        int numero1;
        int numero2;
        int numeropequeño;
        int numerogrande;
        int sumanumeros;
            System.out.println("Indique su primer numero ");
            numero1 = teclado.nextInt();
            System.out.println("Indique su segundo numero");
            numero2 = teclado.nextInt();
            
            if (numero1 < numero2)
            {
            numeropequeño = numero1;
            numerogrande = numero2;
            }
            else{
            numeropequeño = numero2;
            numerogrande = numero1;
            }
            
            for (cont = numeropequeño; cont <= numerogrande; cont++) {
                
                if (cont %2 == 0)
                {
                    System.out.println(cont);
                }
                    
            }
        }
        else {
            System.out.println("OPCIÓN NO VALIDA.");
        }
        
        
        
        
    }

}
